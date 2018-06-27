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
public class AdminTest extends AbstractTCFTest {

    @EJB private Admin john;

    private int id;
    private String name;
    private String password;
    private String mail;

    @Before
    public void setUpContext() throws Exception {
        id = 0;
        name = "Mr Bean";
        password = "joke";
        mail = "bean@joke.fr";
    }

    @Test
    public void createAdmin() throws Exception {
        john = new Admin(name, mail, password);
        assertEquals(john.getMail(), mail);
        assertEquals(john.getPassword(), password);
        assertEquals(john.getMail(), mail);
    }

    @Test
    public void toStringAdmin() throws Exception {
        john = new Admin(name, mail, password);
        assertEquals(john.toString(), "Admin {" + "id=" + id + ", name='" + name + '\'' +
                ", mail='" + mail + '\'' + ", password='" + password + '\'' + '}');
    }

    @Test
    public void equalsAdmin() throws Exception {
        john = new Admin(name, mail, password);
        Admin eric = new Admin(name, mail, password);
        Admin jean = new Admin("Mr Bean","bean@joke.fr", "joke");
        assertEquals(john, new Admin(name, mail, password));
        assertEquals(john, eric);
        assertEquals(john, jean);
    }

}
