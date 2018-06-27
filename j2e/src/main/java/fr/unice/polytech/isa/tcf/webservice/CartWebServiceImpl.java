package fr.unice.polytech.isa.tcf.webservice;

import fr.unice.polytech.isa.tcf.CartModifier;
import fr.unice.polytech.isa.tcf.CatalogueExploration;
import fr.unice.polytech.isa.tcf.CustomerFinder;
import fr.unice.polytech.isa.tcf.entities.Customer;
import fr.unice.polytech.isa.tcf.entities.Item;
import fr.unice.polytech.isa.tcf.entities.Offer;
import fr.unice.polytech.isa.tcf.entities.Advantage;
import fr.unice.polytech.isa.tcf.exceptions.UncheckedException;
import fr.unice.polytech.isa.tcf.exceptions.UnknownCustomerException;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;
import java.util.Optional;
import java.util.Set;

@WebService(targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/tcf/cart")
@Stateless(name = "CartWS")
public class CartWebServiceImpl implements CartWebService {

	@EJB(name="stateless-cart") private CartModifier cart;
	@EJB private CustomerFinder finder;
	@EJB private CatalogueExploration catalogue;

	@Override
	public void addAdvantageToCustomerCart(String customerName, int quantity, int id)
			throws UnknownCustomerException, UncheckedException {
		Customer c = readCustomer(customerName);

		Optional<Item> i = catalogue.exploreCatalogue(id);
		if(i.isPresent()) {
			Item it = new Item(new Offer(i.get().getOffer()), quantity);
			if(quantity > 0 && i.get().getQuantity() - quantity > 0) {
				i.get().setQuantity(i.get().getQuantity() - quantity);
				cart.add(c, it);
			} else if(quantity > 0 && i.get().getQuantity() - quantity == 0) {
				cart.add(c, it);
				catalogue.remove(i.get());
			} else {
				throw new UncheckedException("Inconsistent quantity !", null);
			}
		} else {
			throw new UncheckedException("Item no existing !", null);
		}
	}

	@Override
	public void removeAdvantageToCustomerCart(String customerName, int quantity, int id)
			throws UnknownCustomerException {
		cart.remove(readCustomer(customerName), quantity, id);
	}

	@Override
	public Set<Advantage> getCustomerCartContents(String customerName)
			throws UnknownCustomerException {
		return cart.contents(readCustomer(customerName));
	}

	private Customer readCustomer(String customerName)
			throws UnknownCustomerException {
		Optional<Customer> c = finder.findByName(customerName);
		if(!c.isPresent()) {
			throw new UnknownCustomerException(customerName);}
		return c.get();
	}

}
