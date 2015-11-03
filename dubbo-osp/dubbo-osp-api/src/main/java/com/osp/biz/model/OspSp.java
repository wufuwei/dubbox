/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class OspSp extends BaseEntity {
	
	
	//date formats
	public static final String FORMAT_CREATEDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_UPDATEDATE = DATE_TIME_FORMAT;
	
	//columns START
	private java.lang.Long id;
	private java.lang.String icpcode;
	private java.lang.String icpservid;
	private java.lang.String spname;
	private java.lang.String fullname;
	private java.lang.String address;
	private java.lang.String email;
	private java.lang.String tel;
	private java.lang.String mobile;
	private java.lang.String website;
	private java.lang.String connectuser;
	private java.lang.Integer zipcode;
	private java.lang.String fax;
	private java.lang.String status;
	private java.lang.String summary;
	private java.lang.String createuser;
	private java.sql.Timestamp createdate;
	private java.lang.String updateuser;
	private java.sql.Timestamp updatedate;
	//columns END
 
//generateConstructor START

		 public OspSp(){}

	public OspSp(
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
	public void setIcpcode(java.lang.String value) {
		this.icpcode = value;
	}
	
	public java.lang.String getIcpcode() {
		return this.icpcode;
	}
	public void setIcpservid(java.lang.String value) {
		this.icpservid = value;
	}
	
	public java.lang.String getIcpservid() {
		return this.icpservid;
	}
	public void setSpname(java.lang.String value) {
		this.spname = value;
	}
	
	public java.lang.String getSpname() {
		return this.spname;
	}
	public void setFullname(java.lang.String value) {
		this.fullname = value;
	}
	
	public java.lang.String getFullname() {
		return this.fullname;
	}
	public void setAddress(java.lang.String value) {
		this.address = value;
	}
	
	public java.lang.String getAddress() {
		return this.address;
	}
	public void setEmail(java.lang.String value) {
		this.email = value;
	}
	
	public java.lang.String getEmail() {
		return this.email;
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
	public void setWebsite(java.lang.String value) {
		this.website = value;
	}
	
	public java.lang.String getWebsite() {
		return this.website;
	}
	public void setConnectuser(java.lang.String value) {
		this.connectuser = value;
	}
	
	public java.lang.String getConnectuser() {
		return this.connectuser;
	}
	public void setZipcode(java.lang.Integer value) {
		this.zipcode = value;
	}
	
	public java.lang.Integer getZipcode() {
		return this.zipcode;
	}
	public void setFax(java.lang.String value) {
		this.fax = value;
	}
	
	public java.lang.String getFax() {
		return this.fax;
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
			.append("Icpcode").append("=").append(getIcpcode()).append(",")
			.append("Icpservid").append("=").append(getIcpservid()).append(",")
			.append("Spname").append("=").append(getSpname()).append(",")
			.append("Fullname").append("=").append(getFullname()).append(",")
			.append("Address").append("=").append(getAddress()).append(",")
			.append("Email").append("=").append(getEmail()).append(",")
			.append("Tel").append("=").append(getTel()).append(",")
			.append("Mobile").append("=").append(getMobile()).append(",")
			.append("Website").append("=").append(getWebsite()).append(",")
			.append("Connectuser").append("=").append(getConnectuser()).append(",")
			.append("Zipcode").append("=").append(getZipcode()).append(",")
			.append("Fax").append("=").append(getFax()).append(",")
			.append("Status").append("=").append(getStatus()).append(",")
			.append("Summary").append("=").append(getSummary()).append(",")
			.append("Createuser").append("=").append(getCreateuser()).append(",")
			.append("Createdate").append("=").append(getCreatedate()).append(",")
			.append("Updateuser").append("=").append(getUpdateuser()).append(",")
			.append("Updatedate").append("=").append(getUpdatedate())
			.append("]").toString();
	}
	

}

