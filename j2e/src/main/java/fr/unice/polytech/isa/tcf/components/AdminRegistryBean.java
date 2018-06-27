package fr.unice.polytech.isa.tcf.components;

import fr.unice.polytech.isa.tcf.AdminFinder;
import fr.unice.polytech.isa.tcf.AdminRegistration;
import fr.unice.polytech.isa.tcf.entities.Admin;
import fr.unice.polytech.isa.tcf.exceptions.AlreadyExistingAdminException;
import fr.unice.polytech.isa.tcf.exceptions.AlreadyExistingCustomerException;
import org.json.*;

import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import fr.unice.polytech.isa.tcf.utils.MailUtils;
import sun.net.www.http.HttpClient;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jms.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@Startup
public class AdminRegistryBean implements AdminRegistration, AdminFinder {

    private static final Logger log = Logger.getLogger(Logger.class.getName());

    @PersistenceContext private EntityManager manager;
    @Resource private ConnectionFactory connectionFactory;

    @PostConstruct
    void init() throws AlreadyExistingAdminException{
        register("admin","admin@gmail.com","admin");
    }


    /******************************************
     ** Customer Registration implementation **
     ******************************************/

	/*
	 * Test if the customer already exist
	 * If yes throws an AlreadyExistingCustomerException
	 * If no, add it to the database and send information to doNet server for the mail service end the Cerberus service
	 */
    @Override
    public void register(String name, String mail, String password) throws AlreadyExistingAdminException {
        if(findByName(name).isPresent()) throw new AlreadyExistingAdminException(name);
        Admin c = new Admin(name, mail, password);
        manager.persist(c);
    }


    /************************************
     ** Customer Finder implementation **
     ************************************/

    @Override
    public Optional<Admin> findByName(String name) {
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<Admin> criteria = builder.createQuery(Admin.class);
        Root<Admin> root =  criteria.from(Admin.class);
        criteria.select(root).where(builder.equal(root.get("name"), name));
        TypedQuery<Admin> query = manager.createQuery(criteria);
        try {
            return Optional.of(query.getSingleResult());
        } catch (NoResultException nre){
            log.log(Level.FINEST, "No result for ["+name+"]", nre);
            return Optional.empty();
        }
    }

}

