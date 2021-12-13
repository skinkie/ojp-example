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
 * <p>Java class for OccupancyEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OccupancyEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="full"/&gt;
 *     &lt;enumeration value="seatsAvailable"/&gt;
 *     &lt;enumeration value="standingAvailable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OccupancyEnumeration")
@XmlEnum
public enum OccupancyEnumeration {

    @XmlEnumValue("full")
    FULL("full"),
    @XmlEnumValue("seatsAvailable")
    SEATS_AVAILABLE("seatsAvailable"),
    @XmlEnumValue("standingAvailable")
    STANDING_AVAILABLE("standingAvailable");
    private final String value;

    OccupancyEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OccupancyEnumeration fromValue(String v) {
        for (OccupancyEnumeration c: OccupancyEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
