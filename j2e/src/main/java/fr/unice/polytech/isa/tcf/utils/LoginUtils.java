package fr.unice.polytech.isa.tcf.utils;

import fr.unice.polytech.isa.tcf.entities.Customer;
import fr.unice.polytech.isa.tcf.exceptions.AlreadyExistingCustomerException;
import fr.unice.polytech.isa.tcf.exceptions.ExternalPartnerException;
import fr.unice.polytech.isa.tcf.exceptions.UnknownCustomerException;
import org.apache.cxf.jaxrs.client.WebClient;
import org.json.JSONObject;

import javax.ws.rs.core.MediaType;


public class LoginUtils {

    private String url;

    public LoginUtils(String host, String port) {
        this.url = "http://" + host + ":" + port;
    }

    public LoginUtils() { this("localhost", "9090"); }

    public void performLogin(String name, String mdp) throws ExternalPartnerException {
        // Building payment request
        JSONObject request = new JSONObject().put("name", name);
        request.put("Mdp", mdp);
        System.out.println("\nLogin Request send : "+request + "\n");

        try {
            String str = WebClient.create(url).path("/login")
                    .accept(MediaType.APPLICATION_JSON_TYPE).header("Content-Type", MediaType.APPLICATION_JSON)
                    .post(request.toString(), String.class);
            if(Integer.parseInt(str) != 1) throw new UnknownCustomerException();

        } catch (Exception e) {
            throw new ExternalPartnerException(url+"/login", e);
        }

    }

}
