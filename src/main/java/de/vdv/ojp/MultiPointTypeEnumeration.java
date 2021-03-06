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
 * <p>Java class for MultiPointTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MultiPointTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="anyPoint"/&gt;
 *     &lt;enumeration value="eachOrigin"/&gt;
 *     &lt;enumeration value="eachDestination"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MultiPointTypeEnumeration")
@XmlEnum
public enum MultiPointTypeEnumeration {

    @XmlEnumValue("anyPoint")
    ANY_POINT("anyPoint"),
    @XmlEnumValue("eachOrigin")
    EACH_ORIGIN("eachOrigin"),
    @XmlEnumValue("eachDestination")
    EACH_DESTINATION("eachDestination");
    private final String value;

    MultiPointTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MultiPointTypeEnumeration fromValue(String v) {
        for (MultiPointTypeEnumeration c: MultiPointTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
