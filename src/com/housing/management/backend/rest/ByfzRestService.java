package com.housing.management.backend.rest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.housing.management.backend.domain.Byfz;
import com.housing.management.backend.service.three.ByfzService;

@Controller
@RequestMapping({ "/byfz" })
public class ByfzRestService {
	private static final Logger logger = Logger.getLogger(ByfzRestService.class);
	@Autowired
	private ByfzService byfzservice = new ByfzService();
	//private ByfzinsertService insertservice = new ByfzinsertService();
	
	@RequestMapping(value = { "/check/info" } , method = { RequestMethod.POST })
	@ResponseBody
	public Byfz Getcheckresult(@RequestBody Byfz byfz) {
		logger.info("查询结果开始");
		int cz=1;
		if(byfz.getCzlx().equals("查询")){
			cz=1;
		}
		else if(byfz.getCzlx().equals("插入")){
			cz=2;
		}
		else if(byfz.getCzlx().equals("更新")){
			cz=3;
		}
		Byfz result = byfzservice.check(byfz,cz);
		System.out.println(result.getName());
		logger.info("查询结果结束");
		return result;
	}
	
	@RequestMapping(value = { "/information/insert" } , method = { RequestMethod.POST })
	@ResponseBody
	public Byfz Byfzinsert(@RequestBody Byfz byfz){
		logger.info("插入信息开始");
		Byfz result = byfzservice.check(byfz,2);
		logger.info("插入信息结束");
		return result;	
	}
	@RequestMapping(value = { "/information/update" } , method = { RequestMethod.POST })
	@ResponseBody
	public Byfz Byfzupdate(@RequestBody Byfz byfz){
		logger.info("更新信息开始");
		Byfz result = byfzservice.check(byfz,3);
		logger.info("更新信息结束");
		return result;	
	}

}
