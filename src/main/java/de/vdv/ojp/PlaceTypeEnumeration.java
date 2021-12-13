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
 * <p>Java class for PlaceTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlaceTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="stop"/&gt;
 *     &lt;enumeration value="address"/&gt;
 *     &lt;enumeration value="poi"/&gt;
 *     &lt;enumeration value="coord"/&gt;
 *     &lt;enumeration value="topographicPlace"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PlaceTypeEnumeration")
@XmlEnum
public enum PlaceTypeEnumeration {

    @XmlEnumValue("stop")
    STOP("stop"),
    @XmlEnumValue("address")
    ADDRESS("address"),
    @XmlEnumValue("poi")
    POI("poi"),
    @XmlEnumValue("coord")
    COORD("coord"),
    @XmlEnumValue("topographicPlace")
    TOPOGRAPHIC_PLACE("topographicPlace");
    private final String value;

    PlaceTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlaceTypeEnumeration fromValue(String v) {
        for (PlaceTypeEnumeration c: PlaceTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}