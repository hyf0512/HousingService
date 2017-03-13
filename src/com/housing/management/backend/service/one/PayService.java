package com.housing.management.backend.service.one;

import org.springframework.stereotype.Service;

import com.allinpay.ets.client.SecurityUtil;
import com.housing.management.backend.domain.PayMessage;

@Service
public class PayService {

	public PayMessage Setpaymessage(PayMessage paymessage){
		com.allinpay.ets.client.RequestOrder requestOrder = new com.allinpay.ets.client.RequestOrder();
		String getext1 = SunMd5.allinpayRegister("008330173420000", paymessage.getFcznm(),"1234567890");
		//System.out.print("result+"+getext1+"\n");
		paymessage.setExt1("<USER>"+getext1+"</USER>");
		paymessage.setInputCharset("1");
		paymessage.setVersion("v1.0");
		paymessage.setLanguage("1");
		paymessage.setSignType("0");
		paymessage.setMerchantId("008330173420000");
		paymessage.setOrderCurrency("0");
		//paymessage.setOrderExpireDatetime("60");
		//paymessage.setProductName("白蚁防治");
		//paymessage.setProductDesc("白蚁防治费用");
		paymessage.setPayType("33");
		//paymessage.setTradeNature("SERVICES");
		paymessage.setPayerName("");
		paymessage.setPayerTelephone("");
		paymessage.setKey("1234567890");
		paymessage.setPickupUrl("http://60.191.13.120:8081/HousingService/api/payresult/result/massage");
		paymessage.setReceiveUrl("http://60.191.13.120:8081/HousingService/api/payresult/result/massage");
		String key=paymessage.getKey();
		String version=paymessage.getVersion();
		String language=paymessage.getLanguage();
		String inputCharset= paymessage.getInputCharset();
		String merchantId=paymessage.getMerchantId();
		String pickupUrl=paymessage.getPickupUrl();
		String receiveUrl=paymessage.getReceiveUrl();
		String payType=paymessage.getPayType();
		String signType=paymessage.getSignType();
		String orderNo=paymessage.getOrderNo();
		String orderAmount=paymessage.getOrderAmount();
		String orderDatetime=paymessage.getOrderDatetime();
		String orderCurrency=paymessage.getOrderCurrency();
		String orderExpireDatetime=paymessage.getOrderExpireDatetime();
		String payerTelephone=paymessage.getPayerTelephone();
		String payerEmail=paymessage.getPayerEmail();
		String payerName=paymessage.getPayerName();
		String payerIDCard=paymessage.getPayerIDCard();
		String pid=paymessage.getPid();
		String productName=paymessage.getProductName();
		String productId=paymessage.getProductId();
		String productNum=paymessage.getProductNum();
		String productPrice=paymessage.getProductPrice();
		String productDesc=paymessage.getProductDesc();
		String ext1=paymessage.getExt1();
		String ext2=paymessage.getExt2();
		String extTL=paymessage.getExtTL();//通联商户拓展业务字段，在v2.2.0版本之后才使用到的，用于开通分账等业务
		String issuerId=paymessage.getIssuerId();
		String pan=paymessage.getPan();
		String tradeNature = paymessage.getTradeNature();
		if(null!=payerIDCard&&!"".equals(payerIDCard)){
			try{
				//out.println("1aaaa");
				//payerIDCard = SecurityUtil.encryptByPublicKey("C:\\TLCert.cer", payerIDCard);
				payerIDCard = SecurityUtil.encryptByPublicKey("TLCert.cer", payerIDCard);
				//out.println(payerIDCard);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		if(null!=pan&&!"".equals(pan)){
			try{
				pan = SecurityUtil.encryptByPublicKey("TLCert.cer", pan);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		//构造订单请求对象，生成signMsg。
		//com.allinpay.ets.client.RequestOrder requestOrder = new com.allinpay.ets.client.RequestOrder();
		if(null!=inputCharset&&!"".equals(inputCharset)){
			requestOrder.setInputCharset(Integer.parseInt(inputCharset));
		}
		requestOrder.setPickupUrl(pickupUrl);
		requestOrder.setReceiveUrl(receiveUrl);
		requestOrder.setVersion(version);
		if(null!=language&&!"".equals(language)){
			requestOrder.setLanguage(Integer.parseInt(language));
		}
		requestOrder.setSignType(Integer.parseInt(signType));
		requestOrder.setPayType(Integer.parseInt(payType));
		requestOrder.setIssuerId(issuerId);
		requestOrder.setMerchantId(merchantId);
		requestOrder.setPayerName(payerName);
		requestOrder.setPayerEmail(payerEmail);
		requestOrder.setPayerTelephone(payerTelephone);
		requestOrder.setPayerIDCard(payerIDCard);
		requestOrder.setPid(pid);
		requestOrder.setOrderNo(orderNo);
		requestOrder.setOrderAmount(Long.parseLong(orderAmount));
		requestOrder.setOrderCurrency(orderCurrency);
		requestOrder.setOrderDatetime(orderDatetime);
		requestOrder.setOrderExpireDatetime(orderExpireDatetime);
		requestOrder.setProductName(productName);
		if(null!=productPrice&&!"".equals(productPrice)){
			requestOrder.setProductPrice(Long.parseLong(productPrice));
		}
		if(null!=productNum&&!"".equals(productNum)){
			requestOrder.setProductNum(Integer.parseInt(productNum));
		}	
		requestOrder.setProductId(productId);
		requestOrder.setProductDesc(productDesc);
		requestOrder.setExt1(ext1);
		requestOrder.setExt2(ext2);
		requestOrder.setExtTL(extTL);//通联商户拓展业务字段，在v2.2.0版本之后才使用到的，用于开通分账等业务
		requestOrder.setPan(pan);
		requestOrder.setTradeNature(tradeNature);
		requestOrder.setKey(key); //key为MD5密钥，密钥是在通联支付网关会员服务网站上设置。

		//String strSrcMsg = requestOrder.getSrc(); // 此方法用于debug，测试通过后可注释。
		String strSignMsg = requestOrder.doSign(); // 签名，设为signMsg字段值。
		paymessage.setStrSignMsg(strSignMsg);
		return paymessage;
	}
}
