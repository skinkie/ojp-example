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
 * <p>Java class for StopPlaceTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StopPlaceTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="airport"/&gt;
 *     &lt;enumeration value="railStation"/&gt;
 *     &lt;enumeration value="metroStation"/&gt;
 *     &lt;enumeration value="coachStation"/&gt;
 *     &lt;enumeration value="busStation"/&gt;
 *     &lt;enumeration value="harbourPort"/&gt;
 *     &lt;enumeration value="ferrytPort"/&gt;
 *     &lt;enumeration value="ferryStop"/&gt;
 *     &lt;enumeration value="onStreetBus"/&gt;
 *     &lt;enumeration value="onStreetTram"/&gt;
 *     &lt;enumeration value="skiLift"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StopPlaceTypeEnumeration")
@XmlEnum
public enum StopPlaceTypeEnumeration {

    @XmlEnumValue("airport")
    AIRPORT("airport"),
    @XmlEnumValue("railStation")
    RAIL_STATION("railStation"),
    @XmlEnumValue("metroStation")
    METRO_STATION("metroStation"),
    @XmlEnumValue("coachStation")
    COACH_STATION("coachStation"),
    @XmlEnumValue("busStation")
    BUS_STATION("busStation"),
    @XmlEnumValue("harbourPort")
    HARBOUR_PORT("harbourPort"),
    @XmlEnumValue("ferrytPort")
    FERRYT_PORT("ferrytPort"),
    @XmlEnumValue("ferryStop")
    FERRY_STOP("ferryStop"),
    @XmlEnumValue("onStreetBus")
    ON_STREET_BUS("onStreetBus"),
    @XmlEnumValue("onStreetTram")
    ON_STREET_TRAM("onStreetTram"),
    @XmlEnumValue("skiLift")
    SKI_LIFT("skiLift"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    StopPlaceTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StopPlaceTypeEnumeration fromValue(String v) {
        for (StopPlaceTypeEnumeration c: StopPlaceTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
