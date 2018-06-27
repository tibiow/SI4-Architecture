package fr.unice.polytech.isa.tcf.exceptions;

import javax.xml.ws.WebFault;
import java.io.Serializable;

@WebFault
public class AlreadyExistingCustomerException extends Exception implements Serializable {

	private String conflictingName;

	public AlreadyExistingCustomerException(String name) {
		super("Error Customer " + name + " already exist");
		conflictingName = name;
	}


	public AlreadyExistingCustomerException() {
	}

	public String getConflictingName() {
		return conflictingName;
	}

	public void setConflictingName(String conflictingName) {
		this.conflictingName = conflictingName;
	}
}
