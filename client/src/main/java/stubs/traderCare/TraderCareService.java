
package stubs.traderCare;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TraderCareService", targetNamespace = "http://webservice.tcf.isa.polytech.unice.fr/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TraderCareService {


    /**
     * 
     * @param traderMail
     * @param traderPassword
     * @param traderAddress
     * @param traderName
     * @throws AlreadyExistingTraderException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "register", targetNamespace = "http://webservice.tcf.isa.polytech.unice.fr/", className = "stubs.traderCare.Register")
    @ResponseWrapper(localName = "registerResponse", targetNamespace = "http://webservice.tcf.isa.polytech.unice.fr/", className = "stubs.traderCare.RegisterResponse")
    public void register(
        @WebParam(name = "trader_name", targetNamespace = "")
        String traderName,
        @WebParam(name = "trader_address", targetNamespace = "")
        String traderAddress,
        @WebParam(name = "trader_mail", targetNamespace = "")
        String traderMail,
        @WebParam(name = "trader_password", targetNamespace = "")
        String traderPassword)
        throws AlreadyExistingTraderException_Exception
    ;

}
