//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package de.vdv.ojp.model;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for PublishToAlertsActionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublishToAlertsActionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}PushedActionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ByEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ByMobile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishToAlertsActionStructure", propOrder = {
    "byEmail",
    "byMobile"
})
public class PublishToAlertsActionStructure
    extends PushedActionStructure
{

    @XmlElement(name = "ByEmail", defaultValue = "true")
    protected Boolean byEmail;
    @XmlElement(name = "ByMobile", defaultValue = "true")
    protected Boolean byMobile;

    /**
     * Gets the value of the byEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isByEmail() {
        return byEmail;
    }

    /**
     * Sets the value of the byEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setByEmail(Boolean value) {
        this.byEmail = value;
    }

    /**
     * Gets the value of the byMobile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isByMobile() {
        return byMobile;
    }

    /**
     * Sets the value of the byMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setByMobile(Boolean value) {
        this.byMobile = value;
    }

    public PublishToAlertsActionStructure withByEmail(Boolean value) {
        setByEmail(value);
        return this;
    }

    public PublishToAlertsActionStructure withByMobile(Boolean value) {
        setByMobile(value);
        return this;
    }

    @Override
    public PublishToAlertsActionStructure withBeforeNotices(PushedActionStructure.BeforeNotices value) {
        setBeforeNotices(value);
        return this;
    }

    @Override
    public PublishToAlertsActionStructure withClearNotice(Boolean value) {
        setClearNotice(value);
        return this;
    }

    @Override
    public PublishToAlertsActionStructure withDescription(NaturalLanguageStringStructure value) {
        setDescription(value);
        return this;
    }

    @Override
    public PublishToAlertsActionStructure withActionData(ActionDataStructure... values) {
        if (values!= null) {
            for (ActionDataStructure value: values) {
                getActionData().add(value);
            }
        }
        return this;
    }

    @Override
    public PublishToAlertsActionStructure withActionData(Collection<ActionDataStructure> values) {
        if (values!= null) {
            getActionData().addAll(values);
        }
        return this;
    }

    @Override
    public PublishToAlertsActionStructure withActionStatus(ActionStatusEnumeration value) {
        setActionStatus(value);
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
