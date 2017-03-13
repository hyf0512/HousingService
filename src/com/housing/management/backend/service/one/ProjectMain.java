package com.housing.management.backend.service.one;

import java.net.URL;

public class ProjectMain {

	public static void main(String[] args) {

		/**
		 * MD5测试: 008310107420099 这个是新移动支付注册:测试的商户号   008310107630044
		 * 这个是Md5用例 商户在二期平台测试用例   
		 * 第一个参数是：测试商户号: 第三个参数是对应 MD5key：（如果测试不稳定，那就试试下面生产的方法）
		 */

		String result = SunMd5.TextRegister("008330173420000", "0083150027",
				"1234567890");
		System.out.print("result+"+result+"\n");

		/**  
		 * MD5生产: 008310107420054 这个是新移动支付注册:生产的商户号 
		 * 这个是Md5用例 商户在二期平台生产用例
		 * 第一个参数是：生产商户号: 第三个参数是 MD5key： 生产与测试的主要区别在于访问的路由不同。
		 */

		/* String resultsecond = SunMd5.allinpayRegister("008310107420054",
		 "119485157", "1234567890");
		 System.out.print(resultsecond);*/


	}

}
