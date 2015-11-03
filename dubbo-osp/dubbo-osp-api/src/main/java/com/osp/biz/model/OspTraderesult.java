/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class OspTraderesult extends BaseEntity {
	
	
	//date formats
	public static final String FORMAT_PAYDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_CREATEDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_UPDATEDATE = DATE_TIME_FORMAT;
	
	//columns START
	private java.lang.Integer id;
	private java.lang.String username;
	private java.lang.String orderId;
	private java.lang.String result;
	private java.lang.String msg;
	private java.lang.String trAmt;
	private java.lang.String clrDate;
	private java.lang.String actionNo;
	private java.lang.String balance;
	private java.lang.String cardNo;
	private java.lang.String batchNo;
	private java.lang.String sign;
	private java.sql.Timestamp paydate;
	private java.lang.String contentname;
	private java.lang.String createuser;
	private java.sql.Timestamp createdate;
	private java.lang.String updateuser;
	private java.sql.Timestamp updatedate;
	//columns END
 
//generateConstructor START

		 public OspTraderesult(){}

	public OspTraderesult(
		java.lang.Integer id
	){
		this.id = id;
	}

//generateConstructor END
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.Integer getId() {
		return this.id;
	}
	public void setUsername(java.lang.String value) {
		this.username = value;
	}
	
	public java.lang.String getUsername() {
		return this.username;
	}
	public void setOrderId(java.lang.String value) {
		this.orderId = value;
	}
	
	public java.lang.String getOrderId() {
		return this.orderId;
	}
	public void setResult(java.lang.String value) {
		this.result = value;
	}
	
	public java.lang.String getResult() {
		return this.result;
	}
	public void setMsg(java.lang.String value) {
		this.msg = value;
	}
	
	public java.lang.String getMsg() {
		return this.msg;
	}
	public void setTrAmt(java.lang.String value) {
		this.trAmt = value;
	}
	
	public java.lang.String getTrAmt() {
		return this.trAmt;
	}
	public void setClrDate(java.lang.String value) {
		this.clrDate = value;
	}
	
	public java.lang.String getClrDate() {
		return this.clrDate;
	}
	public void setActionNo(java.lang.String value) {
		this.actionNo = value;
	}
	
	public java.lang.String getActionNo() {
		return this.actionNo;
	}
	public void setBalance(java.lang.String value) {
		this.balance = value;
	}
	
	public java.lang.String getBalance() {
		return this.balance;
	}
	public void setCardNo(java.lang.String value) {
		this.cardNo = value;
	}
	
	public java.lang.String getCardNo() {
		return this.cardNo;
	}
	public void setBatchNo(java.lang.String value) {
		this.batchNo = value;
	}
	
	public java.lang.String getBatchNo() {
		return this.batchNo;
	}
	public void setSign(java.lang.String value) {
		this.sign = value;
	}
	
	public java.lang.String getSign() {
		return this.sign;
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
	public void setContentname(java.lang.String value) {
		this.contentname = value;
	}
	
	public java.lang.String getContentname() {
		return this.contentname;
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
			.append("Username").append("=").append(getUsername()).append(",")
			.append("OrderId").append("=").append(getOrderId()).append(",")
			.append("Result").append("=").append(getResult()).append(",")
			.append("Msg").append("=").append(getMsg()).append(",")
			.append("TrAmt").append("=").append(getTrAmt()).append(",")
			.append("ClrDate").append("=").append(getClrDate()).append(",")
			.append("ActionNo").append("=").append(getActionNo()).append(",")
			.append("Balance").append("=").append(getBalance()).append(",")
			.append("CardNo").append("=").append(getCardNo()).append(",")
			.append("BatchNo").append("=").append(getBatchNo()).append(",")
			.append("Sign").append("=").append(getSign()).append(",")
			.append("Paydate").append("=").append(getPaydate()).append(",")
			.append("Contentname").append("=").append(getContentname()).append(",")
			.append("Createuser").append("=").append(getCreateuser()).append(",")
			.append("Createdate").append("=").append(getCreatedate()).append(",")
			.append("Updateuser").append("=").append(getUpdateuser()).append(",")
			.append("Updatedate").append("=").append(getUpdatedate())
			.append("]").toString();
	}
	

}

