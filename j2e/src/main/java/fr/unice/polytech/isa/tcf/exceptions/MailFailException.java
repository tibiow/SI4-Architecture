package fr.unice.polytech.isa.tcf.exceptions;

import javax.xml.ws.WebFault;
import java.io.Serializable;

@WebFault
public class MailFailException extends Exception implements Serializable {

    private String conflictingName;

    public MailFailException(String name) {
        super("Cannot send mail for" + name);
        conflictingName = name;
    }


    public MailFailException() {
    }

    public String getConflictingName() {
        return conflictingName;
    }

    public void setConflictingName(String conflictingName) {
        this.conflictingName = conflictingName;
    }
}
