package com.housing.management.backend.service.one;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Random;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.housing.management.backend.rest.SendMessageRestService;

@Service
public class SendMessageService {
	private static final Logger logger = Logger.getLogger(SendMessageService.class);

	/**
	 * 咨询服务发送验证码接口
	 * 
	 * @param phone
	 * @return 
	 */
	public String sendmessage(String phone) {
		String yzm = "";
		Random random = new Random();
		for(int i=0;i<6;i++){
			yzm+=random.nextInt(10);
		}
		System.out.println(yzm);
		String smsmsg = "您正在登陆住保房管网房管业务咨询投诉栏目，手机验证码为："+ yzm + "，请及时操作相关业务。";
		String smsnumber="999";
		String smsplantime="";
		String smspriority="0";
		String smsaccount="验证码";
		Connection conn = null; 
		CallableStatement cstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@192.168.200.72:1521:soarweb";
			String user = "SMS";
			String password = "sms_2013";
			conn = DriverManager.getConnection(dburl, user, password);
			cstmt=conn.prepareCall("{call PROC_SEND_SMS(?,?,?,?,?,?,?)}");
			cstmt.setString(1, phone);
			cstmt.setString(2, smsmsg);
			cstmt.setString(3, smsnumber);
			cstmt.setString(4, smsplantime);
			cstmt.setString(5, smspriority);
			cstmt.setString(6, smsaccount);
			cstmt.registerOutParameter(7, Types.INTEGER);
			cstmt.execute();
			int smssendreturn = cstmt.getInt(7);
		} catch (Exception e) {
			logger.error(phone + "获取验证码发生异常。");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return yzm;
		
	}
	
}

