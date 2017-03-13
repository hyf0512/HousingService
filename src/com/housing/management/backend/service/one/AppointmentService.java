package com.housing.management.backend.service.one;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.housing.management.backend.dao.FcbzyyDAO;
import com.housing.management.backend.domain.Fcbzyy;
import com.housing.management.backend.domain.FcbzyyChb;
import com.housing.management.backend.domain.FcbzyySldd;
import com.housing.management.backend.domain.FcbzyyYwlb;

@Service
public class AppointmentService {
	private static final Logger logger = Logger.getLogger(AppointmentService.class);
	
	@Autowired
	private FcbzyyDAO fcbzyyDAO;
	
	public List<FcbzyySldd> getAddressList(){
		return fcbzyyDAO.getAddressList();
		
	}
	
	public List<FcbzyyChb> getTimeList(String slddId){
		return fcbzyyDAO.getTimeList(slddId);
		
	}
	
	public List<FcbzyyYwlb> getBussinessTypeList(){
		return fcbzyyDAO.getBussinessTypeList();
		
	}
	
	public List<FcbzyyChb> getDateAndNumberList(String slddId){
		System.out.println();
		return fcbzyyDAO.getDateList(slddId);
		
	}
	public String getDay(int i){
		return fcbzyyDAO.getDay(i);
	}
	public int getYyzs(String id){
		return fcbzyyDAO.getYyzs(id);
	}
	public int getYyys(FcbzyyChb fcbzyychb){
		return fcbzyyDAO.getYyys(fcbzyychb);
	}
	
	/**
	 * 插入预约信息
	 * 
	 */
	public int insertInfo(Fcbzyy fcbzyy){
//		// SEQ	
//		fcbzyy.setId(1);
		String yyh = fcbzyy.getYyrq().replaceAll("-", "");
		String a = fcbzyy.getChbId();
		if(a.length()==1){
			a="0"+a;
		}
		yyh=yyh+a;
		fcbzyy.setYyh(yyh);
		fcbzyy.setLsbz("0");
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String cjsj = dateFormat.format(now);
		fcbzyy.setCjsj(cjsj);
		int result = fcbzyyDAO.insertInfo(fcbzyy);
		if(result == 1){
			String time = fcbzyy.getYyrq();
			time=time.replaceFirst("-", "年");
			time=time.replaceFirst("-", "月");
			time=time.replaceFirst("-", "日");
			String smsmsg=fcbzyy.getName()+"，您好，您已成功预约了我局房产登记业务，请凭该手机短信于"+time+fcbzyy.getSlsj()+"前到达"+fcbzyy.getSlck()+"办理，预约号为"+fcbzyy.getYyh()+"。如逾期未至的，预约号不予保留，敬请谅解。欢迎您来我局服务大厅办理房产登记，如有不明事宜，可垂询预约服务电话0571-89830222。";
			String smsnumber="915";
			String smsplantime="";
			String smspriority="5";
			String smsaccount="网上预约";
			Connection conn = null; 
			CallableStatement cstmt = null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String dburl = "jdbc:oracle:thin:@192.168.200.72:1521:soarweb";
				String user = "SMS";
				String password = "sms_2013";
				conn = DriverManager.getConnection(dburl, user, password);
				cstmt=conn.prepareCall("{call PROC_SEND_SMS(?,?,?,?,?,?,?)}");
				cstmt.setString(1, fcbzyy.getMob());
				cstmt.setString(2, smsmsg);
				cstmt.setString(3, smsnumber);
				cstmt.setString(4, smsplantime);
				cstmt.setString(5, smspriority);
				cstmt.setString(6, smsaccount);
				cstmt.registerOutParameter(7, Types.INTEGER);
				cstmt.execute();
				int smssendreturn = cstmt.getInt(7);
			} catch (Exception e) {
				logger.error(fcbzyy.getMob() + "获取验证码发生异常。");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
	public List<Fcbzyy> getyylist(String userId){
		return fcbzyyDAO.getFcbzyy(userId);
	}
	public Fcbzyy updatefcbzyy(Fcbzyy fcbzyy){
		String result="0";
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String qxsj = dateFormat.format(now);
		fcbzyy.setQxsj(qxsj);
		try{
			fcbzyyDAO.updateFcbzyy(fcbzyy);
			result="1";
		}catch(Exception e){
			result="0";
			e.printStackTrace();
		}
		fcbzyy.setCancelresult(result);
		return fcbzyy;
	}
	public Fcbzyy searchyydetil(String yyh){
		return fcbzyyDAO.searchyydetil(yyh);
	}

}
