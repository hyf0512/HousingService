package com.housing.management.backend.ws;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.xml.security.utils.Base64;

import com.housing.management.backend.common.DESUtil;

public class MyHTTPAuthInterceptor extends AbstractPhaseInterceptor<Message> {
	
	public MyHTTPAuthInterceptor() {
		super(Phase.PRE_PROTOCOL);
		// TODO Auto-generated constructor stub
	}

	public void handleMessage(Message message) throws Fault {	
		 
		Map<String, List<?>> headers = (Map<String, List<?>>) message.get(Message.PROTOCOL_HEADERS);

		String address = (String)message.get(Message.ENDPOINT_ADDRESS);
		System.out.println(address);
		
		String authString ="";
		// 用户名和密码认证
		//authString =username + ":"+desUtil.decrypt(password);
		try {
			DESUtil desUtil = new DESUtil();

		} catch (Exception e) {
			e.printStackTrace();
		}

	    headers.put("Authorization", Collections.singletonList("Basic " + new String(Base64.encode(authString.getBytes()))));
	 }
}
