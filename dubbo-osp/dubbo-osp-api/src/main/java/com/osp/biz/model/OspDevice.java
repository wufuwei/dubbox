/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class OspDevice extends BaseEntity {
	
	
	//date formats
	public static final String FORMAT_ACTIVEDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_CREATEDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_UPDATEDATE = DATE_TIME_FORMAT;
	
	//columns START
	private java.lang.Long id;
	private java.lang.String imei;
	private java.lang.String imeimd5;
	private java.lang.String status;
	private java.lang.String summary;
	private java.sql.Timestamp activedate;
	private java.lang.String createuser;
	private java.sql.Timestamp createdate;
	private java.lang.String updateuser;
	private java.sql.Timestamp updatedate;
	//columns END
 
//generateConstructor START

		 public OspDevice(){}

	public OspDevice(
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
	public void setImei(java.lang.String value) {
		this.imei = value;
	}
	
	public java.lang.String getImei() {
		return this.imei;
	}
	public void setImeimd5(java.lang.String value) {
		this.imeimd5 = value;
	}
	
	public java.lang.String getImeimd5() {
		return this.imeimd5;
	}
	public void setStatus(java.lang.String value) {
		this.status = value;
	}
	
	public java.lang.String getStatus() {
		return this.status;
	}
	public void setSummary(java.lang.String value) {
		this.summary = value;
	}
	
	public java.lang.String getSummary() {
		return this.summary;
	}
	public String getActivedateString() {
		return date2String(getActivedate(), FORMAT_ACTIVEDATE);
	}
	public void setActivedateString(String value) {
		setActivedate(string2Date(value, FORMAT_ACTIVEDATE,java.sql.Timestamp.class));
	}
	
	public void setActivedate(java.sql.Timestamp value) {
		this.activedate = value;
	}
	
	public java.sql.Timestamp getActivedate() {
		return this.activedate;
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
			.append("Imei").append("=").append(getImei()).append(",")
			.append("Imeimd5").append("=").append(getImeimd5()).append(",")
			.append("Status").append("=").append(getStatus()).append(",")
			.append("Summary").append("=").append(getSummary()).append(",")
			.append("Activedate").append("=").append(getActivedate()).append(",")
			.append("Createuser").append("=").append(getCreateuser()).append(",")
			.append("Createdate").append("=").append(getCreatedate()).append(",")
			.append("Updateuser").append("=").append(getUpdateuser()).append(",")
			.append("Updatedate").append("=").append(getUpdatedate())
			.append("]").toString();
	}
	

}

