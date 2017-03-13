package com.housing.management.backend.job;

import com.housing.management.backend.domain.JobResult;

public interface JobInterface {

	// jobParameter:JSON格式
	public JobResult process(String jobParameter);
}
