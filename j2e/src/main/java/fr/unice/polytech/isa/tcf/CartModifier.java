package fr.unice.polytech.isa.tcf;

import fr.unice.polytech.isa.tcf.entities.Advantage;
import fr.unice.polytech.isa.tcf.entities.Customer;
import fr.unice.polytech.isa.tcf.entities.Item;

import javax.ejb.Local;
import java.util.Set;

@Local
public interface CartModifier {

	boolean add(Customer c, Item item);

	boolean remove(Customer c, int quantity, int id);

	Set<Advantage> contents(Customer c);

}
