//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for LifeCycleManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LifeCycleManagement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cancel" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="end" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="lifeCycleManagementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LifeCycleManagement", propOrder = {
    "cancel",
    "end",
    "lifeCycleManagementExtension"
})
public class LifeCycleManagement {

    protected Boolean cancel;
    protected Boolean end;
    protected ExtensionType lifeCycleManagementExtension;

    /**
     * Gets the value of the cancel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancel() {
        return cancel;
    }

    /**
     * Sets the value of the cancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancel(Boolean value) {
        this.cancel = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnd(Boolean value) {
        this.end = value;
    }

    /**
     * Gets the value of the lifeCycleManagementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLifeCycleManagementExtension() {
        return lifeCycleManagementExtension;
    }

    /**
     * Sets the value of the lifeCycleManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLifeCycleManagementExtension(ExtensionType value) {
        this.lifeCycleManagementExtension = value;
    }

    public LifeCycleManagement withCancel(Boolean value) {
        setCancel(value);
        return this;
    }

    public LifeCycleManagement withEnd(Boolean value) {
        setEnd(value);
        return this;
    }

    public LifeCycleManagement withLifeCycleManagementExtension(ExtensionType value) {
        setLifeCycleManagementExtension(value);
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
