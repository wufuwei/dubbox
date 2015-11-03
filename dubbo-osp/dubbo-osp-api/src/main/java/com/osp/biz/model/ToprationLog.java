/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class ToprationLog extends BaseEntity {
	
	
	//date formats
	public static final String FORMAT_OPT_TIME = DATE_TIME_FORMAT;
	
	//columns START
	private java.lang.Integer id;
	private java.lang.Integer staffId;
	private java.sql.Timestamp optTime;
	private java.lang.String optModule;
	private java.lang.String optDomain;
	private java.lang.Short optType;
	private java.lang.Short optResult;
	private java.lang.String optIp;
	private java.lang.String optDescribe;
	//columns END
 
//generateConstructor START

		 public ToprationLog(){}

	public ToprationLog(
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
	public void setStaffId(java.lang.Integer value) {
		this.staffId = value;
	}
	
	public java.lang.Integer getStaffId() {
		return this.staffId;
	}
	public String getOptTimeString() {
		return date2String(getOptTime(), FORMAT_OPT_TIME);
	}
	public void setOptTimeString(String value) {
		setOptTime(string2Date(value, FORMAT_OPT_TIME,java.sql.Timestamp.class));
	}
	
	public void setOptTime(java.sql.Timestamp value) {
		this.optTime = value;
	}
	
	public java.sql.Timestamp getOptTime() {
		return this.optTime;
	}
	public void setOptModule(java.lang.String value) {
		this.optModule = value;
	}
	
	public java.lang.String getOptModule() {
		return this.optModule;
	}
	public void setOptDomain(java.lang.String value) {
		this.optDomain = value;
	}
	
	public java.lang.String getOptDomain() {
		return this.optDomain;
	}
	public void setOptType(java.lang.Short value) {
		this.optType = value;
	}
	
	public java.lang.Short getOptType() {
		return this.optType;
	}
	public void setOptResult(java.lang.Short value) {
		this.optResult = value;
	}
	
	public java.lang.Short getOptResult() {
		return this.optResult;
	}
	public void setOptIp(java.lang.String value) {
		this.optIp = value;
	}
	
	public java.lang.String getOptIp() {
		return this.optIp;
	}
	public void setOptDescribe(java.lang.String value) {
		this.optDescribe = value;
	}
	
	public java.lang.String getOptDescribe() {
		return this.optDescribe;
	}

	public String toString() {
		return new StringBuffer().append("[")
			.append("Id").append("=").append(getId()).append(",")
			.append("StaffId").append("=").append(getStaffId()).append(",")
			.append("OptTime").append("=").append(getOptTime()).append(",")
			.append("OptModule").append("=").append(getOptModule()).append(",")
			.append("OptDomain").append("=").append(getOptDomain()).append(",")
			.append("OptType").append("=").append(getOptType()).append(",")
			.append("OptResult").append("=").append(getOptResult()).append(",")
			.append("OptIp").append("=").append(getOptIp()).append(",")
			.append("OptDescribe").append("=").append(getOptDescribe())
			.append("]").toString();
	}
	

}

