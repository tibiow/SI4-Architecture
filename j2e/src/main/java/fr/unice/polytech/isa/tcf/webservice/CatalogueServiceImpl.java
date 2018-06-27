package fr.unice.polytech.isa.tcf.webservice;

import fr.unice.polytech.isa.tcf.CatalogueExploration;
import fr.unice.polytech.isa.tcf.entities.Customer;
import fr.unice.polytech.isa.tcf.entities.Item;
import fr.unice.polytech.isa.tcf.entities.Offer;
import fr.unice.polytech.isa.tcf.exceptions.UncheckedException;
import fr.unice.polytech.isa.tcf.exceptions.UnknownCustomerException;
import fr.unice.polytech.isa.tcf.CustomerFinder;
import java.util.List;
import java.util.Optional;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;
import java.util.HashSet;
import java.util.Set;

@WebService(targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/tcf/catalogue")
@Stateless(name = "CatalogueWS")
public class CatalogueServiceImpl implements CatalogueService {

    @EJB private CustomerFinder finder;
    @EJB private CatalogueExploration catalogue;

    @Override
    public Set<Item> listAllItems(String customerName) throws UnknownCustomerException {
        Optional<List<Item>> i = catalogue.listPreMadeItems(readCustomer(customerName).isVUP());
        Set<Item> items = new HashSet<>();
        if(i.isPresent()) {
            List<Item> l = i.get();
            for(int j = 0; j < l.size(); j++) {
                items.add(l.get(j));
            }
        }
        return items;
    }

    @Override
    public void addItemToCatalogue(String customerName, int quantity, String name, String description, String image, boolean VUP, boolean gift, double price, int points)
            throws UnknownCustomerException {
        readCustomer(customerName);
        Item it = new Item(new Offer(name, description, image, VUP, gift, price, points), quantity);
        Optional<Item> i = catalogue.exploreCatalogue(it);
        if(i.isPresent()) {
            i.get().setQuantity(it.getQuantity() + i.get().getQuantity());
        } else {
            catalogue.add(it);
        }
    }

    @Override
    public void removeItemToCatalogue(String customerName, int quantity, int id)
            throws UnknownCustomerException, UncheckedException {
        readCustomer(customerName);
        Optional<Item> i = catalogue.exploreCatalogue(id);
        if(i.isPresent()) {
            if(quantity > 0 && i.get().getQuantity() - quantity > 0) {
                i.get().setQuantity(i.get().getQuantity() - quantity);
            } else if(quantity > 0 && i.get().getQuantity() - quantity == 0) {
                catalogue.remove(i.get());
            } else {
                throw new UncheckedException("Inconsistent quantity!", null);
            }
        }
    }

    @Override
    public void modifyItemToCatalogue(String customerName, int quantity, String name, String description, String image, boolean VUP, boolean gift, double price, int points, int id)
            throws UnknownCustomerException {
        readCustomer(customerName);

        Item it = new Item(new Offer(name, description, image, VUP, gift, price, points), quantity);
        it.setId(id);

        Optional<Item> i = catalogue.exploreCatalogue(id);
        Optional<Item> i2 = catalogue.exploreCatalogue(it);

        if(i.isPresent()) {
            if(i2.isPresent()) {
                if(i2.get().equals(i.get())) {
                    i2.get().setQuantity(it.getQuantity());
                } else {
                    i2.get().setQuantity(it.getQuantity() + i2.get().getQuantity());
                    catalogue.remove(i.get());
                }
            } else {
                i.get().setOffer(it.getOffer());
                i.get().setQuantity(it.getQuantity());
                i.get().setId(it.getId());
            }
        }
    }

    private Customer readCustomer(String customerName)
            throws UnknownCustomerException {
        Optional<Customer> c = finder.findByName(customerName);
        if(!c.isPresent()) {
            throw new UnknownCustomerException(customerName);}
        return c.get();
    }

}
