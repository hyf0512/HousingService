/**
 * FindZjkfmxUpKfcgsjByPzcode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hzfc.soar.zfbz.gzf.websupport;

public class FindZjkfmxUpKfcgsjByPzcode  implements java.io.Serializable {
    private java.lang.Long pzcode;

    public FindZjkfmxUpKfcgsjByPzcode() {
    }

    public FindZjkfmxUpKfcgsjByPzcode(
           java.lang.Long pzcode) {
           this.pzcode = pzcode;
    }


    /**
     * Gets the pzcode value for this FindZjkfmxUpKfcgsjByPzcode.
     * 
     * @return pzcode
     */
    public java.lang.Long getPzcode() {
        return pzcode;
    }


    /**
     * Sets the pzcode value for this FindZjkfmxUpKfcgsjByPzcode.
     * 
     * @param pzcode
     */
    public void setPzcode(java.lang.Long pzcode) {
        this.pzcode = pzcode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FindZjkfmxUpKfcgsjByPzcode)) return false;
        FindZjkfmxUpKfcgsjByPzcode other = (FindZjkfmxUpKfcgsjByPzcode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pzcode==null && other.getPzcode()==null) || 
             (this.pzcode!=null &&
              this.pzcode.equals(other.getPzcode())));
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
        if (getPzcode() != null) {
            _hashCode += getPzcode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FindZjkfmxUpKfcgsjByPzcode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findZjkfmxUpKfcgsjByPzcode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pzcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pzcode"));
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
