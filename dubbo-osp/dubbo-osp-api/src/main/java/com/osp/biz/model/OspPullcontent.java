/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class OspPullcontent extends BaseEntity {
	
	
	//date formats
	public static final String FORMAT_PUBLISHDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_STARTPULLTIME = DATE_TIME_FORMAT;
	public static final String FORMAT_CREATEDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_UPDATEDATE = DATE_TIME_FORMAT;
	
	//columns START
	private java.lang.Long id;
	private java.lang.String title;
	private java.lang.String summary;
	private java.lang.String status;
	private java.lang.String pullto;
	private java.lang.Integer pullcount;
	private java.lang.String publishflag;
	private java.sql.Timestamp publishdate;
	private java.sql.Timestamp startpulltime;
	private java.lang.Integer intervaltime;
	private java.lang.String createuser;
	private java.sql.Timestamp createdate;
	private java.lang.String updateuser;
	private java.sql.Timestamp updatedate;
	//columns END
 
//generateConstructor START

		 public OspPullcontent(){}

	public OspPullcontent(
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
	public void setTitle(java.lang.String value) {
		this.title = value;
	}
	
	public java.lang.String getTitle() {
		return this.title;
	}
	public void setSummary(java.lang.String value) {
		this.summary = value;
	}
	
	public java.lang.String getSummary() {
		return this.summary;
	}
	public void setStatus(java.lang.String value) {
		this.status = value;
	}
	
	public java.lang.String getStatus() {
		return this.status;
	}
	public void setPullto(java.lang.String value) {
		this.pullto = value;
	}
	
	public java.lang.String getPullto() {
		return this.pullto;
	}
	public void setPullcount(java.lang.Integer value) {
		this.pullcount = value;
	}
	
	public java.lang.Integer getPullcount() {
		return this.pullcount;
	}
	public void setPublishflag(java.lang.String value) {
		this.publishflag = value;
	}
	
	public java.lang.String getPublishflag() {
		return this.publishflag;
	}
	public String getPublishdateString() {
		return date2String(getPublishdate(), FORMAT_PUBLISHDATE);
	}
	public void setPublishdateString(String value) {
		setPublishdate(string2Date(value, FORMAT_PUBLISHDATE,java.sql.Timestamp.class));
	}
	
	public void setPublishdate(java.sql.Timestamp value) {
		this.publishdate = value;
	}
	
	public java.sql.Timestamp getPublishdate() {
		return this.publishdate;
	}
	public String getStartpulltimeString() {
		return date2String(getStartpulltime(), FORMAT_STARTPULLTIME);
	}
	public void setStartpulltimeString(String value) {
		setStartpulltime(string2Date(value, FORMAT_STARTPULLTIME,java.sql.Timestamp.class));
	}
	
	public void setStartpulltime(java.sql.Timestamp value) {
		this.startpulltime = value;
	}
	
	public java.sql.Timestamp getStartpulltime() {
		return this.startpulltime;
	}
	public void setIntervaltime(java.lang.Integer value) {
		this.intervaltime = value;
	}
	
	public java.lang.Integer getIntervaltime() {
		return this.intervaltime;
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
			.append("Title").append("=").append(getTitle()).append(",")
			.append("Summary").append("=").append(getSummary()).append(",")
			.append("Status").append("=").append(getStatus()).append(",")
			.append("Pullto").append("=").append(getPullto()).append(",")
			.append("Pullcount").append("=").append(getPullcount()).append(",")
			.append("Publishflag").append("=").append(getPublishflag()).append(",")
			.append("Publishdate").append("=").append(getPublishdate()).append(",")
			.append("Startpulltime").append("=").append(getStartpulltime()).append(",")
			.append("Intervaltime").append("=").append(getIntervaltime()).append(",")
			.append("Createuser").append("=").append(getCreateuser()).append(",")
			.append("Createdate").append("=").append(getCreatedate()).append(",")
			.append("Updateuser").append("=").append(getUpdateuser()).append(",")
			.append("Updatedate").append("=").append(getUpdatedate())
			.append("]").toString();
	}
	

}

