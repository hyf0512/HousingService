/**
 * WebGzfZlxxServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hzfc.soar.zfbz.gzf.websupport;

public class WebGzfZlxxServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.hzfc.soar.zfbz.gzf.websupport.GzfZlxxWebService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[22];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findDatasByFwzl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fwzl"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findTpgJtxxByRycode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sqrcode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgJtxx"));
        oper.setReturnClass(com.hzfc.soar.zfbz.gzf.websupport.TpgJtxx[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findPzrxxByXmZjhmYddh");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sqrxm"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "zjhm"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "yddh"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bzlx"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findZfbzRyxxs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xqName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageSize"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgRyxx"));
        oper.setReturnClass(com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findZfbzGzffyxxs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xqName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageSize"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgGzffyxx"));
        oper.setReturnClass(com.hzfc.soar.zfbz.gzf.websupport.TpgGzffyxx[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryZlxxs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "fileContentVo"), com.hzfc.soar.zfbz.gzf.websupport.FileContentVo[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "fileContentVo"));
        oper.setReturnClass(com.hzfc.soar.zfbz.gzf.websupport.FileContentVo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findTpgGzfpzxxByHtbh");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgGzfpzxx"));
        oper.setReturnClass(com.hzfc.soar.zfbz.gzf.websupport.TpgGzfpzxx.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendSms");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findTpgRyxxByZjhm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgRyxx"));
        oper.setReturnClass(com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findTpgGzffyxxByFycode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fycode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgGzffyxx"));
        oper.setReturnClass(com.hzfc.soar.zfbz.gzf.websupport.TpgGzffyxx[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findZfbzRygxs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xqName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageSize"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgrRygx"));
        oper.setReturnClass(com.hzfc.soar.zfbz.gzf.websupport.TpgrRygx[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findTpgRyxxByYhzjzhid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "yhzjzhid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgRyxx"));
        oper.setReturnClass(com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findTpgGzfpzxxsByPzcode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pzcode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgGzfpzxx"));
        oper.setReturnClass(com.hzfc.soar.zfbz.gzf.websupport.TpgGzfpzxx[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendSms4Query");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nameAndPhoneNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "content"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findHfdataByHfrq");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hfrq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findTpgRyxxsByRycode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sqrcode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgRyxx"));
        oper.setReturnClass(com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findZfbzGzfpzxxs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xqName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageSize"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgGzfpzxx"));
        oper.setReturnClass(com.hzfc.soar.zfbz.gzf.websupport.TpgGzfpzxx[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findTpgrRygxByRycode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sqrcode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgrRygx"));
        oper.setReturnClass(com.hzfc.soar.zfbz.gzf.websupport.TpgrRygx[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findZjkfmxUpKfcgsjByPzcode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pzcode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgZjkfmx"));
        oper.setReturnClass(com.hzfc.soar.zfbz.gzf.websupport.TpgZjkfmx.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findZfbzZjkfmxs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xqName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "kfsj"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "kfzt"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageSize"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgZjkfmx"));
        oper.setReturnClass(com.hzfc.soar.zfbz.gzf.websupport.TpgZjkfmx[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("verifyHth");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "mapContent"));
        oper.setReturnClass(com.hzfc.soar.zfbz.gzf.websupport.MapContent.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findZfbzJtxxs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xqName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageSize"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgJtxx"));
        oper.setReturnClass(com.hzfc.soar.zfbz.gzf.websupport.TpgJtxx[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

    }

    public WebGzfZlxxServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WebGzfZlxxServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WebGzfZlxxServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", ">>mapContent>returnMap>entry");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.MapContentReturnMapEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", ">mapContent>returnMap");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.MapContentReturnMapEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", ">>mapContent>returnMap>entry");
            qName2 = new javax.xml.namespace.QName("", "entry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "fileContentVo");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FileContentVo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findDatasByFwzl");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FindDatasByFwzl.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findDatasByFwzlResponse");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FindDatasByFwzlResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findHfdataByHfrq");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FindHfdataByHfrq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findHfdataByHfrqResponse");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FindHfdataByHfrqResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findPzrxxByXmZjhmYddh");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FindPzrxxByXmZjhmYddh.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findPzrxxByXmZjhmYddhResponse");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FindPzrxxByXmZjhmYddhResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findTpgGzffyxxByFycode");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FindTpgGzffyxxByFycode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findTpgGzffyxxByFycodeResponse");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.TpgGzffyxx[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgGzffyxx");
            qName2 = new javax.xml.namespace.QName("", "return");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findTpgGzfpzxxByHtbh");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FindTpgGzfpzxxByHtbh.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findTpgGzfpzxxByHtbhResponse");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FindTpgGzfpzxxByHtbhResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findTpgGzfpzxxsByPzcode");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FindTpgGzfpzxxsByPzcode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findTpgGzfpzxxsByPzcodeResponse");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.TpgGzfpzxx[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgGzfpzxx");
            qName2 = new javax.xml.namespace.QName("", "return");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findTpgJtxxByRycode");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FindTpgJtxxByRycode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findTpgJtxxByRycodeResponse");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.TpgJtxx[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgJtxx");
            qName2 = new javax.xml.namespace.QName("", "return");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findTpgrRygxByRycode");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FindTpgrRygxByRycode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findTpgrRygxByRycodeResponse");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.TpgrRygx[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgrRygx");
            qName2 = new javax.xml.namespace.QName("", "return");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findTpgRyxxByYhzjzhid");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FindTpgRyxxByYhzjzhid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findTpgRyxxByYhzjzhidResponse");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FindTpgRyxxByYhzjzhidResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findTpgRyxxByZjhm");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FindTpgRyxxByZjhm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findTpgRyxxByZjhmResponse");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FindTpgRyxxByZjhmResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findTpgRyxxsByRycode");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FindTpgRyxxsByRycode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findTpgRyxxsByRycodeResponse");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgRyxx");
            qName2 = new javax.xml.namespace.QName("", "return");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findZfbzGzffyxxs");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FindZfbzGzffyxxs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findZfbzGzffyxxsResponse");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.TpgGzffyxx[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgGzffyxx");
            qName2 = new javax.xml.namespace.QName("", "return");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findZfbzGzfpzxxs");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FindZfbzGzfpzxxs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findZfbzGzfpzxxsResponse");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.TpgGzfpzxx[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgGzfpzxx");
            qName2 = new javax.xml.namespace.QName("", "return");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findZfbzJtxxs");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FindZfbzJtxxs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findZfbzJtxxsResponse");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.TpgJtxx[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgJtxx");
            qName2 = new javax.xml.namespace.QName("", "return");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findZfbzRygxs");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FindZfbzRygxs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findZfbzRygxsResponse");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.TpgrRygx[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgrRygx");
            qName2 = new javax.xml.namespace.QName("", "return");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findZfbzRyxxs");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FindZfbzRyxxs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findZfbzRyxxsResponse");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgRyxx");
            qName2 = new javax.xml.namespace.QName("", "return");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findZfbzZjkfmxs");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FindZfbzZjkfmxs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findZfbzZjkfmxsResponse");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.TpgZjkfmx[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgZjkfmx");
            qName2 = new javax.xml.namespace.QName("", "return");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findZjkfmxUpKfcgsjByPzcode");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FindZjkfmxUpKfcgsjByPzcode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findZjkfmxUpKfcgsjByPzcodeResponse");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FindZjkfmxUpKfcgsjByPzcodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "mapContent");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.MapContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "queryZlxxs");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FileContentVo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "fileContentVo");
            qName2 = new javax.xml.namespace.QName("", "arg0");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "queryZlxxsResponse");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.FileContentVo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "fileContentVo");
            qName2 = new javax.xml.namespace.QName("", "return");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "sendSms");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.SendSms.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "sendSms4Query");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.SendSms4Query.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "sendSms4QueryResponse");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.SendSms4QueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "sendSmsResponse");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.SendSmsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "soarBasePO");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.SoarBasePO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgGzffyxx");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.TpgGzffyxx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgGzfpzxx");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.TpgGzfpzxx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgJtxx");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.TpgJtxx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgrRygx");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.TpgrRygx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgRyxx");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "tpgZjkfmx");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.TpgZjkfmx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "verifyHth");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.VerifyHth.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "verifyHthResponse");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.VerifyHthResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "zfbzBasePO");
            cachedSerQNames.add(qName);
            cls = com.hzfc.soar.zfbz.gzf.websupport.ZfbzBasePO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public java.lang.String findDatasByFwzl(java.lang.String fwzl) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findDatasByFwzl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fwzl});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hzfc.soar.zfbz.gzf.websupport.TpgJtxx[] findTpgJtxxByRycode(java.lang.Long sqrcode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findTpgJtxxByRycode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sqrcode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgJtxx[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgJtxx[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hzfc.soar.zfbz.gzf.websupport.TpgJtxx[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String findPzrxxByXmZjhmYddh(java.lang.String sqrxm, java.lang.String zjhm, java.lang.String yddh, java.lang.Integer bzlx) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findPzrxxByXmZjhmYddh"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sqrxm, zjhm, yddh, bzlx});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx[] findZfbzRyxxs(java.lang.String xqName, java.lang.Integer pageNo, java.lang.Integer pageSize) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findZfbzRyxxs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {xqName, pageNo, pageSize});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hzfc.soar.zfbz.gzf.websupport.TpgGzffyxx[] findZfbzGzffyxxs(java.lang.String xqName, java.lang.Integer pageNo, java.lang.Integer pageSize) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findZfbzGzffyxxs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {xqName, pageNo, pageSize});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgGzffyxx[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgGzffyxx[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hzfc.soar.zfbz.gzf.websupport.TpgGzffyxx[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hzfc.soar.zfbz.gzf.websupport.FileContentVo[] queryZlxxs(com.hzfc.soar.zfbz.gzf.websupport.FileContentVo[] arg0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "queryZlxxs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hzfc.soar.zfbz.gzf.websupport.FileContentVo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hzfc.soar.zfbz.gzf.websupport.FileContentVo[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hzfc.soar.zfbz.gzf.websupport.FileContentVo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hzfc.soar.zfbz.gzf.websupport.TpgGzfpzxx findTpgGzfpzxxByHtbh(java.lang.String arg0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findTpgGzfpzxxByHtbh"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgGzfpzxx) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgGzfpzxx) org.apache.axis.utils.JavaUtils.convert(_resp, com.hzfc.soar.zfbz.gzf.websupport.TpgGzfpzxx.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String sendSms(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "sendSms"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx findTpgRyxxByZjhm(java.lang.String arg0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findTpgRyxxByZjhm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx) org.apache.axis.utils.JavaUtils.convert(_resp, com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hzfc.soar.zfbz.gzf.websupport.TpgGzffyxx[] findTpgGzffyxxByFycode(java.lang.Long fycode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findTpgGzffyxxByFycode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fycode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgGzffyxx[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgGzffyxx[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hzfc.soar.zfbz.gzf.websupport.TpgGzffyxx[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hzfc.soar.zfbz.gzf.websupport.TpgrRygx[] findZfbzRygxs(java.lang.String xqName, java.lang.Integer pageNo, java.lang.Integer pageSize) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findZfbzRygxs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {xqName, pageNo, pageSize});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgrRygx[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgrRygx[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hzfc.soar.zfbz.gzf.websupport.TpgrRygx[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx findTpgRyxxByYhzjzhid(java.lang.Long yhzjzhid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findTpgRyxxByYhzjzhid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {yhzjzhid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx) org.apache.axis.utils.JavaUtils.convert(_resp, com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hzfc.soar.zfbz.gzf.websupport.TpgGzfpzxx[] findTpgGzfpzxxsByPzcode(java.lang.Long pzcode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findTpgGzfpzxxsByPzcode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pzcode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgGzfpzxx[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgGzfpzxx[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hzfc.soar.zfbz.gzf.websupport.TpgGzfpzxx[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String sendSms4Query(java.lang.String[] nameAndPhoneNo, java.lang.String content, java.lang.String userId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "sendSms4Query"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nameAndPhoneNo, content, userId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String findHfdataByHfrq(java.lang.String hfrq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findHfdataByHfrq"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {hfrq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx[] findTpgRyxxsByRycode(java.lang.Long sqrcode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findTpgRyxxsByRycode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sqrcode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hzfc.soar.zfbz.gzf.websupport.TpgGzfpzxx[] findZfbzGzfpzxxs(java.lang.String xqName, java.lang.Integer pageNo, java.lang.Integer pageSize) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findZfbzGzfpzxxs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {xqName, pageNo, pageSize});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgGzfpzxx[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgGzfpzxx[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hzfc.soar.zfbz.gzf.websupport.TpgGzfpzxx[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hzfc.soar.zfbz.gzf.websupport.TpgrRygx[] findTpgrRygxByRycode(java.lang.Long sqrcode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findTpgrRygxByRycode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sqrcode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgrRygx[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgrRygx[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hzfc.soar.zfbz.gzf.websupport.TpgrRygx[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hzfc.soar.zfbz.gzf.websupport.TpgZjkfmx findZjkfmxUpKfcgsjByPzcode(java.lang.Long pzcode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findZjkfmxUpKfcgsjByPzcode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pzcode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgZjkfmx) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgZjkfmx) org.apache.axis.utils.JavaUtils.convert(_resp, com.hzfc.soar.zfbz.gzf.websupport.TpgZjkfmx.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hzfc.soar.zfbz.gzf.websupport.TpgZjkfmx[] findZfbzZjkfmxs(java.lang.String xqName, java.util.Calendar kfsj, java.lang.Integer kfzt, java.lang.Integer pageNo, java.lang.Integer pageSize) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findZfbzZjkfmxs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {xqName, kfsj, kfzt, pageNo, pageSize});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgZjkfmx[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgZjkfmx[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hzfc.soar.zfbz.gzf.websupport.TpgZjkfmx[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hzfc.soar.zfbz.gzf.websupport.MapContent verifyHth(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "verifyHth"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, arg3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hzfc.soar.zfbz.gzf.websupport.MapContent) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hzfc.soar.zfbz.gzf.websupport.MapContent) org.apache.axis.utils.JavaUtils.convert(_resp, com.hzfc.soar.zfbz.gzf.websupport.MapContent.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hzfc.soar.zfbz.gzf.websupport.TpgJtxx[] findZfbzJtxxs(java.lang.String xqName, java.lang.Integer pageNo, java.lang.Integer pageSize) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "findZfbzJtxxs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {xqName, pageNo, pageSize});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgJtxx[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hzfc.soar.zfbz.gzf.websupport.TpgJtxx[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hzfc.soar.zfbz.gzf.websupport.TpgJtxx[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
