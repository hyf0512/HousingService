package com.housing.management.backend.rest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.housing.management.backend.domain.EmailUser;
import com.housing.management.backend.service.one.QuestionService;

@Controller
@RequestMapping({ "/question" })
public class QuestionRestService {
	
	private static final Logger logger = Logger.getLogger(EmailResultRestService.class);
	
	@Autowired
	private QuestionService questionService;
	/**
	 * 提交咨询 
	 * @throws ClassNotFoundException 
	 */
	@RequestMapping(value = { "/create" }, method = { RequestMethod.POST })
	@ResponseBody
	public EmailUser createQuestion(@RequestBody EmailUser emailUser) throws ClassNotFoundException{
		
		logger.info("提交咨询开始");
		EmailUser result = questionService.question(emailUser);
		logger.info("提交咨询结束");
		
		return result;
	}

}
