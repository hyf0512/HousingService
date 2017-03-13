package com.housing.management.backend.domain;


import java.sql.Timestamp;

/**
 * 政务动态：“住保房管动态”
 */
public class HousingNews extends PageData {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6978480276099999681L;
	
	// 类型ID
	private String columnId;

	// 新闻ID
	private String contentId;
	// 新闻标题
	private String title;
	// 子标题
	private String subTitle;
	// 短标题
	private String shortTitle;
	// 跳转超链接
	private String directUrl;

	// 新闻内容 数据库对象
	private Object content;
	// 新闻内容，输出对象,前台显示用（内容里面，包含HTML标签）
	private String outputContent;
	
	// 发布文号		
	private String fbNo;
	// 发布部门		
	private String fbDep;
	// 发布截止日期
	private Timestamp limitTime;
	// 发布时间
	private Timestamp fbDate;
	// logo的url
	private String logoUrl;
	// 点击量
	private Integer click;

	// 是热点新闻
	private Integer isHot;
	// 是头条
	private Integer isTop;
	
	
	public String getOutputContent() {
		return outputContent;
	}
	public void setOutputContent(String outputContent) {
		this.outputContent = outputContent;
	}
	public String getFbNo() {
		return fbNo;
	}
	public void setFbNo(String fbNo) {
		this.fbNo = fbNo;
	}
	public String getFbDep() {
		return fbDep;
	}
	public void setFbDep(String fbDep) {
		this.fbDep = fbDep;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public String getShortTitle() {
		return shortTitle;
	}
	public void setShortTitle(String shortTitle) {
		this.shortTitle = shortTitle;
	}
	public String getDirectUrl() {
		return directUrl;
	}
	public void setDirectUrl(String directUrl) {
		this.directUrl = directUrl;
	}
	public Timestamp getFbDate() {
		return fbDate;
	}
	public void setFbDate(Timestamp fbDate) {
		this.fbDate = fbDate;
	}
	public String getLogoUrl() {
		return logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	public Integer getClick() {
		return click;
	}
	public void setClick(Integer click) {
		this.click = click;
	}
	public Integer getIsHot() {
		return isHot;
	}
	public void setIsHot(Integer isHot) {
		this.isHot = isHot;
	}
	public Integer getIsTop() {
		return isTop;
	}
	public void setIsTop(Integer isTop) {
		this.isTop = isTop;
	}
	public String getColumnId() {
		return columnId;
	}
	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}
	public String getContentId() {
		return contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Object getContent() {
		return content;
	}
	public void setContent(Object content) {
		this.content = content;
	}
	public Timestamp getLimitTime() {
		return limitTime;
	}
	public void setLimitTime(Timestamp limitTime) {
		this.limitTime = limitTime;
	}

	
	
}
