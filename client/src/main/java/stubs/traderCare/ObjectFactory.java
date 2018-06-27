
package stubs.traderCare;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the stubs.traderCare package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AlreadyExistingTraderException_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "AlreadyExistingTraderException");
    private final static QName _Register_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "register");
    private final static QName _RegisterResponse_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "registerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stubs.traderCare
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link AlreadyExistingTraderException }
     * 
     */
    public AlreadyExistingTraderException createAlreadyExistingTraderException() {
        return new AlreadyExistingTraderException();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlreadyExistingTraderException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tcf.isa.polytech.unice.fr/", name = "AlreadyExistingTraderException")
    public JAXBElement<AlreadyExistingTraderException> createAlreadyExistingTraderException(AlreadyExistingTraderException value) {
        return new JAXBElement<AlreadyExistingTraderException>(_AlreadyExistingTraderException_QNAME, AlreadyExistingTraderException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tcf.isa.polytech.unice.fr/", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tcf.isa.polytech.unice.fr/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

}
