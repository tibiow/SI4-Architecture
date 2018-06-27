package fr.unice.polytech.isa.tcf;

import fr.unice.polytech.isa.tcf.exceptions.AlreadyExistingCustomerException;

import javax.ejb.Local;

@Local
public interface CustomerRegistration {

	void register(String customerName, String customerAddress, String customerMail, String customerPassword, boolean vup)
			throws AlreadyExistingCustomerException;

}

