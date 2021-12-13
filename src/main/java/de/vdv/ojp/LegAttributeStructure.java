//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package de.vdv.ojp;

import java.math.BigInteger;
import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import de.vdv.ojp.model.AccessFacilityEnumeration;
import de.vdv.ojp.model.AccommodationFacilityEnumeration;
import de.vdv.ojp.model.AssistanceFacilityEnumeration;
import de.vdv.ojp.model.FareClassFacilityEnumeration;
import de.vdv.ojp.model.HireFacilityEnumeration;
import de.vdv.ojp.model.LuggageFacilityEnumeration;
import de.vdv.ojp.model.MobilityFacilityEnumeration;
import de.vdv.ojp.model.NuisanceFacilityEnumeration;
import de.vdv.ojp.model.PassengerCommsFacilityEnumeration;
import de.vdv.ojp.model.PassengerInformationFacilityEnumeration;
import de.vdv.ojp.model.RefreshmentFacilityEnumeration;
import de.vdv.ojp.model.SanitaryFacilityEnumeration;
import de.vdv.ojp.model.TicketingFacilityEnumeration;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Attributes that are not valid on the whole service, but only on section of a TRIP made on a single MODE without interchange between boarding and alighting (facilities available on a specified (part of a) Leg of a VEHICLE JOURNEY)
 * 
 * <p>Java class for LegAttributeStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegAttributeStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.vdv.de/ojp}GeneralAttributeStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FromStopSeqNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="ToStopSeqNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegAttributeStructure", propOrder = {
    "fromStopSeqNumber",
    "toStopSeqNumber"
})
public class LegAttributeStructure
    extends GeneralAttributeStructure
{

    @XmlElement(name = "FromStopSeqNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger fromStopSeqNumber;
    @XmlElement(name = "ToStopSeqNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger toStopSeqNumber;

    /**
     * Gets the value of the fromStopSeqNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFromStopSeqNumber() {
        return fromStopSeqNumber;
    }

    /**
     * Sets the value of the fromStopSeqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFromStopSeqNumber(BigInteger value) {
        this.fromStopSeqNumber = value;
    }

    /**
     * Gets the value of the toStopSeqNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getToStopSeqNumber() {
        return toStopSeqNumber;
    }

    /**
     * Sets the value of the toStopSeqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setToStopSeqNumber(BigInteger value) {
        this.toStopSeqNumber = value;
    }

    public LegAttributeStructure withFromStopSeqNumber(BigInteger value) {
        setFromStopSeqNumber(value);
        return this;
    }

    public LegAttributeStructure withToStopSeqNumber(BigInteger value) {
        setToStopSeqNumber(value);
        return this;
    }

    @Override
    public LegAttributeStructure withText(InternationalTextStructure value) {
        setText(value);
        return this;
    }

    @Override
    public LegAttributeStructure withCode(String value) {
        setCode(value);
        return this;
    }

    @Override
    public LegAttributeStructure withFareClassFacility(FareClassFacilityEnumeration... values) {
        if (values!= null) {
            for (FareClassFacilityEnumeration value: values) {
                getFareClassFacility().add(value);
            }
        }
        return this;
    }

    @Override
    public LegAttributeStructure withFareClassFacility(Collection<FareClassFacilityEnumeration> values) {
        if (values!= null) {
            getFareClassFacility().addAll(values);
        }
        return this;
    }

    @Override
    public LegAttributeStructure withTicketingFacility(TicketingFacilityEnumeration... values) {
        if (values!= null) {
            for (TicketingFacilityEnumeration value: values) {
                getTicketingFacility().add(value);
            }
        }
        return this;
    }

    @Override
    public LegAttributeStructure withTicketingFacility(Collection<TicketingFacilityEnumeration> values) {
        if (values!= null) {
            getTicketingFacility().addAll(values);
        }
        return this;
    }

    @Override
    public LegAttributeStructure withNuisanceFacility(NuisanceFacilityEnumeration... values) {
        if (values!= null) {
            for (NuisanceFacilityEnumeration value: values) {
                getNuisanceFacility().add(value);
            }
        }
        return this;
    }

    @Override
    public LegAttributeStructure withNuisanceFacility(Collection<NuisanceFacilityEnumeration> values) {
        if (values!= null) {
            getNuisanceFacility().addAll(values);
        }
        return this;
    }

    @Override
    public LegAttributeStructure withMobilityFacility(MobilityFacilityEnumeration... values) {
        if (values!= null) {
            for (MobilityFacilityEnumeration value: values) {
                getMobilityFacility().add(value);
            }
        }
        return this;
    }

    @Override
    public LegAttributeStructure withMobilityFacility(Collection<MobilityFacilityEnumeration> values) {
        if (values!= null) {
            getMobilityFacility().addAll(values);
        }
        return this;
    }

    @Override
    public LegAttributeStructure withPassengerInformationFacility(PassengerInformationFacilityEnumeration... values) {
        if (values!= null) {
            for (PassengerInformationFacilityEnumeration value: values) {
                getPassengerInformationFacility().add(value);
            }
        }
        return this;
    }

    @Override
    public LegAttributeStructure withPassengerInformationFacility(Collection<PassengerInformationFacilityEnumeration> values) {
        if (values!= null) {
            getPassengerInformationFacility().addAll(values);
        }
        return this;
    }

    @Override
    public LegAttributeStructure withPassengerCommsFacility(PassengerCommsFacilityEnumeration... values) {
        if (values!= null) {
            for (PassengerCommsFacilityEnumeration value: values) {
                getPassengerCommsFacility().add(value);
            }
        }
        return this;
    }

    @Override
    public LegAttributeStructure withPassengerCommsFacility(Collection<PassengerCommsFacilityEnumeration> values) {
        if (values!= null) {
            getPassengerCommsFacility().addAll(values);
        }
        return this;
    }

    @Override
    public LegAttributeStructure withRefreshmentFacility(RefreshmentFacilityEnumeration... values) {
        if (values!= null) {
            for (RefreshmentFacilityEnumeration value: values) {
                getRefreshmentFacility().add(value);
            }
        }
        return this;
    }

    @Override
    public LegAttributeStructure withRefreshmentFacility(Collection<RefreshmentFacilityEnumeration> values) {
        if (values!= null) {
            getRefreshmentFacility().addAll(values);
        }
        return this;
    }

    @Override
    public LegAttributeStructure withAccessFacility(AccessFacilityEnumeration... values) {
        if (values!= null) {
            for (AccessFacilityEnumeration value: values) {
                getAccessFacility().add(value);
            }
        }
        return this;
    }

    @Override
    public LegAttributeStructure withAccessFacility(Collection<AccessFacilityEnumeration> values) {
        if (values!= null) {
            getAccessFacility().addAll(values);
        }
        return this;
    }

    @Override
    public LegAttributeStructure withSanitaryFacility(SanitaryFacilityEnumeration... values) {
        if (values!= null) {
            for (SanitaryFacilityEnumeration value: values) {
                getSanitaryFacility().add(value);
            }
        }
        return this;
    }

    @Override
    public LegAttributeStructure withSanitaryFacility(Collection<SanitaryFacilityEnumeration> values) {
        if (values!= null) {
            getSanitaryFacility().addAll(values);
        }
        return this;
    }

    @Override
    public LegAttributeStructure withLuggageFacility(LuggageFacilityEnumeration... values) {
        if (values!= null) {
            for (LuggageFacilityEnumeration value: values) {
                getLuggageFacility().add(value);
            }
        }
        return this;
    }

    @Override
    public LegAttributeStructure withLuggageFacility(Collection<LuggageFacilityEnumeration> values) {
        if (values!= null) {
            getLuggageFacility().addAll(values);
        }
        return this;
    }

    @Override
    public LegAttributeStructure withAccommodationFacility(AccommodationFacilityEnumeration... values) {
        if (values!= null) {
            for (AccommodationFacilityEnumeration value: values) {
                getAccommodationFacility().add(value);
            }
        }
        return this;
    }

    @Override
    public LegAttributeStructure withAccommodationFacility(Collection<AccommodationFacilityEnumeration> values) {
        if (values!= null) {
            getAccommodationFacility().addAll(values);
        }
        return this;
    }

    @Override
    public LegAttributeStructure withAssistanceFacility(AssistanceFacilityEnumeration... values) {
        if (values!= null) {
            for (AssistanceFacilityEnumeration value: values) {
                getAssistanceFacility().add(value);
            }
        }
        return this;
    }

    @Override
    public LegAttributeStructure withAssistanceFacility(Collection<AssistanceFacilityEnumeration> values) {
        if (values!= null) {
            getAssistanceFacility().addAll(values);
        }
        return this;
    }

    @Override
    public LegAttributeStructure withHireFacility(HireFacilityEnumeration... values) {
        if (values!= null) {
            for (HireFacilityEnumeration value: values) {
                getHireFacility().add(value);
            }
        }
        return this;
    }

    @Override
    public LegAttributeStructure withHireFacility(Collection<HireFacilityEnumeration> values) {
        if (values!= null) {
            getHireFacility().addAll(values);
        }
        return this;
    }

    @Override
    public LegAttributeStructure withMandatory(Boolean value) {
        setMandatory(value);
        return this;
    }

    @Override
    public LegAttributeStructure withImportance(Integer value) {
        setImportance(value);
        return this;
    }

    @Override
    public LegAttributeStructure withInfoURL(String value) {
        setInfoURL(value);
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
