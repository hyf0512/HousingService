package com.housing.management.backend.domain;

public class Picture extends BaseObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3023737387078852865L;
	private String result;//是否上传成功
	private String fileData;//Base64编码过的图片数据信息
	private String slbh;//受理编号
	public void setSlbh(String slbh){
		this.slbh = slbh;
	}
	public String getSlbh(){
		return slbh;
	}
	public void setFileData(String fileDate){
		this.fileData = fileDate;
	}
	public String getFileData(){
		return fileData;
	}
	public void setResult(String result){
		this.result = result;
	}
	public String getResult(){
		return result;
	}
}
