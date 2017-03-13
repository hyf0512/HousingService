package com.housing.management.backend.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.housing.management.backend.service.one.SendMessageService;

@Controller
@RequestMapping({ "/message" })
public class SendMessageRestService {	
	@Autowired
	private SendMessageService sendMessageService;
	
	/**
	 * 办证查询结果
	 */
	@RequestMapping(value = { "/verification/{phone}" }, method = { RequestMethod.GET })
	@ResponseBody
	public String getVerificationCode(@PathVariable String phone) {
		return sendMessageService.sendmessage(phone);
	}
	
}
