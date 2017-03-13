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
import com.housing.management.backend.domain.HousingNews;
import com.housing.management.backend.service.one.NewsService;

@Controller
@RequestMapping({ "/news" })
public class NewsRestService {
	private static final Logger logger = Logger.getLogger(NewsRestService.class);
	
	@Autowired
	private NewsService newsService;
	
	/**
	 * 公告公示
	 * 
	 * columnId:30002 住保房管动态,30009 经济适用住房,30012 廉租房公告,31361 公租房公告
	 * 
	 * @param housingNews
	 * 
	 * @result HousingNews
	 */
	@RequestMapping(value = { "/list" }, method = { RequestMethod.POST })
	@ResponseBody
	public PageHolder<HousingNews> getHousingNewsList(@RequestBody HousingNews housingNews) {
		logger.info("查询公告公示列表开始");

		Utils.pageDataInit(housingNews);
		PageHolder<HousingNews> pageHolder = newsService.getHousingNewsList(housingNews);
		
		logger.info("查询公告公示列表结束");
		  
		return pageHolder;
		 
	}
	

	
	/**
	 * 根据新闻ID，查询新闻详情内容
	 * 
	 * @param contentId
	 * 
	 * @result HousingNews
	 */
	@RequestMapping(value = { "/detail/{contentId}" }, method = { RequestMethod.GET })
	@ResponseBody
	public HousingNews getNewsDetailById(@PathVariable String contentId) {
		logger.info("根据新闻ID，查询新闻详情内容开始");
		
		HousingNews result = newsService.getNewsDetailById(contentId);
		
		logger.info("根据新闻ID，查询新闻详情内容结束");
		  
		return result;
		 
	}


}
