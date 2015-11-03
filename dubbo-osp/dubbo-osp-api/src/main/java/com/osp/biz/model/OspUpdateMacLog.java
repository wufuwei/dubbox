/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class OspUpdateMacLog extends BaseEntity {
	
	
	//date formats
	public static final String FORMAT_CHANGEDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_CREATEDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_UPDATEDATE = DATE_TIME_FORMAT;
	
	//columns START
	private java.lang.Integer id;
	private java.lang.String username;
	private java.lang.String oldmac;
	private java.lang.String newmac;
	private java.sql.Timestamp changedate;
	private java.lang.String ip;
	private java.lang.String description;
	private java.lang.String memo;
	private java.lang.String createuser;
	private java.sql.Timestamp createdate;
	private java.lang.String updateuser;
	private java.sql.Timestamp updatedate;
	//columns END
 
//generateConstructor START

		 public OspUpdateMacLog(){}

	public OspUpdateMacLog(
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
	public void setOldmac(java.lang.String value) {
		this.oldmac = value;
	}
	
	public java.lang.String getOldmac() {
		return this.oldmac;
	}
	public void setNewmac(java.lang.String value) {
		this.newmac = value;
	}
	
	public java.lang.String getNewmac() {
		return this.newmac;
	}
	public String getChangedateString() {
		return date2String(getChangedate(), FORMAT_CHANGEDATE);
	}
	public void setChangedateString(String value) {
		setChangedate(string2Date(value, FORMAT_CHANGEDATE,java.sql.Timestamp.class));
	}
	
	public void setChangedate(java.sql.Timestamp value) {
		this.changedate = value;
	}
	
	public java.sql.Timestamp getChangedate() {
		return this.changedate;
	}
	public void setIp(java.lang.String value) {
		this.ip = value;
	}
	
	public java.lang.String getIp() {
		return this.ip;
	}
	public void setDescription(java.lang.String value) {
		this.description = value;
	}
	
	public java.lang.String getDescription() {
		return this.description;
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
			.append("Username").append("=").append(getUsername()).append(",")
			.append("Oldmac").append("=").append(getOldmac()).append(",")
			.append("Newmac").append("=").append(getNewmac()).append(",")
			.append("Changedate").append("=").append(getChangedate()).append(",")
			.append("Ip").append("=").append(getIp()).append(",")
			.append("Description").append("=").append(getDescription()).append(",")
			.append("Memo").append("=").append(getMemo()).append(",")
			.append("Createuser").append("=").append(getCreateuser()).append(",")
			.append("Createdate").append("=").append(getCreatedate()).append(",")
			.append("Updateuser").append("=").append(getUpdateuser()).append(",")
			.append("Updatedate").append("=").append(getUpdatedate())
			.append("]").toString();
	}
	

}

