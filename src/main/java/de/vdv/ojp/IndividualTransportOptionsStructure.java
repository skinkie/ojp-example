//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package de.vdv.ojp;

import java.math.BigInteger;
import java.time.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;


/**
 * Individual modes and their usage limits as stated by the passenger
 * 
 * <p>Java class for IndividualTransportOptionsStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualTransportOptionsStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mode" type="{http://www.vdv.de/ojp}IndividualModesEnumeration"/&gt;
 *         &lt;element name="MaxDistance" type="{http://www.siri.org.uk/siri}DistanceType" minOccurs="0"/&gt;
 *         &lt;element name="MaxDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="MinDistance" type="{http://www.siri.org.uk/siri}DistanceType" minOccurs="0"/&gt;
 *         &lt;element name="MinDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="Speed" type="{http://www.vdv.de/ojp}OpenPercentType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualTransportOptionsStructure", propOrder = {
    "mode",
    "maxDistance",
    "maxDuration",
    "minDistance",
    "minDuration",
    "speed"
})
public class IndividualTransportOptionsStructure {

    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected IndividualModesEnumeration mode;
    @XmlElement(name = "MaxDistance")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxDistance;
    @XmlElement(name = "MaxDuration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration maxDuration;
    @XmlElement(name = "MinDistance")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minDistance;
    @XmlElement(name = "MinDuration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration minDuration;
    @XmlElement(name = "Speed")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger speed;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualModesEnumeration }
     *     
     */
    public IndividualModesEnumeration getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualModesEnumeration }
     *     
     */
    public void setMode(IndividualModesEnumeration value) {
        this.mode = value;
    }

    /**
     * Gets the value of the maxDistance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxDistance() {
        return maxDistance;
    }

    /**
     * Sets the value of the maxDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxDistance(BigInteger value) {
        this.maxDistance = value;
    }

    /**
     * Gets the value of the maxDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMaxDuration() {
        return maxDuration;
    }

    /**
     * Sets the value of the maxDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDuration(Duration value) {
        this.maxDuration = value;
    }

    /**
     * Gets the value of the minDistance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinDistance() {
        return minDistance;
    }

    /**
     * Sets the value of the minDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinDistance(BigInteger value) {
        this.minDistance = value;
    }

    /**
     * Gets the value of the minDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMinDuration() {
        return minDuration;
    }

    /**
     * Sets the value of the minDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinDuration(Duration value) {
        this.minDuration = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpeed(BigInteger value) {
        this.speed = value;
    }

    public IndividualTransportOptionsStructure withMode(IndividualModesEnumeration value) {
        setMode(value);
        return this;
    }

    public IndividualTransportOptionsStructure withMaxDistance(BigInteger value) {
        setMaxDistance(value);
        return this;
    }

    public IndividualTransportOptionsStructure withMaxDuration(Duration value) {
        setMaxDuration(value);
        return this;
    }

    public IndividualTransportOptionsStructure withMinDistance(BigInteger value) {
        setMinDistance(value);
        return this;
    }

    public IndividualTransportOptionsStructure withMinDuration(Duration value) {
        setMinDuration(value);
        return this;
    }

    public IndividualTransportOptionsStructure withSpeed(BigInteger value) {
        setSpeed(value);
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
