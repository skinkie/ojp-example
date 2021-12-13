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
 * <p>Java class for OptimisationMethodEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OptimisationMethodEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="fastest"/&gt;
 *     &lt;enumeration value="minChanges"/&gt;
 *     &lt;enumeration value="leastWalking"/&gt;
 *     &lt;enumeration value="leastCost"/&gt;
 *     &lt;enumeration value="earliestArrival"/&gt;
 *     &lt;enumeration value="latestDeparture"/&gt;
 *     &lt;enumeration value="earliestArrivalAndLatestDeparture"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OptimisationMethodEnumeration")
@XmlEnum
public enum OptimisationMethodEnumeration {

    @XmlEnumValue("fastest")
    FASTEST("fastest"),
    @XmlEnumValue("minChanges")
    MIN_CHANGES("minChanges"),
    @XmlEnumValue("leastWalking")
    LEAST_WALKING("leastWalking"),
    @XmlEnumValue("leastCost")
    LEAST_COST("leastCost"),
    @XmlEnumValue("earliestArrival")
    EARLIEST_ARRIVAL("earliestArrival"),
    @XmlEnumValue("latestDeparture")
    LATEST_DEPARTURE("latestDeparture"),
    @XmlEnumValue("earliestArrivalAndLatestDeparture")
    EARLIEST_ARRIVAL_AND_LATEST_DEPARTURE("earliestArrivalAndLatestDeparture");
    private final String value;

    OptimisationMethodEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OptimisationMethodEnumeration fromValue(String v) {
        for (OptimisationMethodEnumeration c: OptimisationMethodEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
