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
 * <p>Java class for SharingModelEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SharingModelEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="singleStationBased"/&gt;
 *     &lt;enumeration value="multipleStationBased"/&gt;
 *     &lt;enumeration value="nonStationBased"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SharingModelEnumeration")
@XmlEnum
public enum SharingModelEnumeration {

    @XmlEnumValue("singleStationBased")
    SINGLE_STATION_BASED("singleStationBased"),
    @XmlEnumValue("multipleStationBased")
    MULTIPLE_STATION_BASED("multipleStationBased"),
    @XmlEnumValue("nonStationBased")
    NON_STATION_BASED("nonStationBased");
    private final String value;

    SharingModelEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SharingModelEnumeration fromValue(String v) {
        for (SharingModelEnumeration c: SharingModelEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}