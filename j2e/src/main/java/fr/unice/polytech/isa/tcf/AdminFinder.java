package fr.unice.polytech.isa.tcf;

import fr.unice.polytech.isa.tcf.entities.Admin;

import javax.ejb.Local;
import java.util.Optional;

@Local
public interface AdminFinder {

    Optional<Admin> findByName(String name);

}

