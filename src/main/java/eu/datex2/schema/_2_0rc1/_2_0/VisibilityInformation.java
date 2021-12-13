//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import java.time.ZonedDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for VisibilityInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisibilityInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}WeatherValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="visibility" type="{http://datex2.eu/schema/2_0RC1/2_0}Visibility"/&gt;
 *         &lt;element name="visibilityInformationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisibilityInformation", propOrder = {
    "visibility",
    "visibilityInformationExtension"
})
public class VisibilityInformation
    extends WeatherValue
{

    @XmlElement(required = true)
    protected Visibility visibility;
    protected ExtensionType visibilityInformationExtension;

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link Visibility }
     *     
     */
    public Visibility getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Visibility }
     *     
     */
    public void setVisibility(Visibility value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the visibilityInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVisibilityInformationExtension() {
        return visibilityInformationExtension;
    }

    /**
     * Sets the value of the visibilityInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVisibilityInformationExtension(ExtensionType value) {
        this.visibilityInformationExtension = value;
    }

    public VisibilityInformation withVisibility(Visibility value) {
        setVisibility(value);
        return this;
    }

    public VisibilityInformation withVisibilityInformationExtension(ExtensionType value) {
        setVisibilityInformationExtension(value);
        return this;
    }

    @Override
    public VisibilityInformation withWeatherValueExtension(ExtensionType value) {
        setWeatherValueExtension(value);
        return this;
    }

    @Override
    public VisibilityInformation withAccuracy(Float value) {
        setAccuracy(value);
        return this;
    }

    @Override
    public VisibilityInformation withComputationalMethod(ComputationMethodEnum value) {
        setComputationalMethod(value);
        return this;
    }

    @Override
    public VisibilityInformation withFault(Boolean value) {
        setFault(value);
        return this;
    }

    @Override
    public VisibilityInformation withFaultReason(MultilingualString value) {
        setFaultReason(value);
        return this;
    }

    @Override
    public VisibilityInformation withNumberOfIncompleteInputs(BigInteger value) {
        setNumberOfIncompleteInputs(value);
        return this;
    }

    @Override
    public VisibilityInformation withNumberOfInputValuesUsed(BigInteger value) {
        setNumberOfInputValuesUsed(value);
        return this;
    }

    @Override
    public VisibilityInformation withPeriod(Float value) {
        setPeriod(value);
        return this;
    }

    @Override
    public VisibilityInformation withSmoothingFactor(Float value) {
        setSmoothingFactor(value);
        return this;
    }

    @Override
    public VisibilityInformation withStandardDeviation(Float value) {
        setStandardDeviation(value);
        return this;
    }

    @Override
    public VisibilityInformation withSupplierCalculatedDataQuality(Float value) {
        setSupplierCalculatedDataQuality(value);
        return this;
    }

    @Override
    public VisibilityInformation withTime(ZonedDateTime value) {
        setTime(value);
        return this;
    }

    @Override
    public VisibilityInformation withPertinentLocation(GroupOfLocations value) {
        setPertinentLocation(value);
        return this;
    }

    @Override
    public VisibilityInformation withBasicDataValueExtension(ExtensionType value) {
        setBasicDataValueExtension(value);
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
