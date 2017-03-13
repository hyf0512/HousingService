/**
 * FindPzrxxByXmZjhmYddh.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hzfc.soar.zfbz.gzf.websupport;

public class FindPzrxxByXmZjhmYddh  implements java.io.Serializable {
    private java.lang.String sqrxm;

    private java.lang.String zjhm;

    private java.lang.String yddh;

    private java.lang.Integer bzlx;

    public FindPzrxxByXmZjhmYddh() {
    }

    public FindPzrxxByXmZjhmYddh(
           java.lang.String sqrxm,
           java.lang.String zjhm,
           java.lang.String yddh,
           java.lang.Integer bzlx) {
           this.sqrxm = sqrxm;
           this.zjhm = zjhm;
           this.yddh = yddh;
           this.bzlx = bzlx;
    }


    /**
     * Gets the sqrxm value for this FindPzrxxByXmZjhmYddh.
     * 
     * @return sqrxm
     */
    public java.lang.String getSqrxm() {
        return sqrxm;
    }


    /**
     * Sets the sqrxm value for this FindPzrxxByXmZjhmYddh.
     * 
     * @param sqrxm
     */
    public void setSqrxm(java.lang.String sqrxm) {
        this.sqrxm = sqrxm;
    }


    /**
     * Gets the zjhm value for this FindPzrxxByXmZjhmYddh.
     * 
     * @return zjhm
     */
    public java.lang.String getZjhm() {
        return zjhm;
    }


    /**
     * Sets the zjhm value for this FindPzrxxByXmZjhmYddh.
     * 
     * @param zjhm
     */
    public void setZjhm(java.lang.String zjhm) {
        this.zjhm = zjhm;
    }


    /**
     * Gets the yddh value for this FindPzrxxByXmZjhmYddh.
     * 
     * @return yddh
     */
    public java.lang.String getYddh() {
        return yddh;
    }


    /**
     * Sets the yddh value for this FindPzrxxByXmZjhmYddh.
     * 
     * @param yddh
     */
    public void setYddh(java.lang.String yddh) {
        this.yddh = yddh;
    }


    /**
     * Gets the bzlx value for this FindPzrxxByXmZjhmYddh.
     * 
     * @return bzlx
     */
    public java.lang.Integer getBzlx() {
        return bzlx;
    }


    /**
     * Sets the bzlx value for this FindPzrxxByXmZjhmYddh.
     * 
     * @param bzlx
     */
    public void setBzlx(java.lang.Integer bzlx) {
        this.bzlx = bzlx;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FindPzrxxByXmZjhmYddh)) return false;
        FindPzrxxByXmZjhmYddh other = (FindPzrxxByXmZjhmYddh) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sqrxm==null && other.getSqrxm()==null) || 
             (this.sqrxm!=null &&
              this.sqrxm.equals(other.getSqrxm()))) &&
            ((this.zjhm==null && other.getZjhm()==null) || 
             (this.zjhm!=null &&
              this.zjhm.equals(other.getZjhm()))) &&
            ((this.yddh==null && other.getYddh()==null) || 
             (this.yddh!=null &&
              this.yddh.equals(other.getYddh()))) &&
            ((this.bzlx==null && other.getBzlx()==null) || 
             (this.bzlx!=null &&
              this.bzlx.equals(other.getBzlx())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSqrxm() != null) {
            _hashCode += getSqrxm().hashCode();
        }
        if (getZjhm() != null) {
            _hashCode += getZjhm().hashCode();
        }
        if (getYddh() != null) {
            _hashCode += getYddh().hashCode();
        }
        if (getBzlx() != null) {
            _hashCode += getBzlx().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FindPzrxxByXmZjhmYddh.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findPzrxxByXmZjhmYddh"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sqrxm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sqrxm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zjhm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zjhm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yddh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "yddh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bzlx");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bzlx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
