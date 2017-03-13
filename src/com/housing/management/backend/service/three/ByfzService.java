package com.housing.management.backend.service.three;

import java.text.SimpleDateFormat;
import java.util.Date;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.housing.management.backend.common.ApplicationContextHelper;
import com.housing.management.backend.common.Constants;
import com.housing.management.backend.dao.ByfzDAO;
import com.housing.management.backend.domain.Byfz;
import com.hzfc.soar.zfbz.byfz.websupport.ByfzwwWebService;

@Service
public class ByfzService {

	@Autowired
	private ByfzDAO byfzdao;
	public Byfz check(Byfz byfz,int cz){
		if(cz==1){
			Byfz byfz1 = new Byfz();//回显的内容
			String fwcode;//房屋内码
			String szcq;//所在城区
			String fwzl;//房屋坐落
			String fwjg;//房屋结构
			String jzmj;//建筑面积
			String syqzid;//房产证内码
			String slrq;//受理日期
			boolean overdue;//判断能否办理
			int local_ywlb = Constants.BYSYWLB_BYMZ;
			if(byfz.getYwlb()=="3"){
				local_ywlb = Constants.BYSYWLB_ZXYF;
			}
			String cqzh = byfz.getCqzh();
			String name = byfz.getName();
			boolean canupdate = false;
			String ywlbsm = "白蚁灭治业务";
			//System.out.println(byfzdao.getsl("%2016%"));
			//byfzdao.setsl(byfz);
			ByfzwwWebService byfzwebservice =(ByfzwwWebService)ApplicationContextHelper.getBean("byfzServiceClient");
			String result = byfzwebservice.checkForAccept(local_ywlb, cqzh, name);
			//String result = "{'overdue':true,'fwzl':'和睦路41号东幢2单元101室','syqzsh':'杭房权证拱改字第0007328号','syqzid':60628533,'fwyt':10,'yslid':null,'jzmj':63.16,'fwjg':4,'ywlb':2401002,'szcq':330105,'yslbh':null,'slrq':'2012-04-10','exists':true,'sfnw':true,'fwcode':80571063}";
			System.out.println(result);
			JSONObject json = JSONObject.fromObject(result);
			System.out.println(json);
			//if(){
				boolean exists = json.getBoolean("exists");
				if(exists){
					fwcode = json.getString("fwcode");
					System.out.println(fwcode);
					szcq = json.getString("szcq");
					fwzl = json.getString("fwzl");
					fwjg = json.getString("fwjg");
					jzmj = json.getString("jzmj");
					syqzid = json.getString("syqzid");
					slrq = json.getString("slrq");
					int ywlbFlag = json.getInt("ywlb");
					overdue = json.getBoolean("overdue");
					boolean sfnw = json.getBoolean("sfnw");
					Long yslid = null;
					try{
						yslid = json.getLong("yslid");
					} catch (Exception e) {yslid = null;}
					 if(ywlbFlag==Constants.BYSYWLB_BYMZ){
						 ywlbsm="白蚁灭治业务";
						 System.out.println(1);
					 }
					 else if(ywlbFlag==Constants.BYSYWLB_ZXYF){
						 ywlbsm="装修业务";
					 }
					 if(!overdue){
						 if(yslid!=null&&!sfnw&&local_ywlb==ywlbFlag){
							 canupdate = true;//可以回显并编辑
							 
							 byfz1=byfzdao.getupdate(yslid);
							 if(byfz1.getStatu()=="0"&&byfz1.getPayid()=="0"){
								 canupdate=false;//不可以回显并编辑
							 }
						 }
					 }
					 //可以回显并编辑
					 if(canupdate){
						 byfz1.setCanupdate(canupdate);
						 byfz1.setName(name);
						 byfz1.setCqzh(cqzh);
						 byfz1.setYwlb(byfz.getYwlb());
						 byfz = byfz1;
					 }
					 //不能回显并编辑
					 else{
						 byfz.setCanupdate(canupdate);
					 }
					 byfz.setFwcode(fwcode);
					 byfz.setSzcq(szcq);
					 byfz.setAddress(fwzl);
					 byfz.setFwjg(fwjg);
					 byfz.setArea(jzmj);
					 byfz.setSyqzid(syqzid);
					 byfz.setSlrq(slrq);
					 byfz.setOverdue(overdue);
					 byfz.setYwlbflag(ywlbsm);
					 byfz.setHavedate(true);
				}
			//}
			//else
			//	byfz.setHavedate(false);
			byfz.setHavedate(exists);
		}
		else if(cz==2){
			//byfzdao.setsl(byfz);
			String result = "0";
			if(byfz.getSzcq()==""||byfz.getSzcq()==null){
				byfz.setSzcq("0");
			}
			byfz.setStatu("0");
			Date date1 = new Date();
			SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String time1 = df1.format(date1);
			byfz.setAddtime(time1);
			Date date = new Date();
			SimpleDateFormat df = new SimpleDateFormat("yyyyMM");
			String time = df.format(date);
			String sl1 = time.substring(0, 4);
			int id = 0;
			String whereid="";
			String sl = "%"+sl1+"%";
			System.out.println(sl);
			try{
				String slno = byfzdao.getsl(sl);
				id = Integer.parseInt(slno.substring(slno.length()-4));
			}catch (Exception e){
				id=0;
			}
			
			//if(slno!=0){
				//id = Integer.parseInt(slno.substring(slno.length()-4));
			//}
			if(id<9&&id>=0){
				whereid="000"+(id+1);
			}
			else if(id>=9&&id<100){
				whereid="00"+(id+1);
			}
			else if(id<999&&id>=100){
				whereid="0"+(id+1);
			}else if(id>=1000&&id<=9999){
				whereid=""+(id+1);
			}
			time+=whereid;
			byfz.setSlbh("Y"+time);
			byfz.setFcyt("0");
			System.out.println("Y"+time);
			//int result=1;
			try{
				byfzdao.insert(byfz);
				result="1";
			}catch(Exception e){
				result="0";
			}
			byfz.setResult(result);
			
		}
		else if(cz==3){
			String result="0";
			Date date = new Date();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String time = df.format(date);
			if(byfz.getStatu()!="1"){
				time = "";
			}
			byfz.setShsj(time);
			byfz.setShyj("");
			
			try{
				int num = byfzdao.update(byfz);
				if(num ==1){
					result = "1";
				}
				else{
					result="0";
				}
			}catch(Exception e){
				result="0";
			}
			byfz.setResult(result);
		}
		
		return byfz;
	}
}
