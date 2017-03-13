package com.housing.management.backend.job;

import java.util.Date;

import net.sf.json.JSONObject;

import org.apache.cxf.common.util.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.housing.management.backend.common.Utils;
import com.housing.management.backend.domain.Job;
import com.housing.management.backend.domain.JobResult;
@Component
public class DailyJobExample implements JobInterface{
	
	 private static Logger logger = Logger.getLogger(DailyJobExample.class);
//	@Autowired
//	private JobDAO jobDao;
	

	@Override
	public JobResult process(String jobParameter) {
		if(!StringUtils.isEmpty(jobParameter)){
		logger.info(JSONObject.fromObject(jobParameter).toString());
		}
		// TODO Auto-generated method stub
		JobResult result=new JobResult();
		result.setCode("1");
		return result;
	}
	
	
	public void createJob(){
		logger.info("cteate job daily");
		JSONObject jo = new JSONObject();
		jo.put("job_para1", "test1");
		jo.put("job_para2", "test2");
		
		Job job=new Job();
		job.setJob_name("dail job");
		job.setJob_handler("dailyJobExample");
		
		job.setJob_parameter(jo.toString());
		
		job.setLoad_balancer(Utils.getHostName());
		job.setCreate_time(new Date());
		job.setHandle_time(new Date());
		//jobDao.createJob(job); comment out for testing purpose
		
		
	}

}
