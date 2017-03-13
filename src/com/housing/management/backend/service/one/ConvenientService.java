package com.housing.management.backend.service.one;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.housing.management.backend.dao.TpmBsdDAO;
import com.housing.management.backend.domain.TpmBsd;

@Service
public class ConvenientService {
	
	@Autowired
	private TpmBsdDAO tpmBsdDAO;
	
	public List<TpmBsd> getAddressList(String bsdLx){
		return tpmBsdDAO.getAddressList(bsdLx);
		
	}
	
	public TpmBsd getAddressInfo(String id){
		return tpmBsdDAO.getAddressInfo(id);
		
	}

}
