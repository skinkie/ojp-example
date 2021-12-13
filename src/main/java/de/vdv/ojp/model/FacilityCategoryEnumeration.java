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
 * <p>Java class for FacilityCategoryEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FacilityCategoryEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="fixedEquipment"/&gt;
 *     &lt;enumeration value="serviceProvidedByIndividual"/&gt;
 *     &lt;enumeration value="serviceForPersonalDevice"/&gt;
 *     &lt;enumeration value="reservedArea"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FacilityCategoryEnumeration")
@XmlEnum
public enum FacilityCategoryEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("fixedEquipment")
    FIXED_EQUIPMENT("fixedEquipment"),
    @XmlEnumValue("serviceProvidedByIndividual")
    SERVICE_PROVIDED_BY_INDIVIDUAL("serviceProvidedByIndividual"),
    @XmlEnumValue("serviceForPersonalDevice")
    SERVICE_FOR_PERSONAL_DEVICE("serviceForPersonalDevice"),
    @XmlEnumValue("reservedArea")
    RESERVED_AREA("reservedArea");
    private final String value;

    FacilityCategoryEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FacilityCategoryEnumeration fromValue(String v) {
        for (FacilityCategoryEnumeration c: FacilityCategoryEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
