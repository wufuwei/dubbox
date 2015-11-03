/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class OspPaybind extends BaseEntity {
	
	
	//date formats
	public static final String FORMAT_BINDDATE = DATE_TIME_FORMAT;
	
	//columns START
	private java.lang.Long id;
	private java.lang.String username;
	private java.lang.String payaccount;
	private java.lang.String type;
	private java.lang.String bindflag;
	private java.lang.String defaultflag;
	private java.lang.String summary;
	private java.sql.Timestamp binddate;
	private java.lang.Float balance;
	//columns END
 
//generateConstructor START

		 public OspPaybind(){}

	public OspPaybind(
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
	public void setType(java.lang.String value) {
		this.type = value;
	}
	
	public java.lang.String getType() {
		return this.type;
	}
	public void setBindflag(java.lang.String value) {
		this.bindflag = value;
	}
	
	public java.lang.String getBindflag() {
		return this.bindflag;
	}
	public void setDefaultflag(java.lang.String value) {
		this.defaultflag = value;
	}
	
	public java.lang.String getDefaultflag() {
		return this.defaultflag;
	}
	public void setSummary(java.lang.String value) {
		this.summary = value;
	}
	
	public java.lang.String getSummary() {
		return this.summary;
	}
	public String getBinddateString() {
		return date2String(getBinddate(), FORMAT_BINDDATE);
	}
	public void setBinddateString(String value) {
		setBinddate(string2Date(value, FORMAT_BINDDATE,java.sql.Timestamp.class));
	}
	
	public void setBinddate(java.sql.Timestamp value) {
		this.binddate = value;
	}
	
	public java.sql.Timestamp getBinddate() {
		return this.binddate;
	}
	public void setBalance(java.lang.Float value) {
		this.balance = value;
	}
	
	public java.lang.Float getBalance() {
		return this.balance;
	}

	public String toString() {
		return new StringBuffer().append("[")
			.append("Id").append("=").append(getId()).append(",")
			.append("Username").append("=").append(getUsername()).append(",")
			.append("Payaccount").append("=").append(getPayaccount()).append(",")
			.append("Type").append("=").append(getType()).append(",")
			.append("Bindflag").append("=").append(getBindflag()).append(",")
			.append("Defaultflag").append("=").append(getDefaultflag()).append(",")
			.append("Summary").append("=").append(getSummary()).append(",")
			.append("Binddate").append("=").append(getBinddate()).append(",")
			.append("Balance").append("=").append(getBalance())
			.append("]").toString();
	}
	

}

