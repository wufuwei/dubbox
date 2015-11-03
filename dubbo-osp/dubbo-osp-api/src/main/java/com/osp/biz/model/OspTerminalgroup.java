/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class OspTerminalgroup extends BaseEntity {
	
	
	//date formats
	public static final String FORMAT_CREATEDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_UPDATEDATE = DATE_TIME_FORMAT;
	
	//columns START
	private java.lang.Long id;
	private java.lang.String groupname;
	private java.lang.String summary;
	private java.lang.String createuser;
	private java.sql.Timestamp createdate;
	private java.lang.String updateuser;
	private java.sql.Timestamp updatedate;
	//columns END
 
//generateConstructor START

		 public OspTerminalgroup(){}

	public OspTerminalgroup(
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
	public void setGroupname(java.lang.String value) {
		this.groupname = value;
	}
	
	public java.lang.String getGroupname() {
		return this.groupname;
	}
	public void setSummary(java.lang.String value) {
		this.summary = value;
	}
	
	public java.lang.String getSummary() {
		return this.summary;
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
			.append("Groupname").append("=").append(getGroupname()).append(",")
			.append("Summary").append("=").append(getSummary()).append(",")
			.append("Createuser").append("=").append(getCreateuser()).append(",")
			.append("Createdate").append("=").append(getCreatedate()).append(",")
			.append("Updateuser").append("=").append(getUpdateuser()).append(",")
			.append("Updatedate").append("=").append(getUpdatedate())
			.append("]").toString();
	}
	

}

