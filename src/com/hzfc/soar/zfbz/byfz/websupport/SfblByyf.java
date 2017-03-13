
package com.hzfc.soar.zfbz.byfz.websupport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sfblByyf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sfblByyf">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fczh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fwzl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sfblByyf", propOrder = {
    "fczh",
    "fwzl"
})
public class SfblByyf {

    protected String fczh;
    protected String fwzl;

    /**
     * Gets the value of the fczh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFczh() {
        return fczh;
    }

    /**
     * Sets the value of the fczh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFczh(String value) {
        this.fczh = value;
    }

    /**
     * Gets the value of the fwzl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFwzl() {
        return fwzl;
    }

    /**
     * Sets the value of the fwzl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFwzl(String value) {
        this.fwzl = value;
    }

}
