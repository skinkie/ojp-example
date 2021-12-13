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
 * <p>Java class for FacilityConditionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityConditionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Facility" type="{http://www.siri.org.uk/siri}FacilityStructure"/&gt;
 *           &lt;element ref="{http://www.siri.org.uk/siri}FacilityRef"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="FacilityStatus" type="{http://www.siri.org.uk/siri}FacilityStatusStructure"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationRef" minOccurs="0"/&gt;
 *         &lt;element name="Remedy" type="{http://www.siri.org.uk/siri}RemedyStructure" minOccurs="0"/&gt;
 *         &lt;element name="MonitoringInfo" type="{http://www.siri.org.uk/siri}MonitoringInformationStructure" minOccurs="0"/&gt;
 *         &lt;element name="ValidityPeriod" type="{http://www.siri.org.uk/siri}HalfOpenTimestampOutputRangeStructure" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityConditionStructure", propOrder = {
    "facility",
    "facilityRef",
    "facilityStatus",
    "situationRef",
    "remedy",
    "monitoringInfo",
    "validityPeriod",
    "extensions"
})
public class FacilityConditionStructure {

    @XmlElement(name = "Facility")
    protected FacilityStructure facility;
    @XmlElement(name = "FacilityRef")
    protected FacilityRefStructure facilityRef;
    @XmlElement(name = "FacilityStatus", required = true)
    protected FacilityStatusStructure facilityStatus;
    @XmlElement(name = "SituationRef")
    protected SituationRefStructure situationRef;
    @XmlElement(name = "Remedy")
    protected RemedyStructure remedy;
    @XmlElement(name = "MonitoringInfo")
    protected MonitoringInformationStructure monitoringInfo;
    @XmlElement(name = "ValidityPeriod")
    protected HalfOpenTimestampOutputRangeStructure validityPeriod;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the facility property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityStructure }
     *     
     */
    public FacilityStructure getFacility() {
        return facility;
    }

    /**
     * Sets the value of the facility property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityStructure }
     *     
     */
    public void setFacility(FacilityStructure value) {
        this.facility = value;
    }

    /**
     * Gets the value of the facilityRef property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityRefStructure }
     *     
     */
    public FacilityRefStructure getFacilityRef() {
        return facilityRef;
    }

    /**
     * Sets the value of the facilityRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityRefStructure }
     *     
     */
    public void setFacilityRef(FacilityRefStructure value) {
        this.facilityRef = value;
    }

    /**
     * Gets the value of the facilityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityStatusStructure }
     *     
     */
    public FacilityStatusStructure getFacilityStatus() {
        return facilityStatus;
    }

    /**
     * Sets the value of the facilityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityStatusStructure }
     *     
     */
    public void setFacilityStatus(FacilityStatusStructure value) {
        this.facilityStatus = value;
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
     * Gets the value of the remedy property.
     * 
     * @return
     *     possible object is
     *     {@link RemedyStructure }
     *     
     */
    public RemedyStructure getRemedy() {
        return remedy;
    }

    /**
     * Sets the value of the remedy property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemedyStructure }
     *     
     */
    public void setRemedy(RemedyStructure value) {
        this.remedy = value;
    }

    /**
     * Gets the value of the monitoringInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringInformationStructure }
     *     
     */
    public MonitoringInformationStructure getMonitoringInfo() {
        return monitoringInfo;
    }

    /**
     * Sets the value of the monitoringInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringInformationStructure }
     *     
     */
    public void setMonitoringInfo(MonitoringInformationStructure value) {
        this.monitoringInfo = value;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link HalfOpenTimestampOutputRangeStructure }
     *     
     */
    public HalfOpenTimestampOutputRangeStructure getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the value of the validityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link HalfOpenTimestampOutputRangeStructure }
     *     
     */
    public void setValidityPeriod(HalfOpenTimestampOutputRangeStructure value) {
        this.validityPeriod = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public FacilityConditionStructure withFacility(FacilityStructure value) {
        setFacility(value);
        return this;
    }

    public FacilityConditionStructure withFacilityRef(FacilityRefStructure value) {
        setFacilityRef(value);
        return this;
    }

    public FacilityConditionStructure withFacilityStatus(FacilityStatusStructure value) {
        setFacilityStatus(value);
        return this;
    }

    public FacilityConditionStructure withSituationRef(SituationRefStructure value) {
        setSituationRef(value);
        return this;
    }

    public FacilityConditionStructure withRemedy(RemedyStructure value) {
        setRemedy(value);
        return this;
    }

    public FacilityConditionStructure withMonitoringInfo(MonitoringInformationStructure value) {
        setMonitoringInfo(value);
        return this;
    }

    public FacilityConditionStructure withValidityPeriod(HalfOpenTimestampOutputRangeStructure value) {
        setValidityPeriod(value);
        return this;
    }

    public FacilityConditionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
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
