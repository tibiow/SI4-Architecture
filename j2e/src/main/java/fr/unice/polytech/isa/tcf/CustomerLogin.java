package fr.unice.polytech.isa.tcf;


import fr.unice.polytech.isa.tcf.exceptions.UnknownCustomerException;

import javax.ejb.Local;

@Local
public interface CustomerLogin {

    void login(String customerName, String customerPassword)
            throws UnknownCustomerException;

}

