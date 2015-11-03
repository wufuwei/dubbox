/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class TroleRight extends BaseEntity {
	
	
	//date formats
	
	//columns START
	private java.lang.Integer roleId;
	private java.lang.Integer rightId;
	//columns END
 
//generateConstructor START

		 public TroleRight(){}

	public TroleRight(
		java.lang.Integer roleId,
		java.lang.Integer rightId
	){
		this.roleId = roleId;
		this.rightId = rightId;
	}

//generateConstructor END
	public void setRoleId(java.lang.Integer value) {
		this.roleId = value;
	}
	
	public java.lang.Integer getRoleId() {
		return this.roleId;
	}
	public void setRightId(java.lang.Integer value) {
		this.rightId = value;
	}
	
	public java.lang.Integer getRightId() {
		return this.rightId;
	}

	public String toString() {
		return new StringBuffer().append("[")
			.append("RoleId").append("=").append(getRoleId()).append(",")
			.append("RightId").append("=").append(getRightId())
			.append("]").toString();
	}
	

}

