
package stubs.catalogue;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the stubs.catalogue package. 
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

    private final static QName _RemoveItemToCatalogue_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "removeItemToCatalogue");
    private final static QName _ModifyItemToCatalogueResponse_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "modifyItemToCatalogueResponse");
    private final static QName _ListAllItems_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "listAllItems");
    private final static QName _RemoveItemToCatalogueResponse_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "removeItemToCatalogueResponse");
    private final static QName _ListAllItemsResponse_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "listAllItemsResponse");
    private final static QName _ModifyItemToCatalogue_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "modifyItemToCatalogue");
    private final static QName _UnknownCustomerException_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "UnknownCustomerException");
    private final static QName _UncheckedException_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "UncheckedException");
    private final static QName _AddItemToCatalogue_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "addItemToCatalogue");
    private final static QName _AddItemToCatalogueResponse_QNAME = new QName("http://webservice.tcf.isa.polytech.unice.fr/", "addItemToCatalogueResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stubs.catalogue
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListAllItemsResponse }
     * 
     */
    public ListAllItemsResponse createListAllItemsResponse() {
        return new ListAllItemsResponse();
    }

    /**
     * Create an instance of {@link ModifyItemToCatalogue }
     * 
     */
    public ModifyItemToCatalogue createModifyItemToCatalogue() {
        return new ModifyItemToCatalogue();
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
     * Create an instance of {@link AddItemToCatalogue }
     * 
     */
    public AddItemToCatalogue createAddItemToCatalogue() {
        return new AddItemToCatalogue();
    }

    /**
     * Create an instance of {@link AddItemToCatalogueResponse }
     * 
     */
    public AddItemToCatalogueResponse createAddItemToCatalogueResponse() {
        return new AddItemToCatalogueResponse();
    }

    /**
     * Create an instance of {@link RemoveItemToCatalogue }
     * 
     */
    public RemoveItemToCatalogue createRemoveItemToCatalogue() {
        return new RemoveItemToCatalogue();
    }

    /**
     * Create an instance of {@link ModifyItemToCatalogueResponse }
     * 
     */
    public ModifyItemToCatalogueResponse createModifyItemToCatalogueResponse() {
        return new ModifyItemToCatalogueResponse();
    }

    /**
     * Create an instance of {@link RemoveItemToCatalogueResponse }
     * 
     */
    public RemoveItemToCatalogueResponse createRemoveItemToCatalogueResponse() {
        return new RemoveItemToCatalogueResponse();
    }

    /**
     * Create an instance of {@link ListAllItems }
     * 
     */
    public ListAllItems createListAllItems() {
        return new ListAllItems();
    }

    /**
     * Create an instance of {@link Offer }
     * 
     */
    public Offer createOffer() {
        return new Offer();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveItemToCatalogue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tcf.isa.polytech.unice.fr/", name = "removeItemToCatalogue")
    public JAXBElement<RemoveItemToCatalogue> createRemoveItemToCatalogue(RemoveItemToCatalogue value) {
        return new JAXBElement<RemoveItemToCatalogue>(_RemoveItemToCatalogue_QNAME, RemoveItemToCatalogue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyItemToCatalogueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tcf.isa.polytech.unice.fr/", name = "modifyItemToCatalogueResponse")
    public JAXBElement<ModifyItemToCatalogueResponse> createModifyItemToCatalogueResponse(ModifyItemToCatalogueResponse value) {
        return new JAXBElement<ModifyItemToCatalogueResponse>(_ModifyItemToCatalogueResponse_QNAME, ModifyItemToCatalogueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllItems }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tcf.isa.polytech.unice.fr/", name = "listAllItems")
    public JAXBElement<ListAllItems> createListAllItems(ListAllItems value) {
        return new JAXBElement<ListAllItems>(_ListAllItems_QNAME, ListAllItems.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveItemToCatalogueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tcf.isa.polytech.unice.fr/", name = "removeItemToCatalogueResponse")
    public JAXBElement<RemoveItemToCatalogueResponse> createRemoveItemToCatalogueResponse(RemoveItemToCatalogueResponse value) {
        return new JAXBElement<RemoveItemToCatalogueResponse>(_RemoveItemToCatalogueResponse_QNAME, RemoveItemToCatalogueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllItemsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tcf.isa.polytech.unice.fr/", name = "listAllItemsResponse")
    public JAXBElement<ListAllItemsResponse> createListAllItemsResponse(ListAllItemsResponse value) {
        return new JAXBElement<ListAllItemsResponse>(_ListAllItemsResponse_QNAME, ListAllItemsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyItemToCatalogue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tcf.isa.polytech.unice.fr/", name = "modifyItemToCatalogue")
    public JAXBElement<ModifyItemToCatalogue> createModifyItemToCatalogue(ModifyItemToCatalogue value) {
        return new JAXBElement<ModifyItemToCatalogue>(_ModifyItemToCatalogue_QNAME, ModifyItemToCatalogue.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddItemToCatalogue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tcf.isa.polytech.unice.fr/", name = "addItemToCatalogue")
    public JAXBElement<AddItemToCatalogue> createAddItemToCatalogue(AddItemToCatalogue value) {
        return new JAXBElement<AddItemToCatalogue>(_AddItemToCatalogue_QNAME, AddItemToCatalogue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddItemToCatalogueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tcf.isa.polytech.unice.fr/", name = "addItemToCatalogueResponse")
    public JAXBElement<AddItemToCatalogueResponse> createAddItemToCatalogueResponse(AddItemToCatalogueResponse value) {
        return new JAXBElement<AddItemToCatalogueResponse>(_AddItemToCatalogueResponse_QNAME, AddItemToCatalogueResponse.class, null, value);
    }

}
