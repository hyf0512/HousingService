package com.housing.management.backend.domain;


public class JobResult extends BaseObject{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -6676446936135607865L;
	private String code;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	private String reason;

}
