//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package de.vdv.ojp;

import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.vdv.ojp.model.StopPointRefStructure;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;


/**
 * [same as CALL in SIRI] the meeting of a VEHICLE JOURNEY with a specific SCHEDULED STOP POINT 
 * 
 * <p>Java class for CallAtStopStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallAtStopStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}StopPointGroup"/&gt;
 *         &lt;element name="ServiceArrival" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;group ref="{http://www.vdv.de/ojp}ServiceTimeGroup"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ServiceDeparture" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;group ref="{http://www.vdv.de/ojp}ServiceTimeGroup"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}StopCallStatusGroup"/&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}SituationFullRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallAtStopStructure", propOrder = {
    "stopPointRef",
    "stopPointName",
    "nameSuffix",
    "plannedQuay",
    "estimatedQuay",
    "serviceArrival",
    "serviceDeparture",
    "order",
    "requestStop",
    "unplannedStop",
    "notServicedStop",
    "situationFullRef"
})
public class CallAtStopStructure {

    @XmlElement(name = "StopPointRef", namespace = "http://www.siri.org.uk/siri", required = true)
    protected StopPointRefStructure stopPointRef;
    @XmlElement(name = "StopPointName", required = true)
    protected InternationalTextStructure stopPointName;
    @XmlElement(name = "NameSuffix")
    protected InternationalTextStructure nameSuffix;
    @XmlElement(name = "PlannedQuay")
    protected InternationalTextStructure plannedQuay;
    @XmlElement(name = "EstimatedQuay")
    protected InternationalTextStructure estimatedQuay;
    @XmlElement(name = "ServiceArrival")
    protected CallAtStopStructure.ServiceArrival serviceArrival;
    @XmlElement(name = "ServiceDeparture")
    protected CallAtStopStructure.ServiceDeparture serviceDeparture;
    @XmlElement(name = "Order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;
    @XmlElement(name = "RequestStop", defaultValue = "false")
    protected Boolean requestStop;
    @XmlElement(name = "UnplannedStop", defaultValue = "false")
    protected Boolean unplannedStop;
    @XmlElement(name = "NotServicedStop", defaultValue = "false")
    protected Boolean notServicedStop;
    @XmlElement(name = "SituationFullRef")
    protected List<SituationFullRefStructure> situationFullRef;

    /**
     * Gets the value of the stopPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getStopPointRef() {
        return stopPointRef;
    }

    /**
     * Sets the value of the stopPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setStopPointRef(StopPointRefStructure value) {
        this.stopPointRef = value;
    }

    /**
     * Gets the value of the stopPointName property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getStopPointName() {
        return stopPointName;
    }

    /**
     * Sets the value of the stopPointName property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setStopPointName(InternationalTextStructure value) {
        this.stopPointName = value;
    }

    /**
     * Gets the value of the nameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Sets the value of the nameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setNameSuffix(InternationalTextStructure value) {
        this.nameSuffix = value;
    }

    /**
     * Gets the value of the plannedQuay property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getPlannedQuay() {
        return plannedQuay;
    }

    /**
     * Sets the value of the plannedQuay property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setPlannedQuay(InternationalTextStructure value) {
        this.plannedQuay = value;
    }

    /**
     * Gets the value of the estimatedQuay property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getEstimatedQuay() {
        return estimatedQuay;
    }

    /**
     * Sets the value of the estimatedQuay property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setEstimatedQuay(InternationalTextStructure value) {
        this.estimatedQuay = value;
    }

    /**
     * Gets the value of the serviceArrival property.
     * 
     * @return
     *     possible object is
     *     {@link CallAtStopStructure.ServiceArrival }
     *     
     */
    public CallAtStopStructure.ServiceArrival getServiceArrival() {
        return serviceArrival;
    }

    /**
     * Sets the value of the serviceArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallAtStopStructure.ServiceArrival }
     *     
     */
    public void setServiceArrival(CallAtStopStructure.ServiceArrival value) {
        this.serviceArrival = value;
    }

    /**
     * Gets the value of the serviceDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link CallAtStopStructure.ServiceDeparture }
     *     
     */
    public CallAtStopStructure.ServiceDeparture getServiceDeparture() {
        return serviceDeparture;
    }

    /**
     * Sets the value of the serviceDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallAtStopStructure.ServiceDeparture }
     *     
     */
    public void setServiceDeparture(CallAtStopStructure.ServiceDeparture value) {
        this.serviceDeparture = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

    /**
     * Gets the value of the requestStop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestStop() {
        return requestStop;
    }

    /**
     * Sets the value of the requestStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestStop(Boolean value) {
        this.requestStop = value;
    }

    /**
     * Gets the value of the unplannedStop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnplannedStop() {
        return unplannedStop;
    }

    /**
     * Sets the value of the unplannedStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnplannedStop(Boolean value) {
        this.unplannedStop = value;
    }

    /**
     * Gets the value of the notServicedStop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotServicedStop() {
        return notServicedStop;
    }

    /**
     * Sets the value of the notServicedStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotServicedStop(Boolean value) {
        this.notServicedStop = value;
    }

    /**
     * Gets the value of the situationFullRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situationFullRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituationFullRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituationFullRefStructure }
     * 
     * 
     */
    public List<SituationFullRefStructure> getSituationFullRef() {
        if (situationFullRef == null) {
            situationFullRef = new ArrayList<SituationFullRefStructure>();
        }
        return this.situationFullRef;
    }

    public CallAtStopStructure withStopPointRef(StopPointRefStructure value) {
        setStopPointRef(value);
        return this;
    }

    public CallAtStopStructure withStopPointName(InternationalTextStructure value) {
        setStopPointName(value);
        return this;
    }

    public CallAtStopStructure withNameSuffix(InternationalTextStructure value) {
        setNameSuffix(value);
        return this;
    }

    public CallAtStopStructure withPlannedQuay(InternationalTextStructure value) {
        setPlannedQuay(value);
        return this;
    }

    public CallAtStopStructure withEstimatedQuay(InternationalTextStructure value) {
        setEstimatedQuay(value);
        return this;
    }

    public CallAtStopStructure withServiceArrival(CallAtStopStructure.ServiceArrival value) {
        setServiceArrival(value);
        return this;
    }

    public CallAtStopStructure withServiceDeparture(CallAtStopStructure.ServiceDeparture value) {
        setServiceDeparture(value);
        return this;
    }

    public CallAtStopStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    public CallAtStopStructure withRequestStop(Boolean value) {
        setRequestStop(value);
        return this;
    }

    public CallAtStopStructure withUnplannedStop(Boolean value) {
        setUnplannedStop(value);
        return this;
    }

    public CallAtStopStructure withNotServicedStop(Boolean value) {
        setNotServicedStop(value);
        return this;
    }

    public CallAtStopStructure withSituationFullRef(SituationFullRefStructure... values) {
        if (values!= null) {
            for (SituationFullRefStructure value: values) {
                getSituationFullRef().add(value);
            }
        }
        return this;
    }

    public CallAtStopStructure withSituationFullRef(Collection<SituationFullRefStructure> values) {
        if (values!= null) {
            getSituationFullRef().addAll(values);
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
     *         &lt;group ref="{http://www.vdv.de/ojp}ServiceTimeGroup"/&gt;
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
        "timetabledTime",
        "recordedAtTime",
        "estimatedTime",
        "estimatedTimeLow",
        "estimatedTimeHigh"
    })
    public static class ServiceArrival {

        @XmlElement(name = "TimetabledTime", required = true, type = String.class)
        @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
        @XmlSchemaType(name = "dateTime")
        protected ZonedDateTime timetabledTime;
        @XmlElement(name = "RecordedAtTime", type = String.class)
        @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
        @XmlSchemaType(name = "dateTime")
        protected ZonedDateTime recordedAtTime;
        @XmlElement(name = "EstimatedTime", type = String.class)
        @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
        @XmlSchemaType(name = "dateTime")
        protected ZonedDateTime estimatedTime;
        @XmlElement(name = "EstimatedTimeLow", type = String.class)
        @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
        @XmlSchemaType(name = "dateTime")
        protected ZonedDateTime estimatedTimeLow;
        @XmlElement(name = "EstimatedTimeHigh", type = String.class)
        @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
        @XmlSchemaType(name = "dateTime")
        protected ZonedDateTime estimatedTimeHigh;

        /**
         * Gets the value of the timetabledTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public ZonedDateTime getTimetabledTime() {
            return timetabledTime;
        }

        /**
         * Sets the value of the timetabledTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimetabledTime(ZonedDateTime value) {
            this.timetabledTime = value;
        }

        /**
         * Gets the value of the recordedAtTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public ZonedDateTime getRecordedAtTime() {
            return recordedAtTime;
        }

        /**
         * Sets the value of the recordedAtTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecordedAtTime(ZonedDateTime value) {
            this.recordedAtTime = value;
        }

        /**
         * Gets the value of the estimatedTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public ZonedDateTime getEstimatedTime() {
            return estimatedTime;
        }

        /**
         * Sets the value of the estimatedTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstimatedTime(ZonedDateTime value) {
            this.estimatedTime = value;
        }

        /**
         * Gets the value of the estimatedTimeLow property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public ZonedDateTime getEstimatedTimeLow() {
            return estimatedTimeLow;
        }

        /**
         * Sets the value of the estimatedTimeLow property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstimatedTimeLow(ZonedDateTime value) {
            this.estimatedTimeLow = value;
        }

        /**
         * Gets the value of the estimatedTimeHigh property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public ZonedDateTime getEstimatedTimeHigh() {
            return estimatedTimeHigh;
        }

        /**
         * Sets the value of the estimatedTimeHigh property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstimatedTimeHigh(ZonedDateTime value) {
            this.estimatedTimeHigh = value;
        }

        public CallAtStopStructure.ServiceArrival withTimetabledTime(ZonedDateTime value) {
            setTimetabledTime(value);
            return this;
        }

        public CallAtStopStructure.ServiceArrival withRecordedAtTime(ZonedDateTime value) {
            setRecordedAtTime(value);
            return this;
        }

        public CallAtStopStructure.ServiceArrival withEstimatedTime(ZonedDateTime value) {
            setEstimatedTime(value);
            return this;
        }

        public CallAtStopStructure.ServiceArrival withEstimatedTimeLow(ZonedDateTime value) {
            setEstimatedTimeLow(value);
            return this;
        }

        public CallAtStopStructure.ServiceArrival withEstimatedTimeHigh(ZonedDateTime value) {
            setEstimatedTimeHigh(value);
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
     *         &lt;group ref="{http://www.vdv.de/ojp}ServiceTimeGroup"/&gt;
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
        "timetabledTime",
        "recordedAtTime",
        "estimatedTime",
        "estimatedTimeLow",
        "estimatedTimeHigh"
    })
    public static class ServiceDeparture {

        @XmlElement(name = "TimetabledTime", required = true, type = String.class)
        @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
        @XmlSchemaType(name = "dateTime")
        protected ZonedDateTime timetabledTime;
        @XmlElement(name = "RecordedAtTime", type = String.class)
        @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
        @XmlSchemaType(name = "dateTime")
        protected ZonedDateTime recordedAtTime;
        @XmlElement(name = "EstimatedTime", type = String.class)
        @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
        @XmlSchemaType(name = "dateTime")
        protected ZonedDateTime estimatedTime;
        @XmlElement(name = "EstimatedTimeLow", type = String.class)
        @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
        @XmlSchemaType(name = "dateTime")
        protected ZonedDateTime estimatedTimeLow;
        @XmlElement(name = "EstimatedTimeHigh", type = String.class)
        @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
        @XmlSchemaType(name = "dateTime")
        protected ZonedDateTime estimatedTimeHigh;

        /**
         * Gets the value of the timetabledTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public ZonedDateTime getTimetabledTime() {
            return timetabledTime;
        }

        /**
         * Sets the value of the timetabledTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimetabledTime(ZonedDateTime value) {
            this.timetabledTime = value;
        }

        /**
         * Gets the value of the recordedAtTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public ZonedDateTime getRecordedAtTime() {
            return recordedAtTime;
        }

        /**
         * Sets the value of the recordedAtTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecordedAtTime(ZonedDateTime value) {
            this.recordedAtTime = value;
        }

        /**
         * Gets the value of the estimatedTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public ZonedDateTime getEstimatedTime() {
            return estimatedTime;
        }

        /**
         * Sets the value of the estimatedTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstimatedTime(ZonedDateTime value) {
            this.estimatedTime = value;
        }

        /**
         * Gets the value of the estimatedTimeLow property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public ZonedDateTime getEstimatedTimeLow() {
            return estimatedTimeLow;
        }

        /**
         * Sets the value of the estimatedTimeLow property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstimatedTimeLow(ZonedDateTime value) {
            this.estimatedTimeLow = value;
        }

        /**
         * Gets the value of the estimatedTimeHigh property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public ZonedDateTime getEstimatedTimeHigh() {
            return estimatedTimeHigh;
        }

        /**
         * Sets the value of the estimatedTimeHigh property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstimatedTimeHigh(ZonedDateTime value) {
            this.estimatedTimeHigh = value;
        }

        public CallAtStopStructure.ServiceDeparture withTimetabledTime(ZonedDateTime value) {
            setTimetabledTime(value);
            return this;
        }

        public CallAtStopStructure.ServiceDeparture withRecordedAtTime(ZonedDateTime value) {
            setRecordedAtTime(value);
            return this;
        }

        public CallAtStopStructure.ServiceDeparture withEstimatedTime(ZonedDateTime value) {
            setEstimatedTime(value);
            return this;
        }

        public CallAtStopStructure.ServiceDeparture withEstimatedTimeLow(ZonedDateTime value) {
            setEstimatedTimeLow(value);
            return this;
        }

        public CallAtStopStructure.ServiceDeparture withEstimatedTimeHigh(ZonedDateTime value) {
            setEstimatedTimeHigh(value);
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