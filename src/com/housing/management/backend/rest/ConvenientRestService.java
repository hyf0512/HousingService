package com.housing.management.backend.rest;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.housing.management.backend.domain.TpmBsd;
import com.housing.management.backend.service.one.ConvenientService;

@Controller
@RequestMapping({ "/convenient" })
public class ConvenientRestService {
	private static final Logger logger = Logger.getLogger(ConvenientRestService.class);
	
	@Autowired
	private ConvenientService convenientService;
	
	/**
	 * 便民服务，查询各种地址列表：应急维修，办证地址，查档地址，保障房受理
	 * 办事点类型：1办证地址 2保障房受理 3应急维修 4查档地址
	 * 
	 */
	@RequestMapping(value = { "/address/list/{bsdLx}" }, method = { RequestMethod.GET })
	@ResponseBody
	public List<TpmBsd> getAddressList(@PathVariable String bsdLx) {
		logger.info("查询各种地址列表开始");

		List<TpmBsd> tpmBsdList = convenientService.getAddressList(bsdLx);
		
		logger.info("查询各种地址列表结束");
		  
		return tpmBsdList;
	}

	
	/**
	 * 便民服务，查询各种地址详情：应急维修，办证地址，查档地址，保障房受理
	 * 
	 */
	@RequestMapping(value = { "/address/info/{id}" }, method = { RequestMethod.GET })
	@ResponseBody
	public TpmBsd getAddressInfo(@PathVariable String id) {
		logger.info("查询各种地址基本信息开始");

		TpmBsd tpmBsd = convenientService.getAddressInfo(id);
		
		logger.info("查询各种地址基本信息结束");
		  
		return tpmBsd;	 
	}

}
