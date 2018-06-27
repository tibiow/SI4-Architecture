
package stubs.cart;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the stubs.cart package. 
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

    private final static QName _AddAdvantageToCustomerCartResponse_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "addAdvantageToCustomerCartResponse");
    private final static QName _RemoveAdvantageToCustomerCartResponse_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "removeAdvantageToCustomerCartResponse");
    private final static QName _GetCustomerCartContentsResponse_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "getCustomerCartContentsResponse");
    private final static QName _AddAdvantageToCustomerCart_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "addAdvantageToCustomerCart");
    private final static QName _UnknownCustomerException_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "UnknownCustomerException");
    private final static QName _UncheckedException_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "UncheckedException");
    private final static QName _GetCustomerCartContents_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "getCustomerCartContents");
    private final static QName _RemoveAdvantageToCustomerCart_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "removeAdvantageToCustomerCart");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stubs.cart
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCustomerCartContents }
     * 
     */
    public GetCustomerCartContents createGetCustomerCartContents() {
        return new GetCustomerCartContents();
    }

    /**
     * Create an instance of {@link UnknownCustomerException }
     * 
     */
    public UnknownCustomerException createUnknownCustomerException() {
        return new UnknownCustomerException();
    }

    /**
     * Create an instance of {@link UncheckedException }
     * 
     */
    public UncheckedException createUncheckedException() {
        return new UncheckedException();
    }

    /**
     * Create an instance of {@link RemoveAdvantageToCustomerCart }
     * 
     */
    public RemoveAdvantageToCustomerCart createRemoveAdvantageToCustomerCart() {
        return new RemoveAdvantageToCustomerCart();
    }

    /**
     * Create an instance of {@link AddAdvantageToCustomerCartResponse }
     * 
     */
    public AddAdvantageToCustomerCartResponse createAddAdvantageToCustomerCartResponse() {
        return new AddAdvantageToCustomerCartResponse();
    }

    /**
     * Create an instance of {@link RemoveAdvantageToCustomerCartResponse }
     * 
     */
    public RemoveAdvantageToCustomerCartResponse createRemoveAdvantageToCustomerCartResponse() {
        return new RemoveAdvantageToCustomerCartResponse();
    }

    /**
     * Create an instance of {@link GetCustomerCartContentsResponse }
     * 
     */
    public GetCustomerCartContentsResponse createGetCustomerCartContentsResponse() {
        return new GetCustomerCartContentsResponse();
    }

    /**
     * Create an instance of {@link AddAdvantageToCustomerCart }
     * 
     */
    public AddAdvantageToCustomerCart createAddAdvantageToCustomerCart() {
        return new AddAdvantageToCustomerCart();
    }

    /**
     * Create an instance of {@link Offer }
     * 
     */
    public Offer createOffer() {
        return new Offer();
    }

    /**
     * Create an instance of {@link Advantage }
     * 
     */
    public Advantage createAdvantage() {
        return new Advantage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAdvantageToCustomerCartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tcf.isa.polytech.unice.fr/", name = "addAdvantageToCustomerCartResponse")
    public JAXBElement<AddAdvantageToCustomerCartResponse> createAddAdvantageToCustomerCartResponse(AddAdvantageToCustomerCartResponse value) {
        return new JAXBElement<AddAdvantageToCustomerCartResponse>(_AddAdvantageToCustomerCartResponse_QNAME, AddAdvantageToCustomerCartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAdvantageToCustomerCartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tcf.isa.polytech.unice.fr/", name = "removeAdvantageToCustomerCartResponse")
    public JAXBElement<RemoveAdvantageToCustomerCartResponse> createRemoveAdvantageToCustomerCartResponse(RemoveAdvantageToCustomerCartResponse value) {
        return new JAXBElement<RemoveAdvantageToCustomerCartResponse>(_RemoveAdvantageToCustomerCartResponse_QNAME, RemoveAdvantageToCustomerCartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerCartContentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tcf.isa.polytech.unice.fr/", name = "getCustomerCartContentsResponse")
    public JAXBElement<GetCustomerCartContentsResponse> createGetCustomerCartContentsResponse(GetCustomerCartContentsResponse value) {
        return new JAXBElement<GetCustomerCartContentsResponse>(_GetCustomerCartContentsResponse_QNAME, GetCustomerCartContentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAdvantageToCustomerCart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tcf.isa.polytech.unice.fr/", name = "addAdvantageToCustomerCart")
    public JAXBElement<AddAdvantageToCustomerCart> createAddAdvantageToCustomerCart(AddAdvantageToCustomerCart value) {
        return new JAXBElement<AddAdvantageToCustomerCart>(_AddAdvantageToCustomerCart_QNAME, AddAdvantageToCustomerCart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownCustomerException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tcf.isa.polytech.unice.fr/", name = "UnknownCustomerException")
    public JAXBElement<UnknownCustomerException> createUnknownCustomerException(UnknownCustomerException value) {
        return new JAXBElement<UnknownCustomerException>(_UnknownCustomerException_QNAME, UnknownCustomerException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UncheckedException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tcf.isa.polytech.unice.fr/", name = "UncheckedException")
    public JAXBElement<UncheckedException> createUncheckedException(UncheckedException value) {
        return new JAXBElement<UncheckedException>(_UncheckedException_QNAME, UncheckedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerCartContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tcf.isa.polytech.unice.fr/", name = "getCustomerCartContents")
    public JAXBElement<GetCustomerCartContents> createGetCustomerCartContents(GetCustomerCartContents value) {
        return new JAXBElement<GetCustomerCartContents>(_GetCustomerCartContents_QNAME, GetCustomerCartContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAdvantageToCustomerCart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tcf.isa.polytech.unice.fr/", name = "removeAdvantageToCustomerCart")
    public JAXBElement<RemoveAdvantageToCustomerCart> createRemoveAdvantageToCustomerCart(RemoveAdvantageToCustomerCart value) {
        return new JAXBElement<RemoveAdvantageToCustomerCart>(_RemoveAdvantageToCustomerCart_QNAME, RemoveAdvantageToCustomerCart.class, null, value);
    }

}
