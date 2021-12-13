//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for Source complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Source"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sourceCountry" type="{http://datex2.eu/schema/2_0RC1/2_0}CountryEnum" minOccurs="0"/&gt;
 *         &lt;element name="sourceIdentification" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="sourceName" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="sourceType" type="{http://datex2.eu/schema/2_0RC1/2_0}SourceTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="reliable" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="sourceExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Source", propOrder = {
    "sourceCountry",
    "sourceIdentification",
    "sourceName",
    "sourceType",
    "reliable",
    "sourceExtension"
})
public class Source {

    @XmlSchemaType(name = "string")
    protected CountryEnum sourceCountry;
    protected String sourceIdentification;
    protected MultilingualString sourceName;
    @XmlSchemaType(name = "string")
    protected SourceTypeEnum sourceType;
    protected Boolean reliable;
    protected ExtensionType sourceExtension;

    /**
     * Gets the value of the sourceCountry property.
     * 
     * @return
     *     possible object is
     *     {@link CountryEnum }
     *     
     */
    public CountryEnum getSourceCountry() {
        return sourceCountry;
    }

    /**
     * Sets the value of the sourceCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryEnum }
     *     
     */
    public void setSourceCountry(CountryEnum value) {
        this.sourceCountry = value;
    }

    /**
     * Gets the value of the sourceIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceIdentification() {
        return sourceIdentification;
    }

    /**
     * Sets the value of the sourceIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceIdentification(String value) {
        this.sourceIdentification = value;
    }

    /**
     * Gets the value of the sourceName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getSourceName() {
        return sourceName;
    }

    /**
     * Sets the value of the sourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setSourceName(MultilingualString value) {
        this.sourceName = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link SourceTypeEnum }
     *     
     */
    public SourceTypeEnum getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceTypeEnum }
     *     
     */
    public void setSourceType(SourceTypeEnum value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the reliable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReliable() {
        return reliable;
    }

    /**
     * Sets the value of the reliable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReliable(Boolean value) {
        this.reliable = value;
    }

    /**
     * Gets the value of the sourceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSourceExtension() {
        return sourceExtension;
    }

    /**
     * Sets the value of the sourceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSourceExtension(ExtensionType value) {
        this.sourceExtension = value;
    }

    public Source withSourceCountry(CountryEnum value) {
        setSourceCountry(value);
        return this;
    }

    public Source withSourceIdentification(String value) {
        setSourceIdentification(value);
        return this;
    }

    public Source withSourceName(MultilingualString value) {
        setSourceName(value);
        return this;
    }

    public Source withSourceType(SourceTypeEnum value) {
        setSourceType(value);
        return this;
    }

    public Source withReliable(Boolean value) {
        setReliable(value);
        return this;
    }

    public Source withSourceExtension(ExtensionType value) {
        setSourceExtension(value);
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