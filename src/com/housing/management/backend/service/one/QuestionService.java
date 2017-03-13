package com.housing.management.backend.service.one;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.housing.management.backend.dao.EmailDAO;
import com.housing.management.backend.domain.EmailUser;
import com.sun.org.apache.bcel.internal.generic.Type;

@Service
public class QuestionService {
	
	@Autowired
	private EmailDAO emailDAO;
	/**
	 * 咨询服务接口
	 * 
	 * @param subject
	 * @param kindID
	 * @param name
	 * @param phonenumber
	 * @param fax
	 * @param emailaddress
	 * @param postal
	 * @param address
	 * @param msgBody
	 * @param userIP
	 * @return 
	 * @throws ClassNotFoundException 
	 */
	public EmailUser question(EmailUser emailUser) throws ClassNotFoundException{
		emailUser.setEmailkindID(51101);
	
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String sendtime = dateFormat.format(now);
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy");
		String year = dateFormat1.format(now);
		emailUser.setEmailtime(sendtime);
		emailUser.setReplyweb(1);
//		emailUser.setReplyemail(emailaddress);
		StringBuffer email_pwd1 = new StringBuffer();
		String randString = "0123456789abcdefghigklmnopqrstuvwxyz";
		Random random = new Random();
		for(int i=0;i<6;i++){
			int number =random.nextInt(randString.length());
			email_pwd1.append(randString.charAt(number));
		}
		String email_pwd=email_pwd1.toString();
		//String email_pwd = String.valueOf(randString.charAt(6));
		emailUser.setEmailpwd(email_pwd);
//		emailUser.setVisitorIP(userIP);
		String emailno = "ZXTS"+year+"-";
//		EmailDAO emaildao = null;
		
		try {
			Connection conn = null; 
			CallableStatement cstmt = null;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@192.168.200.72:1521:soarweb";
			String user = "WEBADMIN";
			String password = "webadmin_2013";
			conn = DriverManager.getConnection(dburl, user, password);
			cstmt = conn.prepareCall("{?=call GET_NEXT_SQH(?)}");
			cstmt.registerOutParameter(1, Types.VARCHAR);
			cstmt.setString(2, emailno);
			cstmt.execute();
			emailno = cstmt.getString(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//emailno = emailDAO.getemailno(emailno);
		emailUser.setEmailno(emailno);
		//emailDAO.setemailuser(emailUser);
		//int ID = emailDAO.getemailid();
		//emailUser.setEmailID(ID);
		emailDAO.setmail(emailUser);
		return emailUser;//需要提取其中的emailno做为预受理编号，emailpwd做为密码提供给用户用来查询
	}
}
