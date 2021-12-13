//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package de.vdv.ojp;

import java.math.BigInteger;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import de.vdv.ojp.model.AbstractServiceDeliveryStructure;
import de.vdv.ojp.model.DataFrameRefStructure;
import de.vdv.ojp.model.ExtensionsStructure;
import de.vdv.ojp.model.MessageQualifierStructure;
import de.vdv.ojp.model.ParticipantRefStructure;
import de.vdv.ojp.model.ServiceDeliveryErrorConditionStructure;
import de.vdv.ojp.model.SubscriptionFilterRefStructure;
import de.vdv.ojp.model.SubscriptionQualifierStructure;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for OJPTripDeliveryStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OJPTripDeliveryStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceDeliveryStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}OJPTripRequest" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}ServiceResponseContextGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TripResponseGroup"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OJPTripDeliveryStructure", propOrder = {
    "ojpTripRequest",
    "dataFrameRef",
    "calcTime",
    "tripResponseContext",
    "tripResult",
    "extensions"
})
public class OJPTripDeliveryStructure
    extends AbstractServiceDeliveryStructure
{

    @XmlElement(name = "OJPTripRequest")
    protected OJPTripRequestStructure ojpTripRequest;
    @XmlElement(name = "DataFrameRef")
    protected DataFrameRefStructure dataFrameRef;
    @XmlElement(name = "CalcTime")
    protected BigInteger calcTime;
    @XmlElement(name = "TripResponseContext")
    protected TripResponseContextStructure tripResponseContext;
    @XmlElement(name = "TripResult")
    protected List<TripResultStructure> tripResult;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the ojpTripRequest property.
     * 
     * @return
     *     possible object is
     *     {@link OJPTripRequestStructure }
     *     
     */
    public OJPTripRequestStructure getOJPTripRequest() {
        return ojpTripRequest;
    }

    /**
     * Sets the value of the ojpTripRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link OJPTripRequestStructure }
     *     
     */
    public void setOJPTripRequest(OJPTripRequestStructure value) {
        this.ojpTripRequest = value;
    }

    /**
     * Gets the value of the dataFrameRef property.
     * 
     * @return
     *     possible object is
     *     {@link DataFrameRefStructure }
     *     
     */
    public DataFrameRefStructure getDataFrameRef() {
        return dataFrameRef;
    }

    /**
     * Sets the value of the dataFrameRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataFrameRefStructure }
     *     
     */
    public void setDataFrameRef(DataFrameRefStructure value) {
        this.dataFrameRef = value;
    }

    /**
     * Gets the value of the calcTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCalcTime() {
        return calcTime;
    }

    /**
     * Sets the value of the calcTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCalcTime(BigInteger value) {
        this.calcTime = value;
    }

    /**
     * Gets the value of the tripResponseContext property.
     * 
     * @return
     *     possible object is
     *     {@link TripResponseContextStructure }
     *     
     */
    public TripResponseContextStructure getTripResponseContext() {
        return tripResponseContext;
    }

    /**
     * Sets the value of the tripResponseContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripResponseContextStructure }
     *     
     */
    public void setTripResponseContext(TripResponseContextStructure value) {
        this.tripResponseContext = value;
    }

    /**
     * Gets the value of the tripResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tripResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTripResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TripResultStructure }
     * 
     * 
     */
    public List<TripResultStructure> getTripResult() {
        if (tripResult == null) {
            tripResult = new ArrayList<TripResultStructure>();
        }
        return this.tripResult;
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

    public OJPTripDeliveryStructure withOJPTripRequest(OJPTripRequestStructure value) {
        setOJPTripRequest(value);
        return this;
    }

    public OJPTripDeliveryStructure withDataFrameRef(DataFrameRefStructure value) {
        setDataFrameRef(value);
        return this;
    }

    public OJPTripDeliveryStructure withCalcTime(BigInteger value) {
        setCalcTime(value);
        return this;
    }

    public OJPTripDeliveryStructure withTripResponseContext(TripResponseContextStructure value) {
        setTripResponseContext(value);
        return this;
    }

    public OJPTripDeliveryStructure withTripResult(TripResultStructure... values) {
        if (values!= null) {
            for (TripResultStructure value: values) {
                getTripResult().add(value);
            }
        }
        return this;
    }

    public OJPTripDeliveryStructure withTripResult(Collection<TripResultStructure> values) {
        if (values!= null) {
            getTripResult().addAll(values);
        }
        return this;
    }

    public OJPTripDeliveryStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public OJPTripDeliveryStructure withRequestMessageRef(MessageQualifierStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    @Override
    public OJPTripDeliveryStructure withSubscriberRef(ParticipantRefStructure value) {
        setSubscriberRef(value);
        return this;
    }

    @Override
    public OJPTripDeliveryStructure withSubscriptionFilterRef(SubscriptionFilterRefStructure value) {
        setSubscriptionFilterRef(value);
        return this;
    }

    @Override
    public OJPTripDeliveryStructure withSubscriptionRef(SubscriptionQualifierStructure value) {
        setSubscriptionRef(value);
        return this;
    }

    @Override
    public OJPTripDeliveryStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public OJPTripDeliveryStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public OJPTripDeliveryStructure withStatus(Boolean value) {
        setStatus(value);
        return this;
    }

    @Override
    public OJPTripDeliveryStructure withErrorCondition(ServiceDeliveryErrorConditionStructure value) {
        setErrorCondition(value);
        return this;
    }

    @Override
    public OJPTripDeliveryStructure withValidUntil(ZonedDateTime value) {
        setValidUntil(value);
        return this;
    }

    @Override
    public OJPTripDeliveryStructure withShortestPossibleCycle(Duration value) {
        setShortestPossibleCycle(value);
        return this;
    }

    @Override
    public OJPTripDeliveryStructure withDefaultLanguage(String value) {
        setDefaultLanguage(value);
        return this;
    }

    @Override
    public OJPTripDeliveryStructure withResponseTimestamp(ZonedDateTime value) {
        setResponseTimestamp(value);
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
