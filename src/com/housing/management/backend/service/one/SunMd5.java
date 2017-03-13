package com.housing.management.backend.service.one;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.json.JSONException;
import org.json.JSONObject;

public class SunMd5 {
	//第一，二个路由是：一期测试跟一期生产   第三，四个路由是二期生产与测试路由（公私密钥的方式注册）
	public static String url_text="http://ceshi.allinpay.com/usercenter/merchant/UserInfo/reg.do";
	public static String url_real="https://service.allinpay.com/usercenter/merchant/UserInfo/reg.do";
	public static String url_real_second = "https://cashier.allinpay.com/usercenter/merchant/UserInfo/reg.do";
	public static String url_test_second = "http://192.168.103.39/usercenter/merchant/UserInfo/reg.do";

	//这两个路由是二期 MD5的方式注册路由 ，生产与测试
	public static String Url_Product = "https://service.allinpay.com/usercenter/merchant/UserInfo/reg.do";
	public static String Url_Test = "http://192.168.103.39/usercenter/merchant/UserInfo/reg.do";

	public final static String signType = "0";// Md5 在这个地方要修改成0
	public static String merchantId = "008310107420054";
	public static String partnerUserId = "008310107420024";
	public static String signMsg = "";
	public static String key = "1234567890";

	// 原串 的首尾要加上 & & 这个很重要
	public static String getSignSrc() {
		String result = "";
		result = "&signType=" + signType + "&merchantId=" + merchantId
				+ "&partnerUserId=" + partnerUserId + "&key=" + key + "&";
		return result;
	}

	// 通过Md5获得源串
	public static String getSignSrcAndSignMsg() {
		String result = "";
		result = "signType=" + signType + "&merchantId=" + merchantId
				+ "&partnerUserId=" + partnerUserId + "&signMsg=" + signMsg
				+ "";
		return result;
	}

	public static void loadMd5() throws Exception {
		String result = "";
		String src = getSignSrc();
		signMsg = md5(src).toUpperCase().trim();
		result = getSignSrcAndSignMsg();
		// System.out.print(result);
		String callBack = HttpRequest.sendGet(Url_Product, result);
		System.out.print(callBack + "\n");

		String userid = getUserIdByJson(callBack);// HttpJSONTest.getUserIdFromJson(callBack);
		System.out.print(userid);
	}

	// 输入三个必填参数
	public static String allinpayRegister(String merchantId,
			String partnerUserId, String key) {
		SunMd5.merchantId = merchantId;
		SunMd5.partnerUserId = partnerUserId;
		SunMd5.key = key;
		String result = "";
		String src = getSignSrc();
		signMsg = md5(src).toUpperCase().trim();
		result = getSignSrcAndSignMsg();
		System.out.print(result+"\n");
		String callBack = HttpRequest.sendGet(Url_Product, result);
		System.out.print("callBack="+callBack+"\n");
		result = getUserIdByJson(callBack);
		return result;
	}

	// 输入三个必填参数
	public static String TextRegister(String merchantId, String partnerUserId,
			String key) {
		SunMd5.merchantId = merchantId;
		SunMd5.partnerUserId = partnerUserId;
		SunMd5.key = key;
		String result = "";
		String src = getSignSrc();
		signMsg = md5(src).toUpperCase().trim();
		result = getSignSrcAndSignMsg();
		System.out.print(result+"\n");
		String callBack = HttpRequest.sendGet(Md5TestOuterIp, result);//  url_test_second
		System.out.print(callBack+"\n");
		result = getUserIdByJson(callBack);
		return result;
	}

	public static String getUserIdByJson(String return_msg) {
		String result = "";
		JSONObject object;
		try {
			object = new JSONObject(return_msg);
			result = object.optString("userId");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return result;

	}

	public static String md5(String string) {
		byte[] hash;
		try {
			hash = MessageDigest.getInstance("MD5").digest(
					string.getBytes("UTF-8"));
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("Huh, MD5 should be supported?", e);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException("Huh, UTF-8 should be supported?", e);
		}

		return hexString(hash);
	}

	public static final String hexString(byte[] bytes) {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < bytes.length; i++) {
			buffer.append(hexString(bytes[i]));
		}
		return buffer.toString();
	}

	public static final String hexString(byte byte0) {
		char ac[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A',
				'B', 'C', 'D', 'E', 'F' };
		char ac1[] = new char[2];
		ac1[0] = ac[byte0 >>> 4 & 0xf];
		ac1[1] = ac[byte0 & 0xf];
		String s = new String(ac1);
		return s;
	}
	

	private static String Md5TestOuterIp="https://cashier.allinpay.com/usercenter/merchant/UserInfo/reg.do";
}
