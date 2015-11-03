/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class Tsequence extends BaseEntity {
	
	
	//date formats
	
	//columns START
	private java.lang.String name;
	private java.lang.Integer nextid;
	//columns END
 
//generateConstructor START

		 public Tsequence(){}

	public Tsequence(
		java.lang.String name
	){
		this.name = name;
	}

//generateConstructor END
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}
	public void setNextid(java.lang.Integer value) {
		this.nextid = value;
	}
	
	public java.lang.Integer getNextid() {
		return this.nextid;
	}

	public String toString() {
		return new StringBuffer().append("[")
			.append("Name").append("=").append(getName()).append(",")
			.append("Nextid").append("=").append(getNextid())
			.append("]").toString();
	}
	

}

