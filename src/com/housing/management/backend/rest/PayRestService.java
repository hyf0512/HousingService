package com.housing.management.backend.rest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.housing.management.backend.domain.PayMessage;
import com.housing.management.backend.service.one.PayService;

@Controller
@RequestMapping({ "/pay" })
public class PayRestService {
	private static final Logger logger = Logger.getLogger(ByfzRestService.class);
	@Autowired
	private PayService payservice = new PayService();
	
	@RequestMapping(value = { "/message/paymessage" } , method = { RequestMethod.POST })
	@ResponseBody
	public PayMessage Getmessage(@RequestBody PayMessage paymessage){
		logger.info("付款信息开始");
		paymessage=payservice.Setpaymessage(paymessage);
		logger.info("付款信息结束");
		return paymessage;
	}
}
