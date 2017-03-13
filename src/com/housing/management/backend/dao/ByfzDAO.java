package com.housing.management.backend.dao;

import com.housing.management.backend.domain.Byfz;
import com.housing.management.backend.domain.PayResult;

public interface ByfzDAO {

	public abstract void insert(Byfz byfz);
	public abstract Byfz getupdate(Long bid);
	public abstract String getsl(String today);
	public abstract void setsl(Byfz byfz);
	public abstract int update(Byfz byfz);
	public abstract Byfz searchbyfz1(Byfz byfz);
	public abstract Byfz searchbyfz2(Byfz byfz);
	public abstract Byfz searchbyfz3(Byfz byfz);
	public abstract Byfz searchbyfz4(Byfz byfz);
	public abstract PayResult searchresult(String orderNo);
	public abstract void insertresult(PayResult payresult);
	public abstract void updatepay(PayResult payresult);
	public abstract Byfz returnresult(Byfz byfz);
}
