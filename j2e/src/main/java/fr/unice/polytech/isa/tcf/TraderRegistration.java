package fr.unice.polytech.isa.tcf;

import fr.unice.polytech.isa.tcf.exceptions.AlreadyExistingTraderException;

import javax.ejb.Local;

@Local
public interface TraderRegistration {

    void register(String traderName, String traderAddress, String traderMail, String traderPassword)
            throws AlreadyExistingTraderException;

}

