//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package de.vdv.ojp.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FirstOrLastJourneyEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FirstOrLastJourneyEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="firstServiceOfDay"/&gt;
 *     &lt;enumeration value="otherService"/&gt;
 *     &lt;enumeration value="lastServiceOfDay"/&gt;
 *     &lt;enumeration value="unspecified"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FirstOrLastJourneyEnumeration")
@XmlEnum
public enum FirstOrLastJourneyEnumeration {

    @XmlEnumValue("firstServiceOfDay")
    FIRST_SERVICE_OF_DAY("firstServiceOfDay"),
    @XmlEnumValue("otherService")
    OTHER_SERVICE("otherService"),
    @XmlEnumValue("lastServiceOfDay")
    LAST_SERVICE_OF_DAY("lastServiceOfDay"),
    @XmlEnumValue("unspecified")
    UNSPECIFIED("unspecified");
    private final String value;

    FirstOrLastJourneyEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FirstOrLastJourneyEnumeration fromValue(String v) {
        for (FirstOrLastJourneyEnumeration c: FirstOrLastJourneyEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}