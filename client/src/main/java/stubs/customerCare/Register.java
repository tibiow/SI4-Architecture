
package stubs.customerCare;

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
 *         &lt;element name="customer_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customer_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customer_mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customer_password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vup" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "customerName",
    "customerAddress",
    "customerMail",
    "customerPassword",
    "vup"
})
public class Register {

    @XmlElement(name = "customer_name")
    protected String customerName;
    @XmlElement(name = "customer_address")
    protected String customerAddress;
    @XmlElement(name = "customer_mail")
    protected String customerMail;
    @XmlElement(name = "customer_password")
    protected String customerPassword;
    protected boolean vup;

    /**
     * Obtient la valeur de la propriété customerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Définit la valeur de la propriété customerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Obtient la valeur de la propriété customerAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * Définit la valeur de la propriété customerAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAddress(String value) {
        this.customerAddress = value;
    }

    /**
     * Obtient la valeur de la propriété customerMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerMail() {
        return customerMail;
    }

    /**
     * Définit la valeur de la propriété customerMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerMail(String value) {
        this.customerMail = value;
    }

    /**
     * Obtient la valeur de la propriété customerPassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPassword() {
        return customerPassword;
    }

    /**
     * Définit la valeur de la propriété customerPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPassword(String value) {
        this.customerPassword = value;
    }

    /**
     * Obtient la valeur de la propriété vup.
     * 
     */
    public boolean isVup() {
        return vup;
    }

    /**
     * Définit la valeur de la propriété vup.
     * 
     */
    public void setVup(boolean value) {
        this.vup = value;
    }

}
