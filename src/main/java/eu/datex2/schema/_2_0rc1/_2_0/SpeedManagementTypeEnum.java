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
 * <p>Java class for SpeedManagementTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpeedManagementTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="activeSpeedControlInOperation"/&gt;
 *     &lt;enumeration value="doNotSlowdownUnnecessarily"/&gt;
 *     &lt;enumeration value="observeSpeedLimit"/&gt;
 *     &lt;enumeration value="policeSpeedChecksInOperation"/&gt;
 *     &lt;enumeration value="reduceYourSpeed"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SpeedManagementTypeEnum")
@XmlEnum
public enum SpeedManagementTypeEnum {

    @XmlEnumValue("activeSpeedControlInOperation")
    ACTIVE_SPEED_CONTROL_IN_OPERATION("activeSpeedControlInOperation"),
    @XmlEnumValue("doNotSlowdownUnnecessarily")
    DO_NOT_SLOWDOWN_UNNECESSARILY("doNotSlowdownUnnecessarily"),
    @XmlEnumValue("observeSpeedLimit")
    OBSERVE_SPEED_LIMIT("observeSpeedLimit"),
    @XmlEnumValue("policeSpeedChecksInOperation")
    POLICE_SPEED_CHECKS_IN_OPERATION("policeSpeedChecksInOperation"),
    @XmlEnumValue("reduceYourSpeed")
    REDUCE_YOUR_SPEED("reduceYourSpeed"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    SpeedManagementTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpeedManagementTypeEnum fromValue(String v) {
        for (SpeedManagementTypeEnum c: SpeedManagementTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
