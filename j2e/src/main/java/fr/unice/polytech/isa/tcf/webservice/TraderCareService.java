package fr.unice.polytech.isa.tcf.webservice;

import fr.unice.polytech.isa.tcf.exceptions.AlreadyExistingTraderException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface TraderCareService {

    @WebMethod
    void register(@WebParam(name="trader_name") String name,
                  @WebParam(name="trader_address") String address,
                  @WebParam(name="trader_mail") String mail,
                  @WebParam(name="trader_password") String password)
            throws AlreadyExistingTraderException;

}
