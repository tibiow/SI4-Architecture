package fr.unice.polytech.isa.tcf.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name= "catalogue")
public class Item implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Embedded
	private Offer offer;

	@NotNull
	private int quantity;

	public Item() {
		// Necessary for JPA instantiation process
	}

	public Item(Offer o, int q) {
		offer = o;
		quantity = q;
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

	@Override
	public boolean equals(Object o) {
		if (this == o)
		    return true;
		if (!(o instanceof Item))
		    return false;
		Item item = (Item) o;
		return getOffer().equals(item.getOffer());

	}

	@Override
	public int hashCode() {
		int result = getOffer().hashCode();
		result = 31 * result + getQuantity();
		return result;
	}

}
