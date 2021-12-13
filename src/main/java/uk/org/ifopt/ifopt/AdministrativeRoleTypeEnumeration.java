//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package uk.org.ifopt.ifopt;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdministrativeRoleTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdministrativeRoleTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="all"/&gt;
 *     &lt;enumeration value="collects"/&gt;
 *     &lt;enumeration value="validates"/&gt;
 *     &lt;enumeration value="aggregates"/&gt;
 *     &lt;enumeration value="distributes"/&gt;
 *     &lt;enumeration value="redistributes"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdministrativeRoleTypeEnumeration")
@XmlEnum
public enum AdministrativeRoleTypeEnumeration {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("collects")
    COLLECTS("collects"),
    @XmlEnumValue("validates")
    VALIDATES("validates"),
    @XmlEnumValue("aggregates")
    AGGREGATES("aggregates"),
    @XmlEnumValue("distributes")
    DISTRIBUTES("distributes"),
    @XmlEnumValue("redistributes")
    REDISTRIBUTES("redistributes");
    private final String value;

    AdministrativeRoleTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdministrativeRoleTypeEnumeration fromValue(String v) {
        for (AdministrativeRoleTypeEnumeration c: AdministrativeRoleTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}