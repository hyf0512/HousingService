
package com.hzfc.soar.zfbz.byfz.websupport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkForAccept complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkForAccept">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ywlb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cqzbh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cqr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkForAccept", propOrder = {
    "ywlb",
    "cqzbh",
    "cqr"
})
public class CheckForAccept {

    protected int ywlb;
    protected String cqzbh;
    protected String cqr;

    /**
     * Gets the value of the ywlb property.
     * 
     */
    public int getYwlb() {
        return ywlb;
    }

    /**
     * Sets the value of the ywlb property.
     * 
     */
    public void setYwlb(int value) {
        this.ywlb = value;
    }

    /**
     * Gets the value of the cqzbh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCqzbh() {
        return cqzbh;
    }

    /**
     * Sets the value of the cqzbh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCqzbh(String value) {
        this.cqzbh = value;
    }

    /**
     * Gets the value of the cqr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCqr() {
        return cqr;
    }

    /**
     * Sets the value of the cqr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCqr(String value) {
        this.cqr = value;
    }

}
