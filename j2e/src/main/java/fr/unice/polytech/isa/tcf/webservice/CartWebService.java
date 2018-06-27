package fr.unice.polytech.isa.tcf.webservice;

import fr.unice.polytech.isa.tcf.entities.Advantage;
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
public interface CartWebService {

	@WebMethod
	@Interceptors({ItemVerifier.class})
	void addAdvantageToCustomerCart(@WebParam(name = "customer_name") String customerName,
									@WebParam(name = "quantity") int quantity,
									@WebParam(name = "id") int id)
			throws UnknownCustomerException, UncheckedException;

	@WebMethod
	@Interceptors({ItemVerifier.class})
	void removeAdvantageToCustomerCart(@WebParam(name = "customer_name") String customerName,
								  @WebParam(name = "quantity") int quantity,
								  @WebParam(name = "id") int id)
			throws UnknownCustomerException;

	@WebMethod
	@WebResult(name = "cart_contents")
	Set<Advantage> getCustomerCartContents(@WebParam(name = "customer_name") String customerName)
			throws UnknownCustomerException;

}
