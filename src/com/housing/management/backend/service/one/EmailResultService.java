package com.housing.management.backend.service.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.housing.management.backend.dao.EmailResultDAO;
import com.housing.management.backend.domain.EmailResult;

@Service
public class EmailResultService {

	@Autowired
	private EmailResultDAO emailResultDAO;
	
	/**
	 * 查询咨询服务
	 * @param emailno
	 * @param emailpwd
	 * @return 
	 * @return 
	 */
	public EmailResult ifemailexist(String emailno,String emailpwd){
		
		emailno.trim();
		emailpwd.trim();
		EmailResult emailresult = new EmailResult();
		emailresult.setEmailno(emailno);
		emailresult.setEmailpwd(emailpwd);

		emailresult = emailResultDAO.getemailresult(emailresult);
		if(emailresult.getDeptID()!=null){
			String deptname = emailResultDAO.getdeptname(emailresult.getDeptID());
			emailresult.setDeptname(deptname);
		}
		return emailresult;
	}
}
