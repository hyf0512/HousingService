/**
 * FindDatasByFwzl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hzfc.soar.zfbz.gzf.websupport;

public class FindDatasByFwzl  implements java.io.Serializable {
    private java.lang.String fwzl;

    public FindDatasByFwzl() {
    }

    public FindDatasByFwzl(
           java.lang.String fwzl) {
           this.fwzl = fwzl;
    }


    /**
     * Gets the fwzl value for this FindDatasByFwzl.
     * 
     * @return fwzl
     */
    public java.lang.String getFwzl() {
        return fwzl;
    }


    /**
     * Sets the fwzl value for this FindDatasByFwzl.
     * 
     * @param fwzl
     */
    public void setFwzl(java.lang.String fwzl) {
        this.fwzl = fwzl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FindDatasByFwzl)) return false;
        FindDatasByFwzl other = (FindDatasByFwzl) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fwzl==null && other.getFwzl()==null) || 
             (this.fwzl!=null &&
              this.fwzl.equals(other.getFwzl())));
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
        if (getFwzl() != null) {
            _hashCode += getFwzl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FindDatasByFwzl.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findDatasByFwzl"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fwzl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fwzl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
