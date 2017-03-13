package com.housing.management.backend.schedule;

import org.apache.log4j.Logger;

import com.housing.management.backend.common.ApplicationContextHelper;
import com.housing.management.backend.domain.Job;
import com.housing.management.backend.domain.JobResult;

public class JobCommonHandler  {
	
	private static final Logger logger = Logger.getLogger(JobCommonHandler.class);
	
//	private JobDAO jobDao;
//	
//	
//	public JobDAO getJobDao() {
//		return jobDao;
//	}
//
//	public void setJobDao(JobDAO jobDao) {
//		this.jobDao = jobDao;
//	}


	public void handleJob(Job job){		
		logger.info("begin handle job");	
		JobResult result=new JobResult();
		
		try{
			//Object handler = beanFactory.getBean(job.getJob_handler());
			Object handler = ApplicationContextHelper.getBean(job.getJob_handler());
			Class cl = handler.getClass();
			result = (JobResult) cl.getMethod("process", String.class).invoke(
					handler, job.getJob_parameter());
			logger.info(result);
			
		}catch(Exception e){
			logger.error("got error when handling job", e);
			result.setCode("2");
			result.setReason("error caused by: "+e.getCause());
		}
		
		if(result.getCode().equals("1")){
			//job done successfully
			job.setStatus(1);
//			jobDao.deleteJob(job);
//			job.setHis_create_time(new Date());
//			jobDao.createJobHistory(job);
			
		}else{
			if(job.getRetry_count()<=2){
				//add retry logic
				logger.info("retry count +1");
				job.setRetry_count(job.getRetry_count()+1);
//				jobDao.updateJobStatus(job);		
			}else{
				//retry count > 3,  
				logger.info("retry count: "+ job.getRetry_count());
				logger.info("add into failure record");
				job.setStatus(2);
//				jobDao.deleteJob(job);
//				job.setHis_create_time(new Date());
//				job.setComments(result.getReason());
//				jobDao.createJobHistory(job);
			}	
		}
		ScheduledMainExecutor.clearCacheJobID(job.getJob_id());	
	}
	
	
}
