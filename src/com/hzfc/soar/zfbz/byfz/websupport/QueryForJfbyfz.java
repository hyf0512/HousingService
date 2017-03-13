
package com.hzfc.soar.zfbz.byfz.websupport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for queryForJfbyfz complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryForJfbyfz">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ywlb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sqr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keytype" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryForJfbyfz", propOrder = {
    "ywlb",
    "sqr",
    "keytype",
    "keyword"
})
public class QueryForJfbyfz {

    protected int ywlb;
    protected String sqr;
    protected int keytype;
    protected String keyword;

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
     * Gets the value of the sqr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqr() {
        return sqr;
    }

    /**
     * Sets the value of the sqr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqr(String value) {
        this.sqr = value;
    }

    /**
     * Gets the value of the keytype property.
     * 
     */
    public int getKeytype() {
        return keytype;
    }

    /**
     * Sets the value of the keytype property.
     * 
     */
    public void setKeytype(int value) {
        this.keytype = value;
    }

    /**
     * Gets the value of the keyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyword(String value) {
        this.keyword = value;
    }

}
