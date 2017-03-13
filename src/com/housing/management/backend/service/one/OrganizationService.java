package com.housing.management.backend.service.one;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.housing.management.backend.dao.JgryDeptDAO;
import com.housing.management.backend.domain.JgryDept;

@Service
public class OrganizationService {
//	private static final Logger logger = Logger.getLogger(OrganizationService.class);
	
	@Autowired
	private JgryDeptDAO jgryDeptDAO;
	
	/**
	 * 机构的基本信息
	 * 
	 * @param deptId
	 * @return
	 */
	public JgryDept getBaseInfo(String deptId){
		return jgryDeptDAO.getBaseInfo(deptId);
	}
	
	public List<JgryDept> getSubordinateList(){
		return jgryDeptDAO.getSubordinateList();
		
	}
	
	public List<JgryDept> getInternalList(){
		return jgryDeptDAO.getInternalList();
	}
}
