
package edu.internet2.middleware.grouper.ws.soap_v2_2.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wsMemberChangeSubjects" type="{http://soap_v2_0.ws.grouper.middleware.internet2.edu/xsd}WsMemberChangeSubject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="actAsSubjectLookup" type="{http://soap_v2_0.ws.grouper.middleware.internet2.edu/xsd}WsSubjectLookup" minOccurs="0"/>
 *         &lt;element name="txType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="includeSubjectDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subjectAttributeNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="params" type="{http://soap_v2_0.ws.grouper.middleware.internet2.edu/xsd}WsParam" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientVersion",
    "wsMemberChangeSubjects",
    "actAsSubjectLookup",
    "txType",
    "includeSubjectDetail",
    "subjectAttributeNames",
    "params"
})
@XmlRootElement(name = "memberChangeSubject")
public class MemberChangeSubject {

    @XmlElementRef(name = "clientVersion", namespace = "http://soap_v2_0.ws.grouper.middleware.internet2.edu/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientVersion;
    @XmlElement(nillable = true)
    protected List<WsMemberChangeSubject> wsMemberChangeSubjects;
    @XmlElementRef(name = "actAsSubjectLookup", namespace = "http://soap_v2_0.ws.grouper.middleware.internet2.edu/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<WsSubjectLookup> actAsSubjectLookup;
    @XmlElementRef(name = "txType", namespace = "http://soap_v2_0.ws.grouper.middleware.internet2.edu/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> txType;
    @XmlElementRef(name = "includeSubjectDetail", namespace = "http://soap_v2_0.ws.grouper.middleware.internet2.edu/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> includeSubjectDetail;
    @XmlElement(nillable = true)
    protected List<String> subjectAttributeNames;
    @XmlElement(nillable = true)
    protected List<WsParam> params;

    /**
     * Gets the value of the clientVersion property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientVersion() {
        return clientVersion;
    }

    /**
     * Sets the value of the clientVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientVersion(JAXBElement<String> value) {
        this.clientVersion = value;
    }

    /**
     * Gets the value of the wsMemberChangeSubjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsMemberChangeSubjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsMemberChangeSubjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link edu.internet2.middleware.grouper.ws.soap_v2_2.xsd.WsMemberChangeSubject }
     * 
     * 
     */
    public List<WsMemberChangeSubject> getWsMemberChangeSubjects() {
        if (wsMemberChangeSubjects == null) {
            wsMemberChangeSubjects = new ArrayList<WsMemberChangeSubject>();
        }
        return this.wsMemberChangeSubjects;
    }

    /**
     * Gets the value of the actAsSubjectLookup property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link edu.internet2.middleware.grouper.ws.soap_v2_2.xsd.WsSubjectLookup }{@code >}
     *     
     */
    public JAXBElement<WsSubjectLookup> getActAsSubjectLookup() {
        return actAsSubjectLookup;
    }

    /**
     * Sets the value of the actAsSubjectLookup property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link edu.internet2.middleware.grouper.ws.soap_v2_2.xsd.WsSubjectLookup }{@code >}
     *     
     */
    public void setActAsSubjectLookup(JAXBElement<WsSubjectLookup> value) {
        this.actAsSubjectLookup = value;
    }

    /**
     * Gets the value of the txType property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTxType() {
        return txType;
    }

    /**
     * Sets the value of the txType property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTxType(JAXBElement<String> value) {
        this.txType = value;
    }

    /**
     * Gets the value of the includeSubjectDetail property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIncludeSubjectDetail() {
        return includeSubjectDetail;
    }

    /**
     * Sets the value of the includeSubjectDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIncludeSubjectDetail(JAXBElement<String> value) {
        this.includeSubjectDetail = value;
    }

    /**
     * Gets the value of the subjectAttributeNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectAttributeNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectAttributeNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubjectAttributeNames() {
        if (subjectAttributeNames == null) {
            subjectAttributeNames = new ArrayList<String>();
        }
        return this.subjectAttributeNames;
    }

    /**
     * Gets the value of the params property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the params property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link edu.internet2.middleware.grouper.ws.soap_v2_2.xsd.WsParam }
     * 
     * 
     */
    public List<WsParam> getParams() {
        if (params == null) {
            params = new ArrayList<WsParam>();
        }
        return this.params;
    }

}
