package fr.unice.polytech.isa.tcf.entities;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="customers")
public class Customer implements Serializable {

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

	@NotNull
	private int money;

	@NotNull
	private boolean VUP;

	@OneToMany(cascade={CascadeType.ALL}, fetch=FetchType.EAGER)
	private Set<Advantage> advantages = new HashSet<>();

	public Customer() {
		// Necessary for JPA instantiation process
	}

	public Customer(String n, String ad, String ml, String mdp, boolean vup) {
		name = n;
		password = mdp;
		address = ad;
		mail = ml;
		money = 0;
		VUP = vup;
	}

	public boolean isVUP() {
		return VUP;
	}

	public void setVUP(boolean VUP) {
		this.VUP = VUP;
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

	public void setAdvantages(Set<Advantage> o) {
		advantages = o;
	}
	public Set<Advantage> getAdvantages() { return advantages; }

    public void setMoney(int money){this.money = money;}
    public int getMoney(){return money;}
    public void addMoney(int money){this.money+=money;}
    public void pay(int cost){if(money > cost)money -= cost;}

    @Override
	public int hashCode() {
		int result = getName() != null ? getName().hashCode() : 0;
		result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
		result = 31 * result + (getAdvantages() != null ? getAdvantages().hashCode() : 0);
		return result;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o)
		    return true;
		if (!(o instanceof Customer))
		    return false;

		Customer customer = (Customer) o;

		if (getName() != null ? !getName().equals(customer.getName()) : customer.getName() != null)
		    return false;
		if (getPassword() != null ? !getPassword().equals(customer.getPassword()) : customer.getPassword() != null)
			return false;
		if (getMail() != null ? !getMail().equals(customer.getMail()) : customer.getMail() != null)
			return false;
		if (getAddress() != null ? !getAddress().equals(customer.getAddress()) : customer.getAddress() != null)
			return false;
		if (isVUP() != customer.isVUP())
			return false;
		return getAdvantages() != null ? getAdvantages().equals(customer.getAdvantages()) : customer.getAdvantages() == null;

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
		return "Customer {" +
				"id=" + id +
				", name='" + name + '\'' +
				", address='" + address + '\'' +
				", mail='" + mail + '\'' +
				", password='" + password + '\'' +
				", VUP='" + VUP + '\'' +
				'}';
	}
}