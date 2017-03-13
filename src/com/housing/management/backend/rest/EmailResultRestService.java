package com.housing.management.backend.rest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.housing.management.backend.domain.EmailResult;
import com.housing.management.backend.service.one.EmailResultService;

@Controller
@RequestMapping({ "/email" })
public class EmailResultRestService {
	private static final Logger logger = Logger.getLogger(EmailResultRestService.class);
	
	@Autowired
	private EmailResultService emailResultService;
	
	/**
	 * 
	 * 查询咨询
	 * 
	 */
	@RequestMapping(value = { "/result" }, method = { RequestMethod.POST })
	@ResponseBody
	public EmailResult getCertificateResult(@RequestBody EmailResult emailResult) {
		logger.info("查询咨询开始");
		EmailResult result = emailResultService.ifemailexist(emailResult.getEmailno(),emailResult.getEmailpwd());
		logger.info("查询咨询结束");

		return result;
		 
	}
}
