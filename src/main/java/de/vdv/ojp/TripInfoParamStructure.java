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
 * TripInfo request parameter structure.
 * 
 * <p>Java class for TripInfoParamStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TripInfoParamStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TripInfoPolicyGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TripInfoContentFilterGroup"/&gt;
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
@XmlType(name = "TripInfoParamStructure", propOrder = {
    "useTimetabledDataOnly",
    "includeCalls",
    "includePosition",
    "includeService",
    "includeTrackSections",
    "includeTrackProjection",
    "extension"
})
public class TripInfoParamStructure {

    @XmlElement(name = "UseTimetabledDataOnly", defaultValue = "false")
    protected Boolean useTimetabledDataOnly;
    @XmlElement(name = "IncludeCalls", defaultValue = "true")
    protected Boolean includeCalls;
    @XmlElement(name = "IncludePosition", defaultValue = "true")
    protected Boolean includePosition;
    @XmlElement(name = "IncludeService", defaultValue = "true")
    protected Boolean includeService;
    @XmlElement(name = "IncludeTrackSections", defaultValue = "false")
    protected Boolean includeTrackSections;
    @XmlElement(name = "IncludeTrackProjection", defaultValue = "false")
    protected Boolean includeTrackProjection;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Gets the value of the useTimetabledDataOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseTimetabledDataOnly() {
        return useTimetabledDataOnly;
    }

    /**
     * Sets the value of the useTimetabledDataOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseTimetabledDataOnly(Boolean value) {
        this.useTimetabledDataOnly = value;
    }

    /**
     * Gets the value of the includeCalls property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCalls() {
        return includeCalls;
    }

    /**
     * Sets the value of the includeCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCalls(Boolean value) {
        this.includeCalls = value;
    }

    /**
     * Gets the value of the includePosition property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludePosition() {
        return includePosition;
    }

    /**
     * Sets the value of the includePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludePosition(Boolean value) {
        this.includePosition = value;
    }

    /**
     * Gets the value of the includeService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeService() {
        return includeService;
    }

    /**
     * Sets the value of the includeService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeService(Boolean value) {
        this.includeService = value;
    }

    /**
     * Gets the value of the includeTrackSections property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTrackSections() {
        return includeTrackSections;
    }

    /**
     * Sets the value of the includeTrackSections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTrackSections(Boolean value) {
        this.includeTrackSections = value;
    }

    /**
     * Gets the value of the includeTrackProjection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTrackProjection() {
        return includeTrackProjection;
    }

    /**
     * Sets the value of the includeTrackProjection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTrackProjection(Boolean value) {
        this.includeTrackProjection = value;
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

    public TripInfoParamStructure withUseTimetabledDataOnly(Boolean value) {
        setUseTimetabledDataOnly(value);
        return this;
    }

    public TripInfoParamStructure withIncludeCalls(Boolean value) {
        setIncludeCalls(value);
        return this;
    }

    public TripInfoParamStructure withIncludePosition(Boolean value) {
        setIncludePosition(value);
        return this;
    }

    public TripInfoParamStructure withIncludeService(Boolean value) {
        setIncludeService(value);
        return this;
    }

    public TripInfoParamStructure withIncludeTrackSections(Boolean value) {
        setIncludeTrackSections(value);
        return this;
    }

    public TripInfoParamStructure withIncludeTrackProjection(Boolean value) {
        setIncludeTrackProjection(value);
        return this;
    }

    public TripInfoParamStructure withExtension(Object value) {
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
