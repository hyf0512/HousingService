package com.housing.management.backend.service.three;

import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.protocol.Protocol;

import com.allinpay.ets.client.util.MySecureProtocolSocketFactory;
import com.housing.management.backend.domain.Refund;

public class RefundService {
	public void PayrefundService(String orderNo,String refundAmount,String orderDatetime) throws Exception{
		Refund refund = new Refund();
		String listenUrl="http://ceshi.allinpay.com/gateway/index.do";
		String key = "1234567890";
		String version = "v1.3";
		String merchantId = "100020091218001";
		String signType = "0";
		com.allinpay.ets.client.RequestOrder requestOrder = new com.allinpay.ets.client.RequestOrder();
		requestOrder.setVersion(version);
		requestOrder.setSignType(Integer.parseInt(signType));
		requestOrder.setMerchantId(merchantId);
		requestOrder.setOrderNo(orderNo);
		requestOrder.setRefundAmount(Long.parseLong(refundAmount));
		requestOrder.setOrderDatetime(orderDatetime);
		requestOrder.setKey(key); //key为MD5密钥，密钥是在通联支付网关会员服务网站上设置。
		String srcMsg = requestOrder.getSrc(); // 此方法用于debug，测试通过后可注释。
		String signMsg = requestOrder.doSign(); // 签名，设为signMsg字段值。
		PostMethod postMethod = null;
		Map map = new HashMap();
		try{
		Protocol myhttps = new Protocol("https",new MySecureProtocolSocketFactory(), 443);
		Protocol.registerProtocol("https", myhttps);
		HttpClient httpclient = new HttpClient();
		postMethod = new PostMethod(listenUrl);
		NameValuePair[] datas = {
				new NameValuePair("merchantId", merchantId),
				new NameValuePair("version", version),
				new NameValuePair("signType", signType),
				new NameValuePair("orderNo", orderNo),
				new NameValuePair("orderDatetime", orderDatetime),
				new NameValuePair("refundAmount", refundAmount),
				new NameValuePair("signMsg", signMsg) };
		postMethod.setRequestBody(datas);		
		int responseCode = httpclient.executeMethod(postMethod);		
		// 取得查询交易结果
		if (responseCode == HttpURLConnection.HTTP_OK) {
			String trxXML = postMethod.getResponseBodyAsString();
			String[] msg =trxXML.split("&");
			String [] paramPair=null;
			for(int i=0;i<msg.length;i++){
				paramPair=msg[i].split("=");
	        	map.put(paramPair[0], paramPair[1]); 
	        	System.out.println(paramPair[0]+":"+map.get(paramPair[0]));
			}					
		}	
		}catch(Exception e){
		System.out.println(e);
		}		
		//验签是商户为了验证接收到的报文数据确实是支付网关发送的。
		//构造订单结果对象，验证签名。
		com.allinpay.ets.client.PaymentResult paymentResult = new com.allinpay.ets.client.PaymentResult();
		if("".equals(map.get("ERRORCODE"))||null==map.get("ERRORCODE")){
		//如果errorCode为空，说明返回正确退款报文信息，接下来对报文进行解析验签
		paymentResult.setMerchantId(map.get("merchantId").toString());
		paymentResult.setVersion(map.get("version").toString());
		paymentResult.setSignType(map.get("signType").toString());
		paymentResult.setOrderNo(map.get("orderNo").toString());
		paymentResult.setOrderDatetime(map.get("orderDatetime").toString());
		paymentResult.setOrderAmount(map.get("orderAmount").toString());
		paymentResult.setErrorCode(null==map.get("errorCode")?"":map.get("errorCode").toString());
		paymentResult.setRefundAmount(map.get("refundAmount").toString());
		paymentResult.setRefundDatetime(map.get("refundDatetime").toString());
		paymentResult.setRefundResult(map.get("refundResult").toString());
		paymentResult.setReturnDatetime(map.get("returnDatetime").toString());
		//signMsg为服务器端返回的签名值。
		paymentResult.setSignMsg(map.get("signMsg").toString()); 
		paymentResult.setKey(key);
		//验证签名：返回true代表验签成功；否则验签失败。
		boolean verifyResult = paymentResult.verify();
		
		if(verifyResult){
			System.out.println("退款成功");
		}
		else{
			System.out.println("返回结果验签失败");
		}
		}else{
			//否则返回异常信息errorCode和errorMsg
			String errorCode = map.get("ERRORCODE").toString();
			String errorMsg = new String(map.get("ERRORMSG").toString().getBytes("iso8859-1"),"utf-8");
			System.out.println(errorMsg);
		}
		//return refund;
	}
}
