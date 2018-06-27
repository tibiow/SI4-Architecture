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
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
@Transactional(TransactionMode.COMMIT)
public class CustomerTest extends AbstractTCFTest {

    @EJB private Customer john;

    private int id;

    private String name;
    private String password;
    private String mail;
    private String address;
    private int money;
    private boolean VUP;

    private Set<Item> cart = new HashSet<>();

    @Before
    public void setUpContext() throws Exception {
        id = 0;
        name = "Mr Bean";
        password = "joke";
        mail = "bean@joke.fr";
        address = "1 street comic London";
        money = 0;
        VUP = false;
    }

    @After
    public void cleaningUp() throws Exception {
        cart = new HashSet<>();
    }

    @Test
    public void createCustomer() throws Exception {
        john = new Customer(name, address, mail, password, VUP);
        assertEquals(john.getName(), name);
        assertEquals(john.getAddress(), address);
        assertEquals(john.getMail(), mail);
        assertEquals(john.getPassword(), password);
        assertEquals(john.getMoney(), 0);

    }

    @Test
    public void toStringCustomer() throws Exception {
        john = new Customer(name, address, mail, password, VUP);
        assertEquals(john.toString(), "Customer {" + "id=" + id + ", name='" + name + '\'' + ", address='" + address + '\'' +
                ", mail='" + mail + '\'' + ", password='" + password + '\'' + ", VUP='" + VUP + "\'"  + '}');
    }

    @Test
    public void moneyVariation() throws Exception {
        john = new Customer(name, address, mail, password, VUP);
        john.addMoney(200);
        assertEquals(200,john.getMoney());
        john.addMoney(10);
        assertEquals(210,john.getMoney());
        john.pay(200);
        assertEquals(10,john.getMoney());
        john.pay(200);
        assertEquals(10,john.getMoney());

    }

    @Test
    public void equalsCustomer() throws Exception {
        john = new Customer(name, address, mail, password, VUP);
        Customer eric = new Customer(name, address, mail, password, VUP);
        Customer jean = new Customer("Mr Bean", "1 street comic London", "bean@joke.fr", "joke", false);
        assertEquals(john, new Customer(name, address, mail, password, VUP));
        assertEquals(john, eric);
        assertEquals(john, jean);
        Customer robert = new Customer(name, name, mail, password, VUP);
        assertNotEquals(john, robert);
    }


}
