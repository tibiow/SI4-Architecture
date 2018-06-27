package fr.unice.polytech.isa.tcf.utils;

import fr.unice.polytech.isa.tcf.entities.Customer;
import fr.unice.polytech.isa.tcf.exceptions.ExternalPartnerException;
import fr.unice.polytech.isa.tcf.exceptions.MailFailException;
import org.apache.cxf.jaxrs.client.WebClient;
import org.json.JSONObject;

import javax.ws.rs.core.MediaType;


public class MailUtils {

    private String url;

    public MailUtils(String host, String port) {
        this.url = "http://" + host + ":" + port;
    }

    public MailUtils() { this("localhost", "9090"); }

    public void performMail(Customer customer) throws ExternalPartnerException, MailFailException {
        // Building payment request
        JSONObject request = new JSONObject().put("Mail", customer.getMail()).put("Mail", customer.getMail());
        System.out.println("\nMail Request send : "+request + "\n");
        // Sending a Payment request to the mailbox
        try {
            String str = WebClient.create(url).path("/mailbox")
                    .accept(MediaType.APPLICATION_JSON_TYPE).header("Content-Type", MediaType.APPLICATION_JSON)
                    .post(request.toString(), String.class);
            if(Integer.parseInt(str) != 1) throw new MailFailException(customer.getName());
        } catch (Exception e) {
            throw new ExternalPartnerException(url+"/mailbox", e);
        }


    }

}
