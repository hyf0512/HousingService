package com.housing.management.backend.dao;

import java.util.List;

import com.housing.management.backend.domain.User;


public interface UserDAO {

//	/**
//	 * 查询用户
//	 * 
//	 * @param userId
//	 * 
//	 * @result User
//	 */
//	public abstract User getUserByID(String userId);
//	
	/**
	 * 查询用户
	 * 
	 * @param userId
	 * 
	 * @result User
	 */
	public abstract List<User> getUserList(String userId);
	
	
}
