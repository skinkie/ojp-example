//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package de.vdv.ojp.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for DefaultedTextStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DefaultedTextStructure"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.siri.org.uk/siri&gt;NaturalLanguageStringStructure"&gt;
 *       &lt;attribute name="overridden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultedTextStructure")
public class DefaultedTextStructure
    extends NaturalLanguageStringStructure
{

    @XmlAttribute(name = "overridden")
    protected Boolean overridden;

    /**
     * Gets the value of the overridden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOverridden() {
        if (overridden == null) {
            return true;
        } else {
            return overridden;
        }
    }

    /**
     * Sets the value of the overridden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverridden(Boolean value) {
        this.overridden = value;
    }

    public DefaultedTextStructure withOverridden(Boolean value) {
        setOverridden(value);
        return this;
    }

    @Override
    public DefaultedTextStructure withValue(String value) {
        setValue(value);
        return this;
    }

    @Override
    public DefaultedTextStructure withLang(String value) {
        setLang(value);
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
