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
 * <p>Java class for OJPTripInfoDeliveryStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OJPTripInfoDeliveryStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceDeliveryStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}OJPTripInfoRequest" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}ServiceResponseContextGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TripInfoResponseGroup"/&gt;
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
@XmlType(name = "OJPTripInfoDeliveryStructure", propOrder = {
    "ojpTripInfoRequest",
    "dataFrameRef",
    "calcTime",
    "tripInfoResponseContext",
    "tripInfoResult",
    "extensions"
})
public class OJPTripInfoDeliveryStructure
    extends AbstractServiceDeliveryStructure
{

    @XmlElement(name = "OJPTripInfoRequest")
    protected OJPTripInfoRequestStructure ojpTripInfoRequest;
    @XmlElement(name = "DataFrameRef")
    protected DataFrameRefStructure dataFrameRef;
    @XmlElement(name = "CalcTime")
    protected BigInteger calcTime;
    @XmlElement(name = "TripInfoResponseContext")
    protected TripInfoResponseContextStructure tripInfoResponseContext;
    @XmlElement(name = "TripInfoResult")
    protected TripInfoResultStructure tripInfoResult;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the ojpTripInfoRequest property.
     * 
     * @return
     *     possible object is
     *     {@link OJPTripInfoRequestStructure }
     *     
     */
    public OJPTripInfoRequestStructure getOJPTripInfoRequest() {
        return ojpTripInfoRequest;
    }

    /**
     * Sets the value of the ojpTripInfoRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link OJPTripInfoRequestStructure }
     *     
     */
    public void setOJPTripInfoRequest(OJPTripInfoRequestStructure value) {
        this.ojpTripInfoRequest = value;
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
     * Gets the value of the tripInfoResponseContext property.
     * 
     * @return
     *     possible object is
     *     {@link TripInfoResponseContextStructure }
     *     
     */
    public TripInfoResponseContextStructure getTripInfoResponseContext() {
        return tripInfoResponseContext;
    }

    /**
     * Sets the value of the tripInfoResponseContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripInfoResponseContextStructure }
     *     
     */
    public void setTripInfoResponseContext(TripInfoResponseContextStructure value) {
        this.tripInfoResponseContext = value;
    }

    /**
     * Gets the value of the tripInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link TripInfoResultStructure }
     *     
     */
    public TripInfoResultStructure getTripInfoResult() {
        return tripInfoResult;
    }

    /**
     * Sets the value of the tripInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripInfoResultStructure }
     *     
     */
    public void setTripInfoResult(TripInfoResultStructure value) {
        this.tripInfoResult = value;
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

    public OJPTripInfoDeliveryStructure withOJPTripInfoRequest(OJPTripInfoRequestStructure value) {
        setOJPTripInfoRequest(value);
        return this;
    }

    public OJPTripInfoDeliveryStructure withDataFrameRef(DataFrameRefStructure value) {
        setDataFrameRef(value);
        return this;
    }

    public OJPTripInfoDeliveryStructure withCalcTime(BigInteger value) {
        setCalcTime(value);
        return this;
    }

    public OJPTripInfoDeliveryStructure withTripInfoResponseContext(TripInfoResponseContextStructure value) {
        setTripInfoResponseContext(value);
        return this;
    }

    public OJPTripInfoDeliveryStructure withTripInfoResult(TripInfoResultStructure value) {
        setTripInfoResult(value);
        return this;
    }

    public OJPTripInfoDeliveryStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public OJPTripInfoDeliveryStructure withRequestMessageRef(MessageQualifierStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    @Override
    public OJPTripInfoDeliveryStructure withSubscriberRef(ParticipantRefStructure value) {
        setSubscriberRef(value);
        return this;
    }

    @Override
    public OJPTripInfoDeliveryStructure withSubscriptionFilterRef(SubscriptionFilterRefStructure value) {
        setSubscriptionFilterRef(value);
        return this;
    }

    @Override
    public OJPTripInfoDeliveryStructure withSubscriptionRef(SubscriptionQualifierStructure value) {
        setSubscriptionRef(value);
        return this;
    }

    @Override
    public OJPTripInfoDeliveryStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public OJPTripInfoDeliveryStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public OJPTripInfoDeliveryStructure withStatus(Boolean value) {
        setStatus(value);
        return this;
    }

    @Override
    public OJPTripInfoDeliveryStructure withErrorCondition(ServiceDeliveryErrorConditionStructure value) {
        setErrorCondition(value);
        return this;
    }

    @Override
    public OJPTripInfoDeliveryStructure withValidUntil(ZonedDateTime value) {
        setValidUntil(value);
        return this;
    }

    @Override
    public OJPTripInfoDeliveryStructure withShortestPossibleCycle(Duration value) {
        setShortestPossibleCycle(value);
        return this;
    }

    @Override
    public OJPTripInfoDeliveryStructure withDefaultLanguage(String value) {
        setDefaultLanguage(value);
        return this;
    }

    @Override
    public OJPTripInfoDeliveryStructure withResponseTimestamp(ZonedDateTime value) {
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