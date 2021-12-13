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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for OperatorAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatorAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}SituationRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actionOrigin" type="{http://datex2.eu/schema/2_0RC1/2_0}OperatorActionOriginEnum" minOccurs="0"/&gt;
 *         &lt;element name="operatorActionStatus" type="{http://datex2.eu/schema/2_0RC1/2_0}OperatorActionStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="operatorActionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatorAction", propOrder = {
    "actionOrigin",
    "operatorActionStatus",
    "operatorActionExtension"
})
@XmlSeeAlso({
    RoadsideAssistance.class,
    Roadworks.class,
    SignSetting.class,
    NetworkManagement.class
})
public abstract class OperatorAction
    extends SituationRecord
{

    @XmlSchemaType(name = "string")
    protected OperatorActionOriginEnum actionOrigin;
    @XmlSchemaType(name = "string")
    protected OperatorActionStatusEnum operatorActionStatus;
    protected ExtensionType operatorActionExtension;

    /**
     * Gets the value of the actionOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorActionOriginEnum }
     *     
     */
    public OperatorActionOriginEnum getActionOrigin() {
        return actionOrigin;
    }

    /**
     * Sets the value of the actionOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorActionOriginEnum }
     *     
     */
    public void setActionOrigin(OperatorActionOriginEnum value) {
        this.actionOrigin = value;
    }

    /**
     * Gets the value of the operatorActionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorActionStatusEnum }
     *     
     */
    public OperatorActionStatusEnum getOperatorActionStatus() {
        return operatorActionStatus;
    }

    /**
     * Sets the value of the operatorActionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorActionStatusEnum }
     *     
     */
    public void setOperatorActionStatus(OperatorActionStatusEnum value) {
        this.operatorActionStatus = value;
    }

    /**
     * Gets the value of the operatorActionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOperatorActionExtension() {
        return operatorActionExtension;
    }

    /**
     * Sets the value of the operatorActionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOperatorActionExtension(ExtensionType value) {
        this.operatorActionExtension = value;
    }

    public OperatorAction withActionOrigin(OperatorActionOriginEnum value) {
        setActionOrigin(value);
        return this;
    }

    public OperatorAction withOperatorActionStatus(OperatorActionStatusEnum value) {
        setOperatorActionStatus(value);
        return this;
    }

    public OperatorAction withOperatorActionExtension(ExtensionType value) {
        setOperatorActionExtension(value);
        return this;
    }

    @Override
    public OperatorAction withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public OperatorAction withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public OperatorAction withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public OperatorAction withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public OperatorAction withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public OperatorAction withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public OperatorAction withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public OperatorAction withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public OperatorAction withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public OperatorAction withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public OperatorAction withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public OperatorAction withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public OperatorAction withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public OperatorAction withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public OperatorAction withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public OperatorAction withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public OperatorAction withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public OperatorAction withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public OperatorAction withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public OperatorAction withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public OperatorAction withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public OperatorAction withId(String value) {
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
