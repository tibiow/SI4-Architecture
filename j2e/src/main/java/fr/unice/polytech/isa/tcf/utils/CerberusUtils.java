package fr.unice.polytech.isa.tcf.utils;

import fr.unice.polytech.isa.tcf.entities.Customer;
import fr.unice.polytech.isa.tcf.exceptions.AlreadyExistingCustomerException;
import fr.unice.polytech.isa.tcf.exceptions.ExternalPartnerException;
import org.apache.cxf.jaxrs.client.WebClient;
import org.json.JSONObject;

import javax.ws.rs.core.MediaType;


public class CerberusUtils {

    private String url;

    public CerberusUtils(String host, String port) {
        this.url = "http://" + host + ":" + port;
    }

    public CerberusUtils() { this("localhost", "9090"); }

    public void performCerberus(Customer customer) throws ExternalPartnerException {
        // Building payment request
        JSONObject request = new JSONObject().put("Mail", customer.getMail());
        request.put("Mdp", customer.getPassword());
        request.put("ID", customer.getId());
        System.out.println("\nCerberus Request send : "+request + "\n");

        // Sending a Payment request to the cerberus
        try {
            String str = WebClient.create(url).path("/cerberus")
                    .accept(MediaType.APPLICATION_JSON_TYPE).header("Content-Type", MediaType.APPLICATION_JSON)
                    .post(request.toString(), String.class);
            if(Integer.parseInt(str) != 1) throw new AlreadyExistingCustomerException(customer.getName());

        } catch (Exception e) {
            throw new ExternalPartnerException(url+"/cerberus", e);
        }

    }

}
