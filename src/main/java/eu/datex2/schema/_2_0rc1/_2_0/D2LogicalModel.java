//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for D2LogicalModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="D2LogicalModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="exchange" type="{http://datex2.eu/schema/2_0RC1/2_0}Exchange"/&gt;
 *         &lt;element name="payloadPublication" type="{http://datex2.eu/schema/2_0RC1/2_0}PayloadPublication" minOccurs="0"/&gt;
 *         &lt;element name="d2LogicalModelExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="modelBaseVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="2.0RC1" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "D2LogicalModel", propOrder = {
    "exchange",
    "payloadPublication",
    "d2LogicalModelExtension"
})
public class D2LogicalModel {

    @XmlElement(required = true)
    protected Exchange exchange;
    protected PayloadPublication payloadPublication;
    protected ExtensionType d2LogicalModelExtension;
    @XmlAttribute(name = "modelBaseVersion", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String modelBaseVersion;

    /**
     * Gets the value of the exchange property.
     * 
     * @return
     *     possible object is
     *     {@link Exchange }
     *     
     */
    public Exchange getExchange() {
        return exchange;
    }

    /**
     * Sets the value of the exchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Exchange }
     *     
     */
    public void setExchange(Exchange value) {
        this.exchange = value;
    }

    /**
     * Gets the value of the payloadPublication property.
     * 
     * @return
     *     possible object is
     *     {@link PayloadPublication }
     *     
     */
    public PayloadPublication getPayloadPublication() {
        return payloadPublication;
    }

    /**
     * Sets the value of the payloadPublication property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayloadPublication }
     *     
     */
    public void setPayloadPublication(PayloadPublication value) {
        this.payloadPublication = value;
    }

    /**
     * Gets the value of the d2LogicalModelExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getD2LogicalModelExtension() {
        return d2LogicalModelExtension;
    }

    /**
     * Sets the value of the d2LogicalModelExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setD2LogicalModelExtension(ExtensionType value) {
        this.d2LogicalModelExtension = value;
    }

    /**
     * Gets the value of the modelBaseVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelBaseVersion() {
        if (modelBaseVersion == null) {
            return "2.0RC1";
        } else {
            return modelBaseVersion;
        }
    }

    /**
     * Sets the value of the modelBaseVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelBaseVersion(String value) {
        this.modelBaseVersion = value;
    }

    public D2LogicalModel withExchange(Exchange value) {
        setExchange(value);
        return this;
    }

    public D2LogicalModel withPayloadPublication(PayloadPublication value) {
        setPayloadPublication(value);
        return this;
    }

    public D2LogicalModel withD2LogicalModelExtension(ExtensionType value) {
        setD2LogicalModelExtension(value);
        return this;
    }

    public D2LogicalModel withModelBaseVersion(String value) {
        setModelBaseVersion(value);
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
