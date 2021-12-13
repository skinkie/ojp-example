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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for TransportDescriptionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportDescriptionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CommunicationsTransportMethod" type="{http://www.siri.org.uk/siri}CommunicationsTransportMethodEnumeration"/&gt;
 *         &lt;element name="CompressionMethod" type="{http://www.siri.org.uk/siri}CompressionMethodEnumeration"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportDescriptionStructure", propOrder = {
    "communicationsTransportMethod",
    "compressionMethod"
})
public class TransportDescriptionStructure {

    @XmlElement(name = "CommunicationsTransportMethod", required = true, defaultValue = "httpPost")
    @XmlSchemaType(name = "NMTOKEN")
    protected CommunicationsTransportMethodEnumeration communicationsTransportMethod;
    @XmlElement(name = "CompressionMethod", required = true, defaultValue = "none")
    @XmlSchemaType(name = "NMTOKEN")
    protected CompressionMethodEnumeration compressionMethod;

    /**
     * Gets the value of the communicationsTransportMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationsTransportMethodEnumeration }
     *     
     */
    public CommunicationsTransportMethodEnumeration getCommunicationsTransportMethod() {
        return communicationsTransportMethod;
    }

    /**
     * Sets the value of the communicationsTransportMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationsTransportMethodEnumeration }
     *     
     */
    public void setCommunicationsTransportMethod(CommunicationsTransportMethodEnumeration value) {
        this.communicationsTransportMethod = value;
    }

    /**
     * Gets the value of the compressionMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CompressionMethodEnumeration }
     *     
     */
    public CompressionMethodEnumeration getCompressionMethod() {
        return compressionMethod;
    }

    /**
     * Sets the value of the compressionMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompressionMethodEnumeration }
     *     
     */
    public void setCompressionMethod(CompressionMethodEnumeration value) {
        this.compressionMethod = value;
    }

    public TransportDescriptionStructure withCommunicationsTransportMethod(CommunicationsTransportMethodEnumeration value) {
        setCommunicationsTransportMethod(value);
        return this;
    }

    public TransportDescriptionStructure withCompressionMethod(CompressionMethodEnumeration value) {
        setCompressionMethod(value);
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