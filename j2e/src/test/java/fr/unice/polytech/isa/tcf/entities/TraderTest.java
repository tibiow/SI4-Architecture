package fr.unice.polytech.isa.tcf.entities;

import arquillian.AbstractTCFTest;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.transaction.api.annotation.TransactionMode;
import org.jboss.arquillian.transaction.api.annotation.Transactional;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;
import javax.persistence.criteria.Order;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
@Transactional(TransactionMode.COMMIT)
public class TraderTest extends AbstractTCFTest {

    @EJB private Trader john;

    private int id;

    private String name;
    private String password;
    private String mail;
    private String address;
    private int money;

    private Set<Order> orders = new HashSet<>();
    private Set<Item> cart = new HashSet<>();

    @Before
    public void setUpContext() throws Exception {
        id = 0;
        name = "Mr Bean";
        password = "joke";
        mail = "bean@joke.fr";
        address = "1 street comic London";
        money = 0;
    }

    @After
    public void cleaningUp() throws Exception {
        orders = new HashSet<>();
        cart = new HashSet<>();
    }

    @Test
    public void createTrader() throws Exception {
        john = new Trader(name, address, mail, password);
        assertEquals(john.getName(), name);
        assertEquals(john.getAddress(), address);
        assertEquals(john.getMail(), mail);
        assertEquals(john.getPassword(), password);
    }

    @Test
    public void toStringTrader() throws Exception {
        john = new Trader(name, address, mail, password);
        assertEquals(john.toString(), "Trader {" + "id=" + id + ", name='" + name + '\'' + ", address='" + address + '\'' +
                ", mail='" + mail + '\'' + ", password='" + password + '\'' + '}');
    }

    @Test
    public void equalsTrader() throws Exception {
        john = new Trader(name, address, mail, password);
        Trader eric = new Trader(name, address, mail, password);
        Trader jean = new Trader("Mr Bean", "1 street comic London", "bean@joke.fr", "joke");
        assertEquals(john, new Trader(name, address, mail, password));
        assertEquals(john, eric);
        assertEquals(john, jean);
        Trader robert = new Trader(name, name, mail, password);
        assertNotEquals(john, robert);
    }

}
