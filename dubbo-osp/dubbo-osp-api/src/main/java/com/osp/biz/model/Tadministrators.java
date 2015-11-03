/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class Tadministrators extends BaseEntity {
	
	
	//date formats
	public static final String FORMAT_CREATEDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_UPDATEDATE = DATE_TIME_FORMAT;
	
	//columns START
	private java.lang.Integer staffId;
	private java.lang.String longinName;
	private java.lang.String password;
	private java.lang.String staffName;
	private java.lang.Short status;
	private java.lang.String phone;
	private java.lang.String email;
	private java.lang.String address;
	private java.lang.String information;
	private java.lang.String createuser;
	private java.sql.Timestamp createdate;
	private java.lang.String updateuser;
	private java.sql.Timestamp updatedate;
	//columns END
 
//generateConstructor START

		 public Tadministrators(){}

	public Tadministrators(
		java.lang.Integer staffId
	){
		this.staffId = staffId;
	}

//generateConstructor END
	public void setStaffId(java.lang.Integer value) {
		this.staffId = value;
	}
	
	public java.lang.Integer getStaffId() {
		return this.staffId;
	}
	public void setLonginName(java.lang.String value) {
		this.longinName = value;
	}
	
	public java.lang.String getLonginName() {
		return this.longinName;
	}
	public void setPassword(java.lang.String value) {
		this.password = value;
	}
	
	public java.lang.String getPassword() {
		return this.password;
	}
	public void setStaffName(java.lang.String value) {
		this.staffName = value;
	}
	
	public java.lang.String getStaffName() {
		return this.staffName;
	}
	public void setStatus(java.lang.Short value) {
		this.status = value;
	}
	
	public java.lang.Short getStatus() {
		return this.status;
	}
	public void setPhone(java.lang.String value) {
		this.phone = value;
	}
	
	public java.lang.String getPhone() {
		return this.phone;
	}
	public void setEmail(java.lang.String value) {
		this.email = value;
	}
	
	public java.lang.String getEmail() {
		return this.email;
	}
	public void setAddress(java.lang.String value) {
		this.address = value;
	}
	
	public java.lang.String getAddress() {
		return this.address;
	}
	public void setInformation(java.lang.String value) {
		this.information = value;
	}
	
	public java.lang.String getInformation() {
		return this.information;
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
			.append("StaffId").append("=").append(getStaffId()).append(",")
			.append("LonginName").append("=").append(getLonginName()).append(",")
			.append("Password").append("=").append(getPassword()).append(",")
			.append("StaffName").append("=").append(getStaffName()).append(",")
			.append("Status").append("=").append(getStatus()).append(",")
			.append("Phone").append("=").append(getPhone()).append(",")
			.append("Email").append("=").append(getEmail()).append(",")
			.append("Address").append("=").append(getAddress()).append(",")
			.append("Information").append("=").append(getInformation()).append(",")
			.append("Createuser").append("=").append(getCreateuser()).append(",")
			.append("Createdate").append("=").append(getCreatedate()).append(",")
			.append("Updateuser").append("=").append(getUpdateuser()).append(",")
			.append("Updatedate").append("=").append(getUpdatedate())
			.append("]").toString();
	}
	

}

