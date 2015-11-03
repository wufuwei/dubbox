/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class OspPullcontentlog extends BaseEntity {
	
	
	//date formats
	public static final String FORMAT_PULLDATE = DATE_TIME_FORMAT;
	
	//columns START
	private java.lang.Long id;
	private java.lang.Long pullcontentid;
	private java.lang.String imei;
	private java.lang.String username;
	private java.lang.String title;
	private java.sql.Timestamp pulldate;
	//columns END
 
//generateConstructor START

		 public OspPullcontentlog(){}

	public OspPullcontentlog(
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
	public void setPullcontentid(java.lang.Long value) {
		this.pullcontentid = value;
	}
	
	public java.lang.Long getPullcontentid() {
		return this.pullcontentid;
	}
	public void setImei(java.lang.String value) {
		this.imei = value;
	}
	
	public java.lang.String getImei() {
		return this.imei;
	}
	public void setUsername(java.lang.String value) {
		this.username = value;
	}
	
	public java.lang.String getUsername() {
		return this.username;
	}
	public void setTitle(java.lang.String value) {
		this.title = value;
	}
	
	public java.lang.String getTitle() {
		return this.title;
	}
	public String getPulldateString() {
		return date2String(getPulldate(), FORMAT_PULLDATE);
	}
	public void setPulldateString(String value) {
		setPulldate(string2Date(value, FORMAT_PULLDATE,java.sql.Timestamp.class));
	}
	
	public void setPulldate(java.sql.Timestamp value) {
		this.pulldate = value;
	}
	
	public java.sql.Timestamp getPulldate() {
		return this.pulldate;
	}

	public String toString() {
		return new StringBuffer().append("[")
			.append("Id").append("=").append(getId()).append(",")
			.append("Pullcontentid").append("=").append(getPullcontentid()).append(",")
			.append("Imei").append("=").append(getImei()).append(",")
			.append("Username").append("=").append(getUsername()).append(",")
			.append("Title").append("=").append(getTitle()).append(",")
			.append("Pulldate").append("=").append(getPulldate())
			.append("]").toString();
	}
	

}

