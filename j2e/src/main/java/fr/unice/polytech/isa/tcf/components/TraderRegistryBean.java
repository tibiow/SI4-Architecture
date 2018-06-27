package fr.unice.polytech.isa.tcf.components;

import fr.unice.polytech.isa.tcf.TraderFinder;
import fr.unice.polytech.isa.tcf.TraderRegistration;

import fr.unice.polytech.isa.tcf.entities.Trader;
import fr.unice.polytech.isa.tcf.exceptions.AlreadyExistingTraderException;

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
import javax.annotation.Resource;
import javax.jms.*;

@Stateless
public class TraderRegistryBean implements TraderRegistration, TraderFinder {

    private static final Logger log = Logger.getLogger(Logger.class.getName());

    @PersistenceContext private EntityManager manager;
    @Resource private ConnectionFactory connectionFactory;


    /******************************************
     ** Customer Registration implementation **
     ******************************************/

	/*
	 * Test if the customer already exist
	 * If yes throws an AlreadyExistingCustomerException
	 * If no, add it to the database and send information to doNet server for the mail service end the Cerberus service
	 */
    @Override
    public void register(String name, String adress, String mail, String password) throws AlreadyExistingTraderException {
        if(findByName(name).isPresent()) throw new AlreadyExistingTraderException(name);
        Trader c = new Trader(name, adress , mail, password);
        manager.persist(c);
    }


    /************************************
     ** Customer Finder implementation **
     ************************************/

    @Override
    public Optional<Trader> findByName(String name) {
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<Trader> criteria = builder.createQuery(Trader.class);
        Root<Trader> root =  criteria.from(Trader.class);
        criteria.select(root).where(builder.equal(root.get("name"), name));
        TypedQuery<Trader> query = manager.createQuery(criteria);
        try {
            return Optional.of(query.getSingleResult());
        } catch (NoResultException nre){
            log.log(Level.FINEST, "No result for ["+name+"]", nre);
            return Optional.empty();
        }
    }

}

