//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package de.vdv.ojp.model;

import java.time.ZonedDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;


/**
 * <p>Java class for HalfOpenTimestampOutputRangeStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HalfOpenTimestampOutputRangeStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EndTimeStatus" type="{http://www.siri.org.uk/siri}EndTimeStatusEnumeration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HalfOpenTimestampOutputRangeStructure", propOrder = {
    "startTime",
    "endTime",
    "endTimeStatus"
})
public class HalfOpenTimestampOutputRangeStructure {

    @XmlElement(name = "StartTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime startTime;
    @XmlElement(name = "EndTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime endTime;
    @XmlElement(name = "EndTimeStatus", defaultValue = "undefined")
    @XmlSchemaType(name = "string")
    protected EndTimeStatusEnumeration endTimeStatus;

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(ZonedDateTime value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(ZonedDateTime value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the endTimeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EndTimeStatusEnumeration }
     *     
     */
    public EndTimeStatusEnumeration getEndTimeStatus() {
        return endTimeStatus;
    }

    /**
     * Sets the value of the endTimeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndTimeStatusEnumeration }
     *     
     */
    public void setEndTimeStatus(EndTimeStatusEnumeration value) {
        this.endTimeStatus = value;
    }

    public HalfOpenTimestampOutputRangeStructure withStartTime(ZonedDateTime value) {
        setStartTime(value);
        return this;
    }

    public HalfOpenTimestampOutputRangeStructure withEndTime(ZonedDateTime value) {
        setEndTime(value);
        return this;
    }

    public HalfOpenTimestampOutputRangeStructure withEndTimeStatus(EndTimeStatusEnumeration value) {
        setEndTimeStatus(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, OmitNullsToStringStyle.INSTANCE);
    }

}
