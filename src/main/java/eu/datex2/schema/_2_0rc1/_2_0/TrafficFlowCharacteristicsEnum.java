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
 * <p>Java class for TrafficFlowCharacteristicsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrafficFlowCharacteristicsEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="erraticFlow"/&gt;
 *     &lt;enumeration value="smoothFlow"/&gt;
 *     &lt;enumeration value="stopAndGo"/&gt;
 *     &lt;enumeration value="trafficBlocked"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrafficFlowCharacteristicsEnum")
@XmlEnum
public enum TrafficFlowCharacteristicsEnum {

    @XmlEnumValue("erraticFlow")
    ERRATIC_FLOW("erraticFlow"),
    @XmlEnumValue("smoothFlow")
    SMOOTH_FLOW("smoothFlow"),
    @XmlEnumValue("stopAndGo")
    STOP_AND_GO("stopAndGo"),
    @XmlEnumValue("trafficBlocked")
    TRAFFIC_BLOCKED("trafficBlocked");
    private final String value;

    TrafficFlowCharacteristicsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficFlowCharacteristicsEnum fromValue(String v) {
        for (TrafficFlowCharacteristicsEnum c: TrafficFlowCharacteristicsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
