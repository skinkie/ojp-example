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
 * <p>Java class for TramSubmodesOfTransportEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TramSubmodesOfTransportEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="pti6_0"/&gt;
 *     &lt;enumeration value="loc12_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti6_1"/&gt;
 *     &lt;enumeration value="loc12_1"/&gt;
 *     &lt;enumeration value="cityTram"/&gt;
 *     &lt;enumeration value="pti6_2"/&gt;
 *     &lt;enumeration value="localTramService"/&gt;
 *     &lt;enumeration value="pti6_3"/&gt;
 *     &lt;enumeration value="regionalTram"/&gt;
 *     &lt;enumeration value="pti6_4"/&gt;
 *     &lt;enumeration value="loc12_2"/&gt;
 *     &lt;enumeration value="sightseeingTram"/&gt;
 *     &lt;enumeration value="pti6_5"/&gt;
 *     &lt;enumeration value="shuttleTram"/&gt;
 *     &lt;enumeration value="pti6_6"/&gt;
 *     &lt;enumeration value="allTramServices"/&gt;
 *     &lt;enumeration value="pti6_255"/&gt;
 *     &lt;enumeration value="loc12_255"/&gt;
 *     &lt;enumeration value="undefinedTramService"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TramSubmodesOfTransportEnumeration")
@XmlEnum
public enum TramSubmodesOfTransportEnumeration {

    @XmlEnumValue("pti6_0")
    PTI_6___0("pti6_0"),
    @XmlEnumValue("loc12_0")
    LOC_12___0("loc12_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti6_1")
    PTI_6___1("pti6_1"),
    @XmlEnumValue("loc12_1")
    LOC_12___1("loc12_1"),
    @XmlEnumValue("cityTram")
    CITY_TRAM("cityTram"),
    @XmlEnumValue("pti6_2")
    PTI_6___2("pti6_2"),
    @XmlEnumValue("localTramService")
    LOCAL_TRAM_SERVICE("localTramService"),
    @XmlEnumValue("pti6_3")
    PTI_6___3("pti6_3"),
    @XmlEnumValue("regionalTram")
    REGIONAL_TRAM("regionalTram"),
    @XmlEnumValue("pti6_4")
    PTI_6___4("pti6_4"),
    @XmlEnumValue("loc12_2")
    LOC_12___2("loc12_2"),
    @XmlEnumValue("sightseeingTram")
    SIGHTSEEING_TRAM("sightseeingTram"),
    @XmlEnumValue("pti6_5")
    PTI_6___5("pti6_5"),
    @XmlEnumValue("shuttleTram")
    SHUTTLE_TRAM("shuttleTram"),
    @XmlEnumValue("pti6_6")
    PTI_6___6("pti6_6"),
    @XmlEnumValue("allTramServices")
    ALL_TRAM_SERVICES("allTramServices"),
    @XmlEnumValue("pti6_255")
    PTI_6___255("pti6_255"),
    @XmlEnumValue("loc12_255")
    LOC_12___255("loc12_255"),
    @XmlEnumValue("undefinedTramService")
    UNDEFINED_TRAM_SERVICE("undefinedTramService");
    private final String value;

    TramSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TramSubmodesOfTransportEnumeration fromValue(String v) {
        for (TramSubmodesOfTransportEnumeration c: TramSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}