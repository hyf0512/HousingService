package com.housing.management.backend.domain;


public class Bsjdsearch extends BaseObject{


	/**
	 * 
	 */
	private static final long serialVersionUID = 8041129428735366851L;
	private boolean havedata;//判断是否有数据
	private String id;//受理编号
	private String name;//名称
	
	private String jd;//显示当前进度
	private int state;//显示当前事件状态,1为已办结，2为已终止，3为未办结
	private String personID;//证件号
	private String registlb;//登记类别

    //查询类型
    private String cxywlx;

	public void setHavedata(boolean havedata){
		this.havedata=havedata;
	}
	public boolean getHavedata(){
		return havedata;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setJd(String jd){
		this.jd=jd;
	}
	public String getJd(){
		return jd;
	}
	public void setState(int state){
		this.state=state;
	}
	public int getState(){
		return state;
	}
	public void setPersonID(String personID){
		this.personID=personID;
	}
	public String getPersonID(){
		return personID;
	}
	public void setRegistlb(String registlb){
		this.registlb=registlb;
	}
	public String getRegistlb(){
		return registlb;
	}


    public void setCxywlx(String cxywlx) {
        this.cxywlx = cxywlx;
    }
    public String getCxywlx() {
        return cxywlx;
    }

}
