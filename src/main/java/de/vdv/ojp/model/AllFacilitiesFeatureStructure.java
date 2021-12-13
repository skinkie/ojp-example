//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package de.vdv.ojp.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for AllFacilitiesFeatureStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllFacilitiesFeatureStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}AccessFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}AccommodationFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}AssistanceFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}FareClassFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}HireFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}LuggageFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}MobilityFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}NuisanceFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}ParkingFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}PassengerCommsFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}PassengerInformationFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}RefreshmentFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}ReservedSpaceFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}RetailFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}SanitaryFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}TicketingFacility"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllFacilitiesFeatureStructure", propOrder = {
    "accessFacility",
    "accommodationFacility",
    "assistanceFacility",
    "fareClassFacility",
    "hireFacility",
    "luggageFacility",
    "mobilityFacility",
    "nuisanceFacility",
    "parkingFacility",
    "passengerCommsFacility",
    "passengerInformationFacility",
    "refreshmentFacility",
    "reservedSpaceFacility",
    "retailFacility",
    "sanitaryFacility",
    "ticketingFacility"
})
public class AllFacilitiesFeatureStructure {

    @XmlElement(name = "AccessFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected AccessFacilityEnumeration accessFacility;
    @XmlElement(name = "AccommodationFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected AccommodationFacilityEnumeration accommodationFacility;
    @XmlElement(name = "AssistanceFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected AssistanceFacilityEnumeration assistanceFacility;
    @XmlElement(name = "FareClassFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected FareClassFacilityEnumeration fareClassFacility;
    @XmlElement(name = "HireFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected HireFacilityEnumeration hireFacility;
    @XmlElement(name = "LuggageFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected LuggageFacilityEnumeration luggageFacility;
    @XmlElement(name = "MobilityFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected MobilityFacilityEnumeration mobilityFacility;
    @XmlElement(name = "NuisanceFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected NuisanceFacilityEnumeration nuisanceFacility;
    @XmlElement(name = "ParkingFacility")
    @XmlSchemaType(name = "NMTOKEN")
    protected ParkingFacilityEnumeration parkingFacility;
    @XmlElement(name = "PassengerCommsFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected PassengerCommsFacilityEnumeration passengerCommsFacility;
    @XmlElement(name = "PassengerInformationFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected PassengerInformationFacilityEnumeration passengerInformationFacility;
    @XmlElement(name = "RefreshmentFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected RefreshmentFacilityEnumeration refreshmentFacility;
    @XmlElement(name = "ReservedSpaceFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected ReservedSpaceFacilityEnumeration reservedSpaceFacility;
    @XmlElement(name = "RetailFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected RetailFacilityEnumeration retailFacility;
    @XmlElement(name = "SanitaryFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected SanitaryFacilityEnumeration sanitaryFacility;
    @XmlElement(name = "TicketingFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected TicketingFacilityEnumeration ticketingFacility;

    /**
     * Gets the value of the accessFacility property.
     * 
     * @return
     *     possible object is
     *     {@link AccessFacilityEnumeration }
     *     
     */
    public AccessFacilityEnumeration getAccessFacility() {
        return accessFacility;
    }

    /**
     * Sets the value of the accessFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessFacilityEnumeration }
     *     
     */
    public void setAccessFacility(AccessFacilityEnumeration value) {
        this.accessFacility = value;
    }

    /**
     * Gets the value of the accommodationFacility property.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationFacilityEnumeration }
     *     
     */
    public AccommodationFacilityEnumeration getAccommodationFacility() {
        return accommodationFacility;
    }

    /**
     * Sets the value of the accommodationFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationFacilityEnumeration }
     *     
     */
    public void setAccommodationFacility(AccommodationFacilityEnumeration value) {
        this.accommodationFacility = value;
    }

    /**
     * Gets the value of the assistanceFacility property.
     * 
     * @return
     *     possible object is
     *     {@link AssistanceFacilityEnumeration }
     *     
     */
    public AssistanceFacilityEnumeration getAssistanceFacility() {
        return assistanceFacility;
    }

    /**
     * Sets the value of the assistanceFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssistanceFacilityEnumeration }
     *     
     */
    public void setAssistanceFacility(AssistanceFacilityEnumeration value) {
        this.assistanceFacility = value;
    }

    /**
     * Gets the value of the fareClassFacility property.
     * 
     * @return
     *     possible object is
     *     {@link FareClassFacilityEnumeration }
     *     
     */
    public FareClassFacilityEnumeration getFareClassFacility() {
        return fareClassFacility;
    }

    /**
     * Sets the value of the fareClassFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareClassFacilityEnumeration }
     *     
     */
    public void setFareClassFacility(FareClassFacilityEnumeration value) {
        this.fareClassFacility = value;
    }

    /**
     * Gets the value of the hireFacility property.
     * 
     * @return
     *     possible object is
     *     {@link HireFacilityEnumeration }
     *     
     */
    public HireFacilityEnumeration getHireFacility() {
        return hireFacility;
    }

    /**
     * Sets the value of the hireFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link HireFacilityEnumeration }
     *     
     */
    public void setHireFacility(HireFacilityEnumeration value) {
        this.hireFacility = value;
    }

    /**
     * Gets the value of the luggageFacility property.
     * 
     * @return
     *     possible object is
     *     {@link LuggageFacilityEnumeration }
     *     
     */
    public LuggageFacilityEnumeration getLuggageFacility() {
        return luggageFacility;
    }

    /**
     * Sets the value of the luggageFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link LuggageFacilityEnumeration }
     *     
     */
    public void setLuggageFacility(LuggageFacilityEnumeration value) {
        this.luggageFacility = value;
    }

    /**
     * Gets the value of the mobilityFacility property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityFacilityEnumeration }
     *     
     */
    public MobilityFacilityEnumeration getMobilityFacility() {
        return mobilityFacility;
    }

    /**
     * Sets the value of the mobilityFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityFacilityEnumeration }
     *     
     */
    public void setMobilityFacility(MobilityFacilityEnumeration value) {
        this.mobilityFacility = value;
    }

    /**
     * Gets the value of the nuisanceFacility property.
     * 
     * @return
     *     possible object is
     *     {@link NuisanceFacilityEnumeration }
     *     
     */
    public NuisanceFacilityEnumeration getNuisanceFacility() {
        return nuisanceFacility;
    }

    /**
     * Sets the value of the nuisanceFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link NuisanceFacilityEnumeration }
     *     
     */
    public void setNuisanceFacility(NuisanceFacilityEnumeration value) {
        this.nuisanceFacility = value;
    }

    /**
     * Gets the value of the parkingFacility property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingFacilityEnumeration }
     *     
     */
    public ParkingFacilityEnumeration getParkingFacility() {
        return parkingFacility;
    }

    /**
     * Sets the value of the parkingFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingFacilityEnumeration }
     *     
     */
    public void setParkingFacility(ParkingFacilityEnumeration value) {
        this.parkingFacility = value;
    }

    /**
     * Gets the value of the passengerCommsFacility property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerCommsFacilityEnumeration }
     *     
     */
    public PassengerCommsFacilityEnumeration getPassengerCommsFacility() {
        return passengerCommsFacility;
    }

    /**
     * Sets the value of the passengerCommsFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerCommsFacilityEnumeration }
     *     
     */
    public void setPassengerCommsFacility(PassengerCommsFacilityEnumeration value) {
        this.passengerCommsFacility = value;
    }

    /**
     * Gets the value of the passengerInformationFacility property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerInformationFacilityEnumeration }
     *     
     */
    public PassengerInformationFacilityEnumeration getPassengerInformationFacility() {
        return passengerInformationFacility;
    }

    /**
     * Sets the value of the passengerInformationFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerInformationFacilityEnumeration }
     *     
     */
    public void setPassengerInformationFacility(PassengerInformationFacilityEnumeration value) {
        this.passengerInformationFacility = value;
    }

    /**
     * Gets the value of the refreshmentFacility property.
     * 
     * @return
     *     possible object is
     *     {@link RefreshmentFacilityEnumeration }
     *     
     */
    public RefreshmentFacilityEnumeration getRefreshmentFacility() {
        return refreshmentFacility;
    }

    /**
     * Sets the value of the refreshmentFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefreshmentFacilityEnumeration }
     *     
     */
    public void setRefreshmentFacility(RefreshmentFacilityEnumeration value) {
        this.refreshmentFacility = value;
    }

    /**
     * Gets the value of the reservedSpaceFacility property.
     * 
     * @return
     *     possible object is
     *     {@link ReservedSpaceFacilityEnumeration }
     *     
     */
    public ReservedSpaceFacilityEnumeration getReservedSpaceFacility() {
        return reservedSpaceFacility;
    }

    /**
     * Sets the value of the reservedSpaceFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservedSpaceFacilityEnumeration }
     *     
     */
    public void setReservedSpaceFacility(ReservedSpaceFacilityEnumeration value) {
        this.reservedSpaceFacility = value;
    }

    /**
     * Gets the value of the retailFacility property.
     * 
     * @return
     *     possible object is
     *     {@link RetailFacilityEnumeration }
     *     
     */
    public RetailFacilityEnumeration getRetailFacility() {
        return retailFacility;
    }

    /**
     * Sets the value of the retailFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailFacilityEnumeration }
     *     
     */
    public void setRetailFacility(RetailFacilityEnumeration value) {
        this.retailFacility = value;
    }

    /**
     * Gets the value of the sanitaryFacility property.
     * 
     * @return
     *     possible object is
     *     {@link SanitaryFacilityEnumeration }
     *     
     */
    public SanitaryFacilityEnumeration getSanitaryFacility() {
        return sanitaryFacility;
    }

    /**
     * Sets the value of the sanitaryFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link SanitaryFacilityEnumeration }
     *     
     */
    public void setSanitaryFacility(SanitaryFacilityEnumeration value) {
        this.sanitaryFacility = value;
    }

    /**
     * Gets the value of the ticketingFacility property.
     * 
     * @return
     *     possible object is
     *     {@link TicketingFacilityEnumeration }
     *     
     */
    public TicketingFacilityEnumeration getTicketingFacility() {
        return ticketingFacility;
    }

    /**
     * Sets the value of the ticketingFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingFacilityEnumeration }
     *     
     */
    public void setTicketingFacility(TicketingFacilityEnumeration value) {
        this.ticketingFacility = value;
    }

    public AllFacilitiesFeatureStructure withAccessFacility(AccessFacilityEnumeration value) {
        setAccessFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withAccommodationFacility(AccommodationFacilityEnumeration value) {
        setAccommodationFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withAssistanceFacility(AssistanceFacilityEnumeration value) {
        setAssistanceFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withFareClassFacility(FareClassFacilityEnumeration value) {
        setFareClassFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withHireFacility(HireFacilityEnumeration value) {
        setHireFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withLuggageFacility(LuggageFacilityEnumeration value) {
        setLuggageFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withMobilityFacility(MobilityFacilityEnumeration value) {
        setMobilityFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withNuisanceFacility(NuisanceFacilityEnumeration value) {
        setNuisanceFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withParkingFacility(ParkingFacilityEnumeration value) {
        setParkingFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withPassengerCommsFacility(PassengerCommsFacilityEnumeration value) {
        setPassengerCommsFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withPassengerInformationFacility(PassengerInformationFacilityEnumeration value) {
        setPassengerInformationFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withRefreshmentFacility(RefreshmentFacilityEnumeration value) {
        setRefreshmentFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withReservedSpaceFacility(ReservedSpaceFacilityEnumeration value) {
        setReservedSpaceFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withRetailFacility(RetailFacilityEnumeration value) {
        setRetailFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withSanitaryFacility(SanitaryFacilityEnumeration value) {
        setSanitaryFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withTicketingFacility(TicketingFacilityEnumeration value) {
        setTicketingFacility(value);
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