//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package de.vdv.ojp.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for FacilityChangeStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityChangeStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EquipmentAvailability" type="{http://www.siri.org.uk/siri}EquipmentAvailabilityStructure" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationRef" minOccurs="0"/&gt;
 *         &lt;element name="MobilityDisruption" type="{http://www.siri.org.uk/siri}MobilityDisruptionStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityChangeStructure", propOrder = {
    "equipmentAvailability",
    "situationRef",
    "mobilityDisruption"
})
public class FacilityChangeStructure {

    @XmlElement(name = "EquipmentAvailability")
    protected EquipmentAvailabilityStructure equipmentAvailability;
    @XmlElement(name = "SituationRef")
    protected SituationRefStructure situationRef;
    @XmlElement(name = "MobilityDisruption")
    protected MobilityDisruptionStructure mobilityDisruption;

    /**
     * Gets the value of the equipmentAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentAvailabilityStructure }
     *     
     */
    public EquipmentAvailabilityStructure getEquipmentAvailability() {
        return equipmentAvailability;
    }

    /**
     * Sets the value of the equipmentAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentAvailabilityStructure }
     *     
     */
    public void setEquipmentAvailability(EquipmentAvailabilityStructure value) {
        this.equipmentAvailability = value;
    }

    /**
     * Gets the value of the situationRef property.
     * 
     * @return
     *     possible object is
     *     {@link SituationRefStructure }
     *     
     */
    public SituationRefStructure getSituationRef() {
        return situationRef;
    }

    /**
     * Sets the value of the situationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationRefStructure }
     *     
     */
    public void setSituationRef(SituationRefStructure value) {
        this.situationRef = value;
    }

    /**
     * Gets the value of the mobilityDisruption property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityDisruptionStructure }
     *     
     */
    public MobilityDisruptionStructure getMobilityDisruption() {
        return mobilityDisruption;
    }

    /**
     * Sets the value of the mobilityDisruption property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityDisruptionStructure }
     *     
     */
    public void setMobilityDisruption(MobilityDisruptionStructure value) {
        this.mobilityDisruption = value;
    }

    public FacilityChangeStructure withEquipmentAvailability(EquipmentAvailabilityStructure value) {
        setEquipmentAvailability(value);
        return this;
    }

    public FacilityChangeStructure withSituationRef(SituationRefStructure value) {
        setSituationRef(value);
        return this;
    }

    public FacilityChangeStructure withMobilityDisruption(MobilityDisruptionStructure value) {
        setMobilityDisruption(value);
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