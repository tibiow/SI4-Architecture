package fr.unice.polytech.isa.tcf.exceptions;

import javax.xml.ws.WebFault;
import java.io.Serializable;

@WebFault
public class AlreadyExistingAdminException extends Exception implements Serializable {

    private String conflictingName;

    public AlreadyExistingAdminException(String name) {
        super("Error Admin " + name + "  already exist");
        conflictingName = name;
    }


    public AlreadyExistingAdminException() {
    }

    public String getConflictingName() {
        return conflictingName;
    }

    public void setConflictingName(String conflictingName) {
        this.conflictingName = conflictingName;
    }
}
