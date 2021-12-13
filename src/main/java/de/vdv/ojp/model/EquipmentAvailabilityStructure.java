//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package de.vdv.ojp.model;

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
import uk.org.ifopt.ifopt.EquipmentRefStructure;
import uk.org.ifopt.ifopt.EquipmentStatusEnumeration;
import uk.org.ifopt.ifopt.EquipmentTypeRefStructure;


/**
 * <p>Java class for EquipmentAvailabilityStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentAvailabilityStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EquipmentRef" type="{http://www.ifopt.org.uk/ifopt}EquipmentRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeRef" type="{http://www.ifopt.org.uk/ifopt}EquipmentTypeRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="ValidityPeriod" type="{http://www.siri.org.uk/siri}HalfOpenTimestampOutputRangeStructure" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentStatus" type="{http://www.ifopt.org.uk/ifopt}EquipmentStatusEnumeration"/&gt;
 *         &lt;element name="EquipmentFeatures" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FeatureRef" type="{http://www.siri.org.uk/siri}FeatureRefStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "EquipmentAvailabilityStructure", propOrder = {
    "equipmentRef",
    "description",
    "equipmentTypeRef",
    "validityPeriod",
    "equipmentStatus",
    "equipmentFeatures",
    "extensions"
})
public class EquipmentAvailabilityStructure {

    @XmlElement(name = "EquipmentRef")
    protected EquipmentRefStructure equipmentRef;
    @XmlElement(name = "Description")
    protected List<NaturalLanguageStringStructure> description;
    @XmlElement(name = "EquipmentTypeRef")
    protected EquipmentTypeRefStructure equipmentTypeRef;
    @XmlElement(name = "ValidityPeriod")
    protected HalfOpenTimestampOutputRangeStructure validityPeriod;
    @XmlElement(name = "EquipmentStatus", required = true, defaultValue = "notAvailable")
    @XmlSchemaType(name = "NMTOKEN")
    protected EquipmentStatusEnumeration equipmentStatus;
    @XmlElement(name = "EquipmentFeatures")
    protected EquipmentAvailabilityStructure.EquipmentFeatures equipmentFeatures;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the equipmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentRefStructure }
     *     
     */
    public EquipmentRefStructure getEquipmentRef() {
        return equipmentRef;
    }

    /**
     * Sets the value of the equipmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentRefStructure }
     *     
     */
    public void setEquipmentRef(EquipmentRefStructure value) {
        this.equipmentRef = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getDescription() {
        if (description == null) {
            description = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.description;
    }

    /**
     * Gets the value of the equipmentTypeRef property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentTypeRefStructure }
     *     
     */
    public EquipmentTypeRefStructure getEquipmentTypeRef() {
        return equipmentTypeRef;
    }

    /**
     * Sets the value of the equipmentTypeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentTypeRefStructure }
     *     
     */
    public void setEquipmentTypeRef(EquipmentTypeRefStructure value) {
        this.equipmentTypeRef = value;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link HalfOpenTimestampOutputRangeStructure }
     *     
     */
    public HalfOpenTimestampOutputRangeStructure getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the value of the validityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link HalfOpenTimestampOutputRangeStructure }
     *     
     */
    public void setValidityPeriod(HalfOpenTimestampOutputRangeStructure value) {
        this.validityPeriod = value;
    }

    /**
     * Gets the value of the equipmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentStatusEnumeration }
     *     
     */
    public EquipmentStatusEnumeration getEquipmentStatus() {
        return equipmentStatus;
    }

    /**
     * Sets the value of the equipmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentStatusEnumeration }
     *     
     */
    public void setEquipmentStatus(EquipmentStatusEnumeration value) {
        this.equipmentStatus = value;
    }

    /**
     * Gets the value of the equipmentFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentAvailabilityStructure.EquipmentFeatures }
     *     
     */
    public EquipmentAvailabilityStructure.EquipmentFeatures getEquipmentFeatures() {
        return equipmentFeatures;
    }

    /**
     * Sets the value of the equipmentFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentAvailabilityStructure.EquipmentFeatures }
     *     
     */
    public void setEquipmentFeatures(EquipmentAvailabilityStructure.EquipmentFeatures value) {
        this.equipmentFeatures = value;
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

    public EquipmentAvailabilityStructure withEquipmentRef(EquipmentRefStructure value) {
        setEquipmentRef(value);
        return this;
    }

    public EquipmentAvailabilityStructure withDescription(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getDescription().add(value);
            }
        }
        return this;
    }

    public EquipmentAvailabilityStructure withDescription(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getDescription().addAll(values);
        }
        return this;
    }

    public EquipmentAvailabilityStructure withEquipmentTypeRef(EquipmentTypeRefStructure value) {
        setEquipmentTypeRef(value);
        return this;
    }

    public EquipmentAvailabilityStructure withValidityPeriod(HalfOpenTimestampOutputRangeStructure value) {
        setValidityPeriod(value);
        return this;
    }

    public EquipmentAvailabilityStructure withEquipmentStatus(EquipmentStatusEnumeration value) {
        setEquipmentStatus(value);
        return this;
    }

    public EquipmentAvailabilityStructure withEquipmentFeatures(EquipmentAvailabilityStructure.EquipmentFeatures value) {
        setEquipmentFeatures(value);
        return this;
    }

    public EquipmentAvailabilityStructure withExtensions(ExtensionsStructure value) {
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="FeatureRef" type="{http://www.siri.org.uk/siri}FeatureRefStructure" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "featureRef"
    })
    public static class EquipmentFeatures {

        @XmlElement(name = "FeatureRef", required = true)
        protected List<FeatureRefStructure> featureRef;

        /**
         * Gets the value of the featureRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the featureRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeatureRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FeatureRefStructure }
         * 
         * 
         */
        public List<FeatureRefStructure> getFeatureRef() {
            if (featureRef == null) {
                featureRef = new ArrayList<FeatureRefStructure>();
            }
            return this.featureRef;
        }

        public EquipmentAvailabilityStructure.EquipmentFeatures withFeatureRef(FeatureRefStructure... values) {
            if (values!= null) {
                for (FeatureRefStructure value: values) {
                    getFeatureRef().add(value);
                }
            }
            return this;
        }

        public EquipmentAvailabilityStructure.EquipmentFeatures withFeatureRef(Collection<FeatureRefStructure> values) {
            if (values!= null) {
                getFeatureRef().addAll(values);
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

}