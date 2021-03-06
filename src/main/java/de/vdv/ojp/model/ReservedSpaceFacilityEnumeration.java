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
 * <p>Java class for ReservedSpaceFacilityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReservedSpaceFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="lounge"/&gt;
 *     &lt;enumeration value="hall"/&gt;
 *     &lt;enumeration value="meetingpoint"/&gt;
 *     &lt;enumeration value="groupPoint"/&gt;
 *     &lt;enumeration value="reception"/&gt;
 *     &lt;enumeration value="shelter"/&gt;
 *     &lt;enumeration value="seats"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReservedSpaceFacilityEnumeration")
@XmlEnum
public enum ReservedSpaceFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("lounge")
    LOUNGE("lounge"),
    @XmlEnumValue("hall")
    HALL("hall"),
    @XmlEnumValue("meetingpoint")
    MEETINGPOINT("meetingpoint"),
    @XmlEnumValue("groupPoint")
    GROUP_POINT("groupPoint"),
    @XmlEnumValue("reception")
    RECEPTION("reception"),
    @XmlEnumValue("shelter")
    SHELTER("shelter"),
    @XmlEnumValue("seats")
    SEATS("seats");
    private final String value;

    ReservedSpaceFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReservedSpaceFacilityEnumeration fromValue(String v) {
        for (ReservedSpaceFacilityEnumeration c: ReservedSpaceFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
