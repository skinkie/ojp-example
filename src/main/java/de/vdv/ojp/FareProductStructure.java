//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package de.vdv.ojp;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;


/**
 * [related to FARE PRODUCT in TM and NeTEx] different FARE PRODUCTs that may be available with related information
 * 
 * <p>Java class for FareProductStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareProductStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FareProductId" type="{http://www.vdv.de/ojp}FareProductCodeType"/&gt;
 *         &lt;element name="FareProductName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}FareAuthorityGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}FareProductPriceGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}FareProductValidityGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}FareProductBookingGroup"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareProductStructure", propOrder = {
    "fareProductId",
    "fareProductName",
    "fareAuthorityRef",
    "fareAuthorityText",
    "price",
    "netPrice",
    "currency",
    "vatRate",
    "travelClass",
    "requiredCard",
    "validFor",
    "validityDuration",
    "validityDurationText",
    "validityTariffZones",
    "validityAreaText",
    "infoUrl",
    "saleUrl",
    "bookingArrangements",
    "extension"
})
public class FareProductStructure {

    @XmlElement(name = "FareProductId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String fareProductId;
    @XmlElement(name = "FareProductName", required = true)
    protected String fareProductName;
    @XmlElement(name = "FareAuthorityRef", required = true)
    protected FareAuthorityRefStructure fareAuthorityRef;
    @XmlElement(name = "FareAuthorityText", required = true)
    protected String fareAuthorityText;
    @XmlElement(name = "Price")
    protected BigDecimal price;
    @XmlElement(name = "NetPrice")
    protected BigDecimal netPrice;
    @XmlElement(name = "Currency")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String currency;
    @XmlElement(name = "VatRate")
    @XmlSchemaType(name = "NMTOKEN")
    protected VatRateEnumeration vatRate;
    @XmlElement(name = "TravelClass")
    @XmlSchemaType(name = "NMTOKEN")
    protected TypeOfFareClassEnumeration travelClass;
    @XmlElement(name = "RequiredCard")
    protected List<EntitlementProductRefStructure> requiredCard;
    @XmlElement(name = "ValidFor")
    @XmlSchemaType(name = "string")
    protected List<PassengerCategoryEnumeration> validFor;
    @XmlElement(name = "ValidityDuration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration validityDuration;
    @XmlElement(name = "ValidityDurationText")
    protected InternationalTextStructure validityDurationText;
    @XmlElement(name = "ValidityTariffZones")
    protected List<TariffZoneListInAreaStructure> validityTariffZones;
    @XmlElement(name = "ValidityAreaText")
    protected InternationalTextStructure validityAreaText;
    @XmlElement(name = "InfoUrl")
    protected List<WebLinkStructure> infoUrl;
    @XmlElement(name = "SaleUrl")
    protected List<WebLinkStructure> saleUrl;
    @XmlElement(name = "BookingArrangements")
    protected List<BookingArrangementsContainerStructure> bookingArrangements;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Gets the value of the fareProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareProductId() {
        return fareProductId;
    }

    /**
     * Sets the value of the fareProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareProductId(String value) {
        this.fareProductId = value;
    }

    /**
     * Gets the value of the fareProductName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareProductName() {
        return fareProductName;
    }

    /**
     * Sets the value of the fareProductName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareProductName(String value) {
        this.fareProductName = value;
    }

    /**
     * Gets the value of the fareAuthorityRef property.
     * 
     * @return
     *     possible object is
     *     {@link FareAuthorityRefStructure }
     *     
     */
    public FareAuthorityRefStructure getFareAuthorityRef() {
        return fareAuthorityRef;
    }

    /**
     * Sets the value of the fareAuthorityRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareAuthorityRefStructure }
     *     
     */
    public void setFareAuthorityRef(FareAuthorityRefStructure value) {
        this.fareAuthorityRef = value;
    }

    /**
     * Gets the value of the fareAuthorityText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareAuthorityText() {
        return fareAuthorityText;
    }

    /**
     * Sets the value of the fareAuthorityText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareAuthorityText(String value) {
        this.fareAuthorityText = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the netPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetPrice() {
        return netPrice;
    }

    /**
     * Sets the value of the netPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetPrice(BigDecimal value) {
        this.netPrice = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the vatRate property.
     * 
     * @return
     *     possible object is
     *     {@link VatRateEnumeration }
     *     
     */
    public VatRateEnumeration getVatRate() {
        return vatRate;
    }

    /**
     * Sets the value of the vatRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link VatRateEnumeration }
     *     
     */
    public void setVatRate(VatRateEnumeration value) {
        this.vatRate = value;
    }

    /**
     * Gets the value of the travelClass property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfFareClassEnumeration }
     *     
     */
    public TypeOfFareClassEnumeration getTravelClass() {
        return travelClass;
    }

    /**
     * Sets the value of the travelClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfFareClassEnumeration }
     *     
     */
    public void setTravelClass(TypeOfFareClassEnumeration value) {
        this.travelClass = value;
    }

    /**
     * Gets the value of the requiredCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntitlementProductRefStructure }
     * 
     * 
     */
    public List<EntitlementProductRefStructure> getRequiredCard() {
        if (requiredCard == null) {
            requiredCard = new ArrayList<EntitlementProductRefStructure>();
        }
        return this.requiredCard;
    }

    /**
     * Gets the value of the validFor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validFor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidFor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerCategoryEnumeration }
     * 
     * 
     */
    public List<PassengerCategoryEnumeration> getValidFor() {
        if (validFor == null) {
            validFor = new ArrayList<PassengerCategoryEnumeration>();
        }
        return this.validFor;
    }

    /**
     * Gets the value of the validityDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getValidityDuration() {
        return validityDuration;
    }

    /**
     * Sets the value of the validityDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidityDuration(Duration value) {
        this.validityDuration = value;
    }

    /**
     * Gets the value of the validityDurationText property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getValidityDurationText() {
        return validityDurationText;
    }

    /**
     * Sets the value of the validityDurationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setValidityDurationText(InternationalTextStructure value) {
        this.validityDurationText = value;
    }

    /**
     * Gets the value of the validityTariffZones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validityTariffZones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidityTariffZones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffZoneListInAreaStructure }
     * 
     * 
     */
    public List<TariffZoneListInAreaStructure> getValidityTariffZones() {
        if (validityTariffZones == null) {
            validityTariffZones = new ArrayList<TariffZoneListInAreaStructure>();
        }
        return this.validityTariffZones;
    }

    /**
     * Gets the value of the validityAreaText property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getValidityAreaText() {
        return validityAreaText;
    }

    /**
     * Sets the value of the validityAreaText property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setValidityAreaText(InternationalTextStructure value) {
        this.validityAreaText = value;
    }

    /**
     * Gets the value of the infoUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infoUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebLinkStructure }
     * 
     * 
     */
    public List<WebLinkStructure> getInfoUrl() {
        if (infoUrl == null) {
            infoUrl = new ArrayList<WebLinkStructure>();
        }
        return this.infoUrl;
    }

    /**
     * Gets the value of the saleUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saleUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebLinkStructure }
     * 
     * 
     */
    public List<WebLinkStructure> getSaleUrl() {
        if (saleUrl == null) {
            saleUrl = new ArrayList<WebLinkStructure>();
        }
        return this.saleUrl;
    }

    /**
     * Gets the value of the bookingArrangements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingArrangements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingArrangements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingArrangementsContainerStructure }
     * 
     * 
     */
    public List<BookingArrangementsContainerStructure> getBookingArrangements() {
        if (bookingArrangements == null) {
            bookingArrangements = new ArrayList<BookingArrangementsContainerStructure>();
        }
        return this.bookingArrangements;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtension(Object value) {
        this.extension = value;
    }

    public FareProductStructure withFareProductId(String value) {
        setFareProductId(value);
        return this;
    }

    public FareProductStructure withFareProductName(String value) {
        setFareProductName(value);
        return this;
    }

    public FareProductStructure withFareAuthorityRef(FareAuthorityRefStructure value) {
        setFareAuthorityRef(value);
        return this;
    }

    public FareProductStructure withFareAuthorityText(String value) {
        setFareAuthorityText(value);
        return this;
    }

    public FareProductStructure withPrice(BigDecimal value) {
        setPrice(value);
        return this;
    }

    public FareProductStructure withNetPrice(BigDecimal value) {
        setNetPrice(value);
        return this;
    }

    public FareProductStructure withCurrency(String value) {
        setCurrency(value);
        return this;
    }

    public FareProductStructure withVatRate(VatRateEnumeration value) {
        setVatRate(value);
        return this;
    }

    public FareProductStructure withTravelClass(TypeOfFareClassEnumeration value) {
        setTravelClass(value);
        return this;
    }

    public FareProductStructure withRequiredCard(EntitlementProductRefStructure... values) {
        if (values!= null) {
            for (EntitlementProductRefStructure value: values) {
                getRequiredCard().add(value);
            }
        }
        return this;
    }

    public FareProductStructure withRequiredCard(Collection<EntitlementProductRefStructure> values) {
        if (values!= null) {
            getRequiredCard().addAll(values);
        }
        return this;
    }

    public FareProductStructure withValidFor(PassengerCategoryEnumeration... values) {
        if (values!= null) {
            for (PassengerCategoryEnumeration value: values) {
                getValidFor().add(value);
            }
        }
        return this;
    }

    public FareProductStructure withValidFor(Collection<PassengerCategoryEnumeration> values) {
        if (values!= null) {
            getValidFor().addAll(values);
        }
        return this;
    }

    public FareProductStructure withValidityDuration(Duration value) {
        setValidityDuration(value);
        return this;
    }

    public FareProductStructure withValidityDurationText(InternationalTextStructure value) {
        setValidityDurationText(value);
        return this;
    }

    public FareProductStructure withValidityTariffZones(TariffZoneListInAreaStructure... values) {
        if (values!= null) {
            for (TariffZoneListInAreaStructure value: values) {
                getValidityTariffZones().add(value);
            }
        }
        return this;
    }

    public FareProductStructure withValidityTariffZones(Collection<TariffZoneListInAreaStructure> values) {
        if (values!= null) {
            getValidityTariffZones().addAll(values);
        }
        return this;
    }

    public FareProductStructure withValidityAreaText(InternationalTextStructure value) {
        setValidityAreaText(value);
        return this;
    }

    public FareProductStructure withInfoUrl(WebLinkStructure... values) {
        if (values!= null) {
            for (WebLinkStructure value: values) {
                getInfoUrl().add(value);
            }
        }
        return this;
    }

    public FareProductStructure withInfoUrl(Collection<WebLinkStructure> values) {
        if (values!= null) {
            getInfoUrl().addAll(values);
        }
        return this;
    }

    public FareProductStructure withSaleUrl(WebLinkStructure... values) {
        if (values!= null) {
            for (WebLinkStructure value: values) {
                getSaleUrl().add(value);
            }
        }
        return this;
    }

    public FareProductStructure withSaleUrl(Collection<WebLinkStructure> values) {
        if (values!= null) {
            getSaleUrl().addAll(values);
        }
        return this;
    }

    public FareProductStructure withBookingArrangements(BookingArrangementsContainerStructure... values) {
        if (values!= null) {
            for (BookingArrangementsContainerStructure value: values) {
                getBookingArrangements().add(value);
            }
        }
        return this;
    }

    public FareProductStructure withBookingArrangements(Collection<BookingArrangementsContainerStructure> values) {
        if (values!= null) {
            getBookingArrangements().addAll(values);
        }
        return this;
    }

    public FareProductStructure withExtension(Object value) {
        setExtension(value);
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
