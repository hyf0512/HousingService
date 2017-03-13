package com.housing.management.backend.domain;

/**
 * 机构职能
 */
public class JgryDept extends BaseObject{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8974202536624527383L;
	//部门编号
	private String deptId;
		// 部门全称'
	private String deptName;

	 //'部门简称'
	private String shortName;
	 //'上级部门编号'
	private String parDetpId;

	//'上级部门名称'
	private String parDept;
	
	//'部门排序'
	private String deptIndex;
	 //'总机'
	private String tel;
	 //'传真'
	private String fax;
	 //'邮编'
	private String post;
	 //'地址'
	private String address;
	//'邮箱'
	private String email;
	 //'职责'
	private String mainduty;
	 //'是否公示'
	private Integer isShow;
	 //'值班电话'
	private String onDutyTel;
	//'咨询电话'
	private String askTel;
	//'是否是领导班子'
	private Integer isleader;
	//'是否删除'
	private String delFlag;
	//'基本信息'
	private String jbxx;
	 //'投诉电话'
	private String tsTel;
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getParDetpId() {
		return parDetpId;
	}
	public void setParDetpId(String parDetpId) {
		this.parDetpId = parDetpId;
	}
	public String getParDept() {
		return parDept;
	}
	public void setParDept(String parDept) {
		this.parDept = parDept;
	}
	public String getDeptIndex() {
		return deptIndex;
	}
	public void setDeptIndex(String deptIndex) {
		this.deptIndex = deptIndex;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMainduty() {
		return mainduty;
	}
	public void setMainduty(String mainduty) {
		this.mainduty = mainduty;
	}
	public Integer getIsShow() {
		return isShow;
	}
	public void setIsShow(Integer isShow) {
		this.isShow = isShow;
	}

	public Integer getIsleader() {
		return isleader;
	}
	public void setIsleader(Integer isleader) {
		this.isleader = isleader;
	}
	public String getDelFlag() {
		return delFlag;
	}
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	public String getOnDutyTel() {
		return onDutyTel;
	}
	public void setOnDutyTel(String onDutyTel) {
		this.onDutyTel = onDutyTel;
	}
	public String getAskTel() {
		return askTel;
	}
	public void setAskTel(String askTel) {
		this.askTel = askTel;
	}
	public String getJbxx() {
		return jbxx;
	}
	public void setJbxx(String jbxx) {
		this.jbxx = jbxx;
	}
	public String getTsTel() {
		return tsTel;
	}
	public void setTsTel(String tsTel) {
		this.tsTel = tsTel;
	}
	

}
