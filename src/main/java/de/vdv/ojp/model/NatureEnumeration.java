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
 * <p>Java class for NatureEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NatureEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="plannedOnly"/&gt;
 *     &lt;enumeration value="unplannedOnly"/&gt;
 *     &lt;enumeration value="both"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NatureEnumeration")
@XmlEnum
public enum NatureEnumeration {

    @XmlEnumValue("plannedOnly")
    PLANNED_ONLY("plannedOnly"),
    @XmlEnumValue("unplannedOnly")
    UNPLANNED_ONLY("unplannedOnly"),
    @XmlEnumValue("both")
    BOTH("both");
    private final String value;

    NatureEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NatureEnumeration fromValue(String v) {
        for (NatureEnumeration c: NatureEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}