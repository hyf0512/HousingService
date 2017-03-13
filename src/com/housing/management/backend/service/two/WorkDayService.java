package com.housing.management.backend.service.two;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.housing.management.backend.common.DataSource;
import com.housing.management.backend.dao.FcbzyyDAO;
import com.housing.management.backend.domain.WorkDay;

@Service
public class WorkDayService {
	
	@Autowired
	private FcbzyyDAO fcbzyyDAO;
	
//	@DataSource("dataSourceTwo") 另外一种动态数据源，这里不需要
	public List<WorkDay> getWorkDayList() {
		return fcbzyyDAO.getWorkDayList();
	}

}
