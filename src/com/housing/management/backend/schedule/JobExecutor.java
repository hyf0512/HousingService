package com.housing.management.backend.schedule;


import com.housing.management.backend.domain.Job;


// 多线程执行Job
public class JobExecutor implements Runnable {
	
	private Job job;
	
	private JobCommonHandler jobService;
	
	public JobExecutor(Job job, JobCommonHandler jobService) {
		this.job=job;
		this.jobService=jobService;	
	}

	@Override
	public void run() {
		jobService.handleJob(job);
	}

}
