/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class Tright extends BaseEntity {
	
	
	//date formats
	
	//columns START
	private java.lang.Integer rightId;
	private java.lang.String rightName;
	private java.lang.String rightUrl;
	private java.lang.Integer parentRightId;
	private java.lang.Short rightLevel;
	private java.lang.Integer orderByTopMenu;
	private java.lang.Integer orderByMidMenu;
	//columns END
 
//generateConstructor START

		 public Tright(){}

	public Tright(
		java.lang.Integer rightId
	){
		this.rightId = rightId;
	}

//generateConstructor END
	public void setRightId(java.lang.Integer value) {
		this.rightId = value;
	}
	
	public java.lang.Integer getRightId() {
		return this.rightId;
	}
	public void setRightName(java.lang.String value) {
		this.rightName = value;
	}
	
	public java.lang.String getRightName() {
		return this.rightName;
	}
	public void setRightUrl(java.lang.String value) {
		this.rightUrl = value;
	}
	
	public java.lang.String getRightUrl() {
		return this.rightUrl;
	}
	public void setParentRightId(java.lang.Integer value) {
		this.parentRightId = value;
	}
	
	public java.lang.Integer getParentRightId() {
		return this.parentRightId;
	}
	public void setRightLevel(java.lang.Short value) {
		this.rightLevel = value;
	}
	
	public java.lang.Short getRightLevel() {
		return this.rightLevel;
	}
	public void setOrderByTopMenu(java.lang.Integer value) {
		this.orderByTopMenu = value;
	}
	
	public java.lang.Integer getOrderByTopMenu() {
		return this.orderByTopMenu;
	}
	public void setOrderByMidMenu(java.lang.Integer value) {
		this.orderByMidMenu = value;
	}
	
	public java.lang.Integer getOrderByMidMenu() {
		return this.orderByMidMenu;
	}

	public String toString() {
		return new StringBuffer().append("[")
			.append("RightId").append("=").append(getRightId()).append(",")
			.append("RightName").append("=").append(getRightName()).append(",")
			.append("RightUrl").append("=").append(getRightUrl()).append(",")
			.append("ParentRightId").append("=").append(getParentRightId()).append(",")
			.append("RightLevel").append("=").append(getRightLevel()).append(",")
			.append("OrderByTopMenu").append("=").append(getOrderByTopMenu()).append(",")
			.append("OrderByMidMenu").append("=").append(getOrderByMidMenu())
			.append("]").toString();
	}
	

}

