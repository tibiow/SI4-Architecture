package fr.unice.polytech.isa.tcf.components;

import fr.unice.polytech.isa.tcf.CartModifier;
import fr.unice.polytech.isa.tcf.entities.Customer;
import fr.unice.polytech.isa.tcf.entities.Item;
import fr.unice.polytech.isa.tcf.entities.Advantage;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.Iterator;
import java.util.Set;
import javax.ejb.Stateless;

@Stateless(name = "cart-stateless")
public class CartBean implements CartModifier {

    @PersistenceContext private EntityManager entityManager;

    @Override
    public boolean add(Customer customer, Item item) {
        customer.setAdvantages(updateCart(customer, item));
        return true;
    }

    @Override
    public Set<Advantage> contents(Customer customer) {
        return customer.getAdvantages();
    }

    @Override
    public final boolean remove(Customer c, int quantity, int id) {
        Customer customer = entityManager.merge(c);
        Set<Advantage> advantages = contents(customer);
        for(Advantage advantage : advantages) {
            if(advantage.getId() == id) {
                int q = advantage.getQuantity() - quantity;
                if (q >= 0) {
                    advantage.setQuantity(q);
                    if(q == 0) {
                        advantages.remove(advantage);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public Advantage exploreAdvantage(Customer c, Item it) {
        Set<Advantage> advantages = contents(c);
        Iterator<Advantage> i = advantages.iterator();

        while(i.hasNext()) {
            Advantage a = i.next();
            if(a.getOffer().equals(it.getOffer())) {
                return a;
            }
        }
        return null;
    }

    /**
     * Protected method to update the cart of a given customer, shared by both stateful and stateless beans
     */
    protected Set<Advantage> updateCart(Customer c, Item item) {
        Set<Advantage> advantages = contents(c);
        Advantage a = exploreAdvantage(c, item);
        if (a != null) {
            Item toAdd = new Item(item.getOffer(), item.getQuantity() + a.getQuantity());
            advantages.add(new Advantage(toAdd));
            advantages.remove(a);
        } else {
            advantages.add(new Advantage(item));
        }
        return advantages;
    }
}
