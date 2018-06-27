
package stubs.customerCare;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the stubs.customerCare package. 
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

    private final static QName _AddMoney_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "addMoney");
    private final static QName _Pay_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "pay");
    private final static QName _Login_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "login");
    private final static QName _Register_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "register");
    private final static QName _LoginResponse_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "loginResponse");
    private final static QName _UnknownCustomerException_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "UnknownCustomerException");
    private final static QName _AddMoneyResponse_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "addMoneyResponse");
    private final static QName _PayResponse_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "payResponse");
    private final static QName _AlreadyExistingCustomerException_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "AlreadyExistingCustomerException");
    private final static QName _RegisterResponse_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "registerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stubs.customerCare
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link UnknownCustomerException }
     * 
     */
    public UnknownCustomerException createUnknownCustomerException() {
        return new UnknownCustomerException();
    }

    /**
     * Create an instance of {@link AddMoneyResponse }
     * 
     */
    public AddMoneyResponse createAddMoneyResponse() {
        return new AddMoneyResponse();
    }

    /**
     * Create an instance of {@link PayResponse }
     * 
     */
    public PayResponse createPayResponse() {
        return new PayResponse();
    }

    /**
     * Create an instance of {@link AlreadyExistingCustomerException }
     * 
     */
    public AlreadyExistingCustomerException createAlreadyExistingCustomerException() {
        return new AlreadyExistingCustomerException();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link AddMoney }
     * 
     */
    public AddMoney createAddMoney() {
        return new AddMoney();
    }

    /**
     * Create an instance of {@link Pay }
     * 
     */
    public Pay createPay() {
        return new Pay();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMoney }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tcf.isa.polytech.unice.fr/", name = "addMoney")
    public JAXBElement<AddMoney> createAddMoney(AddMoney value) {
        return new JAXBElement<AddMoney>(_AddMoney_QNAME, AddMoney.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tcf.isa.polytech.unice.fr/", name = "pay")
    public JAXBElement<Pay> createPay(Pay value) {
        return new JAXBElement<Pay>(_Pay_QNAME, Pay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tcf.isa.polytech.unice.fr/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tcf.isa.polytech.unice.fr/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMoneyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tcf.isa.polytech.unice.fr/", name = "addMoneyResponse")
    public JAXBElement<AddMoneyResponse> createAddMoneyResponse(AddMoneyResponse value) {
        return new JAXBElement<AddMoneyResponse>(_AddMoneyResponse_QNAME, AddMoneyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tcf.isa.polytech.unice.fr/", name = "payResponse")
    public JAXBElement<PayResponse> createPayResponse(PayResponse value) {
        return new JAXBElement<PayResponse>(_PayResponse_QNAME, PayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlreadyExistingCustomerException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tcf.isa.polytech.unice.fr/", name = "AlreadyExistingCustomerException")
    public JAXBElement<AlreadyExistingCustomerException> createAlreadyExistingCustomerException(AlreadyExistingCustomerException value) {
        return new JAXBElement<AlreadyExistingCustomerException>(_AlreadyExistingCustomerException_QNAME, AlreadyExistingCustomerException.class, null, value);
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
