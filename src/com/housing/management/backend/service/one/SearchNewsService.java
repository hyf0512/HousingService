package com.housing.management.backend.service.one;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.List;

import oracle.sql.BLOB;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.housing.management.backend.common.PageHolder;
import com.housing.management.backend.dao.NewsDAO;
import com.housing.management.backend.domain.HousingNews;

@Service
public class SearchNewsService {
	private static final Logger logger = Logger.getLogger(SearchNewsService.class);
	@Autowired
	private NewsDAO newsDAO;
	/**
	 * 搜索返回新闻
	 * 
	 * @param massage
	 * @param pageindex
	 * @param pagesize
	 * @return
	 */
	
	public PageHolder<HousingNews> Search(HousingNews housingNews){
		housingNews.setTitle("%"+housingNews.getTitle() +"%");
		List<HousingNews> housingNewsList = newsDAO.getSearchList(housingNews);
		 
		// 总行数
		int totalCnt = newsDAO.getSearchNewsListCount(housingNews);

		PageHolder<HousingNews> pageHolder = new PageHolder<HousingNews>();
		pageHolder.setPageIndex(housingNews.getPageIndex());
		pageHolder.setPageSize(housingNews.getPageSize());
		pageHolder.setPageTotal(totalCnt);
		pageHolder.setRows(housingNewsList);

		return pageHolder;
	}
	
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
	    			bytes=content.getBytes(i,2048);
	    			i=i+2048;
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
