package com.housing.management.backend.domain;

public class FcbzyyYwlb extends BaseObject {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4648209497606629158L;
	
	//'房产办证预约业务类别'
	private String ywlbId;
	//'房产办证预约业务类别'
	private String ywlb;
	//'对应的办证指南链接'
	private String link;
	
	public String getYwlbId() {
		return ywlbId;
	}
	public void setYwlbId(String ywlbId) {
		this.ywlbId = ywlbId;
	}
	public String getYwlb() {
		return ywlb;
	}
	public void setYwlb(String ywlb) {
		this.ywlb = ywlb;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}

}
