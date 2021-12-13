//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 01:30:26 PM CET 
//


package de.vdv.ojp.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for AffectedConnectionLinkStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectedConnectionLinkStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConnectionLinkRef" type="{http://www.siri.org.uk/siri}ConnectionLinkRefStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ConnectionName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="AllLines" type="{http://www.siri.org.uk/siri}EmptyType"/&gt;
 *           &lt;sequence&gt;
 *             &lt;group ref="{http://www.siri.org.uk/siri}LineGroup" minOccurs="0"/&gt;
 *             &lt;element name="ConnectingStopPointRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure" minOccurs="0"/&gt;
 *             &lt;element name="ConnectingStopPointName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;element name="ConnectingZoneRef" type="{http://www.siri.org.uk/siri}ZoneRefStructure" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ConnectionDirection" type="{http://www.siri.org.uk/siri}ConnectionDirectionEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="AffectedPathLink" type="{http://www.siri.org.uk/siri}AffectedPathLinkStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedConnectionLinkStructure", propOrder = {
    "connectionLinkRef",
    "connectionName",
    "allLines",
    "lineRef",
    "publishedLineName",
    "connectingStopPointRef",
    "connectingStopPointName",
    "connectingZoneRef",
    "connectionDirection",
    "affectedPathLink",
    "extensions"
})
public class AffectedConnectionLinkStructure {

    @XmlElement(name = "ConnectionLinkRef")
    protected List<ConnectionLinkRefStructure> connectionLinkRef;
    @XmlElement(name = "ConnectionName")
    protected NaturalLanguageStringStructure connectionName;
    @XmlElement(name = "AllLines")
    protected String allLines;
    @XmlElement(name = "LineRef")
    protected LineRefStructure lineRef;
    @XmlElement(name = "PublishedLineName")
    protected NaturalLanguageStringStructure publishedLineName;
    @XmlElement(name = "ConnectingStopPointRef")
    protected StopPointRefStructure connectingStopPointRef;
    @XmlElement(name = "ConnectingStopPointName")
    protected List<NaturalLanguageStringStructure> connectingStopPointName;
    @XmlElement(name = "ConnectingZoneRef")
    protected ZoneRefStructure connectingZoneRef;
    @XmlElement(name = "ConnectionDirection", defaultValue = "both")
    @XmlSchemaType(name = "NMTOKEN")
    protected ConnectionDirectionEnumeration connectionDirection;
    @XmlElement(name = "AffectedPathLink")
    protected List<AffectedPathLinkStructure> affectedPathLink;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the connectionLinkRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionLinkRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionLinkRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionLinkRefStructure }
     * 
     * 
     */
    public List<ConnectionLinkRefStructure> getConnectionLinkRef() {
        if (connectionLinkRef == null) {
            connectionLinkRef = new ArrayList<ConnectionLinkRefStructure>();
        }
        return this.connectionLinkRef;
    }

    /**
     * Gets the value of the connectionName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getConnectionName() {
        return connectionName;
    }

    /**
     * Sets the value of the connectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setConnectionName(NaturalLanguageStringStructure value) {
        this.connectionName = value;
    }

    /**
     * Gets the value of the allLines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllLines() {
        return allLines;
    }

    /**
     * Sets the value of the allLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllLines(String value) {
        this.allLines = value;
    }

    /**
     * Gets the value of the lineRef property.
     * 
     * @return
     *     possible object is
     *     {@link LineRefStructure }
     *     
     */
    public LineRefStructure getLineRef() {
        return lineRef;
    }

    /**
     * Sets the value of the lineRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRefStructure }
     *     
     */
    public void setLineRef(LineRefStructure value) {
        this.lineRef = value;
    }

    /**
     * Gets the value of the publishedLineName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getPublishedLineName() {
        return publishedLineName;
    }

    /**
     * Sets the value of the publishedLineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setPublishedLineName(NaturalLanguageStringStructure value) {
        this.publishedLineName = value;
    }

    /**
     * Gets the value of the connectingStopPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getConnectingStopPointRef() {
        return connectingStopPointRef;
    }

    /**
     * Sets the value of the connectingStopPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setConnectingStopPointRef(StopPointRefStructure value) {
        this.connectingStopPointRef = value;
    }

    /**
     * Gets the value of the connectingStopPointName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectingStopPointName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectingStopPointName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getConnectingStopPointName() {
        if (connectingStopPointName == null) {
            connectingStopPointName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.connectingStopPointName;
    }

    /**
     * Gets the value of the connectingZoneRef property.
     * 
     * @return
     *     possible object is
     *     {@link ZoneRefStructure }
     *     
     */
    public ZoneRefStructure getConnectingZoneRef() {
        return connectingZoneRef;
    }

    /**
     * Sets the value of the connectingZoneRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneRefStructure }
     *     
     */
    public void setConnectingZoneRef(ZoneRefStructure value) {
        this.connectingZoneRef = value;
    }

    /**
     * Gets the value of the connectionDirection property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionDirectionEnumeration }
     *     
     */
    public ConnectionDirectionEnumeration getConnectionDirection() {
        return connectionDirection;
    }

    /**
     * Sets the value of the connectionDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionDirectionEnumeration }
     *     
     */
    public void setConnectionDirection(ConnectionDirectionEnumeration value) {
        this.connectionDirection = value;
    }

    /**
     * Gets the value of the affectedPathLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectedPathLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedPathLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedPathLinkStructure }
     * 
     * 
     */
    public List<AffectedPathLinkStructure> getAffectedPathLink() {
        if (affectedPathLink == null) {
            affectedPathLink = new ArrayList<AffectedPathLinkStructure>();
        }
        return this.affectedPathLink;
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

    public AffectedConnectionLinkStructure withConnectionLinkRef(ConnectionLinkRefStructure... values) {
        if (values!= null) {
            for (ConnectionLinkRefStructure value: values) {
                getConnectionLinkRef().add(value);
            }
        }
        return this;
    }

    public AffectedConnectionLinkStructure withConnectionLinkRef(Collection<ConnectionLinkRefStructure> values) {
        if (values!= null) {
            getConnectionLinkRef().addAll(values);
        }
        return this;
    }

    public AffectedConnectionLinkStructure withConnectionName(NaturalLanguageStringStructure value) {
        setConnectionName(value);
        return this;
    }

    public AffectedConnectionLinkStructure withAllLines(String value) {
        setAllLines(value);
        return this;
    }

    public AffectedConnectionLinkStructure withLineRef(LineRefStructure value) {
        setLineRef(value);
        return this;
    }

    public AffectedConnectionLinkStructure withPublishedLineName(NaturalLanguageStringStructure value) {
        setPublishedLineName(value);
        return this;
    }

    public AffectedConnectionLinkStructure withConnectingStopPointRef(StopPointRefStructure value) {
        setConnectingStopPointRef(value);
        return this;
    }

    public AffectedConnectionLinkStructure withConnectingStopPointName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getConnectingStopPointName().add(value);
            }
        }
        return this;
    }

    public AffectedConnectionLinkStructure withConnectingStopPointName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getConnectingStopPointName().addAll(values);
        }
        return this;
    }

    public AffectedConnectionLinkStructure withConnectingZoneRef(ZoneRefStructure value) {
        setConnectingZoneRef(value);
        return this;
    }

    public AffectedConnectionLinkStructure withConnectionDirection(ConnectionDirectionEnumeration value) {
        setConnectionDirection(value);
        return this;
    }

    public AffectedConnectionLinkStructure withAffectedPathLink(AffectedPathLinkStructure... values) {
        if (values!= null) {
            for (AffectedPathLinkStructure value: values) {
                getAffectedPathLink().add(value);
            }
        }
        return this;
    }

    public AffectedConnectionLinkStructure withAffectedPathLink(Collection<AffectedPathLinkStructure> values) {
        if (values!= null) {
            getAffectedPathLink().addAll(values);
        }
        return this;
    }

    public AffectedConnectionLinkStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
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
