package com.housing.management.backend.dao;

import java.util.List;

import com.housing.management.backend.domain.JgryDept;

public interface JgryDeptDAO {
	
	/**
	 * 机构信息
	 * 
	 */
	public abstract JgryDept getBaseInfo(String deptId);
	
	
	public abstract List<JgryDept> getSubordinateList();
	
	public abstract List<JgryDept> getInternalList();
}
