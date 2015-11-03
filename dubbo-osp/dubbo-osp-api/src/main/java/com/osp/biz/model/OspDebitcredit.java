/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class OspDebitcredit extends BaseEntity {
	
	
	//date formats
	public static final String FORMAT_TRADEDATE = DATE_TIME_FORMAT;
	
	//columns START
	private java.lang.Long id;
	private java.lang.String tradeid;
	private java.lang.String orderid;
	private java.sql.Timestamp tradedate;
	private java.lang.String username;
	private java.lang.String payaccount;
	private java.lang.String tradename;
	private java.lang.String tradememo;
	private java.lang.Float debit;
	private java.lang.Float credit;
	private java.lang.Float balance;
	private java.lang.String tradetype;
	private java.lang.String tradeaccount;
	//columns END
 
//generateConstructor START

		 public OspDebitcredit(){}

	public OspDebitcredit(
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
	public void setTradeid(java.lang.String value) {
		this.tradeid = value;
	}
	
	public java.lang.String getTradeid() {
		return this.tradeid;
	}
	public void setOrderid(java.lang.String value) {
		this.orderid = value;
	}
	
	public java.lang.String getOrderid() {
		return this.orderid;
	}
	public String getTradedateString() {
		return date2String(getTradedate(), FORMAT_TRADEDATE);
	}
	public void setTradedateString(String value) {
		setTradedate(string2Date(value, FORMAT_TRADEDATE,java.sql.Timestamp.class));
	}
	
	public void setTradedate(java.sql.Timestamp value) {
		this.tradedate = value;
	}
	
	public java.sql.Timestamp getTradedate() {
		return this.tradedate;
	}
	public void setUsername(java.lang.String value) {
		this.username = value;
	}
	
	public java.lang.String getUsername() {
		return this.username;
	}
	public void setPayaccount(java.lang.String value) {
		this.payaccount = value;
	}
	
	public java.lang.String getPayaccount() {
		return this.payaccount;
	}
	public void setTradename(java.lang.String value) {
		this.tradename = value;
	}
	
	public java.lang.String getTradename() {
		return this.tradename;
	}
	public void setTradememo(java.lang.String value) {
		this.tradememo = value;
	}
	
	public java.lang.String getTradememo() {
		return this.tradememo;
	}
	public void setDebit(java.lang.Float value) {
		this.debit = value;
	}
	
	public java.lang.Float getDebit() {
		return this.debit;
	}
	public void setCredit(java.lang.Float value) {
		this.credit = value;
	}
	
	public java.lang.Float getCredit() {
		return this.credit;
	}
	public void setBalance(java.lang.Float value) {
		this.balance = value;
	}
	
	public java.lang.Float getBalance() {
		return this.balance;
	}
	public void setTradetype(java.lang.String value) {
		this.tradetype = value;
	}
	
	public java.lang.String getTradetype() {
		return this.tradetype;
	}
	public void setTradeaccount(java.lang.String value) {
		this.tradeaccount = value;
	}
	
	public java.lang.String getTradeaccount() {
		return this.tradeaccount;
	}

	public String toString() {
		return new StringBuffer().append("[")
			.append("Id").append("=").append(getId()).append(",")
			.append("Tradeid").append("=").append(getTradeid()).append(",")
			.append("Orderid").append("=").append(getOrderid()).append(",")
			.append("Tradedate").append("=").append(getTradedate()).append(",")
			.append("Username").append("=").append(getUsername()).append(",")
			.append("Payaccount").append("=").append(getPayaccount()).append(",")
			.append("Tradename").append("=").append(getTradename()).append(",")
			.append("Tradememo").append("=").append(getTradememo()).append(",")
			.append("Debit").append("=").append(getDebit()).append(",")
			.append("Credit").append("=").append(getCredit()).append(",")
			.append("Balance").append("=").append(getBalance()).append(",")
			.append("Tradetype").append("=").append(getTradetype()).append(",")
			.append("Tradeaccount").append("=").append(getTradeaccount())
			.append("]").toString();
	}
	

}

