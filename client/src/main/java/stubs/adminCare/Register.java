
package stubs.adminCare;

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
 *         &lt;element name="admin_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="admin_mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customer_password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "adminName",
    "adminMail",
    "customerPassword"
})
public class Register {

    @XmlElement(name = "admin_name")
    protected String adminName;
    @XmlElement(name = "admin_mail")
    protected String adminMail;
    @XmlElement(name = "customer_password")
    protected String customerPassword;

    /**
     * Obtient la valeur de la propriété adminName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * Définit la valeur de la propriété adminName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminName(String value) {
        this.adminName = value;
    }

    /**
     * Obtient la valeur de la propriété adminMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminMail() {
        return adminMail;
    }

    /**
     * Définit la valeur de la propriété adminMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminMail(String value) {
        this.adminMail = value;
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

}
