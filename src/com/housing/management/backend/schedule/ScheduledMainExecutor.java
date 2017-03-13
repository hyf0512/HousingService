package com.housing.management.backend.schedule;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

import org.apache.log4j.Logger;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.housing.management.backend.common.Utils;

public class ScheduledMainExecutor implements Runnable {

	private static final Logger logger = Logger
			.getLogger(ScheduledMainExecutor.class);

	private static CopyOnWriteArraySet<Integer> jobSet = new CopyOnWriteArraySet<Integer>();

	private ThreadPoolTaskExecutor taskExecutor;

	private JobCommonHandler jobService;
//
//	private JobDAO jobDao;

	@Override
	public void run() {

		logger.info("main scheduler triggerd");

		String hostname = Utils.getHostName();
		
		Date sysdate=Calendar.getInstance().getTime();
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("host_name",hostname );
		params.put("sys_date", sysdate);

//		List<Job> jobs = jobDao.listAllJobs(params);
//
//		logger.info("jobs found: " + jobs.size());
//
//		//logger.info("cache job size: " + jobSet.size());
//
//		for (Job job : jobs) {
//			if (jobSet.contains(job.getJob_id())) {
//				// job already dispatched,no action
//				logger.info("in running: "+job.getJob_id());
//			} else {
//				logger.info("new added: "+job.getJob_id());
//				jobSet.add(job.getJob_id());
//				taskExecutor.execute(new JobExecutor(job, jobService));
//			}
//
//		}

	}
	
	
	public static void clearCacheJobID(int job_id){
		jobSet.remove(job_id);
	}

//	public JobDAO getJobDao() {
//		return jobDao;
//	}
//
//	public void setJobDao(JobDAO jobDao) {
//		this.jobDao = jobDao;
//	}

	public ThreadPoolTaskExecutor getTaskExecutor() {
		return taskExecutor;
	}

	public void setTaskExecutor(ThreadPoolTaskExecutor taskExecutor) {
		this.taskExecutor = taskExecutor;
	}

	public JobCommonHandler getJobService() {
		return jobService;
	}

	public void setJobService(JobCommonHandler jobService) {
		this.jobService = jobService;
	}

}
