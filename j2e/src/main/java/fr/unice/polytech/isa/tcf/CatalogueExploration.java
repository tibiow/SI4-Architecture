package fr.unice.polytech.isa.tcf;

import fr.unice.polytech.isa.tcf.entities.Item;

import javax.ejb.Local;
import java.util.List;
import java.util.Optional;

@Local
public interface CatalogueExploration {

	Optional<List<Item>> listPreMadeItems(boolean vup);

	Optional<Item> exploreCatalogue(Item i);

	Optional<Item> exploreCatalogue(int id);

	void add(Item item);

	void remove(Item item);

}
