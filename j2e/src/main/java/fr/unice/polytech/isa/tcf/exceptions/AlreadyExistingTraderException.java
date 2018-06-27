package fr.unice.polytech.isa.tcf.exceptions;

import javax.xml.ws.WebFault;
import java.io.Serializable;

@WebFault
public class AlreadyExistingTraderException extends Exception implements Serializable {

    private String conflictingName;

    public AlreadyExistingTraderException(String name) {
        super("Error Trader " + name + " already exist");
        conflictingName = name;
    }


    public AlreadyExistingTraderException() {
    }

    public String getConflictingName() {
        return conflictingName;
    }

    public void setConflictingName(String conflictingName) {
        this.conflictingName = conflictingName;
    }
}
