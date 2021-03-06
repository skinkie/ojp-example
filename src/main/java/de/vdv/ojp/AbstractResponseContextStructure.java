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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Abstract structure providing response contexts related to journeys.
 * 
 * <p>Java class for AbstractResponseContextStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractResponseContextStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Places" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Location" type="{http://www.vdv.de/ojp}PlaceStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Situations" type="{http://www.vdv.de/ojp}SituationsStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractResponseContextStructure", propOrder = {
    "places",
    "situations"
})
@XmlSeeAlso({
    TripResponseContextStructure.class,
    StopEventResponseContextStructure.class,
    TripInfoResponseContextStructure.class
})
public class AbstractResponseContextStructure {

    @XmlElement(name = "Places")
    protected AbstractResponseContextStructure.Places places;
    @XmlElement(name = "Situations")
    protected SituationsStructure situations;

    /**
     * Gets the value of the places property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractResponseContextStructure.Places }
     *     
     */
    public AbstractResponseContextStructure.Places getPlaces() {
        return places;
    }

    /**
     * Sets the value of the places property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractResponseContextStructure.Places }
     *     
     */
    public void setPlaces(AbstractResponseContextStructure.Places value) {
        this.places = value;
    }

    /**
     * Gets the value of the situations property.
     * 
     * @return
     *     possible object is
     *     {@link SituationsStructure }
     *     
     */
    public SituationsStructure getSituations() {
        return situations;
    }

    /**
     * Sets the value of the situations property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationsStructure }
     *     
     */
    public void setSituations(SituationsStructure value) {
        this.situations = value;
    }

    public AbstractResponseContextStructure withPlaces(AbstractResponseContextStructure.Places value) {
        setPlaces(value);
        return this;
    }

    public AbstractResponseContextStructure withSituations(SituationsStructure value) {
        setSituations(value);
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
     *         &lt;element name="Location" type="{http://www.vdv.de/ojp}PlaceStructure" maxOccurs="unbounded"/&gt;
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
        "location"
    })
    public static class Places {

        @XmlElement(name = "Location", required = true)
        protected List<PlaceStructure> location;

        /**
         * Gets the value of the location property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the location property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PlaceStructure }
         * 
         * 
         */
        public List<PlaceStructure> getLocation() {
            if (location == null) {
                location = new ArrayList<PlaceStructure>();
            }
            return this.location;
        }

        public AbstractResponseContextStructure.Places withLocation(PlaceStructure... values) {
            if (values!= null) {
                for (PlaceStructure value: values) {
                    getLocation().add(value);
                }
            }
            return this;
        }

        public AbstractResponseContextStructure.Places withLocation(Collection<PlaceStructure> values) {
            if (values!= null) {
                getLocation().addAll(values);
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
