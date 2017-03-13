package com.housing.management.backend.domain;

public class Byfz extends BaseObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9117651402965346526L;
	private String address;//地址或房屋坐落
	private String area;//面积
	private String lxr;//联系人
	private String lxdh;//联系电话
	private String lxsj;//联系手机
	private String cqzh;//产权证号
	private String name;//产权人姓名
	private String ywlb;//业务类别
	private String ywlbflag;//业务类别2
	private String bid;//主键
	private String slbh;//受理编号
	private String whqk;//危害情况
	private String ffsj;//分飞时间
	private String bytc;//翅膀脱落
	private String kysj;//第一个可以时间
	private String kysj1;//第二个可以时间
	private String bz;//备注
	private String payid;//支付id
	private boolean canupdate;//判断是更新还是插入
	private String statu;//状态
	private String fwcode;//房屋内码
	private String szcq;//所在城区
	private String fwjg;//房屋结构
	private String syqzid;//房产证内码
	private boolean havedate;//判断是否验证成功
	private String slrq;//受理日期
	private boolean overdue;//判断能否办理
	private String xqname;//小区名字
	private String fwaddress;//房屋地址
	private String cqxz;//产权性质
	private String addtime;//增加时间
	private String fcyt;//房产性质
	private String shsj;//审核时间
	private String shyj;//审核意见
	private String czlx;//操作类型，1为检验，2为插入，3为更新
	private String result;//返回结果，1为插入或更新成功，0为失败
	private String searchlb;//查找时的种类
	private String paystatu;//6为支付成功
	private String bhly;//驳回理由
	private String billno;//支付订单号
	private String fee;//治理费用
	private String statuscode;//支付状态代码
	private String responsecode;
	private String orderid;//订单id
	private boolean exists;//是否办理过
	public void setExists(boolean exists){
		this.exists = exists;
	}
	public boolean getExists(){
		return exists;
	}
	public void setOrderid(String orderid){
		this.orderid = orderid;
	}
	public String getOrderid(){
		return orderid;
	}
	public void setResponsecode(String responsecode){
		this.responsecode = responsecode;
	}
	public String getResponsecode(){
		return responsecode;
	}
	public void setStatuscode(String statuscode){
		this.statuscode = statuscode;
	}
	public String getStatuscode(){
		return statuscode;
	}
	public void setFee(String fee){
		this.fee = fee;
	}
	public String getFee(){
		return fee;
	}
	public void setBillno(String billno){
		this.billno = billno;
	}
	public String getBillno(){
		return billno;
	}
	public void setBhly(String bhly){
		this.bhly = bhly;
	}
	public String getBhly(){
		return bhly;
	}
	public void setPaystatu(String paystatu){
		this.paystatu = paystatu;
	}
	public String getPaystatu(){
		return paystatu;
	}
	public void setSearchlb(String searchlb){
		this.searchlb = searchlb;
	}
	public String getSearchlb(){
		return searchlb;
	}
	public void setResult(String result){
		this.result = result;
	}
	public String getResult(){
		return result;
	}
	public void setCzlx(String czlx){
		this.czlx = czlx;
	}
	public String getCzlx(){
		return czlx;
	}
	public void setShyj(String shyj){
		this.shyj = shyj;
	}
	public String getShyj(){
		return shyj;
	}
	public void setShsj(String shsj){
		this.shsj = shsj;
	}
	public String getShsj(){
		return shsj;
	}
	public void setFcyt(String fcyt){
		this.fcyt = fcyt;
	}
	public String getFcyt(){
		return fcyt;
	}
	public void setAddtime(String addtime){
		this.addtime = addtime;
	}
	public String getAddtime(){
		return addtime;
	}
	public void setCqxz(String cqxz){
		this.cqxz = cqxz;
	}
	public String getCqxz(){
		return cqxz;
	}
	public void setFwaddress(String fwaddress){
		this.fwaddress = fwaddress;
	}
	public String getFwaddress(){
		return fwaddress;
	}
	public void setXqname(String xqname){
		this.xqname = xqname;
	}
	public String getXqname(){
		return xqname;
	}
	public void setOverdue(boolean overdue){
		this.overdue = overdue;
	}
	public boolean getOverdue(){
		return overdue;
	}
	public void setSlrq(String slrq){
		this.slrq = slrq;
	}
	public String getSlrq(){
		return slrq;
	}
	public void setHavedate(boolean havedate){
		this.havedate = havedate;
	}
	public boolean getHavedate(){
		return havedate;
	}
	public void setSyqzid(String syqzid){
		this.syqzid = syqzid;
	}
	public String getSyqzid(){
		return syqzid;
	}
	public void setFwjg(String fwjg){
		this.fwjg = fwjg;
	}
	public String getFwjg(){
		return fwjg;
	}
	public void setSzcq(String szcq){
		this.szcq = szcq;
	}
	public String getSzcq(){
		return szcq;
	}
	public void setFwcode(String fwcode){
		this.fwcode = fwcode;
	}
	public String getFwcode(){
		return fwcode;
	}
	public void setStatu(String statu){
		this.statu = statu;
	}
	public String getStatu(){
		return statu;
	}
	public void setCanupdate(boolean canupdate){
		this.canupdate = canupdate;
	}
	public boolean getCanupdate(){
		return canupdate;
	}
	public void setPayid(String payid){
		this.payid = payid;
	}
	public String getPayid(){
		return payid;
	}
	public void setBz(String bz){
		this.bz = bz;
	}
	public String getBz(){
		return bz;
	}
	public void setKysj1(String kysj1){
		this.kysj1 = kysj1;
	}
	public String getKysj1(){
		return kysj1;
	}
	public void setKysj(String kysj){
		this.kysj = kysj;
	}
	public String getKysj(){
		return kysj;
	}
	public void setBytc(String bytc){
		this.bytc = bytc;
	}
	public String getBytc(){
		return bytc;
	}
	public void setFfsj(String ffsj){
		this.ffsj = ffsj;
	}
	public String getFfsj(){
		return ffsj;
	}
	public void setWhqk(String whqk){
		this.whqk = whqk;
	}
	public String getWhqk(){
		return whqk;
	}
	public void setSlbh(String slbh){
		this.slbh = slbh;
	}
	public String getSlbh(){
		return slbh;
	}
	public void setBid(String bid){
		this.bid = bid;
	}
	public String getBid(){
		return bid;
	}
	public void setYwlbflag(String ywlbflag){
		this.ywlbflag = ywlbflag;
	}
	public String getYwlbflag(){
		return ywlbflag;
	}
	public void setYwlb(String ywlb){
		this.ywlb = ywlb;
	}
	public String getYwlb(){
		return ywlb;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setCqzh(String cqzh){
		this.cqzh = cqzh;
	}
	public String getCqzh(){
		return cqzh;
	}
	public void setLxsj(String lxsj){
		this.lxsj = lxsj;
	}
	public String getLxsj(){
		return lxsj;
	}
	public void setLxdh(String lxdh){
		this.lxdh = lxdh;
	}
	public String getLxdh(){
		return lxdh;
	}
	public void setLxr(String lxr){
		this.lxr = lxr;
	}
	public String getLxr(){
		return lxr;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return address;
	}
	public void setArea(String area){
		this.area = area;
	}
	public String getArea(){
		return area;
	}
}
