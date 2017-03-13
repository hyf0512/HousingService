package com.housing.management.backend.domain;

import java.util.Date;

public class Job  extends BaseObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1670973895816884364L;
	
	
	private int job_id;
	private String job_name;
	private String job_handler;
	private String job_parameter; 
	private String load_balancer; 
	private int retry_count;
	private int status; // 0:unhandled , 1:success 2: failure
	private Date create_time;
	private Date handle_time;
	private Date his_create_time; //job history create time
	
	private String comments="";
	
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Date getHis_create_time() {
		return his_create_time;
	}
	public void setHis_create_time(Date his_create_time) {
		this.his_create_time = his_create_time;
	}
	public int getJob_id() {
		return job_id;
	}
	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}
	public String getJob_name() {
		return job_name;
	}
	public void setJob_name(String job_name) {
		this.job_name = job_name;
	}
	public String getJob_handler() {
		return job_handler;
	}
	public void setJob_handler(String job_handler) {
		this.job_handler = job_handler;
	}
	public String getJob_parameter() {
		return job_parameter;
	}
	public void setJob_parameter(String job_parameter) {
		this.job_parameter = job_parameter;
	}
	public String getLoad_balancer() {
		return load_balancer;
	}
	public void setLoad_balancer(String load_balancer) {
		this.load_balancer = load_balancer;
	}
	public int getRetry_count() {
		return retry_count;
	}
	public void setRetry_count(int retry_count) {
		this.retry_count = retry_count;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getHandle_time() {
		return handle_time;
	}
	public void setHandle_time(Date handle_time) {
		this.handle_time = handle_time;
	}
	

}
