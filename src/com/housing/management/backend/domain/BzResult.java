package com.housing.management.backend.domain;//办证结果信息

public class BzResult extends BaseObject{


	/**
	 * 
	 */
	private static final long serialVersionUID = -7258356097992570898L;
	// 受理番号
	private String id;
	// 用户名
	private String name;
	private boolean show_info_more;//是否显示具体信息
	//判断要输出何种信息：
	//0代表数据库中没有此编号，请重输，
	//1代表编号和出入方名称不相符，请重输
	//2代表业务正在办理
	//3代表已办结并已领证
	//4代表已办结，可以领证
	private int show_info;
	private String cfmc;//出方名称
	private String sfmc;//受方名称
	private String type;//交易类型
	private String address;//房屋坐落
	
	// 查询用受理番号
	private String slbh;



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isShow_info_more() {
		return show_info_more;
	}

	public void setShow_info_more(boolean show_info_more) {
		this.show_info_more = show_info_more;
	}

	public int getShow_info() {
		return show_info;
	}

	public void setShow_info(int show_info) {
		this.show_info = show_info;
	}

	public String getCfmc() {
		return cfmc;
	}

	public void setCfmc(String cfmc) {
		this.cfmc = cfmc;
	}

	public String getSfmc() {
		return sfmc;
	}

	public void setSfmc(String sfmc) {
		this.sfmc = sfmc;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSlbh() {
		return slbh;
	}

	public void setSlbh(String slbh) {
		this.slbh = slbh;
	}


}
