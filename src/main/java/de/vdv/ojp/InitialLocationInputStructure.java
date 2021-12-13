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
import de.vdv.ojp.model.LocationStructure;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for InitialLocationInputStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InitialLocationInputStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeoPosition" type="{http://www.siri.org.uk/siri}LocationStructure" minOccurs="0"/&gt;
 *         &lt;element name="GeoRestriction" type="{http://www.vdv.de/ojp}GeoRestrictionsStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitialLocationInputStructure", propOrder = {
    "locationName",
    "geoPosition",
    "geoRestriction"
})
public class InitialLocationInputStructure {

    @XmlElement(name = "LocationName")
    protected String locationName;
    @XmlElement(name = "GeoPosition")
    protected LocationStructure geoPosition;
    @XmlElement(name = "GeoRestriction")
    protected GeoRestrictionsStructure geoRestriction;

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the geoPosition property.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getGeoPosition() {
        return geoPosition;
    }

    /**
     * Sets the value of the geoPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setGeoPosition(LocationStructure value) {
        this.geoPosition = value;
    }

    /**
     * Gets the value of the geoRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link GeoRestrictionsStructure }
     *     
     */
    public GeoRestrictionsStructure getGeoRestriction() {
        return geoRestriction;
    }

    /**
     * Sets the value of the geoRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoRestrictionsStructure }
     *     
     */
    public void setGeoRestriction(GeoRestrictionsStructure value) {
        this.geoRestriction = value;
    }

    public InitialLocationInputStructure withLocationName(String value) {
        setLocationName(value);
        return this;
    }

    public InitialLocationInputStructure withGeoPosition(LocationStructure value) {
        setGeoPosition(value);
        return this;
    }

    public InitialLocationInputStructure withGeoRestriction(GeoRestrictionsStructure value) {
        setGeoRestriction(value);
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