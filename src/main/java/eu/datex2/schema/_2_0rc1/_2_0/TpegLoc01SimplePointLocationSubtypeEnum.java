//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegLoc01SimplePointLocationSubtypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TpegLoc01SimplePointLocationSubtypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="intersection"/&gt;
 *     &lt;enumeration value="nonLinkedPoint"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc01SimplePointLocationSubtypeEnum")
@XmlEnum
public enum TpegLoc01SimplePointLocationSubtypeEnum {

    @XmlEnumValue("intersection")
    INTERSECTION("intersection"),
    @XmlEnumValue("nonLinkedPoint")
    NON_LINKED_POINT("nonLinkedPoint");
    private final String value;

    TpegLoc01SimplePointLocationSubtypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc01SimplePointLocationSubtypeEnum fromValue(String v) {
        for (TpegLoc01SimplePointLocationSubtypeEnum c: TpegLoc01SimplePointLocationSubtypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
