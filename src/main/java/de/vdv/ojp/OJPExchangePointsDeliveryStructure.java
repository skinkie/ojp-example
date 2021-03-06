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
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for OJPExchangePointsDeliveryStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OJPExchangePointsDeliveryStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceDeliveryStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}OJPExchangePointsRequest" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}ServiceResponseContextGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}ExchangePointsResponseGroup"/&gt;
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
@XmlType(name = "OJPExchangePointsDeliveryStructure", propOrder = {
    "ojpExchangePointsRequest",
    "dataFrameRef",
    "calcTime",
    "continueAt",
    "place",
    "extensions"
})
public class OJPExchangePointsDeliveryStructure
    extends AbstractServiceDeliveryStructure
{

    @XmlElement(name = "OJPExchangePointsRequest")
    protected OJPExchangePointsRequestStructure ojpExchangePointsRequest;
    @XmlElement(name = "DataFrameRef")
    protected DataFrameRefStructure dataFrameRef;
    @XmlElement(name = "CalcTime")
    protected BigInteger calcTime;
    @XmlElement(name = "ContinueAt")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger continueAt;
    @XmlElement(name = "Place")
    protected List<ExchangePointsResultStructure> place;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the ojpExchangePointsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link OJPExchangePointsRequestStructure }
     *     
     */
    public OJPExchangePointsRequestStructure getOJPExchangePointsRequest() {
        return ojpExchangePointsRequest;
    }

    /**
     * Sets the value of the ojpExchangePointsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link OJPExchangePointsRequestStructure }
     *     
     */
    public void setOJPExchangePointsRequest(OJPExchangePointsRequestStructure value) {
        this.ojpExchangePointsRequest = value;
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
     * Gets the value of the continueAt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContinueAt() {
        return continueAt;
    }

    /**
     * Sets the value of the continueAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContinueAt(BigInteger value) {
        this.continueAt = value;
    }

    /**
     * Gets the value of the place property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the place property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangePointsResultStructure }
     * 
     * 
     */
    public List<ExchangePointsResultStructure> getPlace() {
        if (place == null) {
            place = new ArrayList<ExchangePointsResultStructure>();
        }
        return this.place;
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

    public OJPExchangePointsDeliveryStructure withOJPExchangePointsRequest(OJPExchangePointsRequestStructure value) {
        setOJPExchangePointsRequest(value);
        return this;
    }

    public OJPExchangePointsDeliveryStructure withDataFrameRef(DataFrameRefStructure value) {
        setDataFrameRef(value);
        return this;
    }

    public OJPExchangePointsDeliveryStructure withCalcTime(BigInteger value) {
        setCalcTime(value);
        return this;
    }

    public OJPExchangePointsDeliveryStructure withContinueAt(BigInteger value) {
        setContinueAt(value);
        return this;
    }

    public OJPExchangePointsDeliveryStructure withPlace(ExchangePointsResultStructure... values) {
        if (values!= null) {
            for (ExchangePointsResultStructure value: values) {
                getPlace().add(value);
            }
        }
        return this;
    }

    public OJPExchangePointsDeliveryStructure withPlace(Collection<ExchangePointsResultStructure> values) {
        if (values!= null) {
            getPlace().addAll(values);
        }
        return this;
    }

    public OJPExchangePointsDeliveryStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public OJPExchangePointsDeliveryStructure withRequestMessageRef(MessageQualifierStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    @Override
    public OJPExchangePointsDeliveryStructure withSubscriberRef(ParticipantRefStructure value) {
        setSubscriberRef(value);
        return this;
    }

    @Override
    public OJPExchangePointsDeliveryStructure withSubscriptionFilterRef(SubscriptionFilterRefStructure value) {
        setSubscriptionFilterRef(value);
        return this;
    }

    @Override
    public OJPExchangePointsDeliveryStructure withSubscriptionRef(SubscriptionQualifierStructure value) {
        setSubscriptionRef(value);
        return this;
    }

    @Override
    public OJPExchangePointsDeliveryStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public OJPExchangePointsDeliveryStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public OJPExchangePointsDeliveryStructure withStatus(Boolean value) {
        setStatus(value);
        return this;
    }

    @Override
    public OJPExchangePointsDeliveryStructure withErrorCondition(ServiceDeliveryErrorConditionStructure value) {
        setErrorCondition(value);
        return this;
    }

    @Override
    public OJPExchangePointsDeliveryStructure withValidUntil(ZonedDateTime value) {
        setValidUntil(value);
        return this;
    }

    @Override
    public OJPExchangePointsDeliveryStructure withShortestPossibleCycle(Duration value) {
        setShortestPossibleCycle(value);
        return this;
    }

    @Override
    public OJPExchangePointsDeliveryStructure withDefaultLanguage(String value) {
        setDefaultLanguage(value);
        return this;
    }

    @Override
    public OJPExchangePointsDeliveryStructure withResponseTimestamp(ZonedDateTime value) {
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
