package fr.unice.polytech.isa.tcf.entities;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class Trader implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private String name;

    @NotNull
    private String password;

    @NotNull
    private String mail;

    @NotNull
    private String address;

    public Trader() {
        // Necessary for JPA instantiation process
    }

    public Trader(String n, String ad, String ml, String mdp) {
        name = n;
        password = mdp;
        address = ad;
        mail = ml;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
        return result;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Trader))
            return false;

        Trader trader = (Trader) o;

        if (getName() != null ? !getName().equals(trader.getName()) : trader.getName() != null)
            return false;
        if (getPassword() != null ? !getPassword().equals(trader.getPassword()) : trader.getPassword() != null)
            return false;
        if (getMail() != null ? !getMail().equals(trader.getMail()) : trader.getMail() != null)
            return false;
        if (getAddress() != null ? !getAddress().equals(trader.getAddress()) : trader.getAddress() != null)
            return false;
        return true;

    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Trader {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}