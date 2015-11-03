/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class OspMemberactionlog extends BaseEntity {
	
	
	//date formats
	public static final String FORMAT_OPTTIME = DATE_TIME_FORMAT;
	
	//columns START
	private java.lang.Integer id;
	private java.lang.String username;
	private java.sql.Timestamp opttime;
	private java.lang.String optmodule;
	private java.lang.String optdomain;
	private java.lang.Integer opttype;
	private java.lang.Integer optresult;
	private java.lang.String optip;
	private java.lang.String optdescribe;
	private java.lang.String actionplatform;
	private java.lang.String imei;
	private java.lang.String sessionid;
	public final Integer KEY_OPTTYPE_VIEW=0;
	
	//columns END
 
//generateConstructor START

		 public OspMemberactionlog(){}

	public OspMemberactionlog(
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
	public void setUsername(java.lang.String value) {
		this.username = value;
	}
	
	public java.lang.String getUsername() {
		return this.username;
	}
	public String getOpttimeString() {
		return date2String(getOpttime(), FORMAT_OPTTIME);
	}
	public void setOpttimeString(String value) {
		setOpttime(string2Date(value, FORMAT_OPTTIME,java.sql.Timestamp.class));
	}
	
	public void setOpttime(java.sql.Timestamp value) {
		this.opttime = value;
	}
	
	public java.sql.Timestamp getOpttime() {
		return this.opttime;
	}
	public void setOptmodule(java.lang.String value) {
		this.optmodule = value;
	}
	
	public java.lang.String getOptmodule() {
		return this.optmodule;
	}
	public void setOptdomain(java.lang.String value) {
		this.optdomain = value;
	}
	
	public java.lang.String getOptdomain() {
		return this.optdomain;
	}
	public void setOpttype(java.lang.Integer value) {
		this.opttype = value;
	}
	
	public java.lang.Integer getOpttype() {
		return this.opttype;
	}
	public void setOptresult(java.lang.Integer value) {
		this.optresult = value;
	}
	
	public java.lang.Integer getOptresult() {
		return this.optresult;
	}
	public void setOptip(java.lang.String value) {
		this.optip = value;
	}
	
	public java.lang.String getOptip() {
		return this.optip;
	}
	public void setOptdescribe(java.lang.String value) {
		this.optdescribe = value;
	}
	
	public java.lang.String getOptdescribe() {
		return this.optdescribe;
	}
	public void setActionplatform(java.lang.String value) {
		this.actionplatform = value;
	}
	
	public java.lang.String getActionplatform() {
		return this.actionplatform;
	}
	public void setImei(java.lang.String value) {
		this.imei = value;
	}
	
	public java.lang.String getImei() {
		return this.imei;
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
			.append("Username").append("=").append(getUsername()).append(",")
			.append("Opttime").append("=").append(getOpttime()).append(",")
			.append("Optmodule").append("=").append(getOptmodule()).append(",")
			.append("Optdomain").append("=").append(getOptdomain()).append(",")
			.append("Opttype").append("=").append(getOpttype()).append(",")
			.append("Optresult").append("=").append(getOptresult()).append(",")
			.append("Optip").append("=").append(getOptip()).append(",")
			.append("Optdescribe").append("=").append(getOptdescribe()).append(",")
			.append("Actionplatform").append("=").append(getActionplatform()).append(",")
			.append("Imei").append("=").append(getImei()).append(",")
			.append("Sessionid").append("=").append(getSessionid())
			.append("]").toString();
	}
	

}

