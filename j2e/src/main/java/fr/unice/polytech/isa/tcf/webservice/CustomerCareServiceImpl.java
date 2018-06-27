package fr.unice.polytech.isa.tcf.webservice;

import fr.unice.polytech.isa.tcf.CustomerLogin;
import fr.unice.polytech.isa.tcf.CustomerRegistration;
import fr.unice.polytech.isa.tcf.CustomerFinder;
import fr.unice.polytech.isa.tcf.entities.Customer;
import fr.unice.polytech.isa.tcf.exceptions.AlreadyExistingCustomerException;
import fr.unice.polytech.isa.tcf.exceptions.UnknownCustomerException;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;
import java.util.Optional;

@WebService(targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/tcf/customer-care")
@Stateless(name = "CustomerCareWS")
public class CustomerCareServiceImpl implements CustomerCareService {

	@EJB private CustomerRegistration registry;
	@EJB private CustomerFinder finder;
	@EJB private CustomerLogin login;



	@Override
	public void addMoney(String customerName,int customerMoney) {
		try {
			Customer c = readCustomer(customerName);
			c.addMoney(customerMoney);
		} catch (UnknownCustomerException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void pay(String customerName,int customerCost) {
		try {
			Customer c = readCustomer(customerName);
			c.pay(customerCost);
		} catch (UnknownCustomerException e) {
			e.printStackTrace();
		}
	}

    @Override
    public void register(String name, String adress, String mail, String password, boolean vup) throws AlreadyExistingCustomerException {
        registry.register(name, adress, mail, password, vup);
    }

	@Override
	public void customerLogin(String name, String password) throws UnknownCustomerException {
		login.login(name, password);
	}

	private Customer readCustomer(String customerName)
			throws UnknownCustomerException {
		Optional<Customer> c = finder.findByName(customerName);
		return c.get();
	}
}
