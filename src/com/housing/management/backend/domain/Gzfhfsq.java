package com.housing.management.backend.domain;

/**
 * 自助换房，房源
 */
public class Gzfhfsq extends PageData{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3764761338665521532L;
	
	private boolean ifexist;//判断通过接口能否查找到数据，true为有数据，false为查找不到。
	private String jyxx;//交易信息，success为成功
	private int fzfhfsqId;
	//'TPG_RYXX的CODE'
	private String sqrCode;
	//'姓名'
	private String xm;
	//'性别'
	private String xb;
	//'身份证号'
	private String sfzh;
	//'移动电话'
	private String yddh;
	//'tpg_gzfpzxx的pzcode'
	private String  pzCode;
	//'tpg_gzffyxx的fycode'
	private String fyCode;
	//'所在城区（中文字，非code）'
	private String zscq;
	//'房屋坐落'
	private String fwzl;
	 //'小区名称'
	private String xqmc;
	 //'是否成套'
	private String sfct;
	 //'总层数'
	private String zcs;
	 //'所在层数'
	private String szcs;
	 //'房屋结构'
	private String fwjg;
	 //'建筑面积'
	private String jzmj;
	 //'套内建筑面积'
	private String tnggmj;
	//'分摊公共面积'
	private String ftggmj;
	//'使用面积'
	private String symj;
	//'边套（E东边套、W西边套、M中间套）'
	private String bt;
	//'所在区域（e城东、s城南、w城西、n城北、m城中）'
	private String szqy;
	 //'所在街道（中文字，非code）'
	private String szjd;
	//'其他联系方式QQ、微信、邮箱等'
	private String lxfs;
	//'意向所在城区（中文字，非code）'
	private String yxszcq;
	 //'意向房屋坐落'
	private String yxfwzl;
	//'意向小区名称'
	private String yxxqmc;
	//'意向是否成套'
	private String yxsfct;
	//'意向总层数（开始）'
	private String yxzcsStart;
	//'意向总层数（结束）'
	private String yxzcsEnd;
	//'意向所在层数（开始）'
	private String yxszcsStart; 
	//'意向所在层数（结束）'
	private String yxszcsEnd;
	//'意向房屋结构'
	private String yxfwjg;
	//'意向建筑面积（开始）'
	private String yxjzmjStart;
	//'意向建筑面积（结束）'
	private String yxjzmjEnd;
	//'意向边套（同边套BT，但是多选，用英文逗号隔开）'
	private String yxbj;
	//'意向所在区域（同所在区域SZQY，但是多选，用英文逗号隔开）'
	private String yxszqy;
	//'其它备注'
	private String yxDesc;
	//'申请时间'
	private String  sqsj;
	//'申请有效标志'
	private String sqyxbz;
	//'申请有效标志时间（有效时间、失效时间）'
	private String sqyxbzsj;
	//'验证码'
	private String yzm;
	//'配对ID，即本表的ID（单向）'
	private String pdId;
	//'配对时间（单向）'
	private String pdsj;
	//'双方配对成功标志'
	private String pdcgbz;
	//'双方配对成功时间'
	private String pdcgbzsj;
	//'换房业务办结标志'
	private String hfywbjbz;
	//'换房业务办结时间'
	private String hfywbjbzsj;
	//'删除标志'
	private String isDelete;
	//'删除时间'
	private String deleteDate;
	//'保障房类型（1公共租赁住房2廉租住房）'
	private int bzfxz;
	public int getFzfhfsqId(){
		return fzfhfsqId;
	}
	public void setFzfhfsqId(int fzfhfsqId){
		this.fzfhfsqId = fzfhfsqId;
	}
	public String getJyxx(){
		return jyxx;
	}
	public void setJyxx(String jyxx){
		this.jyxx = jyxx;
	}
	public boolean getIfexist(){
		return ifexist;
	}
	public void setIfexist(boolean ifexist){
		this.ifexist = ifexist;
	}
	
	public String getSqrCode() {
		return sqrCode;
	}
	public void setSqrCode(String sqrCode) {
		this.sqrCode = sqrCode;
	}
	public String getXm() {
		return xm;
	}
	public void setXm(String xm) {
		this.xm = xm;
	}
	public String getXb() {
		return xb;
	}
	public void setXb(String xb) {
		this.xb = xb;
	}
	public String getSfzh() {
		return sfzh;
	}
	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}
	public String getYddh() {
		return yddh;
	}
	public void setYddh(String yddh) {
		this.yddh = yddh;
	}
	public String getPzCode() {
		return pzCode;
	}
	public void setPzCode(String pzCode) {
		this.pzCode = pzCode;
	}
	public String getFyCode() {
		return fyCode;
	}
	public void setFyCode(String fyCode) {
		this.fyCode = fyCode;
	}
	public String getZscq() {
		return zscq;
	}
	public void setZscq(String zscq) {
		this.zscq = zscq;
	}
	public String getFwzl() {
		return fwzl;
	}
	public void setFwzl(String fwzl) {
		this.fwzl = fwzl;
	}
	public String getXqmc() {
		return xqmc;
	}
	public void setXqmc(String xqmc) {
		this.xqmc = xqmc;
	}
	public String getSfct() {
		return sfct;
	}
	public void setSfct(String sfct) {
		this.sfct = sfct;
	}
	public String getZcs() {
		return zcs;
	}
	public void setZcs(String zcs) {
		this.zcs = zcs;
	}
	public String getSzcs() {
		return szcs;
	}
	public void setSzcs(String szcs) {
		this.szcs = szcs;
	}
	public String getFwjg() {
		return fwjg;
	}
	public void setFwjg(String fwjg) {
		this.fwjg = fwjg;
	}
	public String getJzmj() {
		return jzmj;
	}
	public void setJzmj(String jzmj) {
		this.jzmj = jzmj;
	}
	public String getTnggmj() {
		return tnggmj;
	}
	public void setTnggmj(String tnggmj) {
		this.tnggmj = tnggmj;
	}
	public String getFtggmj() {
		return ftggmj;
	}
	public void setFtggmj(String ftggmj) {
		this.ftggmj = ftggmj;
	}
	public String getSymj() {
		return symj;
	}
	public void setSymj(String symj) {
		this.symj = symj;
	}
	public String getBt() {
		return bt;
	}
	public void setBt(String bt) {
		this.bt = bt;
	}
	public String getSzqy() {
		return szqy;
	}
	public void setSzqy(String szqy) {
		this.szqy = szqy;
	}
	public String getSzjd() {
		return szjd;
	}
	public void setSzjd(String szjd) {
		this.szjd = szjd;
	}
	public String getLxfs() {
		return lxfs;
	}
	public void setLxfs(String lxfs) {
		this.lxfs = lxfs;
	}
	public String getYxszcq() {
		return yxszcq;
	}
	public void setYxszcq(String yxszcq) {
		this.yxszcq = yxszcq;
	}
	public String getYxfwzl() {
		return yxfwzl;
	}
	public void setYxfwzl(String yxfwzl) {
		this.yxfwzl = yxfwzl;
	}
	public String getYxxqmc() {
		return yxxqmc;
	}
	public void setYxxqmc(String yxxqmc) {
		this.yxxqmc = yxxqmc;
	}
	public String getYxsfct() {
		return yxsfct;
	}
	public void setYxsfct(String yxsfct) {
		this.yxsfct = yxsfct;
	}
	public String getYxzcsStart() {
		return yxzcsStart;
	}
	public void setYxzcsStart(String yxzcsStart) {
		this.yxzcsStart = yxzcsStart;
	}
	public String getYxzcsEnd() {
		return yxzcsEnd;
	}
	public void setYxzcsEnd(String yxzcsEnd) {
		this.yxzcsEnd = yxzcsEnd;
	}
	public String getYxszcsStart() {
		return yxszcsStart;
	}
	public void setYxszcsStart(String yxszcsStart) {
		this.yxszcsStart = yxszcsStart;
	}
	public String getYxszcsEnd() {
		return yxszcsEnd;
	}
	public void setYxszcsEnd(String yxszcsEnd) {
		this.yxszcsEnd = yxszcsEnd;
	}
	public String getYxfwjg() {
		return yxfwjg;
	}
	public void setYxfwjg(String yxfwjg) {
		this.yxfwjg = yxfwjg;
	}
	public String getYxjzmjStart() {
		return yxjzmjStart;
	}
	public void setYxjzmjStart(String yxjzmjStart) {
		this.yxjzmjStart = yxjzmjStart;
	}
	public String getYxjzmjEnd() {
		return yxjzmjEnd;
	}
	public void setYxjzmjEnd(String yxjzmjEnd) {
		this.yxjzmjEnd = yxjzmjEnd;
	}
	public String getYxbj() {
		return yxbj;
	}
	public void setYxbj(String yxbj) {
		this.yxbj = yxbj;
	}
	public String getYxszqy() {
		return yxszqy;
	}
	public void setYxszqy(String yxszqy) {
		this.yxszqy = yxszqy;
	}
	public String getYxDesc() {
		return yxDesc;
	}
	public void setYxDesc(String yxDesc) {
		this.yxDesc = yxDesc;
	}
	public String getSqsj() {
		return sqsj;
	}
	public void setSqsj(String sqsj) {
		this.sqsj = sqsj;
	}
	public String getSqyxbz() {
		return sqyxbz;
	}
	public void setSqyxbz(String sqyxbz) {
		this.sqyxbz = sqyxbz;
	}
	public String getSqyxbzsj() {
		return sqyxbzsj;
	}
	public void setSqyxbzsj(String sqyxbzsj) {
		this.sqyxbzsj = sqyxbzsj;
	}
	public String getYzm() {
		return yzm;
	}
	public void setYzm(String yzm) {
		this.yzm = yzm;
	}
	public String getPdId() {
		return pdId;
	}
	public void setPdId(String pdId) {
		this.pdId = pdId;
	}
	public String getPdsj() {
		return pdsj;
	}
	public void setPdsj(String pdsj) {
		this.pdsj = pdsj;
	}
	public String getPdcgbz() {
		return pdcgbz;
	}
	public void setPdcgbz(String pdcgbz) {
		this.pdcgbz = pdcgbz;
	}
	public String getPdcgbzsj() {
		return pdcgbzsj;
	}
	public void setPdcgbzsj(String pdcgbzsj) {
		this.pdcgbzsj = pdcgbzsj;
	}
	public String getHfywbjbz() {
		return hfywbjbz;
	}
	public void setHfywbjbz(String hfywbjbz) {
		this.hfywbjbz = hfywbjbz;
	}
	public String getHfywbjbzsj() {
		return hfywbjbzsj;
	}
	public void setHfywbjbzsj(String hfywbjbzsj) {
		this.hfywbjbzsj = hfywbjbzsj;
	}
	public String getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}
	public String getDeleteDate() {
		return deleteDate;
	}
	public void setDeleteDate(String deleteDate) {
		this.deleteDate = deleteDate;
	}
	public int getBzfxz() {
		return bzfxz;
	}
	public void setBzfxz(int bzfxz) {
		this.bzfxz = bzfxz;
	}

	
}
