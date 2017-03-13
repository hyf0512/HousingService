package com.housing.management.backend.dao;

import java.util.List;

import com.housing.management.backend.domain.Fcbzyy;
import com.housing.management.backend.domain.FcbzyyChb;
import com.housing.management.backend.domain.FcbzyySldd;
import com.housing.management.backend.domain.FcbzyyYwlb;
import com.housing.management.backend.domain.WorkDay;

public interface FcbzyyDAO {
	
	public abstract List<FcbzyySldd> getAddressList();
	public abstract List<FcbzyyChb> getTimeList(String slddId);
	public abstract List<FcbzyyYwlb> getBussinessTypeList();
	public abstract List<FcbzyyChb> getDateList(String slddId);
	public abstract Fcbzyy login(Fcbzyy fcbzyy);
	public abstract String getDay(int i);
	
	public abstract int insertInfo(Fcbzyy fcbzyy);
	public abstract int getYyzs(String id);
	public abstract int getYyys(FcbzyyChb fcbzyychb);
	
	// Test
	public abstract List<WorkDay> getWorkDayList();
	public abstract List<Fcbzyy> getFcbzyy(String userId);
	public abstract void updateFcbzyy(Fcbzyy fcbzyy);
	public abstract Fcbzyy searchyydetil(String yyh);
	
}
