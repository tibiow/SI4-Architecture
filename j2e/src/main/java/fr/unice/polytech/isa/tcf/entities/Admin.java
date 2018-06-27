package fr.unice.polytech.isa.tcf.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class Admin implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private String password;

    @NotNull
    private String mail;

    @NotNull
    private String name;

    public Admin() {
        // Necessary for JPA instantiation process
    }

    public Admin(String n, String ml, String mdp) {
        name = n;
        password = mdp;
        mail = ml;
    }

    public int getId() {
        return id;
    }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }



    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
        return result;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Admin))
            return false;

        Admin admin = (Admin) o;

        if (getPassword() != null ? !getPassword().equals(admin.getPassword()) : admin.getPassword() != null)
            return false;
        if (getMail() != null ? !getMail().equals(admin.getMail()) : admin.getMail() != null)
            return false;
        return true;

    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Admin {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}