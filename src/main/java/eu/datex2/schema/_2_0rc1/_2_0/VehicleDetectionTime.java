//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

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
 * <p>Java class for VehicleDetectionTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleDetectionTime"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arrivalTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="exitTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="passageTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="presenceTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="timeGap" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="timeHeadway" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="vehicleDetectionTimeExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleDetectionTime", propOrder = {
    "arrivalTime",
    "exitTime",
    "passageTime",
    "presenceTime",
    "timeGap",
    "timeHeadway",
    "vehicleDetectionTimeExtension"
})
public class VehicleDetectionTime {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime arrivalTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime exitTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime passageTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime presenceTime;
    protected Float timeGap;
    protected Float timeHeadway;
    protected ExtensionType vehicleDetectionTimeExtension;

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTime(ZonedDateTime value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the exitTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getExitTime() {
        return exitTime;
    }

    /**
     * Sets the value of the exitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExitTime(ZonedDateTime value) {
        this.exitTime = value;
    }

    /**
     * Gets the value of the passageTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getPassageTime() {
        return passageTime;
    }

    /**
     * Sets the value of the passageTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassageTime(ZonedDateTime value) {
        this.passageTime = value;
    }

    /**
     * Gets the value of the presenceTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getPresenceTime() {
        return presenceTime;
    }

    /**
     * Sets the value of the presenceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresenceTime(ZonedDateTime value) {
        this.presenceTime = value;
    }

    /**
     * Gets the value of the timeGap property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTimeGap() {
        return timeGap;
    }

    /**
     * Sets the value of the timeGap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTimeGap(Float value) {
        this.timeGap = value;
    }

    /**
     * Gets the value of the timeHeadway property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTimeHeadway() {
        return timeHeadway;
    }

    /**
     * Sets the value of the timeHeadway property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTimeHeadway(Float value) {
        this.timeHeadway = value;
    }

    /**
     * Gets the value of the vehicleDetectionTimeExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVehicleDetectionTimeExtension() {
        return vehicleDetectionTimeExtension;
    }

    /**
     * Sets the value of the vehicleDetectionTimeExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVehicleDetectionTimeExtension(ExtensionType value) {
        this.vehicleDetectionTimeExtension = value;
    }

    public VehicleDetectionTime withArrivalTime(ZonedDateTime value) {
        setArrivalTime(value);
        return this;
    }

    public VehicleDetectionTime withExitTime(ZonedDateTime value) {
        setExitTime(value);
        return this;
    }

    public VehicleDetectionTime withPassageTime(ZonedDateTime value) {
        setPassageTime(value);
        return this;
    }

    public VehicleDetectionTime withPresenceTime(ZonedDateTime value) {
        setPresenceTime(value);
        return this;
    }

    public VehicleDetectionTime withTimeGap(Float value) {
        setTimeGap(value);
        return this;
    }

    public VehicleDetectionTime withTimeHeadway(Float value) {
        setTimeHeadway(value);
        return this;
    }

    public VehicleDetectionTime withVehicleDetectionTimeExtension(ExtensionType value) {
        setVehicleDetectionTimeExtension(value);
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
