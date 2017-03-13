package com.housing.management.backend.service.three;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.housing.management.backend.dao.ByfzDAO;
import com.housing.management.backend.domain.PayResult;

@Service
public class PayResultService {
	@Autowired
	private ByfzDAO byfzdao;
	public PayResult getresult(String trxXML){
		PayResult payresult = new PayResult();
		String json="";
		//String trxXML="payAmount=200&payDatetime=20160318153517&signType=1&returnDatetime=20160318153517&paymentOrderId=201603181535120283&version=v1.0&issuerId=&orderNo=NO20160318153457&payResult=1&ext1=123&ext2=123&orderAmount=200&signMsg=CaMsrIRzFXriw0ziqxHo06TuvPN1g2Pmiil74CPxAiwOeZX94FKM%2F8z8cOjwMWxTJjbM08sIiVfqC0KoglnPLaJtJoVV4Rlz4khRGENcxmJaeUrmU58%2Bzk7gzWT%2BCxJJuG4CbRr2DKdo6zx7OrHBubZ7tlAPqq0bKuKsePgWREM%3D&errorCode=&payType=0&merchantId=100020091218001&language=1&orderDatetime=20160318153457";
		String[] msg =trxXML.split("&");
		String [] paramPair=null;
		for(int i=0;i<msg.length;i++){
			paramPair=msg[i].split("=");
        	//map.put(paramPair[0], paramPair[1]);
			if(paramPair.length==1)
			{
				if(i==msg.length-1){
					json=json+paramPair[0]+":"+ "\""+"\""+"";
				}
				else{
					json=json+paramPair[0]+":"+ "\""+"\""+""+",";
				}
				
			}
			else{
				if(i==msg.length-1){
					json=json+paramPair[0]+":"+ "\""+paramPair[1]+"\"";
				}
				else{
					json=json+paramPair[0]+":"+ "\""+paramPair[1]+"\""+",";
				}
			}
        	
		}
		//System.out.println(json);
		json="{"+json+"}";
		JSONObject json1 = JSONObject.fromObject(json);
		System.out.println(json1.getString("payAmount"));
		//request.setCharacterEncoding("UTF-8");
		
		String merchantId=json1.getString("merchantId");
		String version=json1.getString("version");
		String language=json1.getString("language");
		String signType=json1.getString("signType");
		String payType=json1.getString("payType");
		String issuerId=json1.getString("issuerId");
		String paymentOrderId=json1.getString("paymentOrderId");
		String orderNo=json1.getString("orderNo");
		String orderDatetime=json1.getString("orderDatetime");
		String orderAmount=json1.getString("orderAmount");
		String payDatetime=json1.getString("payDatetime");
		String payAmount=json1.getString("payAmount");
		String ext1=json1.getString("ext1");
		String ext2=json1.getString("ext2");
		String payResult=json1.getString("payResult");
		String errorCode=json1.getString("errorCode");
		String returnDatetime=json1.getString("returnDatetime");
		String signMsg=json1.getString("signMsg");
	
		//验签是商户为了验证接收到的报文数据确实是支付网关发送的。
		//构造订单结果对象，验证签名。
		com.allinpay.ets.client.PaymentResult paymentResult = new com.allinpay.ets.client.PaymentResult();
		paymentResult.setMerchantId(merchantId);
		paymentResult.setVersion(version);
		paymentResult.setLanguage(language);
		paymentResult.setSignType(signType);
		paymentResult.setPayType(payType);
		paymentResult.setIssuerId(issuerId);
		paymentResult.setPaymentOrderId(paymentOrderId);
		paymentResult.setOrderNo(orderNo);
		paymentResult.setOrderDatetime(orderDatetime);
		paymentResult.setOrderAmount(orderAmount);
		paymentResult.setPayDatetime(payDatetime);
		paymentResult.setPayAmount(payAmount);
		paymentResult.setExt1(ext1);
		paymentResult.setExt2(ext2);
		paymentResult.setPayResult(payResult);
		paymentResult.setErrorCode(errorCode);
		paymentResult.setReturnDatetime(returnDatetime);
		
		//signMsg为服务器端返回的签名值。
		paymentResult.setSignMsg(signMsg); 
		//signType为"1"时，必须设置证书路径。
		//paymentResult.setCertPath("D:\\Program Files/Apache Software Foundation/Tomcat 7.0/webapps/HousingService/lib/TLCert-test.cer"); 
		
		//验证签名：返回true代表验签成功；否则验签失败。
		//boolean verifyResult = paymentResult.verify();
		
		//验签成功，还需要判断订单状态，为"1"表示支付成功。
		boolean paySuccess =  payResult.equals("1");
		//payresult = byfzdao.searchresult(orderNo);
		payresult.setIfsuccess(paySuccess);
		payresult.setMerchantId(merchantId);
		payresult.setVersion(version);
		payresult.setLanguage(language);
		payresult.setSignType(signType);
		payresult.setPayType(payType);
		payresult.setIssuerId(issuerId);
		payresult.setPaymentOrderId(paymentOrderId);
		payresult.setOrderNo(orderNo);
		payresult.setOrderDatetime(orderDatetime);
		payresult.setOrderAmount(orderAmount);
		payresult.setExt1(ext1);
		payresult.setExt2(ext2);
		payresult.setPayResult(payResult);
		payresult.setErrorCode(errorCode);
		payresult.setReturnDatetime(returnDatetime);
		payresult.setPayAmount(payAmount);
		if(paySuccess){
			byfzdao.insertresult(payresult);
			byfzdao.updatepay(payresult);
		}
		return payresult;
	}
}
