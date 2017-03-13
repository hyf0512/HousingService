package com.housing.management.backend.domain;

public class PayMessage extends BaseObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8796247233099141354L;
	private String key;//用于计算signMsg的key值
	private String version;//版本号
	private String language;//语言
	private String inputCharset;//字符集
	private String merchantId;//商户号
	private String pickupUrl;//取货地址
	private String receiveUrl;//商户系统通知地址
	private String payType;//支付方式
	private String signType;//签名类型
	private String orderNo;//商户系统订单号
	private String orderAmount;//订单金额
	private String orderDatetime;//用户订单提交时间
	private String orderCurrency;//订单金额币种类型
	private String orderExpireDatetime;//订单过期时间
	private String payerTelephone;//付款人电话
	private String payerEmail;//付款人email
	private String payerName;//付款人姓名
	private String payerIDCard;//付款人证件号
	private String pid;//合作伙伴商户号
	private String productName;//商品名称
	private String productId;//商品标识
	private String productNum;//商品数量
	private String productPrice;//商品单价
	private String productDesc;//商品描述
	private String ext1;//扩展字段1
	private String ext2;//扩展字段2
	private String extTL;//业务扩展字段
	private String issuerId;//发卡方代码
	private String pan;//付款人支付卡号
	private String tradeNature;//贸易类型
	private String strSignMsg;//签名
	private String fcznm;//房产证内码
	public void setFcznm(String fcznm){
		this.fcznm = fcznm;
	}
	public String getFcznm(){
		return fcznm;
	}
	public void setStrSignMsg(String strSignMsg){
		this.strSignMsg = strSignMsg;
	}
	public String getStrSignMsg(){
		return strSignMsg;
	}
	public void setTradeNature(String tradeNature){
		this.tradeNature = tradeNature;
	}
	public String getTradeNature(){
		return tradeNature;
	}
	public void setPan(String pan){
		this.pan = pan;
	}
	public String getPan(){
		return pan;
	}
	public void setIssuerId(String issuerId){
		this.issuerId = issuerId;
	}
	public String getIssuerId(){
		return issuerId;
	}
	public void setExtTL(String extTL){
		this.extTL = extTL;
	}
	public String getExtTL(){
		return extTL;
	}
	public void setExt2(String ext2){
		this.ext2 = ext2;
	}
	public String getExt2(){
		return ext2;
	}
	public void setExt1(String ext1){
		this.ext1 = ext1;
	}
	public String getExt1(){
		return ext1;
	}
	public void setProductDesc(String productDesc){
		this.productDesc = productDesc;
	}
	public String getProductDesc(){
		return productDesc;
	}
	public void setProductPrice(String productPrice){
		this.productPrice = productPrice;
	}
	public String getProductPrice(){
		return productPrice;
	}
	public void setProductNum(String productNum){
		this.productNum = productNum;
	}
	public String getProductNum(){
		return productNum;
	}
	public void setProductId(String productId){
		this.productId = productId;
	}
	public String getProductId(){
		return productId;
	}
	public void setProductName(String productName){
		this.productName = productName;
	}
	public String getProductName(){
		return productName;
	}
	public void setPid(String pid){
		this.pid = pid;
	}
	public String getPid(){
		return pid;
	}
	public void setPayerIDCard(String payerIDCard){
		this.payerIDCard = payerIDCard;
	}
	public String getPayerIDCard(){
		return payerIDCard;
	}
	public void setPayerName(String payerName){
		this.payerName = payerName;
	}
	public String getPayerName(){
		return payerName;
	}
	public void setPayerEmail(String payerEmail){
		this.payerEmail = payerEmail;
	}
	public String getPayerEmail(){
		return payerEmail;
	}
	public void setPayerTelephone(String payerTelephone){
		this.payerTelephone = payerTelephone;
	}
	public String getPayerTelephone(){
		return payerTelephone;
	}
	public void setOrderExpireDatetime(String orderExpireDatetime){
		this.orderExpireDatetime = orderExpireDatetime;
	}
	public String getOrderExpireDatetime(){
		return orderExpireDatetime;
	}
	public void setOrderCurrency(String orderCurrency){
		this.orderCurrency = orderCurrency;
	}
	public String getOrderCurrency(){
		return orderCurrency;
	}
	public void setOrderDatetime(String orderDatetime){
		this.orderDatetime = orderDatetime;
	}
	public String getOrderDatetime(){
		return orderDatetime;
	}
	public void setOrderAmount(String orderAmount){
		this.orderAmount = orderAmount;
	}
	public String getOrderAmount(){
		return orderAmount;
	}
	public void setOrderNo(String orderNo){
		this.orderNo = orderNo;
	}
	public String getOrderNo(){
		return orderNo;
	}
	public void setSignType(String signType){
		this.signType = signType;
	}
	public String getSignType(){
		return signType;
	}
	public void setPayType(String payType){
		this.payType = payType;
	}
	public String getPayType(){
		return payType;
	}
	public void setReceiveUrl(String receiveUrl){
		this.receiveUrl = receiveUrl;
	}
	public String getReceiveUrl(){
		return receiveUrl;
	}
	public void setPickupUrl(String pickupUrl){
		this.pickupUrl = pickupUrl;
	}
	public String getPickupUrl(){
		return pickupUrl;
	}
	public void setMerchantId(String merchantId){
		this.merchantId = merchantId;
	}
	public String getMerchantId(){
		return merchantId;
	}
	public void setInputCharset(String inputCharset){
		this.inputCharset = inputCharset;
	}
	public String getInputCharset(){
		return inputCharset;
	}
	public void setLanguage(String language){
		this.language = language;
	}
	public String getLanguage(){
		return language;
	}
	public void setVersion(String version){
		this.version = version;
	}
	public String getVersion(){
		return version;
	}
	public void setKey(String key){
		this.key = key;
	}
	public String getKey(){
		return key;
	}
}
