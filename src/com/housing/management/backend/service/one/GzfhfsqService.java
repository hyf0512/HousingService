package com.housing.management.backend.service.one;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sf.json.JSONObject;

import com.housing.management.backend.common.Constants;
import com.housing.management.backend.dao.GzfhfsqDAO;
import com.housing.management.backend.domain.Gzfhfsq;
import com.hzfc.soar.zfbz.gzf.websupport.WebGzfZlxxServiceLocator;
import com.hzfc.soar.zfbz.gzf.websupport.WebGzfZlxxServiceSoapBindingStub;

@Service
public class GzfhfsqService {
	@Autowired
	private GzfhfsqDAO gzfhfsqdao;
	/**
	 * 公租房换房申请点击验证码后验证信息并生成验证码插入数据库中
	 * 
	 * @param name
	 * @param IDnumber
	 * @param phonenumber
	 * @param type
	 * @return 
	 * @return
	 */
	public Gzfhfsq login(Gzfhfsq gzfhfsq){//String name,String IDnumber,String phonenumber,int type){
		Gzfhfsq gzf = new Gzfhfsq();
		try {
			String weburl = Constants.webserviceAddr+"/spi/webGzfZlxxService";
			WebGzfZlxxServiceLocator service = new WebGzfZlxxServiceLocator();
			java.net.URL url = new java.net.URL(weburl);
			WebGzfZlxxServiceSoapBindingStub stub = new WebGzfZlxxServiceSoapBindingStub(url,service);
			String result = stub.findPzrxxByXmZjhmYddh(gzfhfsq.getXm(), gzfhfsq.getSfzh(), gzfhfsq.getYddh(), gzfhfsq.getBzfxz());
			System.out.println(result);
			JSONObject json = JSONObject.fromObject(result);
			
			if(json.getInt("jyjg")==1){
				gzf.setIfexist(true);
				gzf.setJyxx(json.getString("jyxx"));
				gzf.setSqrCode(json.getString("sqrcode"));
				gzf.setXm(gzfhfsq.getXm());
				gzf.setXb(json.getString("xb"));
				gzf.setSfzh(gzfhfsq.getSfzh());
				gzf.setYddh(gzfhfsq.getYddh());
				gzf.setPzCode(json.getString("pzcode"));
				gzf.setFyCode(json.getString("fycode"));
				gzf.setYxszcq(json.getString("szcq"));
				gzf.setFwzl(json.getString("fwzl"));
				gzf.setXqmc(json.getString("xqmc"));
				gzf.setSfct(json.getString("sfct"));
				gzf.setZcs(json.getString("zcs"));
				gzf.setSzcs(json.getString("szcs"));
				gzf.setFwjg(json.getString("fwjg"));
				gzf.setJzmj(json.getString("jzmj"));
				gzf.setTnggmj(json.getString("tnggmj"));
				gzf.setFtggmj(json.getString("ftggmj"));
				gzf.setSymj(json.getString("symj"));
				gzf.setBzfxz(gzfhfsq.getBzfxz());
				String yzm = "";
				int ID = gzfhfsqdao.getGzfhfsqID(gzf);
				gzf.setFzfhfsqId(ID);
				Random random = new Random();
				for(int i=0;i<6;i++){
					yzm+=random.nextInt(10);
				}
				gzf.setYzm(yzm);
				System.out.println(yzm);
				String smsmsg = "您正在登陆公租房换房平台，验证码为："+ yzm + "，验证码将在10分钟后失效。";
				String smsnumber="888";
				String smsplantime="";
				String smspriority="0";
				String smsaccount="公租房换房平台";
				Connection conn = null; 
				CallableStatement cstmt = null;
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String dburl = "jdbc:oracle:thin:@192.168.200.72:1521:soarweb";
				String user = "SMS";
				String password = "sms_2013";
				conn = DriverManager.getConnection(dburl, user, password);
				cstmt=conn.prepareCall("{call PROC_SEND_SMS(?,?,?,?,?,?,?)}");
				cstmt.setString(1, gzfhfsq.getYddh());
				cstmt.setString(2, smsmsg);
				cstmt.setString(3, smsnumber);
				cstmt.setString(4, smsplantime);
				cstmt.setString(5, smspriority);
				cstmt.setString(6, smsaccount);
				cstmt.registerOutParameter(7, Types.INTEGER);
				cstmt.execute();
				int smssendreturn = cstmt.getInt(7);
				gzfhfsqdao.updateGzfhfsq(gzf);
			}
			else{
				gzf.setIfexist(false);
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			gzf.setIfexist(false);
		}
		return gzf;
	}
}

