
package stubs.cart;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour advantageStatus.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="advantageStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EN_ATTENT"/>
 *     &lt;enumeration value="EN_COURS"/>
 *     &lt;enumeration value="TERMINE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "advantageStatus")
@XmlEnum
public enum AdvantageStatus {

    EN_ATTENT,
    EN_COURS,
    TERMINE;

    public String value() {
        return name();
    }

    public static AdvantageStatus fromValue(String v) {
        return valueOf(v);
    }

}
