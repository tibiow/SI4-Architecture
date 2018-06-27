
package stubs.traderCare;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AlreadyExistingTraderException complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AlreadyExistingTraderException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conflictingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlreadyExistingTraderException", propOrder = {
    "conflictingName",
    "message"
})
public class AlreadyExistingTraderException {

    protected String conflictingName;
    protected String message;

    /**
     * Obtient la valeur de la propriété conflictingName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConflictingName() {
        return conflictingName;
    }

    /**
     * Définit la valeur de la propriété conflictingName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConflictingName(String value) {
        this.conflictingName = value;
    }

    /**
     * Obtient la valeur de la propriété message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Définit la valeur de la propriété message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
