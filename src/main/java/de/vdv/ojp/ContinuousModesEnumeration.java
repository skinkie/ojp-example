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
 * <p>Java class for ContinuousModesEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContinuousModesEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="walk"/&gt;
 *     &lt;enumeration value="demandResponsive"/&gt;
 *     &lt;enumeration value="replacementService"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContinuousModesEnumeration")
@XmlEnum
public enum ContinuousModesEnumeration {

    @XmlEnumValue("walk")
    WALK("walk"),
    @XmlEnumValue("demandResponsive")
    DEMAND_RESPONSIVE("demandResponsive"),
    @XmlEnumValue("replacementService")
    REPLACEMENT_SERVICE("replacementService");
    private final String value;

    ContinuousModesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContinuousModesEnumeration fromValue(String v) {
        for (ContinuousModesEnumeration c: ContinuousModesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
