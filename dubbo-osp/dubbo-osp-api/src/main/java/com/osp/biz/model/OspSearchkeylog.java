/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class OspSearchkeylog extends BaseEntity {
	
	
	//date formats
	public static final String FORMAT_SEARCHDATE = DATE_TIME_FORMAT;
	
	//columns START
	private java.lang.Long id;
	private java.lang.String imei;
	private java.lang.String searchkey;
	private java.lang.String ip;
	private java.sql.Timestamp searchdate;
	private java.lang.String actionplatform;
	private java.lang.String sessionid;
	private java.lang.String username;
	//columns END
 
//generateConstructor START

		 public OspSearchkeylog(){}

	public OspSearchkeylog(
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
	public void setImei(java.lang.String value) {
		this.imei = value;
	}
	
	public java.lang.String getImei() {
		return this.imei;
	}
	public void setSearchkey(java.lang.String value) {
		this.searchkey = value;
	}
	
	public java.lang.String getSearchkey() {
		return this.searchkey;
	}
	public void setIp(java.lang.String value) {
		this.ip = value;
	}
	
	public java.lang.String getIp() {
		return this.ip;
	}
	public String getSearchdateString() {
		return date2String(getSearchdate(), FORMAT_SEARCHDATE);
	}
	public void setSearchdateString(String value) {
		setSearchdate(string2Date(value, FORMAT_SEARCHDATE,java.sql.Timestamp.class));
	}
	
	public void setSearchdate(java.sql.Timestamp value) {
		this.searchdate = value;
	}
	
	public java.sql.Timestamp getSearchdate() {
		return this.searchdate;
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
	public void setUsername(java.lang.String value) {
		this.username = value;
	}
	
	public java.lang.String getUsername() {
		return this.username;
	}

	public String toString() {
		return new StringBuffer().append("[")
			.append("Id").append("=").append(getId()).append(",")
			.append("Imei").append("=").append(getImei()).append(",")
			.append("Searchkey").append("=").append(getSearchkey()).append(",")
			.append("Ip").append("=").append(getIp()).append(",")
			.append("Searchdate").append("=").append(getSearchdate()).append(",")
			.append("Actionplatform").append("=").append(getActionplatform()).append(",")
			.append("Sessionid").append("=").append(getSessionid()).append(",")
			.append("Username").append("=").append(getUsername())
			.append("]").toString();
	}
	

}

