//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for SpeedManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpeedManagement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NetworkManagement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="speedManagementType" type="{http://datex2.eu/schema/2_0RC1/2_0}SpeedManagementTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="temporarySpeedLimit" type="{http://datex2.eu/schema/2_0RC1/2_0}KilometresPerHour" minOccurs="0"/&gt;
 *         &lt;element name="speedManagementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeedManagement", propOrder = {
    "speedManagementType",
    "temporarySpeedLimit",
    "speedManagementExtension"
})
public class SpeedManagement
    extends NetworkManagement
{

    @XmlSchemaType(name = "string")
    protected SpeedManagementTypeEnum speedManagementType;
    protected Float temporarySpeedLimit;
    protected ExtensionType speedManagementExtension;

    /**
     * Gets the value of the speedManagementType property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedManagementTypeEnum }
     *     
     */
    public SpeedManagementTypeEnum getSpeedManagementType() {
        return speedManagementType;
    }

    /**
     * Sets the value of the speedManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedManagementTypeEnum }
     *     
     */
    public void setSpeedManagementType(SpeedManagementTypeEnum value) {
        this.speedManagementType = value;
    }

    /**
     * Gets the value of the temporarySpeedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTemporarySpeedLimit() {
        return temporarySpeedLimit;
    }

    /**
     * Sets the value of the temporarySpeedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTemporarySpeedLimit(Float value) {
        this.temporarySpeedLimit = value;
    }

    /**
     * Gets the value of the speedManagementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSpeedManagementExtension() {
        return speedManagementExtension;
    }

    /**
     * Sets the value of the speedManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSpeedManagementExtension(ExtensionType value) {
        this.speedManagementExtension = value;
    }

    public SpeedManagement withSpeedManagementType(SpeedManagementTypeEnum value) {
        setSpeedManagementType(value);
        return this;
    }

    public SpeedManagement withTemporarySpeedLimit(Float value) {
        setTemporarySpeedLimit(value);
        return this;
    }

    public SpeedManagement withSpeedManagementExtension(ExtensionType value) {
        setSpeedManagementExtension(value);
        return this;
    }

    @Override
    public SpeedManagement withComplianceOption(ComplianceOptionEnum value) {
        setComplianceOption(value);
        return this;
    }

    @Override
    public SpeedManagement withApplicableForTrafficDirection(DirectionEnum... values) {
        if (values!= null) {
            for (DirectionEnum value: values) {
                getApplicableForTrafficDirection().add(value);
            }
        }
        return this;
    }

    @Override
    public SpeedManagement withApplicableForTrafficDirection(Collection<DirectionEnum> values) {
        if (values!= null) {
            getApplicableForTrafficDirection().addAll(values);
        }
        return this;
    }

    @Override
    public SpeedManagement withApplicableForTrafficType(TrafficTypeEnum... values) {
        if (values!= null) {
            for (TrafficTypeEnum value: values) {
                getApplicableForTrafficType().add(value);
            }
        }
        return this;
    }

    @Override
    public SpeedManagement withApplicableForTrafficType(Collection<TrafficTypeEnum> values) {
        if (values!= null) {
            getApplicableForTrafficType().addAll(values);
        }
        return this;
    }

    @Override
    public SpeedManagement withPlacesAtWhichApplicable(PlacesEnum... values) {
        if (values!= null) {
            for (PlacesEnum value: values) {
                getPlacesAtWhichApplicable().add(value);
            }
        }
        return this;
    }

    @Override
    public SpeedManagement withPlacesAtWhichApplicable(Collection<PlacesEnum> values) {
        if (values!= null) {
            getPlacesAtWhichApplicable().addAll(values);
        }
        return this;
    }

    @Override
    public SpeedManagement withAutomaticallyInitiated(Boolean value) {
        setAutomaticallyInitiated(value);
        return this;
    }

    @Override
    public SpeedManagement withForVehiclesWithCharacteristicsOf(VehicleCharacteristics... values) {
        if (values!= null) {
            for (VehicleCharacteristics value: values) {
                getForVehiclesWithCharacteristicsOf().add(value);
            }
        }
        return this;
    }

    @Override
    public SpeedManagement withForVehiclesWithCharacteristicsOf(Collection<VehicleCharacteristics> values) {
        if (values!= null) {
            getForVehiclesWithCharacteristicsOf().addAll(values);
        }
        return this;
    }

    @Override
    public SpeedManagement withNetworkManagementExtension(ExtensionType value) {
        setNetworkManagementExtension(value);
        return this;
    }

    @Override
    public SpeedManagement withActionOrigin(OperatorActionOriginEnum value) {
        setActionOrigin(value);
        return this;
    }

    @Override
    public SpeedManagement withOperatorActionStatus(OperatorActionStatusEnum value) {
        setOperatorActionStatus(value);
        return this;
    }

    @Override
    public SpeedManagement withOperatorActionExtension(ExtensionType value) {
        setOperatorActionExtension(value);
        return this;
    }

    @Override
    public SpeedManagement withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public SpeedManagement withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public SpeedManagement withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public SpeedManagement withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public SpeedManagement withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public SpeedManagement withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public SpeedManagement withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public SpeedManagement withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public SpeedManagement withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public SpeedManagement withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public SpeedManagement withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public SpeedManagement withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public SpeedManagement withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public SpeedManagement withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public SpeedManagement withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public SpeedManagement withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public SpeedManagement withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public SpeedManagement withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public SpeedManagement withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public SpeedManagement withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public SpeedManagement withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public SpeedManagement withId(String value) {
        setId(value);
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
