//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for TpegNamedOnlyArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegNamedOnlyArea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TpegAreaLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegAreaDescriptor" maxOccurs="unbounded"/&gt;
 *         &lt;element name="tpegNamedOnlyAreaExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegNamedOnlyArea", propOrder = {
    "name",
    "tpegNamedOnlyAreaExtension"
})
public class TpegNamedOnlyArea
    extends TpegAreaLocation
{

    @XmlElement(required = true)
    protected List<TpegAreaDescriptor> name;
    protected ExtensionType tpegNamedOnlyAreaExtension;

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TpegAreaDescriptor }
     * 
     * 
     */
    public List<TpegAreaDescriptor> getName() {
        if (name == null) {
            name = new ArrayList<TpegAreaDescriptor>();
        }
        return this.name;
    }

    /**
     * Gets the value of the tpegNamedOnlyAreaExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegNamedOnlyAreaExtension() {
        return tpegNamedOnlyAreaExtension;
    }

    /**
     * Sets the value of the tpegNamedOnlyAreaExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegNamedOnlyAreaExtension(ExtensionType value) {
        this.tpegNamedOnlyAreaExtension = value;
    }

    public TpegNamedOnlyArea withName(TpegAreaDescriptor... values) {
        if (values!= null) {
            for (TpegAreaDescriptor value: values) {
                getName().add(value);
            }
        }
        return this;
    }

    public TpegNamedOnlyArea withName(Collection<TpegAreaDescriptor> values) {
        if (values!= null) {
            getName().addAll(values);
        }
        return this;
    }

    public TpegNamedOnlyArea withTpegNamedOnlyAreaExtension(ExtensionType value) {
        setTpegNamedOnlyAreaExtension(value);
        return this;
    }

    @Override
    public TpegNamedOnlyArea withTpegAreaLocationType(TpegLoc01AreaLocationSubtypeEnum value) {
        setTpegAreaLocationType(value);
        return this;
    }

    @Override
    public TpegNamedOnlyArea withTpegHeight(TpegHeight value) {
        setTpegHeight(value);
        return this;
    }

    @Override
    public TpegNamedOnlyArea withTpegAreaLocationExtension(ExtensionType value) {
        setTpegAreaLocationExtension(value);
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