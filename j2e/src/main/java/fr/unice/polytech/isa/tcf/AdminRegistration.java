package fr.unice.polytech.isa.tcf;

import fr.unice.polytech.isa.tcf.exceptions.AlreadyExistingAdminException;

import javax.ejb.Local;

@Local
public interface AdminRegistration {

    void register(String adminName, String adminMail, String adminPassword)
            throws AlreadyExistingAdminException;

}

