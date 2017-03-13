package com.housing.management.backend.domain;

import java.util.Date;



public class JobRepo  extends BaseObject{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 4645754872090872383L;
	
	private String job_name;
	private String job_handler;
	private String job_parameter; 
	private String cron_exp; 
    private String active_status;
	private String remark;
	private Date last_run_time;
	private Date next_run_time;
	private int run_status;
	private String create_user;
	private Date create_time;
	
	private String update_user;
	private Date update_time;
	
	public String getUpdate_user() {
		return update_user;
	}
	public void setUpdate_user(String update_user) {
		this.update_user = update_user;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	public String getCreate_user() {
		return create_user;
	}
	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
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
	public String getCron_exp() {
		return cron_exp;
	}
	public void setCron_exp(String cron_exp) {
		this.cron_exp = cron_exp;
	}
	public String getActive_status() {
		return active_status;
	}
	public void setActive_status(String active_status) {
		this.active_status = active_status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getLast_run_time() {
		return last_run_time;
	}
	public void setLast_run_time(Date last_run_time) {
		this.last_run_time = last_run_time;
	}
	public Date getNext_run_time() {
		return next_run_time;
	}
	public void setNext_run_time(Date next_run_time) {
		this.next_run_time = next_run_time;
	}
	public int getRun_status() {
		return run_status;
	}
	public void setRun_status(int run_status) {
		this.run_status = run_status;
	}
}
