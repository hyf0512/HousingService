package com.housing.management.backend.dao;

import java.util.List;

import com.housing.management.backend.domain.Gzfhfsq;

public interface GzfhfsqDAO {
	
	public abstract List<Gzfhfsq> getGzfhfsqList(Gzfhfsq gzfhfsq);
	public abstract Gzfhfsq getGzfhfsqDetail(Integer fzfhfsqId);
	public abstract Integer getGzfhfsqID(Gzfhfsq gzfhfsq);
	public abstract Integer getGzfhfsqListCount();
	public abstract void updateGzfhfsq(Gzfhfsq gzfhfsq);
}
