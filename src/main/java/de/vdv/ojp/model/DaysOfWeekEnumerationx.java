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
 * <p>Java class for DaysOfWeekEnumerationx.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DaysOfWeekEnumerationx"&gt;
 *   &lt;restriction base="{http://www.siri.org.uk/siri}DayTypeEnumeration"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="monday"/&gt;
 *     &lt;enumeration value="tuesday"/&gt;
 *     &lt;enumeration value="wednesday"/&gt;
 *     &lt;enumeration value="thursday"/&gt;
 *     &lt;enumeration value="friday"/&gt;
 *     &lt;enumeration value="saturday"/&gt;
 *     &lt;enumeration value="sunday"/&gt;
 *     &lt;enumeration value="mondayToFriday"/&gt;
 *     &lt;enumeration value="mondayToSaturday"/&gt;
 *     &lt;enumeration value="weekdays"/&gt;
 *     &lt;enumeration value="weekends"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DaysOfWeekEnumerationx")
@XmlEnum(DayTypeEnumeration.class)
public enum DaysOfWeekEnumerationx {

    @XmlEnumValue("unknown")
    UNKNOWN(DayTypeEnumeration.UNKNOWN),
    @XmlEnumValue("monday")
    MONDAY(DayTypeEnumeration.MONDAY),
    @XmlEnumValue("tuesday")
    TUESDAY(DayTypeEnumeration.TUESDAY),
    @XmlEnumValue("wednesday")
    WEDNESDAY(DayTypeEnumeration.WEDNESDAY),
    @XmlEnumValue("thursday")
    THURSDAY(DayTypeEnumeration.THURSDAY),
    @XmlEnumValue("friday")
    FRIDAY(DayTypeEnumeration.FRIDAY),
    @XmlEnumValue("saturday")
    SATURDAY(DayTypeEnumeration.SATURDAY),
    @XmlEnumValue("sunday")
    SUNDAY(DayTypeEnumeration.SUNDAY),
    @XmlEnumValue("mondayToFriday")
    MONDAY_TO_FRIDAY(DayTypeEnumeration.MONDAY_TO_FRIDAY),
    @XmlEnumValue("mondayToSaturday")
    MONDAY_TO_SATURDAY(DayTypeEnumeration.MONDAY_TO_SATURDAY),
    @XmlEnumValue("weekdays")
    WEEKDAYS(DayTypeEnumeration.WEEKDAYS),
    @XmlEnumValue("weekends")
    WEEKENDS(DayTypeEnumeration.WEEKENDS);
    private final DayTypeEnumeration value;

    DaysOfWeekEnumerationx(DayTypeEnumeration v) {
        value = v;
    }

    public DayTypeEnumeration value() {
        return value;
    }

    public static DaysOfWeekEnumerationx fromValue(DayTypeEnumeration v) {
        for (DaysOfWeekEnumerationx c: DaysOfWeekEnumerationx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
