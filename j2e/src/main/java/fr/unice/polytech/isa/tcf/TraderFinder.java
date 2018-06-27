package fr.unice.polytech.isa.tcf;

import fr.unice.polytech.isa.tcf.entities.Trader;

import javax.ejb.Local;
import java.util.Optional;

@Local
public interface TraderFinder {

    Optional<Trader> findByName(String name);

}

