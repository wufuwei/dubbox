/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class TassginRole extends BaseEntity {
	
	
	//date formats
	
	//columns START
	private java.lang.Integer staffId;
	private java.lang.Integer roleId;
	//columns END
 
//generateConstructor START

		 public TassginRole(){}

	public TassginRole(
		java.lang.Integer staffId,
		java.lang.Integer roleId
	){
		this.staffId = staffId;
		this.roleId = roleId;
	}

//generateConstructor END
	public void setStaffId(java.lang.Integer value) {
		this.staffId = value;
	}
	
	public java.lang.Integer getStaffId() {
		return this.staffId;
	}
	public void setRoleId(java.lang.Integer value) {
		this.roleId = value;
	}
	
	public java.lang.Integer getRoleId() {
		return this.roleId;
	}

	public String toString() {
		return new StringBuffer().append("[")
			.append("StaffId").append("=").append(getStaffId()).append(",")
			.append("RoleId").append("=").append(getRoleId())
			.append("]").toString();
	}
	

}

