//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package de.vdv.ojp;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Multi-point trip request parameter structure.
 * 
 * <p>Java class for MultiPointTripParamStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiPointTripParamStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TripDataFilterGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TripMobilityFilterGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}MultiPointTripPolicyGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}MultiPointTripContentFilterGroup"/&gt;
 *         &lt;element name="FareParam" type="{http://www.vdv.de/ojp}FareParamStructure" minOccurs="0"/&gt;
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
@XmlType(name = "MultiPointTripParamStructure", propOrder = {
    "ptModeFilter",
    "lineFilter",
    "operatorFilter",
    "privateModeFilter",
    "noSingleStep",
    "noStairs",
    "noEscalator",
    "noElevator",
    "noRamp",
    "levelEntrance",
    "bikeTransport",
    "walkSpeed",
    "numberOfResults",
    "numberOfResultsBefore",
    "numberOfResultsAfter",
    "ignoreRealtimeData",
    "immediateTripStart",
    "transferLimit",
    "optimisationMethod",
    "multiPointType",
    "includeTrackSections",
    "includeLegProjection",
    "includeTurnDescription",
    "includeAccessibility",
    "includeIntermediateStops",
    "includeFare",
    "includeOperatingDays",
    "includeLegs",
    "fareParam",
    "extension"
})
public class MultiPointTripParamStructure {

    @XmlElement(name = "PtModeFilter")
    protected PtModeFilterStructure ptModeFilter;
    @XmlElement(name = "LineFilter")
    protected LineDirectionFilterStructure lineFilter;
    @XmlElement(name = "OperatorFilter")
    protected OperatorFilterStructure operatorFilter;
    @XmlElement(name = "PrivateModeFilter")
    protected PrivateModeFilterStructure privateModeFilter;
    @XmlElement(name = "NoSingleStep", defaultValue = "false")
    protected Boolean noSingleStep;
    @XmlElement(name = "NoStairs", defaultValue = "false")
    protected Boolean noStairs;
    @XmlElement(name = "NoEscalator", defaultValue = "false")
    protected Boolean noEscalator;
    @XmlElement(name = "NoElevator", defaultValue = "false")
    protected Boolean noElevator;
    @XmlElement(name = "NoRamp", defaultValue = "false")
    protected Boolean noRamp;
    @XmlElement(name = "LevelEntrance", defaultValue = "false")
    protected Boolean levelEntrance;
    @XmlElement(name = "BikeTransport", defaultValue = "false")
    protected Boolean bikeTransport;
    @XmlElement(name = "WalkSpeed")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger walkSpeed;
    @XmlElement(name = "NumberOfResults")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfResults;
    @XmlElement(name = "NumberOfResultsBefore")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfResultsBefore;
    @XmlElement(name = "NumberOfResultsAfter")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfResultsAfter;
    @XmlElement(name = "IgnoreRealtimeData", defaultValue = "false")
    protected Boolean ignoreRealtimeData;
    @XmlElement(name = "ImmediateTripStart", defaultValue = "false")
    protected Boolean immediateTripStart;
    @XmlElement(name = "TransferLimit")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger transferLimit;
    @XmlElement(name = "OptimisationMethod")
    @XmlSchemaType(name = "string")
    protected OptimisationMethodEnumeration optimisationMethod;
    @XmlElement(name = "MultiPointType")
    @XmlSchemaType(name = "string")
    protected MultiPointTypeEnumeration multiPointType;
    @XmlElement(name = "IncludeTrackSections", defaultValue = "false")
    protected Boolean includeTrackSections;
    @XmlElement(name = "IncludeLegProjection", defaultValue = "false")
    protected Boolean includeLegProjection;
    @XmlElement(name = "IncludeTurnDescription", defaultValue = "false")
    protected Boolean includeTurnDescription;
    @XmlElement(name = "IncludeAccessibility", defaultValue = "false")
    protected Boolean includeAccessibility;
    @XmlElement(name = "IncludeIntermediateStops", defaultValue = "false")
    protected Boolean includeIntermediateStops;
    @XmlElement(name = "IncludeFare", defaultValue = "false")
    protected Boolean includeFare;
    @XmlElement(name = "IncludeOperatingDays", defaultValue = "false")
    protected Boolean includeOperatingDays;
    @XmlElement(name = "IncludeLegs", defaultValue = "false")
    protected Boolean includeLegs;
    @XmlElement(name = "FareParam")
    protected FareParamStructure fareParam;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Gets the value of the ptModeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link PtModeFilterStructure }
     *     
     */
    public PtModeFilterStructure getPtModeFilter() {
        return ptModeFilter;
    }

    /**
     * Sets the value of the ptModeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link PtModeFilterStructure }
     *     
     */
    public void setPtModeFilter(PtModeFilterStructure value) {
        this.ptModeFilter = value;
    }

    /**
     * Gets the value of the lineFilter property.
     * 
     * @return
     *     possible object is
     *     {@link LineDirectionFilterStructure }
     *     
     */
    public LineDirectionFilterStructure getLineFilter() {
        return lineFilter;
    }

    /**
     * Sets the value of the lineFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineDirectionFilterStructure }
     *     
     */
    public void setLineFilter(LineDirectionFilterStructure value) {
        this.lineFilter = value;
    }

    /**
     * Gets the value of the operatorFilter property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorFilterStructure }
     *     
     */
    public OperatorFilterStructure getOperatorFilter() {
        return operatorFilter;
    }

    /**
     * Sets the value of the operatorFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorFilterStructure }
     *     
     */
    public void setOperatorFilter(OperatorFilterStructure value) {
        this.operatorFilter = value;
    }

    /**
     * Gets the value of the privateModeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateModeFilterStructure }
     *     
     */
    public PrivateModeFilterStructure getPrivateModeFilter() {
        return privateModeFilter;
    }

    /**
     * Sets the value of the privateModeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateModeFilterStructure }
     *     
     */
    public void setPrivateModeFilter(PrivateModeFilterStructure value) {
        this.privateModeFilter = value;
    }

    /**
     * Gets the value of the noSingleStep property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoSingleStep() {
        return noSingleStep;
    }

    /**
     * Sets the value of the noSingleStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoSingleStep(Boolean value) {
        this.noSingleStep = value;
    }

    /**
     * Gets the value of the noStairs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoStairs() {
        return noStairs;
    }

    /**
     * Sets the value of the noStairs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoStairs(Boolean value) {
        this.noStairs = value;
    }

    /**
     * Gets the value of the noEscalator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoEscalator() {
        return noEscalator;
    }

    /**
     * Sets the value of the noEscalator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoEscalator(Boolean value) {
        this.noEscalator = value;
    }

    /**
     * Gets the value of the noElevator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoElevator() {
        return noElevator;
    }

    /**
     * Sets the value of the noElevator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoElevator(Boolean value) {
        this.noElevator = value;
    }

    /**
     * Gets the value of the noRamp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoRamp() {
        return noRamp;
    }

    /**
     * Sets the value of the noRamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoRamp(Boolean value) {
        this.noRamp = value;
    }

    /**
     * Gets the value of the levelEntrance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLevelEntrance() {
        return levelEntrance;
    }

    /**
     * Sets the value of the levelEntrance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLevelEntrance(Boolean value) {
        this.levelEntrance = value;
    }

    /**
     * Gets the value of the bikeTransport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBikeTransport() {
        return bikeTransport;
    }

    /**
     * Sets the value of the bikeTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBikeTransport(Boolean value) {
        this.bikeTransport = value;
    }

    /**
     * Gets the value of the walkSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWalkSpeed() {
        return walkSpeed;
    }

    /**
     * Sets the value of the walkSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWalkSpeed(BigInteger value) {
        this.walkSpeed = value;
    }

    /**
     * Gets the value of the numberOfResults property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfResults() {
        return numberOfResults;
    }

    /**
     * Sets the value of the numberOfResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfResults(BigInteger value) {
        this.numberOfResults = value;
    }

    /**
     * Gets the value of the numberOfResultsBefore property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfResultsBefore() {
        return numberOfResultsBefore;
    }

    /**
     * Sets the value of the numberOfResultsBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfResultsBefore(BigInteger value) {
        this.numberOfResultsBefore = value;
    }

    /**
     * Gets the value of the numberOfResultsAfter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfResultsAfter() {
        return numberOfResultsAfter;
    }

    /**
     * Sets the value of the numberOfResultsAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfResultsAfter(BigInteger value) {
        this.numberOfResultsAfter = value;
    }

    /**
     * Gets the value of the ignoreRealtimeData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreRealtimeData() {
        return ignoreRealtimeData;
    }

    /**
     * Sets the value of the ignoreRealtimeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreRealtimeData(Boolean value) {
        this.ignoreRealtimeData = value;
    }

    /**
     * Gets the value of the immediateTripStart property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImmediateTripStart() {
        return immediateTripStart;
    }

    /**
     * Sets the value of the immediateTripStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImmediateTripStart(Boolean value) {
        this.immediateTripStart = value;
    }

    /**
     * Gets the value of the transferLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransferLimit() {
        return transferLimit;
    }

    /**
     * Sets the value of the transferLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransferLimit(BigInteger value) {
        this.transferLimit = value;
    }

    /**
     * Gets the value of the optimisationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link OptimisationMethodEnumeration }
     *     
     */
    public OptimisationMethodEnumeration getOptimisationMethod() {
        return optimisationMethod;
    }

    /**
     * Sets the value of the optimisationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptimisationMethodEnumeration }
     *     
     */
    public void setOptimisationMethod(OptimisationMethodEnumeration value) {
        this.optimisationMethod = value;
    }

    /**
     * Gets the value of the multiPointType property.
     * 
     * @return
     *     possible object is
     *     {@link MultiPointTypeEnumeration }
     *     
     */
    public MultiPointTypeEnumeration getMultiPointType() {
        return multiPointType;
    }

    /**
     * Sets the value of the multiPointType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiPointTypeEnumeration }
     *     
     */
    public void setMultiPointType(MultiPointTypeEnumeration value) {
        this.multiPointType = value;
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
     * Gets the value of the includeLegProjection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeLegProjection() {
        return includeLegProjection;
    }

    /**
     * Sets the value of the includeLegProjection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeLegProjection(Boolean value) {
        this.includeLegProjection = value;
    }

    /**
     * Gets the value of the includeTurnDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTurnDescription() {
        return includeTurnDescription;
    }

    /**
     * Sets the value of the includeTurnDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTurnDescription(Boolean value) {
        this.includeTurnDescription = value;
    }

    /**
     * Gets the value of the includeAccessibility property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAccessibility() {
        return includeAccessibility;
    }

    /**
     * Sets the value of the includeAccessibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAccessibility(Boolean value) {
        this.includeAccessibility = value;
    }

    /**
     * Gets the value of the includeIntermediateStops property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeIntermediateStops() {
        return includeIntermediateStops;
    }

    /**
     * Sets the value of the includeIntermediateStops property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeIntermediateStops(Boolean value) {
        this.includeIntermediateStops = value;
    }

    /**
     * Gets the value of the includeFare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeFare() {
        return includeFare;
    }

    /**
     * Sets the value of the includeFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeFare(Boolean value) {
        this.includeFare = value;
    }

    /**
     * Gets the value of the includeOperatingDays property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeOperatingDays() {
        return includeOperatingDays;
    }

    /**
     * Sets the value of the includeOperatingDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeOperatingDays(Boolean value) {
        this.includeOperatingDays = value;
    }

    /**
     * Gets the value of the includeLegs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeLegs() {
        return includeLegs;
    }

    /**
     * Sets the value of the includeLegs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeLegs(Boolean value) {
        this.includeLegs = value;
    }

    /**
     * Gets the value of the fareParam property.
     * 
     * @return
     *     possible object is
     *     {@link FareParamStructure }
     *     
     */
    public FareParamStructure getFareParam() {
        return fareParam;
    }

    /**
     * Sets the value of the fareParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareParamStructure }
     *     
     */
    public void setFareParam(FareParamStructure value) {
        this.fareParam = value;
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

    public MultiPointTripParamStructure withPtModeFilter(PtModeFilterStructure value) {
        setPtModeFilter(value);
        return this;
    }

    public MultiPointTripParamStructure withLineFilter(LineDirectionFilterStructure value) {
        setLineFilter(value);
        return this;
    }

    public MultiPointTripParamStructure withOperatorFilter(OperatorFilterStructure value) {
        setOperatorFilter(value);
        return this;
    }

    public MultiPointTripParamStructure withPrivateModeFilter(PrivateModeFilterStructure value) {
        setPrivateModeFilter(value);
        return this;
    }

    public MultiPointTripParamStructure withNoSingleStep(Boolean value) {
        setNoSingleStep(value);
        return this;
    }

    public MultiPointTripParamStructure withNoStairs(Boolean value) {
        setNoStairs(value);
        return this;
    }

    public MultiPointTripParamStructure withNoEscalator(Boolean value) {
        setNoEscalator(value);
        return this;
    }

    public MultiPointTripParamStructure withNoElevator(Boolean value) {
        setNoElevator(value);
        return this;
    }

    public MultiPointTripParamStructure withNoRamp(Boolean value) {
        setNoRamp(value);
        return this;
    }

    public MultiPointTripParamStructure withLevelEntrance(Boolean value) {
        setLevelEntrance(value);
        return this;
    }

    public MultiPointTripParamStructure withBikeTransport(Boolean value) {
        setBikeTransport(value);
        return this;
    }

    public MultiPointTripParamStructure withWalkSpeed(BigInteger value) {
        setWalkSpeed(value);
        return this;
    }

    public MultiPointTripParamStructure withNumberOfResults(BigInteger value) {
        setNumberOfResults(value);
        return this;
    }

    public MultiPointTripParamStructure withNumberOfResultsBefore(BigInteger value) {
        setNumberOfResultsBefore(value);
        return this;
    }

    public MultiPointTripParamStructure withNumberOfResultsAfter(BigInteger value) {
        setNumberOfResultsAfter(value);
        return this;
    }

    public MultiPointTripParamStructure withIgnoreRealtimeData(Boolean value) {
        setIgnoreRealtimeData(value);
        return this;
    }

    public MultiPointTripParamStructure withImmediateTripStart(Boolean value) {
        setImmediateTripStart(value);
        return this;
    }

    public MultiPointTripParamStructure withTransferLimit(BigInteger value) {
        setTransferLimit(value);
        return this;
    }

    public MultiPointTripParamStructure withOptimisationMethod(OptimisationMethodEnumeration value) {
        setOptimisationMethod(value);
        return this;
    }

    public MultiPointTripParamStructure withMultiPointType(MultiPointTypeEnumeration value) {
        setMultiPointType(value);
        return this;
    }

    public MultiPointTripParamStructure withIncludeTrackSections(Boolean value) {
        setIncludeTrackSections(value);
        return this;
    }

    public MultiPointTripParamStructure withIncludeLegProjection(Boolean value) {
        setIncludeLegProjection(value);
        return this;
    }

    public MultiPointTripParamStructure withIncludeTurnDescription(Boolean value) {
        setIncludeTurnDescription(value);
        return this;
    }

    public MultiPointTripParamStructure withIncludeAccessibility(Boolean value) {
        setIncludeAccessibility(value);
        return this;
    }

    public MultiPointTripParamStructure withIncludeIntermediateStops(Boolean value) {
        setIncludeIntermediateStops(value);
        return this;
    }

    public MultiPointTripParamStructure withIncludeFare(Boolean value) {
        setIncludeFare(value);
        return this;
    }

    public MultiPointTripParamStructure withIncludeOperatingDays(Boolean value) {
        setIncludeOperatingDays(value);
        return this;
    }

    public MultiPointTripParamStructure withIncludeLegs(Boolean value) {
        setIncludeLegs(value);
        return this;
    }

    public MultiPointTripParamStructure withFareParam(FareParamStructure value) {
        setFareParam(value);
        return this;
    }

    public MultiPointTripParamStructure withExtension(Object value) {
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