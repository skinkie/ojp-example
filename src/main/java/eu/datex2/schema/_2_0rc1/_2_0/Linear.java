//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for Linear complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Linear"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NetworkLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegLinearLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLinearLocation" minOccurs="0"/&gt;
 *         &lt;element name="alertCLinear" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCLinear" minOccurs="0"/&gt;
 *         &lt;element name="roadsideReferencePointLinear" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadsideReferencePointLinear" minOccurs="0"/&gt;
 *         &lt;element name="linearExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Linear", propOrder = {
    "tpegLinearLocation",
    "alertCLinear",
    "roadsideReferencePointLinear",
    "linearExtension"
})
public class Linear
    extends NetworkLocation
{

    protected TpegLinearLocation tpegLinearLocation;
    protected AlertCLinear alertCLinear;
    protected RoadsideReferencePointLinear roadsideReferencePointLinear;
    protected ExtensionType linearExtension;

    /**
     * Gets the value of the tpegLinearLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TpegLinearLocation }
     *     
     */
    public TpegLinearLocation getTpegLinearLocation() {
        return tpegLinearLocation;
    }

    /**
     * Sets the value of the tpegLinearLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLinearLocation }
     *     
     */
    public void setTpegLinearLocation(TpegLinearLocation value) {
        this.tpegLinearLocation = value;
    }

    /**
     * Gets the value of the alertCLinear property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCLinear }
     *     
     */
    public AlertCLinear getAlertCLinear() {
        return alertCLinear;
    }

    /**
     * Sets the value of the alertCLinear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCLinear }
     *     
     */
    public void setAlertCLinear(AlertCLinear value) {
        this.alertCLinear = value;
    }

    /**
     * Gets the value of the roadsideReferencePointLinear property.
     * 
     * @return
     *     possible object is
     *     {@link RoadsideReferencePointLinear }
     *     
     */
    public RoadsideReferencePointLinear getRoadsideReferencePointLinear() {
        return roadsideReferencePointLinear;
    }

    /**
     * Sets the value of the roadsideReferencePointLinear property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadsideReferencePointLinear }
     *     
     */
    public void setRoadsideReferencePointLinear(RoadsideReferencePointLinear value) {
        this.roadsideReferencePointLinear = value;
    }

    /**
     * Gets the value of the linearExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLinearExtension() {
        return linearExtension;
    }

    /**
     * Sets the value of the linearExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLinearExtension(ExtensionType value) {
        this.linearExtension = value;
    }

    public Linear withTpegLinearLocation(TpegLinearLocation value) {
        setTpegLinearLocation(value);
        return this;
    }

    public Linear withAlertCLinear(AlertCLinear value) {
        setAlertCLinear(value);
        return this;
    }

    public Linear withRoadsideReferencePointLinear(RoadsideReferencePointLinear value) {
        setRoadsideReferencePointLinear(value);
        return this;
    }

    public Linear withLinearExtension(ExtensionType value) {
        setLinearExtension(value);
        return this;
    }

    @Override
    public Linear withSupplementaryPositionalDescription(SupplementaryPositionalDescription value) {
        setSupplementaryPositionalDescription(value);
        return this;
    }

    @Override
    public Linear withDestination(Destination value) {
        setDestination(value);
        return this;
    }

    @Override
    public Linear withNetworkLocationExtension(ExtensionType value) {
        setNetworkLocationExtension(value);
        return this;
    }

    @Override
    public Linear withExternalReferencing(ExternalReferencing... values) {
        if (values!= null) {
            for (ExternalReferencing value: values) {
                getExternalReferencing().add(value);
            }
        }
        return this;
    }

    @Override
    public Linear withExternalReferencing(Collection<ExternalReferencing> values) {
        if (values!= null) {
            getExternalReferencing().addAll(values);
        }
        return this;
    }

    @Override
    public Linear withLocationForDisplay(PointCoordinates value) {
        setLocationForDisplay(value);
        return this;
    }

    @Override
    public Linear withLocationExtension(ExtensionType value) {
        setLocationExtension(value);
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
