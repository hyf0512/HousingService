/**
 * FindZfbzJtxxs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hzfc.soar.zfbz.gzf.websupport;

public class FindZfbzJtxxs  implements java.io.Serializable {
    private java.lang.String xqName;

    private java.lang.Integer pageNo;

    private java.lang.Integer pageSize;

    public FindZfbzJtxxs() {
    }

    public FindZfbzJtxxs(
           java.lang.String xqName,
           java.lang.Integer pageNo,
           java.lang.Integer pageSize) {
           this.xqName = xqName;
           this.pageNo = pageNo;
           this.pageSize = pageSize;
    }


    /**
     * Gets the xqName value for this FindZfbzJtxxs.
     * 
     * @return xqName
     */
    public java.lang.String getXqName() {
        return xqName;
    }


    /**
     * Sets the xqName value for this FindZfbzJtxxs.
     * 
     * @param xqName
     */
    public void setXqName(java.lang.String xqName) {
        this.xqName = xqName;
    }


    /**
     * Gets the pageNo value for this FindZfbzJtxxs.
     * 
     * @return pageNo
     */
    public java.lang.Integer getPageNo() {
        return pageNo;
    }


    /**
     * Sets the pageNo value for this FindZfbzJtxxs.
     * 
     * @param pageNo
     */
    public void setPageNo(java.lang.Integer pageNo) {
        this.pageNo = pageNo;
    }


    /**
     * Gets the pageSize value for this FindZfbzJtxxs.
     * 
     * @return pageSize
     */
    public java.lang.Integer getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this FindZfbzJtxxs.
     * 
     * @param pageSize
     */
    public void setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FindZfbzJtxxs)) return false;
        FindZfbzJtxxs other = (FindZfbzJtxxs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.xqName==null && other.getXqName()==null) || 
             (this.xqName!=null &&
              this.xqName.equals(other.getXqName()))) &&
            ((this.pageNo==null && other.getPageNo()==null) || 
             (this.pageNo!=null &&
              this.pageNo.equals(other.getPageNo()))) &&
            ((this.pageSize==null && other.getPageSize()==null) || 
             (this.pageSize!=null &&
              this.pageSize.equals(other.getPageSize())));
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
        if (getXqName() != null) {
            _hashCode += getXqName().hashCode();
        }
        if (getPageNo() != null) {
            _hashCode += getPageNo().hashCode();
        }
        if (getPageSize() != null) {
            _hashCode += getPageSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FindZfbzJtxxs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findZfbzJtxxs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xqName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xqName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pageNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pageSize"));
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
