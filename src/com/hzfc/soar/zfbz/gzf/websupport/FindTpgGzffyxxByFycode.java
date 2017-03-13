/**
 * FindTpgGzffyxxByFycode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hzfc.soar.zfbz.gzf.websupport;

public class FindTpgGzffyxxByFycode  implements java.io.Serializable {
    private java.lang.Long fycode;

    public FindTpgGzffyxxByFycode() {
    }

    public FindTpgGzffyxxByFycode(
           java.lang.Long fycode) {
           this.fycode = fycode;
    }


    /**
     * Gets the fycode value for this FindTpgGzffyxxByFycode.
     * 
     * @return fycode
     */
    public java.lang.Long getFycode() {
        return fycode;
    }


    /**
     * Sets the fycode value for this FindTpgGzffyxxByFycode.
     * 
     * @param fycode
     */
    public void setFycode(java.lang.Long fycode) {
        this.fycode = fycode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FindTpgGzffyxxByFycode)) return false;
        FindTpgGzffyxxByFycode other = (FindTpgGzffyxxByFycode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fycode==null && other.getFycode()==null) || 
             (this.fycode!=null &&
              this.fycode.equals(other.getFycode())));
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
        if (getFycode() != null) {
            _hashCode += getFycode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FindTpgGzffyxxByFycode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findTpgGzffyxxByFycode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fycode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fycode"));
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
