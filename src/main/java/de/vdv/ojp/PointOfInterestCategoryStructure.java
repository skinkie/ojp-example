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
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * [a view of POINT OF INTEREST CLASSIFICATION in TMv6] categorisation of POINTs OF INTEREST in respect of the activities undertaken at them (defined by key-value-pairs).
 * 
 * <p>Java class for PointOfInterestCategoryStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointOfInterestCategoryStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="OsmTag" type="{http://www.vdv.de/ojp}OsmTagStructure" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PointOfInterestClassification" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInterestCategoryStructure", propOrder = {
    "osmTag",
    "pointOfInterestClassification"
})
public class PointOfInterestCategoryStructure {

    @XmlElement(name = "OsmTag")
    protected List<OsmTagStructure> osmTag;
    @XmlElement(name = "PointOfInterestClassification")
    protected List<String> pointOfInterestClassification;

    /**
     * Gets the value of the osmTag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the osmTag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOsmTag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OsmTagStructure }
     * 
     * 
     */
    public List<OsmTagStructure> getOsmTag() {
        if (osmTag == null) {
            osmTag = new ArrayList<OsmTagStructure>();
        }
        return this.osmTag;
    }

    /**
     * Gets the value of the pointOfInterestClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointOfInterestClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointOfInterestClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPointOfInterestClassification() {
        if (pointOfInterestClassification == null) {
            pointOfInterestClassification = new ArrayList<String>();
        }
        return this.pointOfInterestClassification;
    }

    public PointOfInterestCategoryStructure withOsmTag(OsmTagStructure... values) {
        if (values!= null) {
            for (OsmTagStructure value: values) {
                getOsmTag().add(value);
            }
        }
        return this;
    }

    public PointOfInterestCategoryStructure withOsmTag(Collection<OsmTagStructure> values) {
        if (values!= null) {
            getOsmTag().addAll(values);
        }
        return this;
    }

    public PointOfInterestCategoryStructure withPointOfInterestClassification(String... values) {
        if (values!= null) {
            for (String value: values) {
                getPointOfInterestClassification().add(value);
            }
        }
        return this;
    }

    public PointOfInterestCategoryStructure withPointOfInterestClassification(Collection<String> values) {
        if (values!= null) {
            getPointOfInterestClassification().addAll(values);
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