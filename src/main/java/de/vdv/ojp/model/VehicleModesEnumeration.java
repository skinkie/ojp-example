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
 * <p>Java class for VehicleModesEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleModesEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="air"/&gt;
 *     &lt;enumeration value="bus"/&gt;
 *     &lt;enumeration value="coach"/&gt;
 *     &lt;enumeration value="ferry"/&gt;
 *     &lt;enumeration value="metro"/&gt;
 *     &lt;enumeration value="rail"/&gt;
 *     &lt;enumeration value="tram"/&gt;
 *     &lt;enumeration value="underground"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleModesEnumeration")
@XmlEnum
public enum VehicleModesEnumeration {

    @XmlEnumValue("air")
    AIR("air"),
    @XmlEnumValue("bus")
    BUS("bus"),
    @XmlEnumValue("coach")
    COACH("coach"),
    @XmlEnumValue("ferry")
    FERRY("ferry"),
    @XmlEnumValue("metro")
    METRO("metro"),
    @XmlEnumValue("rail")
    RAIL("rail"),
    @XmlEnumValue("tram")
    TRAM("tram"),
    @XmlEnumValue("underground")
    UNDERGROUND("underground");
    private final String value;

    VehicleModesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleModesEnumeration fromValue(String v) {
        for (VehicleModesEnumeration c: VehicleModesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
