package com.housing.management.backend.domain;

/**
 * 房产办证预约出号表
 * 
 * @author xubj
 *
 */
public class FcbzyyChb extends BaseObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7307820338578993493L;
	
	//'房产办证预约出号'
	private String chbId;
	//'序号'
	private String xh;
	//'受理时间段'
	private String sjd;
	//'受理时间'
	private String slsj;
	//'受理地点ID'
	private String slddId;
	
	// 日期
	private String cjsj;
	// 剩余次数
	private String yysy;
	
	public String getYysy() {
		return yysy;
	}
	public void setYysy(String yysy) {
		this.yysy = yysy;
	}
	public String getCjsj() {
		return cjsj;
	}
	public void setCjsj(String cjsj) {
		this.cjsj = cjsj;
	}
	public String getChbId() {
		return chbId;
	}
	public void setChbId(String chbId) {
		this.chbId = chbId;
	}
	public String getXh() {
		return xh;
	}
	public void setXh(String xh) {
		this.xh = xh;
	}
	public String getSjd() {
		return sjd;
	}
	public void setSjd(String sjd) {
		this.sjd = sjd;
	}
	public String getSlsj() {
		return slsj;
	}
	public void setSlsj(String slsj) {
		this.slsj = slsj;
	}
	public String getSlddId() {
		return slddId;
	}
	public void setSlddId(String slddId) {
		this.slddId = slddId;
	}
}
