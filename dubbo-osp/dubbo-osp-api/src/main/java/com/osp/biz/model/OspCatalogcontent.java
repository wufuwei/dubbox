/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class OspCatalogcontent extends BaseEntity {
	
	
	//date formats
	
	//columns START
	private java.lang.Long id;
	private java.lang.String contentinnercode;
	private java.lang.String catalogid;
	//columns END
 
//generateConstructor START

		 public OspCatalogcontent(){}

	public OspCatalogcontent(
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
	public void setContentinnercode(java.lang.String value) {
		this.contentinnercode = value;
	}
	
	public java.lang.String getContentinnercode() {
		return this.contentinnercode;
	}
	public void setCatalogid(java.lang.String value) {
		this.catalogid = value;
	}
	
	public java.lang.String getCatalogid() {
		return this.catalogid;
	}

	public String toString() {
		return new StringBuffer().append("[")
			.append("Id").append("=").append(getId()).append(",")
			.append("Contentinnercode").append("=").append(getContentinnercode()).append(",")
			.append("Catalogid").append("=").append(getCatalogid())
			.append("]").toString();
	}
	

}

