/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class Trole extends BaseEntity {
	
	
	//date formats
	
	//columns START
	private java.lang.Integer roleId;
	private java.lang.String roleName;
	private java.lang.String roleDesc;
	//columns END
 
//generateConstructor START

		 public Trole(){}

	public Trole(
		java.lang.Integer roleId
	){
		this.roleId = roleId;
	}

//generateConstructor END
	public void setRoleId(java.lang.Integer value) {
		this.roleId = value;
	}
	
	public java.lang.Integer getRoleId() {
		return this.roleId;
	}
	public void setRoleName(java.lang.String value) {
		this.roleName = value;
	}
	
	public java.lang.String getRoleName() {
		return this.roleName;
	}
	public void setRoleDesc(java.lang.String value) {
		this.roleDesc = value;
	}
	
	public java.lang.String getRoleDesc() {
		return this.roleDesc;
	}

	public String toString() {
		return new StringBuffer().append("[")
			.append("RoleId").append("=").append(getRoleId()).append(",")
			.append("RoleName").append("=").append(getRoleName()).append(",")
			.append("RoleDesc").append("=").append(getRoleDesc())
			.append("]").toString();
	}
	

}

