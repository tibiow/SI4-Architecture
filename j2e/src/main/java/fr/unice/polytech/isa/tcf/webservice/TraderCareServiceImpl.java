package fr.unice.polytech.isa.tcf.webservice;


import fr.unice.polytech.isa.tcf.*;
import fr.unice.polytech.isa.tcf.exceptions.AlreadyExistingTraderException;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

@WebService(targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/tcf/trader-care")
@Stateless(name = "TraderCareWS")
public class TraderCareServiceImpl implements TraderCareService {

    @EJB private TraderRegistration registry;

    @Override
    public void register(String name, String address, String mail, String password) throws AlreadyExistingTraderException {
        registry.register(name, address, mail, password);
    }

}
