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
 * <p>Java class for SituationRefStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SituationRefStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationSimpleRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationFullRef" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationRefStructure", propOrder = {
    "situationSimpleRef",
    "situationFullRef"
})
public class SituationRefStructure {

    @XmlElement(name = "SituationSimpleRef")
    protected SituationSimpleRefStructure situationSimpleRef;
    @XmlElement(name = "SituationFullRef")
    protected SituationFullRefStructure situationFullRef;

    /**
     * Gets the value of the situationSimpleRef property.
     * 
     * @return
     *     possible object is
     *     {@link SituationSimpleRefStructure }
     *     
     */
    public SituationSimpleRefStructure getSituationSimpleRef() {
        return situationSimpleRef;
    }

    /**
     * Sets the value of the situationSimpleRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationSimpleRefStructure }
     *     
     */
    public void setSituationSimpleRef(SituationSimpleRefStructure value) {
        this.situationSimpleRef = value;
    }

    /**
     * Gets the value of the situationFullRef property.
     * 
     * @return
     *     possible object is
     *     {@link SituationFullRefStructure }
     *     
     */
    public SituationFullRefStructure getSituationFullRef() {
        return situationFullRef;
    }

    /**
     * Sets the value of the situationFullRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationFullRefStructure }
     *     
     */
    public void setSituationFullRef(SituationFullRefStructure value) {
        this.situationFullRef = value;
    }

    public SituationRefStructure withSituationSimpleRef(SituationSimpleRefStructure value) {
        setSituationSimpleRef(value);
        return this;
    }

    public SituationRefStructure withSituationFullRef(SituationFullRefStructure value) {
        setSituationFullRef(value);
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
