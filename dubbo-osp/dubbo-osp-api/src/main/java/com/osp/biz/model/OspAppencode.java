/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class OspAppencode extends BaseEntity {
	
	
	//date formats
	public static final String FORMAT_UPLOADDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_CREATEDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_UPDATEDATE = DATE_TIME_FORMAT;
	
	//columns START
	private java.lang.Long id;
	private java.lang.String name;
	private java.lang.String apppackage;
	private java.lang.String version;
	private java.lang.Long filesize;
	private java.lang.String downloadurl;
	private java.lang.String mobilelogo;
	private java.sql.Timestamp uploaddate;
	private java.lang.String createuser;
	private java.sql.Timestamp createdate;
	private java.lang.String updateuser;
	private java.sql.Timestamp updatedate;
	//columns END
 
//generateConstructor START

		 public OspAppencode(){}

	public OspAppencode(
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
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}
	public void setApppackage(java.lang.String value) {
		this.apppackage = value;
	}
	
	public java.lang.String getApppackage() {
		return this.apppackage;
	}
	public void setVersion(java.lang.String value) {
		this.version = value;
	}
	
	public java.lang.String getVersion() {
		return this.version;
	}
	public void setFilesize(java.lang.Long value) {
		this.filesize = value;
	}
	
	public java.lang.Long getFilesize() {
		return this.filesize;
	}
	public void setDownloadurl(java.lang.String value) {
		this.downloadurl = value;
	}
	
	public java.lang.String getDownloadurl() {
		return this.downloadurl;
	}
	public void setMobilelogo(java.lang.String value) {
		this.mobilelogo = value;
	}
	
	public java.lang.String getMobilelogo() {
		return this.mobilelogo;
	}
	public String getUploaddateString() {
		return date2String(getUploaddate(), FORMAT_UPLOADDATE);
	}
	public void setUploaddateString(String value) {
		setUploaddate(string2Date(value, FORMAT_UPLOADDATE,java.sql.Timestamp.class));
	}
	
	public void setUploaddate(java.sql.Timestamp value) {
		this.uploaddate = value;
	}
	
	public java.sql.Timestamp getUploaddate() {
		return this.uploaddate;
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
			.append("Name").append("=").append(getName()).append(",")
			.append("Apppackage").append("=").append(getApppackage()).append(",")
			.append("Version").append("=").append(getVersion()).append(",")
			.append("Filesize").append("=").append(getFilesize()).append(",")
			.append("Downloadurl").append("=").append(getDownloadurl()).append(",")
			.append("Mobilelogo").append("=").append(getMobilelogo()).append(",")
			.append("Uploaddate").append("=").append(getUploaddate()).append(",")
			.append("Createuser").append("=").append(getCreateuser()).append(",")
			.append("Createdate").append("=").append(getCreatedate()).append(",")
			.append("Updateuser").append("=").append(getUpdateuser()).append(",")
			.append("Updatedate").append("=").append(getUpdatedate())
			.append("]").toString();
	}
	

}

