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
 * <p>Java class for GuidanceAdviceEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GuidanceAdviceEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="origin"/&gt;
 *     &lt;enumeration value="destination"/&gt;
 *     &lt;enumeration value="continue"/&gt;
 *     &lt;enumeration value="keep"/&gt;
 *     &lt;enumeration value="turn"/&gt;
 *     &lt;enumeration value="leave"/&gt;
 *     &lt;enumeration value="enter"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GuidanceAdviceEnumeration")
@XmlEnum
public enum GuidanceAdviceEnumeration {

    @XmlEnumValue("origin")
    ORIGIN("origin"),
    @XmlEnumValue("destination")
    DESTINATION("destination"),
    @XmlEnumValue("continue")
    CONTINUE("continue"),
    @XmlEnumValue("keep")
    KEEP("keep"),
    @XmlEnumValue("turn")
    TURN("turn"),
    @XmlEnumValue("leave")
    LEAVE("leave"),
    @XmlEnumValue("enter")
    ENTER("enter");
    private final String value;

    GuidanceAdviceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GuidanceAdviceEnumeration fromValue(String v) {
        for (GuidanceAdviceEnumeration c: GuidanceAdviceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}