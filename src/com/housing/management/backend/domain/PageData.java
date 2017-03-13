package com.housing.management.backend.domain;

public class PageData extends BaseObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3332661609277990246L;

	protected int pageSize;//每页条数

	protected int pageIndex;//当前页数
	
	protected int pageTotal;//总页数
	
	protected int fromRowNum;//起始行数
	
	protected int toRowNum;//截止行数

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageTotal() {
		return pageTotal;
	}

	public void setPageTotal(int pageTotal) {
		this.pageTotal = pageTotal;
	}

	public int getFromRowNum() {
		return fromRowNum;
	}

	public void setFromRowNum(int fromRowNum) {
		this.fromRowNum = fromRowNum;
	}

	public int getToRowNum() {
		return toRowNum;
	}

	public void setToRowNum(int toRowNum) {
		this.toRowNum = toRowNum;
	}
}
