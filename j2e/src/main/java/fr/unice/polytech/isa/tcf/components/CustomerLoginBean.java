package fr.unice.polytech.isa.tcf.components;

import fr.unice.polytech.isa.tcf.CustomerFinder;
import fr.unice.polytech.isa.tcf.CustomerLogin;
import fr.unice.polytech.isa.tcf.CustomerRegistration;
import fr.unice.polytech.isa.tcf.entities.Customer;
import fr.unice.polytech.isa.tcf.exceptions.AlreadyExistingCustomerException;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import fr.unice.polytech.isa.tcf.exceptions.UnknownCustomerException;
import fr.unice.polytech.isa.tcf.utils.LoginUtils;
import fr.unice.polytech.isa.tcf.utils.MailUtils;
import fr.unice.polytech.isa.tcf.utils.CerberusUtils;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.jms.*;

@Stateless
public class CustomerLoginBean implements CustomerLogin, CustomerFinder {

    private static final Logger log = Logger.getLogger(Logger.class.getName());

    @PersistenceContext public EntityManager manager;
    @Resource public ConnectionFactory connectionFactory;
    @EJB LoginUtils login;

    /******************************************
     ** Customer Registration implementation **
     ******************************************/

	/*
	 * Test if the customer already exist
	 * If yes throws an AlreadyExistingCustomerException
	 * If no, add it to the database and send information to doNet server for the mail service end the Cerberus service
	 */
    @Override
    public void login(String name, String password) throws UnknownCustomerException {
        if(!findByName(name).isPresent())
            throw new UnknownCustomerException(name);

        send(name,password);

    }


    /************************************
     ** Customer Finder implementation **
     ************************************/

    @Override
    public Optional<Customer> findByName(String name) {
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<Customer> criteria = builder.createQuery(Customer.class);
        Root<Customer> root =  criteria.from(Customer.class);
        criteria.select(root).where(builder.equal(root.get("name"), name));
        TypedQuery<Customer> query = manager.createQuery(criteria);
        try {
            return Optional.of(query.getSingleResult());
        } catch (NoResultException nre){
            log.log(Level.FINEST, "No result for ["+name+"]", nre);
            return Optional.empty();
        }
    }

    /*
     * Will send information to the dotNet server for the login service end the Cerberus service
     */
    private void send(String name, String password) {
        try {
            System.out.println("\n***Sending request***");
            LoginUtils login = new LoginUtils();
            login.performLogin(name , password);
            System.out.println("\n***Request send***");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

