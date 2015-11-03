/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class OspTerminalonline extends BaseEntity {
	
	
	//date formats
	public static final String FORMAT_ONLINETIME = DATE_TIME_FORMAT;
	public static final String FORMAT_OFFLINETIME = DATE_TIME_FORMAT;
	
	//columns START
	private java.lang.Long id;
	private java.lang.String sessionid;
	private java.lang.String imei;
	private java.lang.String terminalinfo;
	private java.lang.String softwarename;
	private java.lang.String softwareversion;
	private java.lang.String osplatform;
	private java.lang.String osversion;
	private java.lang.String screen;
	private java.lang.String province;
	private java.lang.String ip;
	private java.lang.String summary;
	private java.lang.String prop1;
	private java.lang.String prop2;
	private java.sql.Timestamp onlinetime;
	private java.sql.Timestamp offlinetime;
	//columns END
 
//generateConstructor START

		 public OspTerminalonline(){}

	public OspTerminalonline(
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
	public void setSessionid(java.lang.String value) {
		this.sessionid = value;
	}
	
	public java.lang.String getSessionid() {
		return this.sessionid;
	}
	public void setImei(java.lang.String value) {
		this.imei = value;
	}
	
	public java.lang.String getImei() {
		return this.imei;
	}
	public void setTerminalinfo(java.lang.String value) {
		this.terminalinfo = value;
	}
	
	public java.lang.String getTerminalinfo() {
		return this.terminalinfo;
	}
	public void setSoftwarename(java.lang.String value) {
		this.softwarename = value;
	}
	
	public java.lang.String getSoftwarename() {
		return this.softwarename;
	}
	public void setSoftwareversion(java.lang.String value) {
		this.softwareversion = value;
	}
	
	public java.lang.String getSoftwareversion() {
		return this.softwareversion;
	}
	public void setOsplatform(java.lang.String value) {
		this.osplatform = value;
	}
	
	public java.lang.String getOsplatform() {
		return this.osplatform;
	}
	public void setOsversion(java.lang.String value) {
		this.osversion = value;
	}
	
	public java.lang.String getOsversion() {
		return this.osversion;
	}
	public void setScreen(java.lang.String value) {
		this.screen = value;
	}
	
	public java.lang.String getScreen() {
		return this.screen;
	}
	public void setProvince(java.lang.String value) {
		this.province = value;
	}
	
	public java.lang.String getProvince() {
		return this.province;
	}
	public void setIp(java.lang.String value) {
		this.ip = value;
	}
	
	public java.lang.String getIp() {
		return this.ip;
	}
	public void setSummary(java.lang.String value) {
		this.summary = value;
	}
	
	public java.lang.String getSummary() {
		return this.summary;
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
	public String getOnlinetimeString() {
		return date2String(getOnlinetime(), FORMAT_ONLINETIME);
	}
	public void setOnlinetimeString(String value) {
		setOnlinetime(string2Date(value, FORMAT_ONLINETIME,java.sql.Timestamp.class));
	}
	
	public void setOnlinetime(java.sql.Timestamp value) {
		this.onlinetime = value;
	}
	
	public java.sql.Timestamp getOnlinetime() {
		return this.onlinetime;
	}
	public String getOfflinetimeString() {
		return date2String(getOfflinetime(), FORMAT_OFFLINETIME);
	}
	public void setOfflinetimeString(String value) {
		setOfflinetime(string2Date(value, FORMAT_OFFLINETIME,java.sql.Timestamp.class));
	}
	
	public void setOfflinetime(java.sql.Timestamp value) {
		this.offlinetime = value;
	}
	
	public java.sql.Timestamp getOfflinetime() {
		return this.offlinetime;
	}

	public String toString() {
		return new StringBuffer().append("[")
			.append("Id").append("=").append(getId()).append(",")
			.append("Sessionid").append("=").append(getSessionid()).append(",")
			.append("Imei").append("=").append(getImei()).append(",")
			.append("Terminalinfo").append("=").append(getTerminalinfo()).append(",")
			.append("Softwarename").append("=").append(getSoftwarename()).append(",")
			.append("Softwareversion").append("=").append(getSoftwareversion()).append(",")
			.append("Osplatform").append("=").append(getOsplatform()).append(",")
			.append("Osversion").append("=").append(getOsversion()).append(",")
			.append("Screen").append("=").append(getScreen()).append(",")
			.append("Province").append("=").append(getProvince()).append(",")
			.append("Ip").append("=").append(getIp()).append(",")
			.append("Summary").append("=").append(getSummary()).append(",")
			.append("Prop1").append("=").append(getProp1()).append(",")
			.append("Prop2").append("=").append(getProp2()).append(",")
			.append("Onlinetime").append("=").append(getOnlinetime()).append(",")
			.append("Offlinetime").append("=").append(getOfflinetime())
			.append("]").toString();
	}
	

}

