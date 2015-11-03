/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class OspContentauditlog extends BaseEntity {
	
	
	//date formats
	public static final String FORMAT_AUDITDATE = DATE_TIME_FORMAT;
	
	//columns START
	private java.lang.Long id;
	private java.lang.Long contentid;
	private java.lang.String contentinnercode;
	private java.lang.String status;
	private java.lang.String summary;
	private java.lang.String actiontype;
	private java.lang.String audituser;
	private java.sql.Timestamp auditdate;
	//columns END
 
//generateConstructor START

		 public OspContentauditlog(){}

	public OspContentauditlog(
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
	public void setContentid(java.lang.Long value) {
		this.contentid = value;
	}
	
	public java.lang.Long getContentid() {
		return this.contentid;
	}
	public void setContentinnercode(java.lang.String value) {
		this.contentinnercode = value;
	}
	
	public java.lang.String getContentinnercode() {
		return this.contentinnercode;
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
	public void setActiontype(java.lang.String value) {
		this.actiontype = value;
	}
	
	public java.lang.String getActiontype() {
		return this.actiontype;
	}
	public void setAudituser(java.lang.String value) {
		this.audituser = value;
	}
	
	public java.lang.String getAudituser() {
		return this.audituser;
	}
	public String getAuditdateString() {
		return date2String(getAuditdate(), FORMAT_AUDITDATE);
	}
	public void setAuditdateString(String value) {
		setAuditdate(string2Date(value, FORMAT_AUDITDATE,java.sql.Timestamp.class));
	}
	
	public void setAuditdate(java.sql.Timestamp value) {
		this.auditdate = value;
	}
	
	public java.sql.Timestamp getAuditdate() {
		return this.auditdate;
	}

	public String toString() {
		return new StringBuffer().append("[")
			.append("Id").append("=").append(getId()).append(",")
			.append("Contentid").append("=").append(getContentid()).append(",")
			.append("Contentinnercode").append("=").append(getContentinnercode()).append(",")
			.append("Status").append("=").append(getStatus()).append(",")
			.append("Summary").append("=").append(getSummary()).append(",")
			.append("Actiontype").append("=").append(getActiontype()).append(",")
			.append("Audituser").append("=").append(getAudituser()).append(",")
			.append("Auditdate").append("=").append(getAuditdate())
			.append("]").toString();
	}
	

}

