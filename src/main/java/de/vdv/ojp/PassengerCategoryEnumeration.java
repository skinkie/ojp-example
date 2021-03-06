//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package de.vdv.ojp;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassengerCategoryEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PassengerCategoryEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Adult"/&gt;
 *     &lt;enumeration value="Child"/&gt;
 *     &lt;enumeration value="Senior"/&gt;
 *     &lt;enumeration value="Youth"/&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PassengerCategoryEnumeration")
@XmlEnum
public enum PassengerCategoryEnumeration {

    @XmlEnumValue("Adult")
    ADULT("Adult"),
    @XmlEnumValue("Child")
    CHILD("Child"),
    @XmlEnumValue("Senior")
    SENIOR("Senior"),
    @XmlEnumValue("Youth")
    YOUTH("Youth"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled");
    private final String value;

    PassengerCategoryEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PassengerCategoryEnumeration fromValue(String v) {
        for (PassengerCategoryEnumeration c: PassengerCategoryEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
