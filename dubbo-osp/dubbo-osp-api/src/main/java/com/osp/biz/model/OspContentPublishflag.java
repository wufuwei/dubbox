/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class OspContentPublishflag extends BaseEntity {
	
	
	//date formats
	
	//columns START
	private java.lang.String contentinnercode;
	private java.lang.String version;
	//columns END
 
//generateConstructor START


	public OspContentPublishflag(
	){
	}

//generateConstructor END
	public void setContentinnercode(java.lang.String value) {
		this.contentinnercode = value;
	}
	
	public java.lang.String getContentinnercode() {
		return this.contentinnercode;
	}
	public void setVersion(java.lang.String value) {
		this.version = value;
	}
	
	public java.lang.String getVersion() {
		return this.version;
	}

	public String toString() {
		return new StringBuffer().append("[")
			.append("Contentinnercode").append("=").append(getContentinnercode()).append(",")
			.append("Version").append("=").append(getVersion())
			.append("]").toString();
	}
	

}

