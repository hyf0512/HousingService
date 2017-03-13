package com.housing.management.backend.domain;

public class EmailResult extends BaseObject{

	/**
	 * 查询咨询结果
	 */
	private static final long serialVersionUID = -8510306124204952584L;
	private String emailno;
	private String emailpwd;
	private String emailsubject;//主题
	private String emailkindid;//类型：51101为咨询，51102为建议，51103为投诉
	private String emailtime;//发件时间
	private String emailtext;//正文
	private String emailnum;//受理编号
	private String operationclass;
	//受理类别:51306为住房保障及制度改革51301物业管理51302物业维修基金管理51304房产交易产权管理51305城市房屋拆迁管理51307白蚁防治
	//51308房产档案管理51309房产信息服务51310房产市场管理51311房屋安全鉴定51312综合类
	
	private String replyphone;//联系电话
	private String replycode;//邮编
	private String replyaddress;//联系地址
	private String replytime;//反馈时间
	private String replytext;//反馈意见
	
	private String staffname;//经办人
	private String stafftel;//经办人联系电话
	private String handovermark;//是否被回答，1为已回答，0为未回答
	private String deptname;//承办单位名字
	private String deptID;//承办单位ID，通过ID查找单位名字
	public void setEmailno(String emailno){
		this.emailno = emailno;
	}
	public String getEmailno(){
		return emailno;
	}
	public void setEmailpwd(String emailpwd){
		this.emailpwd = emailpwd;
	}
	public String getEmailpwd(){
		return emailpwd;
	}
	public void setEmailsubject(String emailsubject){
		this.emailsubject = emailsubject;
	}
	public String getEmailsubject(){
		return emailsubject;
	}
	public void setEmailkindid(String emailkindid){
		this.emailkindid = emailkindid;
	}
	public String getEmailkindid(){
		return emailkindid;
	}
	public void setEmailtime(String emailtime){
		this.emailtime = emailtime;
	}
	public String getEmailtime(){
		return emailtime;
	}
	public void setReplyphone(String replyphone){
		this.replyphone = replyphone;
	}
	public String getReplyphone(){
		return replyphone;
	}
	public String getOperationclass(){
		return operationclass;
	}
	public void setOperationclass(String operationclass){
		this.operationclass = operationclass;
	}
	public void setReplycode(String replycode){
		this.replycode = replycode;
	}
	public String getReplycode(){
		return replycode;
	}
	public void setReplyaddress(String replyaddress){
		this.replyaddress = replyaddress;
	}
	public String getReplyaddress(){
		return replyaddress;
	}
	public void setEmailtext(String emailtext){
		this.emailtext = emailtext;
	}
	public String getEmailtext(){
		return emailtext;
	}
	public void setEmailnum(String emailnum){
		this.emailnum = emailnum;
	}
	public String getEmailnum(){
		return emailnum;
	}
	public void setReplytime(String replytime){
		this.replytime = replytime;
	}
	public String getReplytime(){
		return replytime;
	}
	public void setStaffname(String staffname){
		this.staffname = staffname;
	}
	public String getStaffname(){
		return staffname;
	}
	public void setStafftel(String stafftel){
		this.stafftel = stafftel;
	}
	public String getStafftel(){
		return stafftel;
	}
	public void setReplytext(String replytext){
		this.replytext = replytext;
	}
	public String getReplytext(){
		return replytext;
	}
	public void setHandovermark(String handovermark){
		this.handovermark = handovermark;
	}
	public String getHandovermark(){
		return handovermark;
	}
	public void setDeptname(String deptname){
		this.deptname = deptname;
	}
	public String getDeptname(){
		return deptname;
	}
	public void setDeptID(String deptID){
		this.deptID = deptID;
	}
	public String getDeptID(){
		return deptID;
	}
}
