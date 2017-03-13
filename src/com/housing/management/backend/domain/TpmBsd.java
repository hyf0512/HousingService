package com.housing.management.backend.domain;

/**
 * 办事点查询
 * 
 * @author xubj
 *
 */
public class TpmBsd extends BaseObject{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1306315431614088469L;
	
	//'办事点'
	private String tpmBsdId;
	//'办事点类型：1产权登记 2住房保障 3维修中心'
	private String bsdLx;
	//'办事点名称'
	private String bsdMc;
	//'地址'
	private String dz;
	//'咨询电话'
	private String zxdh;
	//'坐标纬度（百度地图）'
	private String zbwd;
	//'坐标经度（百度地图）'
	private String zbjd;
	//'位置示意图（图片URL路径）'
	private String ddsyt;

	
	public String getBsdLx() {
		return bsdLx;
	}
	
	public String getTpmBsdId() {
		return tpmBsdId;
	}

	public void setTpmBsdId(String tpmBsdId) {
		this.tpmBsdId = tpmBsdId;
	}

	public void setBsdLx(String bsdLx) {
		this.bsdLx = bsdLx;
	}
	public String getBsdMc() {
		return bsdMc;
	}
	public void setBsdMc(String bsdMc) {
		this.bsdMc = bsdMc;
	}
	public String getDz() {
		return dz;
	}
	public void setDz(String dz) {
		this.dz = dz;
	}
	public String getZxdh() {
		return zxdh;
	}
	public void setZxdh(String zxdh) {
		this.zxdh = zxdh;
	}
	public String getZbwd() {
		return zbwd;
	}
	public void setZbwd(String zbwd) {
		this.zbwd = zbwd;
	}
	public String getZbjd() {
		return zbjd;
	}
	public void setZbjd(String zbjd) {
		this.zbjd = zbjd;
	}
	public String getDdsyt() {
		return ddsyt;
	}
	public void setDdsyt(String ddsyt) {
		this.ddsyt = ddsyt;
	}
	
	

}
