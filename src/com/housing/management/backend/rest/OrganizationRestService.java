package com.housing.management.backend.rest;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.housing.management.backend.domain.JgryDept;
import com.housing.management.backend.service.one.OrganizationService;

@Controller
@RequestMapping({ "/organization" })
public class OrganizationRestService {
	private static final Logger logger = Logger.getLogger(OrganizationRestService.class);
	
	@Autowired
	private OrganizationService organizationService;
	/**
	 * 机构的基本信息
	 */
	@RequestMapping(value = { "/base/info/{deptId}" }, method = { RequestMethod.GET })
	@ResponseBody
	public JgryDept getBaseInfo(@PathVariable String deptId) {
		logger.info("查询机构的基本信息开始");

		JgryDept jgryDept = organizationService.getBaseInfo(deptId);
		
		logger.info("查询机构的基本信息结束");
		  
		return jgryDept;
		 
	}
	
	/**
	 * 直属单位列表
	 * 
	 */
	@RequestMapping(value = { "/subordinate/list" }, method = { RequestMethod.GET })
	@ResponseBody
	public List<JgryDept> getSubordinateList() {
		logger.info("查询直属单位列表开始");

		List<JgryDept> jgryDeptList = organizationService.getSubordinateList();
		
		logger.info("查询直属单位列表结束");
		  
		return jgryDeptList;
		 
	}
	
	/**
	 * 内设机构列表
	 * 
	 */
	@RequestMapping(value = { "/internal/list" }, method = { RequestMethod.GET })
	@ResponseBody
	public List<JgryDept> getInternalList() {
		logger.info("查询内设机构列表开始");

		List<JgryDept> jgryDeptList = organizationService.getInternalList();
		
		logger.info("查询内设机构列表结束");
		  
		return jgryDeptList;
		 
	}

}
