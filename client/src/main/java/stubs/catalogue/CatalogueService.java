
package stubs.catalogue;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
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
@WebService(name = "CatalogueService", targetNamespace = "http://webservice.tcf.isa.polytech.unice.fr/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CatalogueService {


    /**
     * 
     * @param quantity
     * @param id
     * @param customerName
     * @throws UnknownCustomerException_Exception
     * @throws UncheckedException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "removeItemToCatalogue", targetNamespace = "http://webservice.tcf.isa.polytech.unice.fr/", className = "stubs.catalogue.RemoveItemToCatalogue")
    @ResponseWrapper(localName = "removeItemToCatalogueResponse", targetNamespace = "http://webservice.tcf.isa.polytech.unice.fr/", className = "stubs.catalogue.RemoveItemToCatalogueResponse")
    public void removeItemToCatalogue(
        @WebParam(name = "customer_name", targetNamespace = "")
        String customerName,
        @WebParam(name = "quantity", targetNamespace = "")
        int quantity,
        @WebParam(name = "id", targetNamespace = "")
        int id)
        throws UncheckedException_Exception, UnknownCustomerException_Exception
    ;

    /**
     * 
     * @param vup
     * @param gift
     * @param image
     * @param quantity
     * @param price
     * @param name
     * @param description
     * @param id
     * @param customerName
     * @param points
     * @throws UnknownCustomerException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "modifyItemToCatalogue", targetNamespace = "http://webservice.tcf.isa.polytech.unice.fr/", className = "stubs.catalogue.ModifyItemToCatalogue")
    @ResponseWrapper(localName = "modifyItemToCatalogueResponse", targetNamespace = "http://webservice.tcf.isa.polytech.unice.fr/", className = "stubs.catalogue.ModifyItemToCatalogueResponse")
    public void modifyItemToCatalogue(
        @WebParam(name = "customer_name", targetNamespace = "")
        String customerName,
        @WebParam(name = "quantity", targetNamespace = "")
        int quantity,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "description", targetNamespace = "")
        String description,
        @WebParam(name = "image", targetNamespace = "")
        String image,
        @WebParam(name = "VUP", targetNamespace = "")
        boolean vup,
        @WebParam(name = "gift", targetNamespace = "")
        boolean gift,
        @WebParam(name = "price", targetNamespace = "")
        double price,
        @WebParam(name = "points", targetNamespace = "")
        int points,
        @WebParam(name = "id", targetNamespace = "")
        int id)
        throws UnknownCustomerException_Exception
    ;

    /**
     * 
     * @param vup
     * @param gift
     * @param image
     * @param quantity
     * @param price
     * @param name
     * @param description
     * @param customerName
     * @param points
     * @throws UnknownCustomerException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "addItemToCatalogue", targetNamespace = "http://webservice.tcf.isa.polytech.unice.fr/", className = "stubs.catalogue.AddItemToCatalogue")
    @ResponseWrapper(localName = "addItemToCatalogueResponse", targetNamespace = "http://webservice.tcf.isa.polytech.unice.fr/", className = "stubs.catalogue.AddItemToCatalogueResponse")
    public void addItemToCatalogue(
        @WebParam(name = "customer_name", targetNamespace = "")
        String customerName,
        @WebParam(name = "quantity", targetNamespace = "")
        int quantity,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "description", targetNamespace = "")
        String description,
        @WebParam(name = "image", targetNamespace = "")
        String image,
        @WebParam(name = "VUP", targetNamespace = "")
        boolean vup,
        @WebParam(name = "gift", targetNamespace = "")
        boolean gift,
        @WebParam(name = "price", targetNamespace = "")
        double price,
        @WebParam(name = "points", targetNamespace = "")
        int points)
        throws UnknownCustomerException_Exception
    ;

    /**
     * 
     * @param customerName
     * @return
     *     returns java.util.List<stubs.catalogue.Item>
     * @throws UnknownCustomerException_Exception
     */
    @WebMethod
    @WebResult(name = "Item", targetNamespace = "")
    @RequestWrapper(localName = "listAllItems", targetNamespace = "http://webservice.tcf.isa.polytech.unice.fr/", className = "stubs.catalogue.ListAllItems")
    @ResponseWrapper(localName = "listAllItemsResponse", targetNamespace = "http://webservice.tcf.isa.polytech.unice.fr/", className = "stubs.catalogue.ListAllItemsResponse")
    public List<Item> listAllItems(
        @WebParam(name = "customer_name", targetNamespace = "")
        String customerName)
        throws UnknownCustomerException_Exception
    ;

}