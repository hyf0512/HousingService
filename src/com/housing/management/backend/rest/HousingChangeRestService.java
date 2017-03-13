package com.housing.management.backend.rest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.housing.management.backend.common.PageHolder;
import com.housing.management.backend.common.Utils;
import com.housing.management.backend.domain.Gzfhfsq;
import com.housing.management.backend.service.one.HousingChangeService;


@Controller
@RequestMapping({ "/housingChange" })
public class HousingChangeRestService {
	private static final Logger logger = Logger.getLogger(NewsRestService.class);
	
	@Autowired
	private HousingChangeService housingChangeService;
	
	/**
	 * 自助换房，房源列表
	 * 
	 */
	@RequestMapping(value = { "/list" }, method = { RequestMethod.POST })
	@ResponseBody
	public PageHolder<Gzfhfsq> getHousingChangeList(@RequestBody Gzfhfsq gzfhfsq) {
		logger.info("查询自助换房房源列表开始");
		
		Utils.pageDataInit(gzfhfsq);
		PageHolder<Gzfhfsq> pageHolder = housingChangeService.getHousingChangeList(gzfhfsq);
		
		logger.info("查询自助换房房源列表结束");
		  
		return pageHolder;
		 
	}
	
	/**
	 * 查询房源详细信息
	 */
	@RequestMapping(value = { "/detail/{fzfhfsqId}" }, method = { RequestMethod.GET })
	@ResponseBody
	public Gzfhfsq getHousingChangeDetail(@PathVariable Integer fzfhfsqId) {
		logger.info("查询房源详细信息开始");
		
		Gzfhfsq gzfhfsq = housingChangeService.getHousingChangeDetail(fzfhfsqId);
		
		logger.info("查询房源详细信息结束");
		  
		return gzfhfsq;
		 
	}

}
