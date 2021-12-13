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
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for CapabilitiesResponseStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesResponseStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ProducerResponseStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}AbstractFunctionalServiceCapabilitiesResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesResponseStructure", propOrder = {
    "abstractFunctionalServiceCapabilitiesResponse"
})
public class CapabilitiesResponseStructure
    extends ProducerResponseStructure
{

    @XmlElement(name = "AbstractFunctionalServiceCapabilitiesResponse", required = true)
    protected AbstractServiceCapabilitiesResponseStructure abstractFunctionalServiceCapabilitiesResponse;

    /**
     * Gets the value of the abstractFunctionalServiceCapabilitiesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractServiceCapabilitiesResponseStructure }
     *     
     */
    public AbstractServiceCapabilitiesResponseStructure getAbstractFunctionalServiceCapabilitiesResponse() {
        return abstractFunctionalServiceCapabilitiesResponse;
    }

    /**
     * Sets the value of the abstractFunctionalServiceCapabilitiesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractServiceCapabilitiesResponseStructure }
     *     
     */
    public void setAbstractFunctionalServiceCapabilitiesResponse(AbstractServiceCapabilitiesResponseStructure value) {
        this.abstractFunctionalServiceCapabilitiesResponse = value;
    }

    public CapabilitiesResponseStructure withAbstractFunctionalServiceCapabilitiesResponse(AbstractServiceCapabilitiesResponseStructure value) {
        setAbstractFunctionalServiceCapabilitiesResponse(value);
        return this;
    }

    @Override
    public CapabilitiesResponseStructure withProducerRef(ParticipantRefStructure value) {
        setProducerRef(value);
        return this;
    }

    @Override
    public CapabilitiesResponseStructure withAddress(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public CapabilitiesResponseStructure withResponseMessageIdentifier(MessageQualifierStructure value) {
        setResponseMessageIdentifier(value);
        return this;
    }

    @Override
    public CapabilitiesResponseStructure withRequestMessageRef(MessageRefStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    @Override
    public CapabilitiesResponseStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public CapabilitiesResponseStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public CapabilitiesResponseStructure withResponseTimestamp(ZonedDateTime value) {
        setResponseTimestamp(value);
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