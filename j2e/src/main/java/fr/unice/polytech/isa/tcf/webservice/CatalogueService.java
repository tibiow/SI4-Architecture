package fr.unice.polytech.isa.tcf.webservice;

import fr.unice.polytech.isa.tcf.entities.Item;
import fr.unice.polytech.isa.tcf.exceptions.UncheckedException;
import fr.unice.polytech.isa.tcf.exceptions.UnknownCustomerException;
import fr.unice.polytech.isa.tcf.interceptors.ItemVerifier;

import javax.interceptor.Interceptors;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.Set;

@WebService
public interface CatalogueService {

    @WebMethod
    @WebResult(name = "Item")
    Set<Item> listAllItems(@WebParam(name = "customer_name") String customerName)
            throws UnknownCustomerException;

    @WebMethod
    @Interceptors({ItemVerifier.class})
    void addItemToCatalogue(@WebParam(name = "customer_name") String customerName,
                            @WebParam(name = "quantity") int quantity,
                            @WebParam(name = "name") String name,
                            @WebParam(name = "description") String description,
                            @WebParam(name = "image") String image,
                            @WebParam(name = "VUP") boolean VUP,
                            @WebParam(name = "gift") boolean gift,
                            @WebParam(name = "price") double price,
                            @WebParam(name = "points") int points)
            throws UnknownCustomerException;

    @WebMethod
    @Interceptors({ItemVerifier.class})
    void removeItemToCatalogue(@WebParam(name = "customer_name") String customerName,
                               @WebParam(name = "quantity") int quantity,
                               @WebParam(name = "id") int id)
            throws UnknownCustomerException, UncheckedException;

    @WebMethod
    @Interceptors({ItemVerifier.class})
    void modifyItemToCatalogue(@WebParam(name = "customer_name") String customerName,
                               @WebParam(name = "quantity") int quantity,
                               @WebParam(name = "name") String name,
                               @WebParam(name = "description") String description,
                               @WebParam(name = "image") String image,
                               @WebParam(name = "VUP") boolean VUP,
                               @WebParam(name = "gift") boolean gift,
                               @WebParam(name = "price") double price,
                               @WebParam(name = "points") int points,
                               @WebParam(name = "id") int id)
            throws UnknownCustomerException;

}