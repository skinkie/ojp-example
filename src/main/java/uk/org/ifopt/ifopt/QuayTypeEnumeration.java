//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package uk.org.ifopt.ifopt;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuayTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuayTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="airlineGate"/&gt;
 *     &lt;enumeration value="railPlatform"/&gt;
 *     &lt;enumeration value="metroPlatform"/&gt;
 *     &lt;enumeration value="coachStop"/&gt;
 *     &lt;enumeration value="busStop"/&gt;
 *     &lt;enumeration value="tramStop"/&gt;
 *     &lt;enumeration value="boatQuay"/&gt;
 *     &lt;enumeration value="ferryLanding"/&gt;
 *     &lt;enumeration value="telecabinePlatfrom"/&gt;
 *     &lt;enumeration value="taxiStand"/&gt;
 *     &lt;enumeration value="setDownPlace"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QuayTypeEnumeration")
@XmlEnum
public enum QuayTypeEnumeration {

    @XmlEnumValue("airlineGate")
    AIRLINE_GATE("airlineGate"),
    @XmlEnumValue("railPlatform")
    RAIL_PLATFORM("railPlatform"),
    @XmlEnumValue("metroPlatform")
    METRO_PLATFORM("metroPlatform"),
    @XmlEnumValue("coachStop")
    COACH_STOP("coachStop"),
    @XmlEnumValue("busStop")
    BUS_STOP("busStop"),
    @XmlEnumValue("tramStop")
    TRAM_STOP("tramStop"),
    @XmlEnumValue("boatQuay")
    BOAT_QUAY("boatQuay"),
    @XmlEnumValue("ferryLanding")
    FERRY_LANDING("ferryLanding"),
    @XmlEnumValue("telecabinePlatfrom")
    TELECABINE_PLATFROM("telecabinePlatfrom"),
    @XmlEnumValue("taxiStand")
    TAXI_STAND("taxiStand"),
    @XmlEnumValue("setDownPlace")
    SET_DOWN_PLACE("setDownPlace"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    QuayTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuayTypeEnumeration fromValue(String v) {
        for (QuayTypeEnumeration c: QuayTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}