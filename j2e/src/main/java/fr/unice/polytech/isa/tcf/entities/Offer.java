package fr.unice.polytech.isa.tcf.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Embeddable
public class Offer implements Serializable {

    @NotNull
    private String name;

    @NotNull
    private String description;

    @NotNull
    private String image;

    @NotNull
    private boolean VUP = false;

    @NotNull
    private boolean gift = false;

    @NotNull
    private double price;

    @NotNull
    private int points;

    public Offer() {}

    public Offer(Offer o) {
        name = o.getName();
        description = o.getDescription();
        image = o.getImage();
        gift = o.isGift();
        VUP = o.isVUP();
        price = o.getPrice();
        points = o.getPoints();
    }

    public Offer(String name, String des, String image, boolean vup, boolean g, double pri, int poi) {
        this.name = name;
        this.description = des;
        this.image = image;
        this.VUP = vup;
        this.gift = g;
        this.price = pri;
        this.points = poi;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public String getImage() {return image;}

    public void setImage(String image) {this.image = image;}

    public boolean isVUP() {return VUP;}

    public void setVUP(boolean VUP) {this.VUP = VUP;}

    public boolean isGift() {return gift;}

    public void setGift(boolean gift) {this.gift = gift;}

    public double getPrice() {return price;}

    public void setPrice(double price) {this.price = price;}

    public int getPoints() {return points;}

    public void setPoints(int points) {this.points = points;}

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (getImage() != null ? getImage().hashCode() : 0);
        return result;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if(o == null)
            return false;
        if(getClass() != o.getClass())
            return false;
        if (!(o instanceof Offer))
            return false;

        Offer offer = (Offer) o;

        if (getPrice() != offer.getPrice())
            return false;
        if (getPoints() != offer.getPoints())
            return false;
        if (isVUP() != offer.isVUP())
            return false;
        if(isGift() != offer.isGift())
            return false;
        if (getName() != null ? !getName().equals(offer.getName()) : offer.getName() != null)
            return false;
        if (getDescription() != null ? !getDescription().equals(offer.getDescription()) : offer.getDescription() != null)
            return false;
        if (getImage() != null ? !getImage().equals(offer.getImage()) : offer.getImage() != null)
            return false;
        return true;

    }

}
