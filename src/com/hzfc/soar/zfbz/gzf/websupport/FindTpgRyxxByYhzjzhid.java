/**
 * FindTpgRyxxByYhzjzhid.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hzfc.soar.zfbz.gzf.websupport;

public class FindTpgRyxxByYhzjzhid  implements java.io.Serializable {
    private java.lang.Long yhzjzhid;

    public FindTpgRyxxByYhzjzhid() {
    }

    public FindTpgRyxxByYhzjzhid(
           java.lang.Long yhzjzhid) {
           this.yhzjzhid = yhzjzhid;
    }


    /**
     * Gets the yhzjzhid value for this FindTpgRyxxByYhzjzhid.
     * 
     * @return yhzjzhid
     */
    public java.lang.Long getYhzjzhid() {
        return yhzjzhid;
    }


    /**
     * Sets the yhzjzhid value for this FindTpgRyxxByYhzjzhid.
     * 
     * @param yhzjzhid
     */
    public void setYhzjzhid(java.lang.Long yhzjzhid) {
        this.yhzjzhid = yhzjzhid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FindTpgRyxxByYhzjzhid)) return false;
        FindTpgRyxxByYhzjzhid other = (FindTpgRyxxByYhzjzhid) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.yhzjzhid==null && other.getYhzjzhid()==null) || 
             (this.yhzjzhid!=null &&
              this.yhzjzhid.equals(other.getYhzjzhid())));
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
        if (getYhzjzhid() != null) {
            _hashCode += getYhzjzhid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FindTpgRyxxByYhzjzhid.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findTpgRyxxByYhzjzhid"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yhzjzhid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "yhzjzhid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
