package fr.unice.polytech.isa.tcf.webservice;

import fr.unice.polytech.isa.tcf.exceptions.AlreadyExistingAdminException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface AdminCareService {

    @WebMethod
    void register(@WebParam(name="admin_name") String name,
                  @WebParam(name="admin_mail") String mail,
                  @WebParam(name="customer_password") String password)
            throws AlreadyExistingAdminException;



}
