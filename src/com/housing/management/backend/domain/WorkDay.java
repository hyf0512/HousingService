package com.housing.management.backend.domain;

public class WorkDay extends BaseObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5498785221120455798L;
	
	private String id;
	
	private String bz;
	
	private String wdDate;
	
	public String getWdDate() {
		return wdDate;
	}

	public void setWdDate(String wdDate) {
		this.wdDate = wdDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}
	
	

}
