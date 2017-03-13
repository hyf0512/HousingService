package com.housing.management.backend.domain;

public class Fcbzyy extends BaseObject {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2296668872556442282L;
	
	private String id;
	// 预约号
	private String yyh;
	// 预约日期
	private String yyrq;
	// 出号ID
	private String chbId;
	// 预约登陆账号用户ID
	private String userId;
	// 预约业务类别
	private String ywlb;
	private String name;	//姓名
	private String cId;		//身份证
	private String mob;		//手机
	private String sfdhyy;	//是否电话预约
	private String cjsj;	//日期
	private String lsbz;	//历史标志
	private String qxsj;	//取消时间
	private String password;//加密后的密码
	private String slck;//受理窗口
	private String slsj;//受理时间
	private String sjd;//时间点
	private String sldd;//受理地点
	// 登录用用户和密码
	private String loginUserName;
	private String loginPassword;
	private String registerId;
	private String cancelresult;
	public String getCancelresult(){
		return cancelresult;
	}
	public void setCancelresult(String cancelresult){
		this.cancelresult = cancelresult;
	}
	public String getSldd(){
		return sldd;
	}
	public void setSldd(String sldd){
		this.sldd = sldd;
	}
	public String getSjd(){
		return sjd;
	}
	public void setSjd(String sjd){
		this.sjd = sjd;
	}
	public String getRegisterId(){
		return registerId;
	}
	public void setRegisterId(String registerId){
		this.registerId = registerId;
	}
	public String getSlsj(){
		return slsj;
	}
	public void setSlsj(String slsj){
		this.slsj = slsj;
	}
	public String getSlck(){
		return slck;
	}
	public void setSlck(String slck){
		this.slck = slck;
	}
	public String getLoginUserName() {
		return loginUserName;
	}
	public void setLoginUserName(String loginUserName) {
		this.loginUserName = loginUserName;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getYyh() {
		return yyh;
	}
	public void setYyh(String yyh) {
		this.yyh = yyh;
	}
	public String getYyrq() {
		return yyrq;
	}
	public void setYyrq(String yyrq) {
		this.yyrq = yyrq;
	}
	public String getChbId() {
		return chbId;
	}
	public void setChbId(String chbId) {
		this.chbId = chbId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getYwlb() {
		return ywlb;
	}
	public void setYwlb(String ywlb) {
		this.ywlb = ywlb;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getSfdhyy() {
		return sfdhyy;
	}
	public void setSfdhyy(String sfdhyy) {
		this.sfdhyy = sfdhyy;
	}
	public String getCjsj() {
		return cjsj;
	}
	public void setCjsj(String cjsj) {
		this.cjsj = cjsj;
	}
	public String getLsbz() {
		return lsbz;
	}
	public void setLsbz(String lsbz) {
		this.lsbz = lsbz;
	}
	public String getQxsj() {
		return qxsj;
	}
	public void setQxsj(String qxsj) {
		this.qxsj = qxsj;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}
	

}
