package com.housing.management.backend.service.one;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.housing.management.backend.common.PageHolder;
import com.housing.management.backend.dao.GzfhfsqDAO;
import com.housing.management.backend.domain.Gzfhfsq;

@Service
public class HousingChangeService {
	@Autowired
	private GzfhfsqDAO gzfhfsqDAO;
	
	public PageHolder<Gzfhfsq> getHousingChangeList(Gzfhfsq gzfhfsq){
		
		List<Gzfhfsq> gzfhfsqList = gzfhfsqDAO.getGzfhfsqList(gzfhfsq);
		// 总行数
		int totalCnt = gzfhfsqDAO.getGzfhfsqListCount();

		PageHolder<Gzfhfsq> pageHolder = new PageHolder<Gzfhfsq>();
		pageHolder.setPageIndex(gzfhfsq.getPageIndex());
		pageHolder.setPageSize(gzfhfsq.getPageSize());
		pageHolder.setPageTotal(totalCnt);
		pageHolder.setRows(gzfhfsqList);

		return pageHolder;
	}
	
	public Gzfhfsq getHousingChangeDetail(Integer fzfhfsqId){
		return gzfhfsqDAO.getGzfhfsqDetail(fzfhfsqId);
	}

}
