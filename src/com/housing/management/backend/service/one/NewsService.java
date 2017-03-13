package com.housing.management.backend.service.one;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.List;

import oracle.sql.BLOB;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.housing.management.backend.common.DataSource;
import com.housing.management.backend.common.PageHolder;
import com.housing.management.backend.dao.NewsDAO;
import com.housing.management.backend.domain.HousingNews;


@Service
public class NewsService {
	private static final Logger logger = Logger.getLogger(NewsService.class);
	
	@Autowired
	private NewsDAO newsDAO;

	/**
	 * 住保房管动态列表
	 * 
	 * @param housingNews
	 * @return
	 */
//	@DataSource("dataSourceOne") 另外一种配置：通过注解配置数据源，这里不需要
	public PageHolder<HousingNews> getHousingNewsList(HousingNews housingNews) {

//		housingNews.setColumnId(Constants.HOUSING_NEWS_CODE_STR);
		
		List<HousingNews> housingNewsList = newsDAO.getHousingNewsList(housingNews);
		 
		// 总行数
		int totalCnt = newsDAO.getHousingNewsListCount(housingNews);

		PageHolder<HousingNews> pageHolder = new PageHolder<HousingNews>();
		pageHolder.setPageIndex(housingNews.getPageIndex());
		pageHolder.setPageSize(housingNews.getPageSize());
		pageHolder.setPageTotal(totalCnt);
		pageHolder.setRows(housingNewsList);

		return pageHolder;
	}
	
	/**
	 * 根据新闻ID，查询新闻详情内容
	 */
	public HousingNews getNewsDetailById(String contentId){
		HousingNews housingNews =  newsDAO.getNewsDetailById(contentId);
		
		BLOB content = (BLOB)housingNews.getContent();
		
//		try {
//			long a = content.length();
//			System.out.println(new String(content.getBytes(1,new Long(a).intValue()),"GB2312"));
//		} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//		} catch (UnsupportedEncodingException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		String newStr = ""; // 返回字符串
	    int i = 1;
	    byte[] bytes; // BLOB临时存储字节数组
	    long BlobLength;
		try {
			// BOLB长度
			BlobLength = content.length();
		    byte[] msgContent = content.getBytes(BlobLength,1);
		    if (msgContent!=null && BlobLength > 0){
		    	while(i<BlobLength){
	    			bytes=content.getBytes(i,3072);
	    			i=i+3072;
					newStr=newStr+ new String(bytes,"GB2312");
		    	}
		    }
		    
		    housingNews.setOutputContent(newStr);

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("新闻内容读取错误！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("新闻内容读取错误！");
		}
	    // 清空
	    housingNews.setContent(null);
	    
		return housingNews;

	}
}
