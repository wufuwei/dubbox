/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class OspOrder extends BaseEntity {
	
	
	//date formats
	public static final String FORMAT_ORDERDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_PAYDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_SENDBEGINDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_SENDENDDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_CREATEDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_UPDATEDATE = DATE_TIME_FORMAT;
	
	//columns START
	private java.lang.Long id;
	private java.lang.String orderid;
	private java.lang.String username;
	private java.lang.String isvalid;
	private java.lang.String paystatus;
	private java.lang.String sendstatus;
	private java.lang.Float amount;
	private java.lang.Float sendfee;
	private java.lang.Float orderamount;
	private java.sql.Timestamp orderdate;
	private java.lang.String contentname;
	private java.lang.String contentmemo;
	private java.lang.String province;
	private java.lang.String city;
	private java.lang.String district;
	private java.lang.String address;
	private java.lang.String zipcode;
	private java.lang.String tel;
	private java.lang.String mobile;
	private java.sql.Timestamp paydate;
	private java.sql.Timestamp sendbegindate;
	private java.sql.Timestamp sendenddate;
	private java.lang.String sendtimeslice;
	private java.lang.String sendinfo;
	private java.lang.String sendtype;
	private java.lang.String tradetype;
	private java.lang.String tradedesc;
	private java.lang.String memo;
	private java.lang.String createuser;
	private java.sql.Timestamp createdate;
	private java.lang.String updateuser;
	private java.sql.Timestamp updatedate;
	//columns END
 
//generateConstructor START

		 public OspOrder(){}

	public OspOrder(
		java.lang.Long id
	){
		this.id = id;
	}

//generateConstructor END
	public void setId(java.lang.Long value) {
		this.id = value;
	}
	
	public java.lang.Long getId() {
		return this.id;
	}
	public void setOrderid(java.lang.String value) {
		this.orderid = value;
	}
	
	public java.lang.String getOrderid() {
		return this.orderid;
	}
	public void setUsername(java.lang.String value) {
		this.username = value;
	}
	
	public java.lang.String getUsername() {
		return this.username;
	}
	public void setIsvalid(java.lang.String value) {
		this.isvalid = value;
	}
	
	public java.lang.String getIsvalid() {
		return this.isvalid;
	}
	public void setPaystatus(java.lang.String value) {
		this.paystatus = value;
	}
	
	public java.lang.String getPaystatus() {
		return this.paystatus;
	}
	public void setSendstatus(java.lang.String value) {
		this.sendstatus = value;
	}
	
	public java.lang.String getSendstatus() {
		return this.sendstatus;
	}
	public void setAmount(java.lang.Float value) {
		this.amount = value;
	}
	
	public java.lang.Float getAmount() {
		return this.amount;
	}
	public void setSendfee(java.lang.Float value) {
		this.sendfee = value;
	}
	
	public java.lang.Float getSendfee() {
		return this.sendfee;
	}
	public void setOrderamount(java.lang.Float value) {
		this.orderamount = value;
	}
	
	public java.lang.Float getOrderamount() {
		return this.orderamount;
	}
	public String getOrderdateString() {
		return date2String(getOrderdate(), FORMAT_ORDERDATE);
	}
	public void setOrderdateString(String value) {
		setOrderdate(string2Date(value, FORMAT_ORDERDATE,java.sql.Timestamp.class));
	}
	
	public void setOrderdate(java.sql.Timestamp value) {
		this.orderdate = value;
	}
	
	public java.sql.Timestamp getOrderdate() {
		return this.orderdate;
	}
	public void setContentname(java.lang.String value) {
		this.contentname = value;
	}
	
	public java.lang.String getContentname() {
		return this.contentname;
	}
	public void setContentmemo(java.lang.String value) {
		this.contentmemo = value;
	}
	
	public java.lang.String getContentmemo() {
		return this.contentmemo;
	}
	public void setProvince(java.lang.String value) {
		this.province = value;
	}
	
	public java.lang.String getProvince() {
		return this.province;
	}
	public void setCity(java.lang.String value) {
		this.city = value;
	}
	
	public java.lang.String getCity() {
		return this.city;
	}
	public void setDistrict(java.lang.String value) {
		this.district = value;
	}
	
	public java.lang.String getDistrict() {
		return this.district;
	}
	public void setAddress(java.lang.String value) {
		this.address = value;
	}
	
	public java.lang.String getAddress() {
		return this.address;
	}
	public void setZipcode(java.lang.String value) {
		this.zipcode = value;
	}
	
	public java.lang.String getZipcode() {
		return this.zipcode;
	}
	public void setTel(java.lang.String value) {
		this.tel = value;
	}
	
	public java.lang.String getTel() {
		return this.tel;
	}
	public void setMobile(java.lang.String value) {
		this.mobile = value;
	}
	
	public java.lang.String getMobile() {
		return this.mobile;
	}
	public String getPaydateString() {
		return date2String(getPaydate(), FORMAT_PAYDATE);
	}
	public void setPaydateString(String value) {
		setPaydate(string2Date(value, FORMAT_PAYDATE,java.sql.Timestamp.class));
	}
	
	public void setPaydate(java.sql.Timestamp value) {
		this.paydate = value;
	}
	
	public java.sql.Timestamp getPaydate() {
		return this.paydate;
	}
	public String getSendbegindateString() {
		return date2String(getSendbegindate(), FORMAT_SENDBEGINDATE);
	}
	public void setSendbegindateString(String value) {
		setSendbegindate(string2Date(value, FORMAT_SENDBEGINDATE,java.sql.Timestamp.class));
	}
	
	public void setSendbegindate(java.sql.Timestamp value) {
		this.sendbegindate = value;
	}
	
	public java.sql.Timestamp getSendbegindate() {
		return this.sendbegindate;
	}
	public String getSendenddateString() {
		return date2String(getSendenddate(), FORMAT_SENDENDDATE);
	}
	public void setSendenddateString(String value) {
		setSendenddate(string2Date(value, FORMAT_SENDENDDATE,java.sql.Timestamp.class));
	}
	
	public void setSendenddate(java.sql.Timestamp value) {
		this.sendenddate = value;
	}
	
	public java.sql.Timestamp getSendenddate() {
		return this.sendenddate;
	}
	public void setSendtimeslice(java.lang.String value) {
		this.sendtimeslice = value;
	}
	
	public java.lang.String getSendtimeslice() {
		return this.sendtimeslice;
	}
	public void setSendinfo(java.lang.String value) {
		this.sendinfo = value;
	}
	
	public java.lang.String getSendinfo() {
		return this.sendinfo;
	}
	public void setSendtype(java.lang.String value) {
		this.sendtype = value;
	}
	
	public java.lang.String getSendtype() {
		return this.sendtype;
	}
	public void setTradetype(java.lang.String value) {
		this.tradetype = value;
	}
	
	public java.lang.String getTradetype() {
		return this.tradetype;
	}
	public void setTradedesc(java.lang.String value) {
		this.tradedesc = value;
	}
	
	public java.lang.String getTradedesc() {
		return this.tradedesc;
	}
	public void setMemo(java.lang.String value) {
		this.memo = value;
	}
	
	public java.lang.String getMemo() {
		return this.memo;
	}
	public void setCreateuser(java.lang.String value) {
		this.createuser = value;
	}
	
	public java.lang.String getCreateuser() {
		return this.createuser;
	}
	public String getCreatedateString() {
		return date2String(getCreatedate(), FORMAT_CREATEDATE);
	}
	public void setCreatedateString(String value) {
		setCreatedate(string2Date(value, FORMAT_CREATEDATE,java.sql.Timestamp.class));
	}
	
	public void setCreatedate(java.sql.Timestamp value) {
		this.createdate = value;
	}
	
	public java.sql.Timestamp getCreatedate() {
		return this.createdate;
	}
	public void setUpdateuser(java.lang.String value) {
		this.updateuser = value;
	}
	
	public java.lang.String getUpdateuser() {
		return this.updateuser;
	}
	public String getUpdatedateString() {
		return date2String(getUpdatedate(), FORMAT_UPDATEDATE);
	}
	public void setUpdatedateString(String value) {
		setUpdatedate(string2Date(value, FORMAT_UPDATEDATE,java.sql.Timestamp.class));
	}
	
	public void setUpdatedate(java.sql.Timestamp value) {
		this.updatedate = value;
	}
	
	public java.sql.Timestamp getUpdatedate() {
		return this.updatedate;
	}

	public String toString() {
		return new StringBuffer().append("[")
			.append("Id").append("=").append(getId()).append(",")
			.append("Orderid").append("=").append(getOrderid()).append(",")
			.append("Username").append("=").append(getUsername()).append(",")
			.append("Isvalid").append("=").append(getIsvalid()).append(",")
			.append("Paystatus").append("=").append(getPaystatus()).append(",")
			.append("Sendstatus").append("=").append(getSendstatus()).append(",")
			.append("Amount").append("=").append(getAmount()).append(",")
			.append("Sendfee").append("=").append(getSendfee()).append(",")
			.append("Orderamount").append("=").append(getOrderamount()).append(",")
			.append("Orderdate").append("=").append(getOrderdate()).append(",")
			.append("Contentname").append("=").append(getContentname()).append(",")
			.append("Contentmemo").append("=").append(getContentmemo()).append(",")
			.append("Province").append("=").append(getProvince()).append(",")
			.append("City").append("=").append(getCity()).append(",")
			.append("District").append("=").append(getDistrict()).append(",")
			.append("Address").append("=").append(getAddress()).append(",")
			.append("Zipcode").append("=").append(getZipcode()).append(",")
			.append("Tel").append("=").append(getTel()).append(",")
			.append("Mobile").append("=").append(getMobile()).append(",")
			.append("Paydate").append("=").append(getPaydate()).append(",")
			.append("Sendbegindate").append("=").append(getSendbegindate()).append(",")
			.append("Sendenddate").append("=").append(getSendenddate()).append(",")
			.append("Sendtimeslice").append("=").append(getSendtimeslice()).append(",")
			.append("Sendinfo").append("=").append(getSendinfo()).append(",")
			.append("Sendtype").append("=").append(getSendtype()).append(",")
			.append("Tradetype").append("=").append(getTradetype()).append(",")
			.append("Tradedesc").append("=").append(getTradedesc()).append(",")
			.append("Memo").append("=").append(getMemo()).append(",")
			.append("Createuser").append("=").append(getCreateuser()).append(",")
			.append("Createdate").append("=").append(getCreatedate()).append(",")
			.append("Updateuser").append("=").append(getUpdateuser()).append(",")
			.append("Updatedate").append("=").append(getUpdatedate())
			.append("]").toString();
	}
	

}

