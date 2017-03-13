package com.housing.management.backend.domain;

/**
 * 房产办证预约受理地点
 * 
 * @author xubj
 *
 */
public class FcbzyySldd extends BaseObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4036818368658165368L;

	//'房产办证预约受理地点ID'
	private String slddId;
	//'受理地点'
	private String sldd;
	//'受理窗口'
	private String slck;
	
	public String getSlddId() {
		return slddId;
	}
	public void setSlddId(String slddId) {
		this.slddId = slddId;
	}
	public String getSldd() {
		return sldd;
	}
	public void setSldd(String sldd) {
		this.sldd = sldd;
	}
	public String getSlck() {
		return slck;
	}
	public void setSlck(String slck) {
		this.slck = slck;
	}

}
