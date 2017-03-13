package com.housing.management.backend.rest;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.housing.management.backend.domain.PayResult;
import com.housing.management.backend.service.three.PayResultService;

@Controller
@RequestMapping({ "/payresult" })
public class PayResultRestService {
	//boolean ifsuccess=false;
	PayResult payresult1 = new PayResult();
	private static final Logger logger = Logger.getLogger(ByfzRestService.class);
	@Autowired
	private PayResultService payresultservice = new PayResultService();
	@RequestMapping(value = { "/result/massage" } , method = { RequestMethod.POST })
	@ResponseBody
	public void Getpayresult(@RequestBody String payresult){
		System.out.println(payresult);
		payresult1 = payresultservice.getresult(payresult);
		//System.out.println(payresult);
	}
	@RequestMapping(value = { "/get/result" } , method = { RequestMethod.GET })
	@ResponseBody
	public PayResult getresult(){
		PayResult payresult2 = new PayResult();
		payresult2 = payresult1;
		payresult1=new PayResult();
		return payresult2;
	}
}	
