/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class OspContentrelation extends BaseEntity {
	
	
	//date formats
	
	//columns START
	private java.lang.Long id;
	private java.lang.String pcontentinnercode;
	private java.lang.String scontentinnercode;
	//columns END
 
//generateConstructor START

		 public OspContentrelation(){}

	public OspContentrelation(
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
	public void setPcontentinnercode(java.lang.String value) {
		this.pcontentinnercode = value;
	}
	
	public java.lang.String getPcontentinnercode() {
		return this.pcontentinnercode;
	}
	public void setScontentinnercode(java.lang.String value) {
		this.scontentinnercode = value;
	}
	
	public java.lang.String getScontentinnercode() {
		return this.scontentinnercode;
	}

	public String toString() {
		return new StringBuffer().append("[")
			.append("Id").append("=").append(getId()).append(",")
			.append("Pcontentinnercode").append("=").append(getPcontentinnercode()).append(",")
			.append("Scontentinnercode").append("=").append(getScontentinnercode())
			.append("]").toString();
	}
	

}

