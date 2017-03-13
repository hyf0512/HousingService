package com.housing.management.backend.rest;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.housing.management.backend.domain.Gzfhfsq;
import com.housing.management.backend.service.one.GzfhfsqService;

@Controller
@RequestMapping({ "/fcbbyy" })
public class GzfhfsqRestService {
	
	@Autowired
	private GzfhfsqService gzfhfsqService;
	
	/**
	 * 
	 * 公租房发短信验证码
	 * 
	 */
	@RequestMapping(value = { "/send/message" }, method = { RequestMethod.POST })
	@ResponseBody
	public int sendMessage(@RequestBody Gzfhfsq gzfhfsq,HttpSession fcbyyLoginSession) {

		int result = 0;
		Gzfhfsq gzfhfsqR = gzfhfsqService.login(gzfhfsq);
		
		// TODO
//		gzfhfsqR = gzfhfsq;
//		gzfhfsq.setYzm("123");
		
		if(gzfhfsqR.getIfexist()){
			fcbyyLoginSession.setAttribute("gzfhfsqSession", gzfhfsqR);
			result = 1;
		} else {
			result = 0;
		}
		return result;
		 
	}
	
	/**
	 * 
	 * 登录信息验证
	 * 
	 */
	@RequestMapping(value = { "/login" }, method = { RequestMethod.POST })
	@ResponseBody
	public int login(@RequestBody Gzfhfsq gzfhfsq,HttpSession fcbyyLoginSession) {
		int result = 0;
		if(fcbyyLoginSession.getAttribute("gzfhfsqSession") != null){
			Gzfhfsq gzfhfsqS = (Gzfhfsq)fcbyyLoginSession.getAttribute("gzfhfsqSession");
			
			//信息比对
			if(gzfhfsq.getYzm().equals(gzfhfsqS.getYzm()) && gzfhfsq.getXm().equals(gzfhfsqS.getXm()) && 
					gzfhfsq.getSfzh().equals(gzfhfsqS.getSfzh()) &&
					gzfhfsq.getYddh().equals(gzfhfsqS.getYddh()) && gzfhfsq.getBzfxz() == gzfhfsqS.getBzfxz()){
				result = 1;
				
			}
		}

		return result;
		 
	}

}
