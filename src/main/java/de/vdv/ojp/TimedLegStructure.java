//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package de.vdv.ojp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * passenger TRIP LEG with timetabled schedule.  Corresponds to a RIDE.
 * 
 * <p>Java class for TimedLegStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimedLegStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LegBoard" type="{http://www.vdv.de/ojp}LegBoardStructure"/&gt;
 *         &lt;element name="LegIntermediates" type="{http://www.vdv.de/ojp}LegIntermediateStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LegAlight" type="{http://www.vdv.de/ojp}LegAlightStructure"/&gt;
 *         &lt;element name="Service" type="{http://www.vdv.de/ojp}DatedJourneyStructure"/&gt;
 *         &lt;element name="LegAttribute" type="{http://www.vdv.de/ojp}LegAttributeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}OperatingDaysGroup" minOccurs="0"/&gt;
 *         &lt;element name="LegTrack" type="{http://www.vdv.de/ojp}LegTrackStructure" minOccurs="0"/&gt;
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
@XmlType(name = "TimedLegStructure", propOrder = {
    "legBoard",
    "legIntermediates",
    "legAlight",
    "service",
    "legAttribute",
    "operatingDays",
    "operatingDaysDescription",
    "legTrack",
    "extension"
})
public class TimedLegStructure {

    @XmlElement(name = "LegBoard", required = true)
    protected LegBoardStructure legBoard;
    @XmlElement(name = "LegIntermediates")
    protected List<LegIntermediateStructure> legIntermediates;
    @XmlElement(name = "LegAlight", required = true)
    protected LegAlightStructure legAlight;
    @XmlElement(name = "Service", required = true)
    protected DatedJourneyStructure service;
    @XmlElement(name = "LegAttribute")
    protected List<LegAttributeStructure> legAttribute;
    @XmlElement(name = "OperatingDays")
    protected OperatingDaysStructure operatingDays;
    @XmlElement(name = "OperatingDaysDescription")
    protected InternationalTextStructure operatingDaysDescription;
    @XmlElement(name = "LegTrack")
    protected LegTrackStructure legTrack;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Gets the value of the legBoard property.
     * 
     * @return
     *     possible object is
     *     {@link LegBoardStructure }
     *     
     */
    public LegBoardStructure getLegBoard() {
        return legBoard;
    }

    /**
     * Sets the value of the legBoard property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegBoardStructure }
     *     
     */
    public void setLegBoard(LegBoardStructure value) {
        this.legBoard = value;
    }

    /**
     * Gets the value of the legIntermediates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legIntermediates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegIntermediates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegIntermediateStructure }
     * 
     * 
     */
    public List<LegIntermediateStructure> getLegIntermediates() {
        if (legIntermediates == null) {
            legIntermediates = new ArrayList<LegIntermediateStructure>();
        }
        return this.legIntermediates;
    }

    /**
     * Gets the value of the legAlight property.
     * 
     * @return
     *     possible object is
     *     {@link LegAlightStructure }
     *     
     */
    public LegAlightStructure getLegAlight() {
        return legAlight;
    }

    /**
     * Sets the value of the legAlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegAlightStructure }
     *     
     */
    public void setLegAlight(LegAlightStructure value) {
        this.legAlight = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link DatedJourneyStructure }
     *     
     */
    public DatedJourneyStructure getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedJourneyStructure }
     *     
     */
    public void setService(DatedJourneyStructure value) {
        this.service = value;
    }

    /**
     * Gets the value of the legAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegAttributeStructure }
     * 
     * 
     */
    public List<LegAttributeStructure> getLegAttribute() {
        if (legAttribute == null) {
            legAttribute = new ArrayList<LegAttributeStructure>();
        }
        return this.legAttribute;
    }

    /**
     * Gets the value of the operatingDays property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingDaysStructure }
     *     
     */
    public OperatingDaysStructure getOperatingDays() {
        return operatingDays;
    }

    /**
     * Sets the value of the operatingDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingDaysStructure }
     *     
     */
    public void setOperatingDays(OperatingDaysStructure value) {
        this.operatingDays = value;
    }

    /**
     * Gets the value of the operatingDaysDescription property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getOperatingDaysDescription() {
        return operatingDaysDescription;
    }

    /**
     * Sets the value of the operatingDaysDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setOperatingDaysDescription(InternationalTextStructure value) {
        this.operatingDaysDescription = value;
    }

    /**
     * Gets the value of the legTrack property.
     * 
     * @return
     *     possible object is
     *     {@link LegTrackStructure }
     *     
     */
    public LegTrackStructure getLegTrack() {
        return legTrack;
    }

    /**
     * Sets the value of the legTrack property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegTrackStructure }
     *     
     */
    public void setLegTrack(LegTrackStructure value) {
        this.legTrack = value;
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

    public TimedLegStructure withLegBoard(LegBoardStructure value) {
        setLegBoard(value);
        return this;
    }

    public TimedLegStructure withLegIntermediates(LegIntermediateStructure... values) {
        if (values!= null) {
            for (LegIntermediateStructure value: values) {
                getLegIntermediates().add(value);
            }
        }
        return this;
    }

    public TimedLegStructure withLegIntermediates(Collection<LegIntermediateStructure> values) {
        if (values!= null) {
            getLegIntermediates().addAll(values);
        }
        return this;
    }

    public TimedLegStructure withLegAlight(LegAlightStructure value) {
        setLegAlight(value);
        return this;
    }

    public TimedLegStructure withService(DatedJourneyStructure value) {
        setService(value);
        return this;
    }

    public TimedLegStructure withLegAttribute(LegAttributeStructure... values) {
        if (values!= null) {
            for (LegAttributeStructure value: values) {
                getLegAttribute().add(value);
            }
        }
        return this;
    }

    public TimedLegStructure withLegAttribute(Collection<LegAttributeStructure> values) {
        if (values!= null) {
            getLegAttribute().addAll(values);
        }
        return this;
    }

    public TimedLegStructure withOperatingDays(OperatingDaysStructure value) {
        setOperatingDays(value);
        return this;
    }

    public TimedLegStructure withOperatingDaysDescription(InternationalTextStructure value) {
        setOperatingDaysDescription(value);
        return this;
    }

    public TimedLegStructure withLegTrack(LegTrackStructure value) {
        setLegTrack(value);
        return this;
    }

    public TimedLegStructure withExtension(Object value) {
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