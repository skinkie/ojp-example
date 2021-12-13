//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for VehicleHeadway complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleHeadway"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="distanceGap" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="distanceHeadway" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="vehicleHeadwayExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleHeadway", propOrder = {
    "distanceGap",
    "distanceHeadway",
    "vehicleHeadwayExtension"
})
public class VehicleHeadway {

    protected Float distanceGap;
    protected Float distanceHeadway;
    protected ExtensionType vehicleHeadwayExtension;

    /**
     * Gets the value of the distanceGap property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDistanceGap() {
        return distanceGap;
    }

    /**
     * Sets the value of the distanceGap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDistanceGap(Float value) {
        this.distanceGap = value;
    }

    /**
     * Gets the value of the distanceHeadway property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDistanceHeadway() {
        return distanceHeadway;
    }

    /**
     * Sets the value of the distanceHeadway property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDistanceHeadway(Float value) {
        this.distanceHeadway = value;
    }

    /**
     * Gets the value of the vehicleHeadwayExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVehicleHeadwayExtension() {
        return vehicleHeadwayExtension;
    }

    /**
     * Sets the value of the vehicleHeadwayExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVehicleHeadwayExtension(ExtensionType value) {
        this.vehicleHeadwayExtension = value;
    }

    public VehicleHeadway withDistanceGap(Float value) {
        setDistanceGap(value);
        return this;
    }

    public VehicleHeadway withDistanceHeadway(Float value) {
        setDistanceHeadway(value);
        return this;
    }

    public VehicleHeadway withVehicleHeadwayExtension(ExtensionType value) {
        setVehicleHeadwayExtension(value);
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
