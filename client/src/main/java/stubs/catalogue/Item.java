
package stubs.catalogue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour item complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="offer" type="{http://webservice.tcf.isa.polytech.unice.fr/}offer" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
    "id",
    "offer",
    "quantity"
})
public class Item {

    protected int id;
    protected Offer offer;
    protected int quantity;

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété offer.
     * 
     * @return
     *     possible object is
     *     {@link Offer }
     *     
     */
    public Offer getOffer() {
        return offer;
    }

    /**
     * Définit la valeur de la propriété offer.
     * 
     * @param value
     *     allowed object is
     *     {@link Offer }
     *     
     */
    public void setOffer(Offer value) {
        this.offer = value;
    }

    /**
     * Obtient la valeur de la propriété quantity.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Définit la valeur de la propriété quantity.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

}
