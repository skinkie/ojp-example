//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package de.vdv.ojp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Fare request element.
 * 
 * <p>Java class for FareRequestStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}FareRequestGroup"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareRequestStructure", propOrder = {
    "stopFareRequest",
    "staticFareRequest",
    "tripFareRequest",
    "multiTripFareRequest",
    "params",
    "extension"
})
public class FareRequestStructure {

    @XmlElement(name = "StopFareRequest")
    protected StopFareRequestStructure stopFareRequest;
    @XmlElement(name = "StaticFareRequest")
    protected StaticFareRequestStructure staticFareRequest;
    @XmlElement(name = "TripFareRequest")
    protected TripFareRequestStructure tripFareRequest;
    @XmlElement(name = "MultiTripFareRequest")
    protected MultiTripFareRequestStructure multiTripFareRequest;
    @XmlElement(name = "Params")
    protected FareParamStructure params;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Gets the value of the stopFareRequest property.
     * 
     * @return
     *     possible object is
     *     {@link StopFareRequestStructure }
     *     
     */
    public StopFareRequestStructure getStopFareRequest() {
        return stopFareRequest;
    }

    /**
     * Sets the value of the stopFareRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopFareRequestStructure }
     *     
     */
    public void setStopFareRequest(StopFareRequestStructure value) {
        this.stopFareRequest = value;
    }

    /**
     * Gets the value of the staticFareRequest property.
     * 
     * @return
     *     possible object is
     *     {@link StaticFareRequestStructure }
     *     
     */
    public StaticFareRequestStructure getStaticFareRequest() {
        return staticFareRequest;
    }

    /**
     * Sets the value of the staticFareRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticFareRequestStructure }
     *     
     */
    public void setStaticFareRequest(StaticFareRequestStructure value) {
        this.staticFareRequest = value;
    }

    /**
     * Gets the value of the tripFareRequest property.
     * 
     * @return
     *     possible object is
     *     {@link TripFareRequestStructure }
     *     
     */
    public TripFareRequestStructure getTripFareRequest() {
        return tripFareRequest;
    }

    /**
     * Sets the value of the tripFareRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripFareRequestStructure }
     *     
     */
    public void setTripFareRequest(TripFareRequestStructure value) {
        this.tripFareRequest = value;
    }

    /**
     * Gets the value of the multiTripFareRequest property.
     * 
     * @return
     *     possible object is
     *     {@link MultiTripFareRequestStructure }
     *     
     */
    public MultiTripFareRequestStructure getMultiTripFareRequest() {
        return multiTripFareRequest;
    }

    /**
     * Sets the value of the multiTripFareRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiTripFareRequestStructure }
     *     
     */
    public void setMultiTripFareRequest(MultiTripFareRequestStructure value) {
        this.multiTripFareRequest = value;
    }

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link FareParamStructure }
     *     
     */
    public FareParamStructure getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareParamStructure }
     *     
     */
    public void setParams(FareParamStructure value) {
        this.params = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtension(Object value) {
        this.extension = value;
    }

    public FareRequestStructure withStopFareRequest(StopFareRequestStructure value) {
        setStopFareRequest(value);
        return this;
    }

    public FareRequestStructure withStaticFareRequest(StaticFareRequestStructure value) {
        setStaticFareRequest(value);
        return this;
    }

    public FareRequestStructure withTripFareRequest(TripFareRequestStructure value) {
        setTripFareRequest(value);
        return this;
    }

    public FareRequestStructure withMultiTripFareRequest(MultiTripFareRequestStructure value) {
        setMultiTripFareRequest(value);
        return this;
    }

    public FareRequestStructure withParams(FareParamStructure value) {
        setParams(value);
        return this;
    }

    public FareRequestStructure withExtension(Object value) {
        setExtension(value);
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
