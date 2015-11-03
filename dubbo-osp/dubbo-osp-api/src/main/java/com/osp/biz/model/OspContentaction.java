/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class OspContentaction extends BaseEntity {
	
	
	//date formats
	public static final String FORMAT_ACTIONDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_DELETEDATE = DATE_TIME_FORMAT;
	
	//columns START
	private java.lang.Long id;
	private java.lang.Long contentid;
	private java.lang.String contentinnercode;
	private java.lang.String ip;
	private java.lang.String imei;
	private java.lang.String phonemodel;
	private java.lang.String contentname;
	private java.lang.String username;
	private java.lang.String comment;
	private java.lang.Integer mark;
	private java.lang.Integer score;
	private java.lang.Integer propi1;
	private java.lang.Integer propi2;
	private java.lang.Integer propi3;
	private java.lang.Integer propi4;
	private java.lang.String props1;
	private java.lang.String props2;
	private java.lang.String props3;
	private java.lang.String props4;
	private java.sql.Timestamp actiondate;
	private java.lang.String sessionid;
	private java.lang.String deleteflag;
	private java.sql.Timestamp deletedate;
	//columns END
 
//generateConstructor START

		 public OspContentaction(){}

	public OspContentaction(
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
	public void setImei(java.lang.String value) {
		this.imei = value;
	}
	
	public java.lang.String getImei() {
		return this.imei;
	}
	public void setPhonemodel(java.lang.String value) {
		this.phonemodel = value;
	}
	
	public java.lang.String getPhonemodel() {
		return this.phonemodel;
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
	public void setComment(java.lang.String value) {
		this.comment = value;
	}
	
	public java.lang.String getComment() {
		return this.comment;
	}
	public void setMark(java.lang.Integer value) {
		this.mark = value;
	}
	
	public java.lang.Integer getMark() {
		return this.mark;
	}
	public void setScore(java.lang.Integer value) {
		this.score = value;
	}
	
	public java.lang.Integer getScore() {
		return this.score;
	}
	public void setPropi1(java.lang.Integer value) {
		this.propi1 = value;
	}
	
	public java.lang.Integer getPropi1() {
		return this.propi1;
	}
	public void setPropi2(java.lang.Integer value) {
		this.propi2 = value;
	}
	
	public java.lang.Integer getPropi2() {
		return this.propi2;
	}
	public void setPropi3(java.lang.Integer value) {
		this.propi3 = value;
	}
	
	public java.lang.Integer getPropi3() {
		return this.propi3;
	}
	public void setPropi4(java.lang.Integer value) {
		this.propi4 = value;
	}
	
	public java.lang.Integer getPropi4() {
		return this.propi4;
	}
	public void setProps1(java.lang.String value) {
		this.props1 = value;
	}
	
	public java.lang.String getProps1() {
		return this.props1;
	}
	public void setProps2(java.lang.String value) {
		this.props2 = value;
	}
	
	public java.lang.String getProps2() {
		return this.props2;
	}
	public void setProps3(java.lang.String value) {
		this.props3 = value;
	}
	
	public java.lang.String getProps3() {
		return this.props3;
	}
	public void setProps4(java.lang.String value) {
		this.props4 = value;
	}
	
	public java.lang.String getProps4() {
		return this.props4;
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
	public void setSessionid(java.lang.String value) {
		this.sessionid = value;
	}
	
	public java.lang.String getSessionid() {
		return this.sessionid;
	}
	public void setDeleteflag(java.lang.String value) {
		this.deleteflag = value;
	}
	
	public java.lang.String getDeleteflag() {
		return this.deleteflag;
	}
	public String getDeletedateString() {
		return date2String(getDeletedate(), FORMAT_DELETEDATE);
	}
	public void setDeletedateString(String value) {
		setDeletedate(string2Date(value, FORMAT_DELETEDATE,java.sql.Timestamp.class));
	}
	
	public void setDeletedate(java.sql.Timestamp value) {
		this.deletedate = value;
	}
	
	public java.sql.Timestamp getDeletedate() {
		return this.deletedate;
	}

	public String toString() {
		return new StringBuffer().append("[")
			.append("Id").append("=").append(getId()).append(",")
			.append("Contentid").append("=").append(getContentid()).append(",")
			.append("Contentinnercode").append("=").append(getContentinnercode()).append(",")
			.append("Ip").append("=").append(getIp()).append(",")
			.append("Imei").append("=").append(getImei()).append(",")
			.append("Phonemodel").append("=").append(getPhonemodel()).append(",")
			.append("Contentname").append("=").append(getContentname()).append(",")
			.append("Username").append("=").append(getUsername()).append(",")
			.append("Comment").append("=").append(getComment()).append(",")
			.append("Mark").append("=").append(getMark()).append(",")
			.append("Score").append("=").append(getScore()).append(",")
			.append("Propi1").append("=").append(getPropi1()).append(",")
			.append("Propi2").append("=").append(getPropi2()).append(",")
			.append("Propi3").append("=").append(getPropi3()).append(",")
			.append("Propi4").append("=").append(getPropi4()).append(",")
			.append("Props1").append("=").append(getProps1()).append(",")
			.append("Props2").append("=").append(getProps2()).append(",")
			.append("Props3").append("=").append(getProps3()).append(",")
			.append("Props4").append("=").append(getProps4()).append(",")
			.append("Actiondate").append("=").append(getActiondate()).append(",")
			.append("Sessionid").append("=").append(getSessionid()).append(",")
			.append("Deleteflag").append("=").append(getDeleteflag()).append(",")
			.append("Deletedate").append("=").append(getDeletedate())
			.append("]").toString();
	}
	

}

