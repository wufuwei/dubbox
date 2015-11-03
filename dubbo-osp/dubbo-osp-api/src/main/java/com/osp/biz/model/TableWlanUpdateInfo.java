/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class TableWlanUpdateInfo extends BaseEntity {
	
	
	//date formats
	public static final String FORMAT_CREATEDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_UPDATEDATE = DATE_TIME_FORMAT;
	
	//columns START
	private java.lang.Integer id;
	private java.lang.String platform;
	private java.lang.String version;
	private java.lang.String isImportantVersion;
	private java.lang.String type;
	private java.lang.String province;
	private java.lang.String versionUrl;
	private java.lang.String versionInfo;
	private java.lang.Long fileSize;
	private java.lang.String md5;
	private java.lang.Boolean isEnforce;
	private java.lang.String downloadUrl;
	private java.lang.String fileName;
	private java.lang.String createuser;
	private java.sql.Timestamp createdate;
	private java.lang.String updateuser;
	private java.sql.Timestamp updatedate;
	private java.lang.String name;
	private java.lang.String apppackage;
	//columns END
 
//generateConstructor START

		 public TableWlanUpdateInfo(){}

	public TableWlanUpdateInfo(
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
	public void setPlatform(java.lang.String value) {
		this.platform = value;
	}
	
	public java.lang.String getPlatform() {
		return this.platform;
	}
	public void setVersion(java.lang.String value) {
		this.version = value;
	}
	
	public java.lang.String getVersion() {
		return this.version;
	}
	public void setIsImportantVersion(java.lang.String value) {
		this.isImportantVersion = value;
	}
	
	public java.lang.String getIsImportantVersion() {
		return this.isImportantVersion;
	}
	public void setType(java.lang.String value) {
		this.type = value;
	}
	
	public java.lang.String getType() {
		return this.type;
	}
	public void setProvince(java.lang.String value) {
		this.province = value;
	}
	
	public java.lang.String getProvince() {
		return this.province;
	}
	public void setVersionUrl(java.lang.String value) {
		this.versionUrl = value;
	}
	
	public java.lang.String getVersionUrl() {
		return this.versionUrl;
	}
	public void setVersionInfo(java.lang.String value) {
		this.versionInfo = value;
	}
	
	public java.lang.String getVersionInfo() {
		return this.versionInfo;
	}
	public void setFileSize(java.lang.Long value) {
		this.fileSize = value;
	}
	
	public java.lang.Long getFileSize() {
		return this.fileSize;
	}
	public void setMd5(java.lang.String value) {
		this.md5 = value;
	}
	
	public java.lang.String getMd5() {
		return this.md5;
	}
	public void setIsEnforce(java.lang.Boolean value) {
		this.isEnforce = value;
	}
	
	public java.lang.Boolean getIsEnforce() {
		return this.isEnforce;
	}
	public void setDownloadUrl(java.lang.String value) {
		this.downloadUrl = value;
	}
	
	public java.lang.String getDownloadUrl() {
		return this.downloadUrl;
	}
	public void setFileName(java.lang.String value) {
		this.fileName = value;
	}
	
	public java.lang.String getFileName() {
		return this.fileName;
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

	public String toString() {
		return new StringBuffer().append("[")
			.append("Id").append("=").append(getId()).append(",")
			.append("Platform").append("=").append(getPlatform()).append(",")
			.append("Version").append("=").append(getVersion()).append(",")
			.append("IsImportantVersion").append("=").append(getIsImportantVersion()).append(",")
			.append("Type").append("=").append(getType()).append(",")
			.append("Province").append("=").append(getProvince()).append(",")
			.append("VersionUrl").append("=").append(getVersionUrl()).append(",")
			.append("VersionInfo").append("=").append(getVersionInfo()).append(",")
			.append("FileSize").append("=").append(getFileSize()).append(",")
			.append("Md5").append("=").append(getMd5()).append(",")
			.append("IsEnforce").append("=").append(getIsEnforce()).append(",")
			.append("DownloadUrl").append("=").append(getDownloadUrl()).append(",")
			.append("FileName").append("=").append(getFileName()).append(",")
			.append("Createuser").append("=").append(getCreateuser()).append(",")
			.append("Createdate").append("=").append(getCreatedate()).append(",")
			.append("Updateuser").append("=").append(getUpdateuser()).append(",")
			.append("Updatedate").append("=").append(getUpdatedate()).append(",")
			.append("Name").append("=").append(getName()).append(",")
			.append("Apppackage").append("=").append(getApppackage())
			.append("]").toString();
	}
	

}

