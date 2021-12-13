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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for ImageStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ImageRef" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *           &lt;element name="ImageBinary" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ImageContent" type="{http://www.siri.org.uk/siri}ImageContentEnumeration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageStructure", propOrder = {
    "imageRef",
    "imageBinary",
    "imageContent"
})
@XmlSeeAlso({
    de.vdv.ojp.model.RoadSituationElementStructure.Images.Image.class
})
public class ImageStructure {

    @XmlElement(name = "ImageRef")
    @XmlSchemaType(name = "anyURI")
    protected String imageRef;
    @XmlElement(name = "ImageBinary")
    protected byte[] imageBinary;
    @XmlElement(name = "ImageContent")
    @XmlSchemaType(name = "NMTOKEN")
    protected ImageContentEnumeration imageContent;

    /**
     * Gets the value of the imageRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageRef() {
        return imageRef;
    }

    /**
     * Sets the value of the imageRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageRef(String value) {
        this.imageRef = value;
    }

    /**
     * Gets the value of the imageBinary property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImageBinary() {
        return imageBinary;
    }

    /**
     * Sets the value of the imageBinary property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImageBinary(byte[] value) {
        this.imageBinary = value;
    }

    /**
     * Gets the value of the imageContent property.
     * 
     * @return
     *     possible object is
     *     {@link ImageContentEnumeration }
     *     
     */
    public ImageContentEnumeration getImageContent() {
        return imageContent;
    }

    /**
     * Sets the value of the imageContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageContentEnumeration }
     *     
     */
    public void setImageContent(ImageContentEnumeration value) {
        this.imageContent = value;
    }

    public ImageStructure withImageRef(String value) {
        setImageRef(value);
        return this;
    }

    public ImageStructure withImageBinary(byte[] value) {
        setImageBinary(value);
        return this;
    }

    public ImageStructure withImageContent(ImageContentEnumeration value) {
        setImageContent(value);
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