package fr.unice.polytech.isa.tcf.webservice;

import fr.unice.polytech.isa.tcf.exceptions.AlreadyExistingCustomerException;
import fr.unice.polytech.isa.tcf.exceptions.UnknownCustomerException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface CustomerCareService {

	@WebMethod
	void register(@WebParam(name="customer_name") String name,
				  @WebParam(name="customer_address") String address,
				  @WebParam(name="customer_mail") String mail,
                  @WebParam(name="customer_password") String password,
				  @WebParam(name="vup") boolean vup)
			throws AlreadyExistingCustomerException;

	@WebMethod
	void addMoney(@WebParam(name = "customer_name") String customerName,
				  @WebParam(name = "customer_money") int customerMoney);

	@WebMethod
	void pay(@WebParam(name = "customer_name") String customerName,
			 @WebParam(name = "customer_cost") int customerCost);

	@WebMethod
	void customerLogin(@WebParam(name = "customer_name") String customerName,
			 @WebParam(name = "customer_password") String customerPassword) throws UnknownCustomerException;



}
