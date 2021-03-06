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
 *  description of a piece of a TRIP. May include geographic information, turn instructions and accessibility information 
 * 
 * <p>Java class for PathGuidanceStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PathGuidanceStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PathGuidanceSection" type="{http://www.vdv.de/ojp}PathGuidanceSectionStructure" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PathGuidanceStructure", propOrder = {
    "pathGuidanceSection"
})
public class PathGuidanceStructure {

    @XmlElement(name = "PathGuidanceSection", required = true)
    protected List<PathGuidanceSectionStructure> pathGuidanceSection;

    /**
     * Gets the value of the pathGuidanceSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pathGuidanceSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPathGuidanceSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PathGuidanceSectionStructure }
     * 
     * 
     */
    public List<PathGuidanceSectionStructure> getPathGuidanceSection() {
        if (pathGuidanceSection == null) {
            pathGuidanceSection = new ArrayList<PathGuidanceSectionStructure>();
        }
        return this.pathGuidanceSection;
    }

    public PathGuidanceStructure withPathGuidanceSection(PathGuidanceSectionStructure... values) {
        if (values!= null) {
            for (PathGuidanceSectionStructure value: values) {
                getPathGuidanceSection().add(value);
            }
        }
        return this;
    }

    public PathGuidanceStructure withPathGuidanceSection(Collection<PathGuidanceSectionStructure> values) {
        if (values!= null) {
            getPathGuidanceSection().addAll(values);
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
