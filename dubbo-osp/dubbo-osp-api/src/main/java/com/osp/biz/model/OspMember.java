/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class OspMember extends BaseEntity {
	
	
	//date formats
	public static final String FORMAT_LASTLOGINTIME = DATE_TIME_FORMAT;
	public static final String FORMAT_REGTIME = DATE_TIME_FORMAT;
	public static final String TABLE_ALIAS="osp_member";
	//columns START
	private java.lang.String username;
	private java.lang.String password;
	private java.lang.String name;
	private java.lang.String email;
	private java.lang.String tel;
	private java.lang.String mobile;
	private java.lang.String gender;
	private java.lang.String type;
	private java.lang.String logo;
	private java.lang.String status;
	private java.lang.String score;
	private java.lang.String rank;
	private java.lang.String memberlevel;
	private java.lang.String pwquestion;
	private java.lang.String pwanswer;
	private java.lang.String lastloginip;
	private java.sql.Timestamp lastlogintime;
	private java.sql.Timestamp regtime;
	private java.lang.String regip;
	private java.lang.String loginmd5;
	//columns END
 
//generateConstructor START

		 public OspMember(){}

	public OspMember(
		java.lang.String username
	){
		this.username = username;
	}

//generateConstructor END
	public void setUsername(java.lang.String value) {
		this.username = value;
	}
	
	public java.lang.String getUsername() {
		return this.username;
	}
	public void setPassword(java.lang.String value) {
		this.password = value;
	}
	
	public java.lang.String getPassword() {
		return this.password;
	}
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}
	public void setEmail(java.lang.String value) {
		this.email = value;
	}
	
	public java.lang.String getEmail() {
		return this.email;
	}
	public void setTel(java.lang.String value) {
		this.tel = value;
	}
	
	public java.lang.String getTel() {
		return this.tel;
	}
	public void setMobile(java.lang.String value) {
		this.mobile = value;
	}
	
	public java.lang.String getMobile() {
		return this.mobile;
	}
	public void setGender(java.lang.String value) {
		this.gender = value;
	}
	
	public java.lang.String getGender() {
		return this.gender;
	}
	public void setType(java.lang.String value) {
		this.type = value;
	}
	
	public java.lang.String getType() {
		return this.type;
	}
	public void setLogo(java.lang.String value) {
		this.logo = value;
	}
	
	public java.lang.String getLogo() {
		return this.logo;
	}
	public void setStatus(java.lang.String value) {
		this.status = value;
	}
	
	public java.lang.String getStatus() {
		return this.status;
	}
	public void setScore(java.lang.String value) {
		this.score = value;
	}
	
	public java.lang.String getScore() {
		return this.score;
	}
	public void setRank(java.lang.String value) {
		this.rank = value;
	}
	
	public java.lang.String getRank() {
		return this.rank;
	}
	public void setMemberlevel(java.lang.String value) {
		this.memberlevel = value;
	}
	
	public java.lang.String getMemberlevel() {
		return this.memberlevel;
	}
	public void setPwquestion(java.lang.String value) {
		this.pwquestion = value;
	}
	
	public java.lang.String getPwquestion() {
		return this.pwquestion;
	}
	public void setPwanswer(java.lang.String value) {
		this.pwanswer = value;
	}
	
	public java.lang.String getPwanswer() {
		return this.pwanswer;
	}
	public void setLastloginip(java.lang.String value) {
		this.lastloginip = value;
	}
	
	public java.lang.String getLastloginip() {
		return this.lastloginip;
	}
	public String getLastlogintimeString() {
		return date2String(getLastlogintime(), FORMAT_LASTLOGINTIME);
	}
	public void setLastlogintimeString(String value) {
		setLastlogintime(string2Date(value, FORMAT_LASTLOGINTIME,java.sql.Timestamp.class));
	}
	
	public void setLastlogintime(java.sql.Timestamp value) {
		this.lastlogintime = value;
	}
	
	public java.sql.Timestamp getLastlogintime() {
		return this.lastlogintime;
	}
	public String getRegtimeString() {
		return date2String(getRegtime(), FORMAT_REGTIME);
	}
	public void setRegtimeString(String value) {
		setRegtime(string2Date(value, FORMAT_REGTIME,java.sql.Timestamp.class));
	}
	
	public void setRegtime(java.sql.Timestamp value) {
		this.regtime = value;
	}
	
	public java.sql.Timestamp getRegtime() {
		return this.regtime;
	}
	public void setRegip(java.lang.String value) {
		this.regip = value;
	}
	
	public java.lang.String getRegip() {
		return this.regip;
	}
	public void setLoginmd5(java.lang.String value) {
		this.loginmd5 = value;
	}
	
	public java.lang.String getLoginmd5() {
		return this.loginmd5;
	}

	public String toString() {
		return new StringBuffer().append("[")
			.append("Username").append("=").append(getUsername()).append(",")
			.append("Password").append("=").append(getPassword()).append(",")
			.append("Name").append("=").append(getName()).append(",")
			.append("Email").append("=").append(getEmail()).append(",")
			.append("Tel").append("=").append(getTel()).append(",")
			.append("Mobile").append("=").append(getMobile()).append(",")
			.append("Gender").append("=").append(getGender()).append(",")
			.append("Type").append("=").append(getType()).append(",")
			.append("Logo").append("=").append(getLogo()).append(",")
			.append("Status").append("=").append(getStatus()).append(",")
			.append("Score").append("=").append(getScore()).append(",")
			.append("Rank").append("=").append(getRank()).append(",")
			.append("Memberlevel").append("=").append(getMemberlevel()).append(",")
			.append("Pwquestion").append("=").append(getPwquestion()).append(",")
			.append("Pwanswer").append("=").append(getPwanswer()).append(",")
			.append("Lastloginip").append("=").append(getLastloginip()).append(",")
			.append("Lastlogintime").append("=").append(getLastlogintime()).append(",")
			.append("Regtime").append("=").append(getRegtime()).append(",")
			.append("Regip").append("=").append(getRegip()).append(",")
			.append("Loginmd5").append("=").append(getLoginmd5())
			.append("]").toString();
	}
	

}

