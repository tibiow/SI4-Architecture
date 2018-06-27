package fr.unice.polytech.isa.tcf.webservice;


import fr.unice.polytech.isa.tcf.AdminRegistration;
import fr.unice.polytech.isa.tcf.exceptions.AlreadyExistingAdminException;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

@WebService(targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/tcf/admin-care")
@Stateless(name = "AdminCareWS")
public class AdminCareServiceImpl implements AdminCareService {

    @EJB private AdminRegistration registry;

    @Override
    public void register(String name, String mail, String password) throws AlreadyExistingAdminException {
        registry.register(name, mail, password);
    }

}
