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
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for PtAdviceStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PtAdviceStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdviceRef" type="{http://www.siri.org.uk/siri}AdviceRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="Details" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PtAdviceStructure", propOrder = {
    "adviceRef",
    "details"
})
public class PtAdviceStructure {

    @XmlElement(name = "AdviceRef")
    protected AdviceRefStructure adviceRef;
    @XmlElement(name = "Details")
    protected List<NaturalLanguageStringStructure> details;

    /**
     * Gets the value of the adviceRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdviceRefStructure }
     *     
     */
    public AdviceRefStructure getAdviceRef() {
        return adviceRef;
    }

    /**
     * Sets the value of the adviceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdviceRefStructure }
     *     
     */
    public void setAdviceRef(AdviceRefStructure value) {
        this.adviceRef = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the details property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getDetails() {
        if (details == null) {
            details = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.details;
    }

    public PtAdviceStructure withAdviceRef(AdviceRefStructure value) {
        setAdviceRef(value);
        return this;
    }

    public PtAdviceStructure withDetails(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getDetails().add(value);
            }
        }
        return this;
    }

    public PtAdviceStructure withDetails(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getDetails().addAll(values);
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