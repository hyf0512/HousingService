/**
 * SendSms4Query.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hzfc.soar.zfbz.gzf.websupport;

public class SendSms4Query  implements java.io.Serializable {
    private java.lang.String[] nameAndPhoneNo;

    private java.lang.String content;

    private java.lang.String userId;

    public SendSms4Query() {
    }

    public SendSms4Query(
           java.lang.String[] nameAndPhoneNo,
           java.lang.String content,
           java.lang.String userId) {
           this.nameAndPhoneNo = nameAndPhoneNo;
           this.content = content;
           this.userId = userId;
    }


    /**
     * Gets the nameAndPhoneNo value for this SendSms4Query.
     * 
     * @return nameAndPhoneNo
     */
    public java.lang.String[] getNameAndPhoneNo() {
        return nameAndPhoneNo;
    }


    /**
     * Sets the nameAndPhoneNo value for this SendSms4Query.
     * 
     * @param nameAndPhoneNo
     */
    public void setNameAndPhoneNo(java.lang.String[] nameAndPhoneNo) {
        this.nameAndPhoneNo = nameAndPhoneNo;
    }

    public java.lang.String getNameAndPhoneNo(int i) {
        return this.nameAndPhoneNo[i];
    }

    public void setNameAndPhoneNo(int i, java.lang.String _value) {
        this.nameAndPhoneNo[i] = _value;
    }


    /**
     * Gets the content value for this SendSms4Query.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this SendSms4Query.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the userId value for this SendSms4Query.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SendSms4Query.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendSms4Query)) return false;
        SendSms4Query other = (SendSms4Query) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nameAndPhoneNo==null && other.getNameAndPhoneNo()==null) || 
             (this.nameAndPhoneNo!=null &&
              java.util.Arrays.equals(this.nameAndPhoneNo, other.getNameAndPhoneNo()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId())));
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
        if (getNameAndPhoneNo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNameAndPhoneNo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNameAndPhoneNo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SendSms4Query.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "sendSms4Query"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameAndPhoneNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nameAndPhoneNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
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
