/**
 * FindZfbzZjkfmxs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hzfc.soar.zfbz.gzf.websupport;

public class FindZfbzZjkfmxs  implements java.io.Serializable {
    private java.lang.String xqName;

    private java.util.Calendar kfsj;

    private java.lang.Integer kfzt;

    private java.lang.Integer pageNo;

    private java.lang.Integer pageSize;

    public FindZfbzZjkfmxs() {
    }

    public FindZfbzZjkfmxs(
           java.lang.String xqName,
           java.util.Calendar kfsj,
           java.lang.Integer kfzt,
           java.lang.Integer pageNo,
           java.lang.Integer pageSize) {
           this.xqName = xqName;
           this.kfsj = kfsj;
           this.kfzt = kfzt;
           this.pageNo = pageNo;
           this.pageSize = pageSize;
    }


    /**
     * Gets the xqName value for this FindZfbzZjkfmxs.
     * 
     * @return xqName
     */
    public java.lang.String getXqName() {
        return xqName;
    }


    /**
     * Sets the xqName value for this FindZfbzZjkfmxs.
     * 
     * @param xqName
     */
    public void setXqName(java.lang.String xqName) {
        this.xqName = xqName;
    }


    /**
     * Gets the kfsj value for this FindZfbzZjkfmxs.
     * 
     * @return kfsj
     */
    public java.util.Calendar getKfsj() {
        return kfsj;
    }


    /**
     * Sets the kfsj value for this FindZfbzZjkfmxs.
     * 
     * @param kfsj
     */
    public void setKfsj(java.util.Calendar kfsj) {
        this.kfsj = kfsj;
    }


    /**
     * Gets the kfzt value for this FindZfbzZjkfmxs.
     * 
     * @return kfzt
     */
    public java.lang.Integer getKfzt() {
        return kfzt;
    }


    /**
     * Sets the kfzt value for this FindZfbzZjkfmxs.
     * 
     * @param kfzt
     */
    public void setKfzt(java.lang.Integer kfzt) {
        this.kfzt = kfzt;
    }


    /**
     * Gets the pageNo value for this FindZfbzZjkfmxs.
     * 
     * @return pageNo
     */
    public java.lang.Integer getPageNo() {
        return pageNo;
    }


    /**
     * Sets the pageNo value for this FindZfbzZjkfmxs.
     * 
     * @param pageNo
     */
    public void setPageNo(java.lang.Integer pageNo) {
        this.pageNo = pageNo;
    }


    /**
     * Gets the pageSize value for this FindZfbzZjkfmxs.
     * 
     * @return pageSize
     */
    public java.lang.Integer getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this FindZfbzZjkfmxs.
     * 
     * @param pageSize
     */
    public void setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FindZfbzZjkfmxs)) return false;
        FindZfbzZjkfmxs other = (FindZfbzZjkfmxs) obj;
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
            ((this.kfsj==null && other.getKfsj()==null) || 
             (this.kfsj!=null &&
              this.kfsj.equals(other.getKfsj()))) &&
            ((this.kfzt==null && other.getKfzt()==null) || 
             (this.kfzt!=null &&
              this.kfzt.equals(other.getKfzt()))) &&
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
        if (getKfsj() != null) {
            _hashCode += getKfsj().hashCode();
        }
        if (getKfzt() != null) {
            _hashCode += getKfzt().hashCode();
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
        new org.apache.axis.description.TypeDesc(FindZfbzZjkfmxs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findZfbzZjkfmxs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xqName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xqName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kfsj");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kfsj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kfzt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kfzt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
