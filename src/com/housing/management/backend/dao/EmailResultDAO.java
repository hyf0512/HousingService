package com.housing.management.backend.dao;

import com.housing.management.backend.domain.EmailResult;

public interface EmailResultDAO {

	public abstract EmailResult getemailresult(EmailResult emailresult);
	public abstract String getdeptname(String deptID);
}
