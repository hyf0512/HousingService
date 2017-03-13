package com.housing.management.backend.soa;

import java.io.Serializable;

public class CokeCalendarSOA extends Base implements Serializable, Comparable<CokeCalendarSOA>{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7429001106763840829L;
	/* 顺序 第几月或第几年 */
	private String periodID;
	/* 类型 */
    private String periodType;
    /* 截止年 */
    private String periodEndYear;
    /* 截止月 */
    private String periodEndMonth;
    /* 截止日 */
    private String periodEndDate;
	public String getPeriodID() {
		return periodID;
	}
	public void setPeriodID(String periodID) {
		this.periodID = periodID;
	}
	public String getPeriodType() {
		return periodType;
	}
	public void setPeriodType(String periodType) {
		this.periodType = periodType;
	}
	public String getPeriodEndYear() {
		return periodEndYear;
	}
	public void setPeriodEndYear(String periodEndYear) {
		this.periodEndYear = periodEndYear;
	}
	public String getPeriodEndMonth() {
		return periodEndMonth;
	}
	public void setPeriodEndMonth(String periodEndMonth) {
		this.periodEndMonth = periodEndMonth;
	}
	public String getPeriodEndDate() {
		return periodEndDate;
	}
	public void setPeriodEndDate(String periodEndDate) {
		this.periodEndDate = periodEndDate;
	}
	
	 @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result 
	        		+ ((periodID == null) ? 0 : periodID.hashCode())
	        		+ ((periodType == null) ? 0 : periodType.hashCode())
	        		+ ((periodEndYear == null) ? 0 : periodEndYear.hashCode())
	        		+ ((periodEndMonth == null) ? 0 : periodEndMonth.hashCode())
	        		+ ((periodEndDate == null) ? 0 : periodEndDate.hashCode());
	        return result;
	    }
	
	@Override
	public boolean equals(Object obj){
		if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CokeCalendarSOA other = (CokeCalendarSOA) obj;
        if(this.periodID.equals(other.getPeriodID())
        		&& this.periodType.equals(other.getPeriodType())
        		&& this.periodEndYear.equals(other.getPeriodEndYear())
        		&& this.periodEndMonth.equals(other.getPeriodEndMonth())
        		&& this.periodEndDate.equals(other.getPeriodEndDate())){
        			return true;
        		}
        return false;
	}
	
	@Override
	public int compareTo(CokeCalendarSOA other) {
		if(Integer.parseInt(this.periodEndYear) < Integer.parseInt(other.getPeriodEndYear())){
			return -1;
		} else if(Integer.parseInt(this.periodEndYear) > Integer.parseInt(other.getPeriodEndYear())){
			return 1;
		} else{
			if(Integer.parseInt(this.periodID) < Integer.parseInt(other.getPeriodID())){
				return -1;
			} else {
				return 1;
			}
		}
	}
}
