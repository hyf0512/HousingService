package com.housing.management.backend.rest;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.housing.management.backend.common.PageHolder;
import com.housing.management.backend.common.Utils;
import com.housing.management.backend.domain.Bsjdsearch;
import com.housing.management.backend.domain.BzResult;
import com.housing.management.backend.domain.HousingNews;
import com.housing.management.backend.service.one.SearchBsjdService;
import com.housing.management.backend.service.one.SearchNewsService;
import com.housing.management.backend.service.one.SearchResultService;

@Controller
@RequestMapping({ "/seach" })
public class SeachRestService {
	
	private static final Logger logger = Logger.getLogger(SeachRestService.class);
	
	@Autowired
	private SearchResultService searchResultService;
	@Autowired
	private SearchBsjdService searchBsjdService;
	
	@Autowired
	private SearchNewsService searchNewsService;
	
	/**
	 * 办证查询结果
	 */
	@RequestMapping(value = { "/certificate/result" }, method = { RequestMethod.POST })
	@ResponseBody
	public BzResult getCertificateResult(@RequestBody BzResult bzResult) {
		logger.info("查询办证结果开始");
		BzResult result = searchResultService.search(bzResult.getId(),bzResult.getName());
		logger.info("查询办证结果结束");
//		
//		result.setShow_info_more(true);
//		result.setAddress("aa");
		return result;
		 
	}
	
//	@RequestMapping(value = { "/test/certificate/result" }, method = { RequestMethod.POST })
//	@ResponseBody
//	public Bsjdsearch getCertificateResult(@RequestBody Bsjdsearch bsjdsearch) {
//		logger.info("办事进度查询开始");
//
//		Bsjdsearch result = searchBsjdService.bsjdcx(bsjdsearch.getID(), bsjdsearch.getName());
//		
//		logger.info("办事进度查询结束");
//		  
//		return result;
//		 
//	}
	
	/**
	 * 办事进度查询结果
	 */
	@RequestMapping(value = { "/work/schedule/result" }, method = { RequestMethod.POST })
	@ResponseBody
	public Bsjdsearch getWorkScheduleResult(@RequestBody Bsjdsearch bsjdsearch) {
		logger.info("办事进度查询开始");

		Bsjdsearch result = searchBsjdService.bsjdcx(bsjdsearch.getCxywlx(),bsjdsearch.getId(), bsjdsearch.getName());
		
		logger.info("办事进度查询结束");
		  
		return result;
		 
	}
	
	
	/**
	 * 搜索页面，搜索新闻内容
	 */
	@RequestMapping(value = { "/news/list" }, method = { RequestMethod.POST })
	@ResponseBody
	public PageHolder<HousingNews> getNewsList(@RequestBody HousingNews housingNews) {
		if(StringUtils.isEmpty(housingNews.getTitle())){
			return new PageHolder<HousingNews>();
		}
		
		Utils.pageDataInit(housingNews);
		PageHolder<HousingNews> pageHolder = searchNewsService.Search(housingNews);
		  
		return pageHolder;
		 
	}

}
