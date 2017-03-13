package com.housing.management.backend.dao;

import java.util.List;

import com.housing.management.backend.domain.HousingNews;

public interface NewsDAO {
	
	/**
	 * 住保房管动态列表
	 * 
	 * @param housingNews
	 * 
	 * @result List<HousingNews>
	 */
	public abstract List<HousingNews> getHousingNewsList(HousingNews housingNews);
	
	/**
	 * 住保房管动态列表总行数
	 * 
	 * @param housingNews
	 * 
	 * @result Integer
	 */
	public abstract Integer getHousingNewsListCount(HousingNews housingNews);
	
	/**
	 * 根据新闻ID,查询新闻详情
	 */
	public abstract HousingNews getNewsDetailById(String contentId);
	/**
	 * 根据搜索内容查询信息列表
	 */
	public abstract List<HousingNews> getSearchList(HousingNews housingNews);
	/**
	 * 根据搜索内容查询列表总行数
	 */
	public abstract Integer getSearchNewsListCount(HousingNews housingNews);
}
