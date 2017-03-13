package com.housing.management.backend.domain;

public class User extends BaseObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3453695535860079875L;
	
	private String fUserId;
	
	private String fNickname;

	public String getfUserId() {
		return fUserId;
	}

	public void setfUserId(String fUserId) {
		this.fUserId = fUserId;
	}

	public String getfNickname() {
		return fNickname;
	}

	public void setfNickname(String fNickname) {
		this.fNickname = fNickname;
	}
	
	


}
