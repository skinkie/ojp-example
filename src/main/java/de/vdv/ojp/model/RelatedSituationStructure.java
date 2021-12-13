//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package de.vdv.ojp.model;

import java.time.ZonedDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;
import uk.org.ifopt.ifopt.CountryRefStructure;


/**
 * <p>Java class for RelatedSituationStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedSituationStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}SituationSharedIdentityGroup"/&gt;
 *         &lt;element name="ExternalReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelatedAs" type="{http://www.siri.org.uk/siri}RelatedToEnumeration" minOccurs="0"/&gt;
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
@XmlType(name = "RelatedSituationStructure", propOrder = {
    "creationTime",
    "countryRef",
    "participantRef",
    "situationNumber",
    "updateCountryRef",
    "updateParticipantRef",
    "version",
    "externalReference",
    "relatedAs",
    "extensions"
})
public class RelatedSituationStructure {

    @XmlElement(name = "CreationTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime creationTime;
    @XmlElement(name = "CountryRef")
    protected CountryRefStructure countryRef;
    @XmlElement(name = "ParticipantRef")
    protected ParticipantRefStructure participantRef;
    @XmlElement(name = "SituationNumber", required = true)
    protected EntryQualifierStructure situationNumber;
    @XmlElement(name = "UpdateCountryRef")
    protected CountryRefStructure updateCountryRef;
    @XmlElement(name = "UpdateParticipantRef")
    protected ParticipantRefStructure updateParticipantRef;
    @XmlElement(name = "Version")
    protected SituationVersion version;
    @XmlElement(name = "ExternalReference")
    protected String externalReference;
    @XmlElement(name = "RelatedAs")
    @XmlSchemaType(name = "NMTOKEN")
    protected RelatedToEnumeration relatedAs;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the creationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationTime(ZonedDateTime value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the countryRef property.
     * 
     * @return
     *     possible object is
     *     {@link CountryRefStructure }
     *     
     */
    public CountryRefStructure getCountryRef() {
        return countryRef;
    }

    /**
     * Sets the value of the countryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRefStructure }
     *     
     */
    public void setCountryRef(CountryRefStructure value) {
        this.countryRef = value;
    }

    /**
     * Gets the value of the participantRef property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getParticipantRef() {
        return participantRef;
    }

    /**
     * Sets the value of the participantRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setParticipantRef(ParticipantRefStructure value) {
        this.participantRef = value;
    }

    /**
     * Gets the value of the situationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link EntryQualifierStructure }
     *     
     */
    public EntryQualifierStructure getSituationNumber() {
        return situationNumber;
    }

    /**
     * Sets the value of the situationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryQualifierStructure }
     *     
     */
    public void setSituationNumber(EntryQualifierStructure value) {
        this.situationNumber = value;
    }

    /**
     * Gets the value of the updateCountryRef property.
     * 
     * @return
     *     possible object is
     *     {@link CountryRefStructure }
     *     
     */
    public CountryRefStructure getUpdateCountryRef() {
        return updateCountryRef;
    }

    /**
     * Sets the value of the updateCountryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRefStructure }
     *     
     */
    public void setUpdateCountryRef(CountryRefStructure value) {
        this.updateCountryRef = value;
    }

    /**
     * Gets the value of the updateParticipantRef property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getUpdateParticipantRef() {
        return updateParticipantRef;
    }

    /**
     * Sets the value of the updateParticipantRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setUpdateParticipantRef(ParticipantRefStructure value) {
        this.updateParticipantRef = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link SituationVersion }
     *     
     */
    public SituationVersion getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationVersion }
     *     
     */
    public void setVersion(SituationVersion value) {
        this.version = value;
    }

    /**
     * Gets the value of the externalReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReference() {
        return externalReference;
    }

    /**
     * Sets the value of the externalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReference(String value) {
        this.externalReference = value;
    }

    /**
     * Gets the value of the relatedAs property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedToEnumeration }
     *     
     */
    public RelatedToEnumeration getRelatedAs() {
        return relatedAs;
    }

    /**
     * Sets the value of the relatedAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedToEnumeration }
     *     
     */
    public void setRelatedAs(RelatedToEnumeration value) {
        this.relatedAs = value;
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

    public RelatedSituationStructure withCreationTime(ZonedDateTime value) {
        setCreationTime(value);
        return this;
    }

    public RelatedSituationStructure withCountryRef(CountryRefStructure value) {
        setCountryRef(value);
        return this;
    }

    public RelatedSituationStructure withParticipantRef(ParticipantRefStructure value) {
        setParticipantRef(value);
        return this;
    }

    public RelatedSituationStructure withSituationNumber(EntryQualifierStructure value) {
        setSituationNumber(value);
        return this;
    }

    public RelatedSituationStructure withUpdateCountryRef(CountryRefStructure value) {
        setUpdateCountryRef(value);
        return this;
    }

    public RelatedSituationStructure withUpdateParticipantRef(ParticipantRefStructure value) {
        setUpdateParticipantRef(value);
        return this;
    }

    public RelatedSituationStructure withVersion(SituationVersion value) {
        setVersion(value);
        return this;
    }

    public RelatedSituationStructure withExternalReference(String value) {
        setExternalReference(value);
        return this;
    }

    public RelatedSituationStructure withRelatedAs(RelatedToEnumeration value) {
        setRelatedAs(value);
        return this;
    }

    public RelatedSituationStructure withExtensions(ExtensionsStructure value) {
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
