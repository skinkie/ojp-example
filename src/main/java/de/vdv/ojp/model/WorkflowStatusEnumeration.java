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
 * <p>Java class for WorkflowStatusEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkflowStatusEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="draft"/&gt;
 *     &lt;enumeration value="approvedDraft"/&gt;
 *     &lt;enumeration value="open"/&gt;
 *     &lt;enumeration value="published"/&gt;
 *     &lt;enumeration value="closing"/&gt;
 *     &lt;enumeration value="closed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WorkflowStatusEnumeration")
@XmlEnum
public enum WorkflowStatusEnumeration {

    @XmlEnumValue("draft")
    DRAFT("draft"),
    @XmlEnumValue("approvedDraft")
    APPROVED_DRAFT("approvedDraft"),
    @XmlEnumValue("open")
    OPEN("open"),
    @XmlEnumValue("published")
    PUBLISHED("published"),
    @XmlEnumValue("closing")
    CLOSING("closing"),
    @XmlEnumValue("closed")
    CLOSED("closed");
    private final String value;

    WorkflowStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkflowStatusEnumeration fromValue(String v) {
        for (WorkflowStatusEnumeration c: WorkflowStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
