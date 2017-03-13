
package com.hzfc.soar.zfbz.byfz.websupport;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hzfc.soar.zfbz.byfz.websupport package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _QueryForXfbyyfResponse_QNAME = new QName("http://soar.hzfc.com/byfzwebservice", "queryForXfbyyfResponse");
    private final static QName _SfblByyf_QNAME = new QName("http://soar.hzfc.com/byfzwebservice", "sfblByyf");
    private final static QName _QueryForJfbyfzResponse_QNAME = new QName("http://soar.hzfc.com/byfzwebservice", "queryForJfbyfzResponse");
    private final static QName _Sfbzqxn_QNAME = new QName("http://soar.hzfc.com/byfzwebservice", "sfbzqxn");
    private final static QName _QueryForJfbyfz_QNAME = new QName("http://soar.hzfc.com/byfzwebservice", "queryForJfbyfz");
    private final static QName _SfblByyfResponse_QNAME = new QName("http://soar.hzfc.com/byfzwebservice", "sfblByyfResponse");
    private final static QName _GetBymzyfBzqxResponse_QNAME = new QName("http://soar.hzfc.com/byfzwebservice", "getBymzyfBzqxResponse");
    private final static QName _QueryForXfbyyf_QNAME = new QName("http://soar.hzfc.com/byfzwebservice", "queryForXfbyyf");
    private final static QName _CheckForAccept_QNAME = new QName("http://soar.hzfc.com/byfzwebservice", "checkForAccept");
    private final static QName _CheckForAcceptResponse_QNAME = new QName("http://soar.hzfc.com/byfzwebservice", "checkForAcceptResponse");
    private final static QName _SfbzqxnResponse_QNAME = new QName("http://soar.hzfc.com/byfzwebservice", "sfbzqxnResponse");
    private final static QName _GetBymzyfBzqx_QNAME = new QName("http://soar.hzfc.com/byfzwebservice", "getBymzyfBzqx");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hzfc.soar.zfbz.byfz.websupport
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SfbzqxnResponse }
     * 
     */
    public SfbzqxnResponse createSfbzqxnResponse() {
        return new SfbzqxnResponse();
    }

    /**
     * Create an instance of {@link CheckForAcceptResponse }
     * 
     */
    public CheckForAcceptResponse createCheckForAcceptResponse() {
        return new CheckForAcceptResponse();
    }

    /**
     * Create an instance of {@link CheckForAccept }
     * 
     */
    public CheckForAccept createCheckForAccept() {
        return new CheckForAccept();
    }

    /**
     * Create an instance of {@link GetBymzyfBzqx }
     * 
     */
    public GetBymzyfBzqx createGetBymzyfBzqx() {
        return new GetBymzyfBzqx();
    }

    /**
     * Create an instance of {@link Sfbzqxn }
     * 
     */
    public Sfbzqxn createSfbzqxn() {
        return new Sfbzqxn();
    }

    /**
     * Create an instance of {@link QueryForJfbyfzResponse }
     * 
     */
    public QueryForJfbyfzResponse createQueryForJfbyfzResponse() {
        return new QueryForJfbyfzResponse();
    }

    /**
     * Create an instance of {@link SfblByyf }
     * 
     */
    public SfblByyf createSfblByyf() {
        return new SfblByyf();
    }

    /**
     * Create an instance of {@link QueryForXfbyyfResponse }
     * 
     */
    public QueryForXfbyyfResponse createQueryForXfbyyfResponse() {
        return new QueryForXfbyyfResponse();
    }

    /**
     * Create an instance of {@link QueryForXfbyyf }
     * 
     */
    public QueryForXfbyyf createQueryForXfbyyf() {
        return new QueryForXfbyyf();
    }

    /**
     * Create an instance of {@link GetBymzyfBzqxResponse }
     * 
     */
    public GetBymzyfBzqxResponse createGetBymzyfBzqxResponse() {
        return new GetBymzyfBzqxResponse();
    }

    /**
     * Create an instance of {@link SfblByyfResponse }
     * 
     */
    public SfblByyfResponse createSfblByyfResponse() {
        return new SfblByyfResponse();
    }

    /**
     * Create an instance of {@link QueryForJfbyfz }
     * 
     */
    public QueryForJfbyfz createQueryForJfbyfz() {
        return new QueryForJfbyfz();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryForXfbyyfResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soar.hzfc.com/byfzwebservice", name = "queryForXfbyyfResponse")
    public JAXBElement<QueryForXfbyyfResponse> createQueryForXfbyyfResponse(QueryForXfbyyfResponse value) {
        return new JAXBElement<QueryForXfbyyfResponse>(_QueryForXfbyyfResponse_QNAME, QueryForXfbyyfResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SfblByyf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soar.hzfc.com/byfzwebservice", name = "sfblByyf")
    public JAXBElement<SfblByyf> createSfblByyf(SfblByyf value) {
        return new JAXBElement<SfblByyf>(_SfblByyf_QNAME, SfblByyf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryForJfbyfzResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soar.hzfc.com/byfzwebservice", name = "queryForJfbyfzResponse")
    public JAXBElement<QueryForJfbyfzResponse> createQueryForJfbyfzResponse(QueryForJfbyfzResponse value) {
        return new JAXBElement<QueryForJfbyfzResponse>(_QueryForJfbyfzResponse_QNAME, QueryForJfbyfzResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sfbzqxn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soar.hzfc.com/byfzwebservice", name = "sfbzqxn")
    public JAXBElement<Sfbzqxn> createSfbzqxn(Sfbzqxn value) {
        return new JAXBElement<Sfbzqxn>(_Sfbzqxn_QNAME, Sfbzqxn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryForJfbyfz }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soar.hzfc.com/byfzwebservice", name = "queryForJfbyfz")
    public JAXBElement<QueryForJfbyfz> createQueryForJfbyfz(QueryForJfbyfz value) {
        return new JAXBElement<QueryForJfbyfz>(_QueryForJfbyfz_QNAME, QueryForJfbyfz.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SfblByyfResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soar.hzfc.com/byfzwebservice", name = "sfblByyfResponse")
    public JAXBElement<SfblByyfResponse> createSfblByyfResponse(SfblByyfResponse value) {
        return new JAXBElement<SfblByyfResponse>(_SfblByyfResponse_QNAME, SfblByyfResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBymzyfBzqxResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soar.hzfc.com/byfzwebservice", name = "getBymzyfBzqxResponse")
    public JAXBElement<GetBymzyfBzqxResponse> createGetBymzyfBzqxResponse(GetBymzyfBzqxResponse value) {
        return new JAXBElement<GetBymzyfBzqxResponse>(_GetBymzyfBzqxResponse_QNAME, GetBymzyfBzqxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryForXfbyyf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soar.hzfc.com/byfzwebservice", name = "queryForXfbyyf")
    public JAXBElement<QueryForXfbyyf> createQueryForXfbyyf(QueryForXfbyyf value) {
        return new JAXBElement<QueryForXfbyyf>(_QueryForXfbyyf_QNAME, QueryForXfbyyf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckForAccept }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soar.hzfc.com/byfzwebservice", name = "checkForAccept")
    public JAXBElement<CheckForAccept> createCheckForAccept(CheckForAccept value) {
        return new JAXBElement<CheckForAccept>(_CheckForAccept_QNAME, CheckForAccept.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckForAcceptResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soar.hzfc.com/byfzwebservice", name = "checkForAcceptResponse")
    public JAXBElement<CheckForAcceptResponse> createCheckForAcceptResponse(CheckForAcceptResponse value) {
        return new JAXBElement<CheckForAcceptResponse>(_CheckForAcceptResponse_QNAME, CheckForAcceptResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SfbzqxnResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soar.hzfc.com/byfzwebservice", name = "sfbzqxnResponse")
    public JAXBElement<SfbzqxnResponse> createSfbzqxnResponse(SfbzqxnResponse value) {
        return new JAXBElement<SfbzqxnResponse>(_SfbzqxnResponse_QNAME, SfbzqxnResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBymzyfBzqx }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soar.hzfc.com/byfzwebservice", name = "getBymzyfBzqx")
    public JAXBElement<GetBymzyfBzqx> createGetBymzyfBzqx(GetBymzyfBzqx value) {
        return new JAXBElement<GetBymzyfBzqx>(_GetBymzyfBzqx_QNAME, GetBymzyfBzqx.class, null, value);
    }

}
