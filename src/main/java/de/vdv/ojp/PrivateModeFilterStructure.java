//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package de.vdv.ojp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * List of private mobility offers to include or exclude.
 * 
 * <p>Java class for PrivateModeFilterStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrivateModeFilterStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PrivateMode" type="{http://www.vdv.de/ojp}PrivateModesEnumeration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrivateModeFilterStructure", propOrder = {
    "exclude",
    "privateMode"
})
public class PrivateModeFilterStructure {

    @XmlElement(name = "Exclude", defaultValue = "true")
    protected Boolean exclude;
    @XmlElement(name = "PrivateMode")
    @XmlSchemaType(name = "string")
    protected List<PrivateModesEnumeration> privateMode;

    /**
     * Gets the value of the exclude property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExclude() {
        return exclude;
    }

    /**
     * Sets the value of the exclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExclude(Boolean value) {
        this.exclude = value;
    }

    /**
     * Gets the value of the privateMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the privateMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrivateMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrivateModesEnumeration }
     * 
     * 
     */
    public List<PrivateModesEnumeration> getPrivateMode() {
        if (privateMode == null) {
            privateMode = new ArrayList<PrivateModesEnumeration>();
        }
        return this.privateMode;
    }

    public PrivateModeFilterStructure withExclude(Boolean value) {
        setExclude(value);
        return this;
    }

    public PrivateModeFilterStructure withPrivateMode(PrivateModesEnumeration... values) {
        if (values!= null) {
            for (PrivateModesEnumeration value: values) {
                getPrivateMode().add(value);
            }
        }
        return this;
    }

    public PrivateModeFilterStructure withPrivateMode(Collection<PrivateModesEnumeration> values) {
        if (values!= null) {
            getPrivateMode().addAll(values);
        }
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
