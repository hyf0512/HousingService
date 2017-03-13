package com.housing.management.backend.service.one;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Service;

import com.housing.management.backend.common.Constants;
import com.housing.management.backend.domain.BzResult;
import com.hzfc.soar.fwdj.wwsupport.WwZcxServiceLocator;
import com.hzfc.soar.fwdj.wwsupport.WwZcxServiceSoapBindingStub;

@Service
public class SearchResultService {
	
	/**
	 * 办证查询结果
	 * 
	 * @param accept_id
	 * @param name
	 * @return
	 */
	public BzResult search(String accept_id,String name) {
		accept_id.trim();
		name.trim();
		BzResult bz = new BzResult();
		bz.setName(name);
		bz.setId(accept_id);
		if(accept_id==""||name==""){
			bz.setShow_info_more(false);
			bz.setShow_info(0);//0代表数据库中没有此编号，请重输
		}
		else{
			try{
				WwZcxServiceLocator service = new WwZcxServiceLocator();
				String weburl =  Constants.webserviceAddr+"/spi/wwZcxService";
				java.net.URL url = new java.net.URL(weburl);//URL地址后期要改
				WwZcxServiceSoapBindingStub stud = new WwZcxServiceSoapBindingStub(url,service);
				String result=stud.getBzcxGBK(accept_id, name);
				System.out.println(result);
				if(result==""){
					bz.setShow_info_more(false);
					bz.setShow_info(0);//0代表数据库中没有此编号，请重输
				}
				else
				{
					JSONObject json = JSONObject.fromObject(result);
					System.out.println(json);
					if(json.containsKey("exception")){
						if(Integer.parseInt(json.getString("exception"))==2){
							bz.setShow_info_more(false);
							bz.setShow_info(1);//1代表编号和出入方名称不相符，请重输
						}
						else{
							bz.setShow_info_more(false);
							bz.setShow_info(0);
						}
						
					}
					else{
						bz.setShow_info_more(true);
						bz.setCfmc(json.getString("cfmc"));
						bz.setSfmc(json.getString("sfmc"));
						bz.setType(json.getString("ywlb"));
						bz.setAddress(json.getString("fwzl"));
						if (Boolean.parseBoolean(json.get("isblz").toString())){
							bz.setShow_info(2);//2代表业务正在办理
						}
						else{
							if(Boolean.parseBoolean(json.get("sfyl").toString())){
								bz.setShow_info(3);//3代表已办结并已领证
							}
							else{
								bz.setShow_info(4);//4代表已办结，可以领证
							}
						}
					}
				}
			}
			catch(Exception e){
				bz.setShow_info_more(false);
				bz.setShow_info(0);
			}
		}
		return bz;
	}

	
}
