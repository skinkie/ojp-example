//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for PredefinedLocationSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PredefinedLocationSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="predefinedLocationSetName" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="predefinedLocationSetVersion" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="predefinedLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}PredefinedLocation" maxOccurs="unbounded"/&gt;
 *         &lt;element name="predefinedLocationSetExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PredefinedLocationSet", propOrder = {
    "predefinedLocationSetName",
    "predefinedLocationSetVersion",
    "predefinedLocation",
    "predefinedLocationSetExtension"
})
public class PredefinedLocationSet {

    protected MultilingualString predefinedLocationSetName;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger predefinedLocationSetVersion;
    @XmlElement(required = true)
    protected List<PredefinedLocation> predefinedLocation;
    protected ExtensionType predefinedLocationSetExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the predefinedLocationSetName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getPredefinedLocationSetName() {
        return predefinedLocationSetName;
    }

    /**
     * Sets the value of the predefinedLocationSetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setPredefinedLocationSetName(MultilingualString value) {
        this.predefinedLocationSetName = value;
    }

    /**
     * Gets the value of the predefinedLocationSetVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPredefinedLocationSetVersion() {
        return predefinedLocationSetVersion;
    }

    /**
     * Sets the value of the predefinedLocationSetVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPredefinedLocationSetVersion(BigInteger value) {
        this.predefinedLocationSetVersion = value;
    }

    /**
     * Gets the value of the predefinedLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predefinedLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredefinedLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PredefinedLocation }
     * 
     * 
     */
    public List<PredefinedLocation> getPredefinedLocation() {
        if (predefinedLocation == null) {
            predefinedLocation = new ArrayList<PredefinedLocation>();
        }
        return this.predefinedLocation;
    }

    /**
     * Gets the value of the predefinedLocationSetExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPredefinedLocationSetExtension() {
        return predefinedLocationSetExtension;
    }

    /**
     * Sets the value of the predefinedLocationSetExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPredefinedLocationSetExtension(ExtensionType value) {
        this.predefinedLocationSetExtension = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public PredefinedLocationSet withPredefinedLocationSetName(MultilingualString value) {
        setPredefinedLocationSetName(value);
        return this;
    }

    public PredefinedLocationSet withPredefinedLocationSetVersion(BigInteger value) {
        setPredefinedLocationSetVersion(value);
        return this;
    }

    public PredefinedLocationSet withPredefinedLocation(PredefinedLocation... values) {
        if (values!= null) {
            for (PredefinedLocation value: values) {
                getPredefinedLocation().add(value);
            }
        }
        return this;
    }

    public PredefinedLocationSet withPredefinedLocation(Collection<PredefinedLocation> values) {
        if (values!= null) {
            getPredefinedLocation().addAll(values);
        }
        return this;
    }

    public PredefinedLocationSet withPredefinedLocationSetExtension(ExtensionType value) {
        setPredefinedLocationSetExtension(value);
        return this;
    }

    public PredefinedLocationSet withId(String value) {
        setId(value);
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
