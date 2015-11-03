/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class Province extends BaseEntity {
	
	
	//date formats
	
	//columns START
	private java.lang.Integer provinceid;
	private java.lang.String provname;
	private java.lang.String ldnum;
	private java.lang.String miscid;
	//columns END
 
//generateConstructor START

		 public Province(){}

	public Province(
		java.lang.Integer provinceid
	){
		this.provinceid = provinceid;
	}

//generateConstructor END
	public void setProvinceid(java.lang.Integer value) {
		this.provinceid = value;
	}
	
	public java.lang.Integer getProvinceid() {
		return this.provinceid;
	}
	public void setProvname(java.lang.String value) {
		this.provname = value;
	}
	
	public java.lang.String getProvname() {
		return this.provname;
	}
	public void setLdnum(java.lang.String value) {
		this.ldnum = value;
	}
	
	public java.lang.String getLdnum() {
		return this.ldnum;
	}
	public void setMiscid(java.lang.String value) {
		this.miscid = value;
	}
	
	public java.lang.String getMiscid() {
		return this.miscid;
	}

	public String toString() {
		return new StringBuffer().append("[")
			.append("Provinceid").append("=").append(getProvinceid()).append(",")
			.append("Provname").append("=").append(getProvname()).append(",")
			.append("Ldnum").append("=").append(getLdnum()).append(",")
			.append("Miscid").append("=").append(getMiscid())
			.append("]").toString();
	}
	

}

