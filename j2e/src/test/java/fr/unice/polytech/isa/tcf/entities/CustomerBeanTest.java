package fr.unice.polytech.isa.tcf.entities;

import arquillian.AbstractTCFTest;
import fr.unice.polytech.isa.tcf.components.CustomerRegistryBean;
import fr.unice.polytech.isa.tcf.exceptions.AlreadyExistingCustomerException;
import fr.unice.polytech.isa.tcf.managed.CustomerBean;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.transaction.api.annotation.TransactionMode;
import org.jboss.arquillian.transaction.api.annotation.Transactional;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;
import javax.ejb.EJB;
import javax.jms.ConnectionFactory;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
@Transactional(TransactionMode.COMMIT)
public class CustomerBeanTest extends AbstractTCFTest {
    static private CustomerRegistryBean customerRegistryBean;

    @BeforeClass
    public static void setUpContext() throws Exception {
        customerRegistryBean = mock(CustomerRegistryBean.class);
        customerRegistryBean.manager = mock(EntityManager.class);
        customerRegistryBean.connectionFactory = mock(ConnectionFactory.class);
    }

    @After
    public void cleaningUp() throws Exception {
    }

    @Test
    public void addCustomer() throws AlreadyExistingCustomerException{
    }

    @Test
    public void addAlreadyExistingCustomer() throws AlreadyExistingCustomerException{
    }


}