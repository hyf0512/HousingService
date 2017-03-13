package com.housing.management.backend.service.one;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Service;

import com.housing.management.backend.common.Constants;
import com.housing.management.backend.domain.Bsjdsearch;
import com.hzfc.soar.spfht.wwsupport.WwSpfhtServiceLocator;
import com.hzfc.soar.spfht.wwsupport.WwSpfhtServiceSoapBindingStub;

@Service
public class SearchBsjdService {
	/**
	 * 办事进度查询
	 * 
	 * @param accept_id
	 * @param name
	 * @return
	 */
	public Bsjdsearch bsjdcx(String cxywlx,String accept_id,String name){
		accept_id.trim();
		name.trim();
		Bsjdsearch bsjd = new Bsjdsearch();
		bsjd.setId(accept_id);
		bsjd.setName(name);
		if(accept_id==""||name==""){
			bsjd.setHavedata(false);//判断有无数据
		}
		else{
			try{
				String apptype = "cqcx";//查询类别
                if("gz".equals(cxywlx))apptype = "gz";//查询类别
                else if("lz".equals(cxywlx))apptype = "lz";//查询类别

				String weburl = Constants.webserviceAddr+"/spi/wwSpfhtService";
				WwSpfhtServiceLocator service = new WwSpfhtServiceLocator();
				java.net.URL url = new java.net.URL(weburl);
				WwSpfhtServiceSoapBindingStub stub = new WwSpfhtServiceSoapBindingStub(url,service);
				String result=stub.returnBszd(apptype, name,accept_id);
				System.out.println(result);
				JSONObject json = JSONObject.fromObject(result);
				if(result!=""){
					if(json.getInt("resultcode")==1){
						bsjd.setHavedata(true);
						if(json.getString("hjString")!=""){
							bsjd.setJd(json.getString("hjString"));
							bsjd.setPersonID(json.getString("zjhm"));
							bsjd.setRegistlb(json.getString("ywlb"));
							int state = json.getInt("bjbz");
							if(state==1){
								bsjd.setState(1);
							}
							else if(state==2){
								bsjd.setState(2);
							}
							else{
								bsjd.setState(3);
							}
						}
					}
				}
				
			}
			catch(Exception e){
				bsjd.setHavedata(false);
			}
		}
		return bsjd;
	}
	

	
}
