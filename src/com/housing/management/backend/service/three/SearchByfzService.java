package com.housing.management.backend.service.three;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.housing.management.backend.dao.ByfzDAO;
import com.housing.management.backend.domain.Byfz;

@Service
public class SearchByfzService {
	@Autowired
	private ByfzDAO byfzdao;
	public Byfz SearchByfz(Byfz byfz){
		if(byfz.getSearchlb().equals("1")){
			System.out.println(1);
			byfz=byfzdao.searchbyfz1(byfz);
		}
		else if(byfz.getSearchlb().equals("2")){
			System.out.println(2);
			byfz=byfzdao.searchbyfz2(byfz);
		}
		else if(byfz.getSearchlb().equals("3")){
			System.out.println(3);
			byfz=byfzdao.searchbyfz3(byfz);
		}
		else if(byfz.getSearchlb().equals("4")){
			System.out.println(4);
			byfz=byfzdao.searchbyfz4(byfz);
		}
		return byfz;
	}
}
