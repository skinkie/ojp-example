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
 * <p>Java class for AccessFacilityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="lift"/&gt;
 *     &lt;enumeration value="escalator"/&gt;
 *     &lt;enumeration value="travelator"/&gt;
 *     &lt;enumeration value="ramp"/&gt;
 *     &lt;enumeration value="stairs"/&gt;
 *     &lt;enumeration value="shuttle"/&gt;
 *     &lt;enumeration value="narrowEntrance"/&gt;
 *     &lt;enumeration value="barrier"/&gt;
 *     &lt;enumeration value="palletAccess_lowFloor"/&gt;
 *     &lt;enumeration value="validator"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccessFacilityEnumeration")
@XmlEnum
public enum AccessFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("lift")
    LIFT("lift"),
    @XmlEnumValue("escalator")
    ESCALATOR("escalator"),
    @XmlEnumValue("travelator")
    TRAVELATOR("travelator"),
    @XmlEnumValue("ramp")
    RAMP("ramp"),
    @XmlEnumValue("stairs")
    STAIRS("stairs"),
    @XmlEnumValue("shuttle")
    SHUTTLE("shuttle"),
    @XmlEnumValue("narrowEntrance")
    NARROW_ENTRANCE("narrowEntrance"),
    @XmlEnumValue("barrier")
    BARRIER("barrier"),
    @XmlEnumValue("palletAccess_lowFloor")
    PALLET_ACCESS___LOW_FLOOR("palletAccess_lowFloor"),
    @XmlEnumValue("validator")
    VALIDATOR("validator");
    private final String value;

    AccessFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessFacilityEnumeration fromValue(String v) {
        for (AccessFacilityEnumeration c: AccessFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
