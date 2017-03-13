package com.housing.management.backend.domain;

import java.io.Serializable;

public class EmailUser implements Serializable{

	/**
	 * 咨询
	 */
	private static final long serialVersionUID = 2579979068888664296L;
	private int emailID;
	private String emailsubject;
	private int emailkindID;
	private String emailtime;
	private int replyweb;
	private String sendman;
	private int operationclass;
	private String replyemail;
	private String replyphone;
	private String replyfax;
	private String replyaddress;
	private int replycode;
	private String emailtext;
	private String emailno;
	private String emailpwd;
	private String visitorIP;
	public void setEmailID(int emailID){
		this.emailID = emailID;
	}
	public int getEmailID(){
		return emailID;
	}
	public void setEmailsubject(String emailsubject){
		this.emailsubject = emailsubject;
	}
	public String getEmailsubject(){
		return emailsubject;
	}
	public void setEmailkindID(int emailkindID){
		this.emailkindID = emailkindID;
	}
	public int getEmailkindID(){
		return emailkindID;
	}
	public void setEmailtime(String emailtime){
		this.emailtime = emailtime;
	}
	public String getEmailtime(){
		return emailtime;
	}
	public void setReplyweb(int replyweb){
		this.replyweb = replyweb;
	}
	public int getReplyweb(){
		return replyweb;
	}
	public void setSendman(String sendman){
		this.sendman = sendman;
	}
	public String getSendman(){
		return sendman;
	}
	public void setOperationclass(int operationclass){
		this.operationclass = operationclass;
	}
	public int getOperationclass(){
		return operationclass;
	}
	public void setReplyemail(String replyemail){
		this.replyemail = replyemail;
	}
	public String getReplyemail(){
		return replyemail;
	}
	public void setReplyphone(String replyphone){
		this.replyphone = replyphone;
	}
	public String getReplyphone(){
		return replyphone;
	}
	public void setReplyfax(String replyfax){
		this.replyfax = replyfax;
	}
	public String getReplyfax(){
		return replyfax;
	}
	public void setReplyaddress(String replyaddress){
		this.replyaddress = replyaddress;
	}
	public String getReplyaddress(){
		return replyaddress;
	}
	public void setReplycode(int replycode){
		this.replycode = replycode;
	}
	public int getReplycode(){
		return replycode;
	}

	public void setEmailtext(String emailtext){
		this.emailtext = emailtext;
	}
	public String getEmailtext(){
		return emailtext;
	}
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
	public void setVisitorIP(String visitorIP){
		this.visitorIP = visitorIP;
	}
	public String getVisitorIP(){
		return visitorIP;
	}
}
