/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class OspContentactionlog extends BaseEntity {
	
	
	//date formats
	public static final String FORMAT_ACTIONDATE = DATE_TIME_FORMAT;
	
	//columns START
	private java.lang.Long id;
	private java.lang.Long contentid;
	private java.lang.String contentinnercode;
	private java.lang.String ip;
	private java.lang.String contentname;
	private java.lang.String username;
	private java.lang.String imei;
	private java.lang.String actiontype;
	private java.lang.String prop1;
	private java.lang.String prop2;
	private java.lang.String prop3;
	private java.lang.String prop4;
	private java.sql.Timestamp actiondate;
	private java.lang.String actionplatform;
	private java.lang.String sessionid;
	//columns END
 
//generateConstructor START

		 public OspContentactionlog(){}

	public OspContentactionlog(
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
	public void setIp(java.lang.String value) {
		this.ip = value;
	}
	
	public java.lang.String getIp() {
		return this.ip;
	}
	public void setContentname(java.lang.String value) {
		this.contentname = value;
	}
	
	public java.lang.String getContentname() {
		return this.contentname;
	}
	public void setUsername(java.lang.String value) {
		this.username = value;
	}
	
	public java.lang.String getUsername() {
		return this.username;
	}
	public void setImei(java.lang.String value) {
		this.imei = value;
	}
	
	public java.lang.String getImei() {
		return this.imei;
	}
	public void setActiontype(java.lang.String value) {
		this.actiontype = value;
	}
	
	public java.lang.String getActiontype() {
		return this.actiontype;
	}
	public void setProp1(java.lang.String value) {
		this.prop1 = value;
	}
	
	public java.lang.String getProp1() {
		return this.prop1;
	}
	public void setProp2(java.lang.String value) {
		this.prop2 = value;
	}
	
	public java.lang.String getProp2() {
		return this.prop2;
	}
	public void setProp3(java.lang.String value) {
		this.prop3 = value;
	}
	
	public java.lang.String getProp3() {
		return this.prop3;
	}
	public void setProp4(java.lang.String value) {
		this.prop4 = value;
	}
	
	public java.lang.String getProp4() {
		return this.prop4;
	}
	public String getActiondateString() {
		return date2String(getActiondate(), FORMAT_ACTIONDATE);
	}
	public void setActiondateString(String value) {
		setActiondate(string2Date(value, FORMAT_ACTIONDATE,java.sql.Timestamp.class));
	}
	
	public void setActiondate(java.sql.Timestamp value) {
		this.actiondate = value;
	}
	
	public java.sql.Timestamp getActiondate() {
		return this.actiondate;
	}
	public void setActionplatform(java.lang.String value) {
		this.actionplatform = value;
	}
	
	public java.lang.String getActionplatform() {
		return this.actionplatform;
	}
	public void setSessionid(java.lang.String value) {
		this.sessionid = value;
	}
	
	public java.lang.String getSessionid() {
		return this.sessionid;
	}

	public String toString() {
		return new StringBuffer().append("[")
			.append("Id").append("=").append(getId()).append(",")
			.append("Contentid").append("=").append(getContentid()).append(",")
			.append("Contentinnercode").append("=").append(getContentinnercode()).append(",")
			.append("Ip").append("=").append(getIp()).append(",")
			.append("Contentname").append("=").append(getContentname()).append(",")
			.append("Username").append("=").append(getUsername()).append(",")
			.append("Imei").append("=").append(getImei()).append(",")
			.append("Actiontype").append("=").append(getActiontype()).append(",")
			.append("Prop1").append("=").append(getProp1()).append(",")
			.append("Prop2").append("=").append(getProp2()).append(",")
			.append("Prop3").append("=").append(getProp3()).append(",")
			.append("Prop4").append("=").append(getProp4()).append(",")
			.append("Actiondate").append("=").append(getActiondate()).append(",")
			.append("Actionplatform").append("=").append(getActionplatform()).append(",")
			.append("Sessionid").append("=").append(getSessionid())
			.append("]").toString();
	}
	

}

