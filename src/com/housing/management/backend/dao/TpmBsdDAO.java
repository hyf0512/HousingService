package com.housing.management.backend.dao;

import java.util.List;

import com.housing.management.backend.domain.TpmBsd;

public interface TpmBsdDAO {
	
	/**
	 * 地址列表
	 * 
	 */
	public abstract TpmBsd getAddressInfo(String id);
	
	
	public abstract List<TpmBsd> getAddressList(String bsdLx);

}
