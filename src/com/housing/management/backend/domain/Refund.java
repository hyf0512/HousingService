package com.housing.management.backend.domain;

public class Refund extends BaseObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1434491055371985903L;
	private String merchantId;
	private String version;
	private String signType;
	private String orderNo;
	private String orderAmount;
	private String orderDatetime;
	private String refundAmount;
	private String refundDatetime;
	private String refundResult;//20代表成功
	private String mchtRefundOrderNo;
	private String returnDatetime;
	private String signMsg;
	public void setSignMsg(String signMsg){
		this.signMsg = signMsg;
	}
	public String getSignMsg(){
		return signMsg;
	}
	public void setReturnDatetime(String returnDatetime){
		this.returnDatetime = returnDatetime;
	}
	public String getReturnDatetime(){
		return returnDatetime;
	}
	public void setMchtRefundOrderNo(String mchtRefundOrderNo){
		this.mchtRefundOrderNo = mchtRefundOrderNo;
	}
	public String getMchtRefundOrderNo(){
		return mchtRefundOrderNo;
	}
	public void setRefundResult(String refundResult){
		this.refundResult = refundResult;
	}
	public String getRefundResult(){
		return refundResult;
	}
	public void setRefundDatetime(String refundDatetime){
		this.refundDatetime = refundDatetime;
	}
	public String getrefundDatetime(){
		return refundDatetime;
	}
	public void setRefundAmount(String refundAmount){
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount(){
		return refundAmount;
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
	public void setVersion(String version){
		this.version = version;
	}
	public String getVersion(){
		return version;
	}
	public void setMerchantId(String merchantId){
		this.merchantId = merchantId;
	}
	public String getMerchantId(){
		return merchantId;
	}
	
}
