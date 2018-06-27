package fr.unice.polytech.isa.tcf.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name= "advantages")
public class Advantage implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Embedded
	private Offer offer;

	@NotNull
	private int quantity;

	@Enumerated(EnumType.STRING)
	private AdvantageStatus status = AdvantageStatus.EN_ATTENT;

	public Advantage() {
		// Necessary for JPA instantiation process
	}

	public Advantage(Offer offer, int quantity) {
		this.offer = offer;
		this.quantity = quantity;
	}

	public Advantage(Item i) {
		this.offer = i.getOffer();
		this.quantity = i.getQuantity();
	}

	public int getId() {
		return id;
	}
	public void setId(int id)  {this.id = id;}

	public Offer getOffer() {
		return offer;
	}
	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public AdvantageStatus getStatus() { return status; }
	public void setStatus(AdvantageStatus status) { this.status = status; }

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Advantage))
			return false;
		Advantage advantage = (Advantage) o;
		if (getOffer() != null ? !getOffer().equals(advantage.getOffer()) : advantage.getOffer() != null)
			return false;
		if (getQuantity() != advantage.getQuantity())
			return false;
		return getStatus() == advantage.getStatus();
	}

	@Override
	public int hashCode() {
		int result = (getOffer() != null ? getOffer().hashCode() : 0);
		result = 31 * result + (getStatus() != null ? getStatus().hashCode() : 0);
		return result;
	}

}
