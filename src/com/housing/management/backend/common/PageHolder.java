package com.housing.management.backend.common;

import java.io.Serializable;
import java.util.List;

public class PageHolder<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2150653899896264722L;

	private int pageSize;//每页条数

	private int pageIndex;//当前页数
	
	private int pageTotal;//总页数 
	
	private List<T> rows;
	
	private boolean status=true;//状态

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
	
	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
