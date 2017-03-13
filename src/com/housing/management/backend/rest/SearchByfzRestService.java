package com.housing.management.backend.rest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.housing.management.backend.domain.Byfz;
import com.housing.management.backend.service.three.SearchByfzService;

@Controller
@RequestMapping({ "/searchbyfz" })
public class SearchByfzRestService {
	private static final Logger logger = Logger.getLogger(ByfzRestService.class);
	@Autowired
	private SearchByfzService searchbyfzservice = new SearchByfzService();
	@RequestMapping(value = { "/search/info" } , method = { RequestMethod.POST })
	@ResponseBody
	public Byfz SearchbyfzResult(@RequestBody Byfz byfz){
		logger.info("查找编号开始");
		Byfz result = searchbyfzservice.SearchByfz(byfz);
		logger.info("查找编号结束");
		return result;
	}
}
