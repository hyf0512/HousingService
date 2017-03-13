/**
 * FindTpgrRygxByRycode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hzfc.soar.zfbz.gzf.websupport;

public class FindTpgrRygxByRycode  implements java.io.Serializable {
    private java.lang.Long sqrcode;

    public FindTpgrRygxByRycode() {
    }

    public FindTpgrRygxByRycode(
           java.lang.Long sqrcode) {
           this.sqrcode = sqrcode;
    }


    /**
     * Gets the sqrcode value for this FindTpgrRygxByRycode.
     * 
     * @return sqrcode
     */
    public java.lang.Long getSqrcode() {
        return sqrcode;
    }


    /**
     * Sets the sqrcode value for this FindTpgrRygxByRycode.
     * 
     * @param sqrcode
     */
    public void setSqrcode(java.lang.Long sqrcode) {
        this.sqrcode = sqrcode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FindTpgrRygxByRycode)) return false;
        FindTpgrRygxByRycode other = (FindTpgrRygxByRycode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sqrcode==null && other.getSqrcode()==null) || 
             (this.sqrcode!=null &&
              this.sqrcode.equals(other.getSqrcode())));
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
        if (getSqrcode() != null) {
            _hashCode += getSqrcode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FindTpgrRygxByRycode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findTpgrRygxByRycode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sqrcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sqrcode"));
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
