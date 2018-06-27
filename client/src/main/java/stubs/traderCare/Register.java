
package stubs.traderCare;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour register complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="register">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trader_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trader_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trader_mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trader_password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "register", propOrder = {
    "traderName",
    "traderAddress",
    "traderMail",
    "traderPassword"
})
public class Register {

    @XmlElement(name = "trader_name")
    protected String traderName;
    @XmlElement(name = "trader_address")
    protected String traderAddress;
    @XmlElement(name = "trader_mail")
    protected String traderMail;
    @XmlElement(name = "trader_password")
    protected String traderPassword;

    /**
     * Obtient la valeur de la propriété traderName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderName() {
        return traderName;
    }

    /**
     * Définit la valeur de la propriété traderName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderName(String value) {
        this.traderName = value;
    }

    /**
     * Obtient la valeur de la propriété traderAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderAddress() {
        return traderAddress;
    }

    /**
     * Définit la valeur de la propriété traderAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderAddress(String value) {
        this.traderAddress = value;
    }

    /**
     * Obtient la valeur de la propriété traderMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderMail() {
        return traderMail;
    }

    /**
     * Définit la valeur de la propriété traderMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderMail(String value) {
        this.traderMail = value;
    }

    /**
     * Obtient la valeur de la propriété traderPassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderPassword() {
        return traderPassword;
    }

    /**
     * Définit la valeur de la propriété traderPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderPassword(String value) {
        this.traderPassword = value;
    }

}
