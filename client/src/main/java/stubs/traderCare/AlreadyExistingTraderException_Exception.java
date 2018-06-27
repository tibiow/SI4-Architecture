
package stubs.traderCare;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "AlreadyExistingTraderException", targetNamespace = "http://webservice.tcf.isa.polytech.unice.fr/")
public class AlreadyExistingTraderException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private AlreadyExistingTraderException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public AlreadyExistingTraderException_Exception(String message, AlreadyExistingTraderException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public AlreadyExistingTraderException_Exception(String message, AlreadyExistingTraderException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: stubs.traderCare.AlreadyExistingTraderException
     */
    public AlreadyExistingTraderException getFaultInfo() {
        return faultInfo;
    }

}
