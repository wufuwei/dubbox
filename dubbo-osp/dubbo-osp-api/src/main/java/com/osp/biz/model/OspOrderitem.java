/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class OspOrderitem extends BaseEntity {
	
	
	//date formats
	public static final String FORMAT_CREATEDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_UPDATEDATE = DATE_TIME_FORMAT;
	
	//columns START
	private java.lang.Long id;
	private java.lang.String orderid;
	private java.lang.Long contentid;
	private java.lang.String contentinnercode;
	private java.lang.String contentname;
	private java.lang.Float price;
	private java.lang.Float discount;
	private java.lang.Float discountprice;
	private java.lang.Integer count;
	private java.lang.Float amount;
	private java.lang.String memo;
	private java.lang.String prop1;
	private java.lang.String prop2;
	private java.lang.String prop3;
	private java.lang.String prop4;
	private java.lang.String createuser;
	private java.sql.Timestamp createdate;
	private java.lang.String updateuser;
	private java.sql.Timestamp updatedate;
	private java.lang.Float orderamount;
	private java.lang.String mobilelogo;
	private java.lang.String alias;
	private java.lang.String contentalias;
	//columns END
 
//generateConstructor START

		 public OspOrderitem(){}

	public OspOrderitem(
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
	public void setOrderid(java.lang.String value) {
		this.orderid = value;
	}
	
	public java.lang.String getOrderid() {
		return this.orderid;
	}
	public void setContentid(java.lang.Long value) {
		this.contentid = value;
	}
	
	public java.lang.Long getContentid() {
		return this.contentid;
	}
	public void setContentinnercode(java.lang.String value) {
		this.contentinnercode = value;
	}
	
	public java.lang.String getContentinnercode() {
		return this.contentinnercode;
	}
	public void setContentname(java.lang.String value) {
		this.contentname = value;
	}
	
	public java.lang.String getContentname() {
		return this.contentname;
	}
	public void setPrice(java.lang.Float value) {
		this.price = value;
	}
	
	public java.lang.Float getPrice() {
		return this.price;
	}
	public void setDiscount(java.lang.Float value) {
		this.discount = value;
	}
	
	public java.lang.Float getDiscount() {
		return this.discount;
	}
	public void setDiscountprice(java.lang.Float value) {
		this.discountprice = value;
	}
	
	public java.lang.Float getDiscountprice() {
		return this.discountprice;
	}
	public void setCount(java.lang.Integer value) {
		this.count = value;
	}
	
	public java.lang.Integer getCount() {
		return this.count;
	}
	public void setAmount(java.lang.Float value) {
		this.amount = value;
	}
	
	public java.lang.Float getAmount() {
		return this.amount;
	}
	public void setMemo(java.lang.String value) {
		this.memo = value;
	}
	
	public java.lang.String getMemo() {
		return this.memo;
	}
	public void setProp1(java.lang.String value) {
		this.prop1 = value;
	}
	
	public java.lang.String getProp1() {
		return this.prop1;
	}
	public void setProp2(java.lang.String value) {
		this.prop2 = value;
	}
	
	public java.lang.String getProp2() {
		return this.prop2;
	}
	public void setProp3(java.lang.String value) {
		this.prop3 = value;
	}
	
	public java.lang.String getProp3() {
		return this.prop3;
	}
	public void setProp4(java.lang.String value) {
		this.prop4 = value;
	}
	
	public java.lang.String getProp4() {
		return this.prop4;
	}
	public void setCreateuser(java.lang.String value) {
		this.createuser = value;
	}
	
	public java.lang.String getCreateuser() {
		return this.createuser;
	}
	public String getCreatedateString() {
		return date2String(getCreatedate(), FORMAT_CREATEDATE);
	}
	public void setCreatedateString(String value) {
		setCreatedate(string2Date(value, FORMAT_CREATEDATE,java.sql.Timestamp.class));
	}
	
	public void setCreatedate(java.sql.Timestamp value) {
		this.createdate = value;
	}
	
	public java.sql.Timestamp getCreatedate() {
		return this.createdate;
	}
	public void setUpdateuser(java.lang.String value) {
		this.updateuser = value;
	}
	
	public java.lang.String getUpdateuser() {
		return this.updateuser;
	}
	public String getUpdatedateString() {
		return date2String(getUpdatedate(), FORMAT_UPDATEDATE);
	}
	public void setUpdatedateString(String value) {
		setUpdatedate(string2Date(value, FORMAT_UPDATEDATE,java.sql.Timestamp.class));
	}
	
	public void setUpdatedate(java.sql.Timestamp value) {
		this.updatedate = value;
	}
	
	public java.sql.Timestamp getUpdatedate() {
		return this.updatedate;
	}
	public void setOrderamount(java.lang.Float value) {
		this.orderamount = value;
	}
	
	public java.lang.Float getOrderamount() {
		return this.orderamount;
	}
	public void setMobilelogo(java.lang.String value) {
		this.mobilelogo = value;
	}
	
	public java.lang.String getMobilelogo() {
		return this.mobilelogo;
	}
	public void setAlias(java.lang.String value) {
		this.alias = value;
	}
	
	public java.lang.String getAlias() {
		return this.alias;
	}
	public void setContentalias(java.lang.String value) {
		this.contentalias = value;
	}
	
	public java.lang.String getContentalias() {
		return this.contentalias;
	}

	public String toString() {
		return new StringBuffer().append("[")
			.append("Id").append("=").append(getId()).append(",")
			.append("Orderid").append("=").append(getOrderid()).append(",")
			.append("Contentid").append("=").append(getContentid()).append(",")
			.append("Contentinnercode").append("=").append(getContentinnercode()).append(",")
			.append("Contentname").append("=").append(getContentname()).append(",")
			.append("Price").append("=").append(getPrice()).append(",")
			.append("Discount").append("=").append(getDiscount()).append(",")
			.append("Discountprice").append("=").append(getDiscountprice()).append(",")
			.append("Count").append("=").append(getCount()).append(",")
			.append("Amount").append("=").append(getAmount()).append(",")
			.append("Memo").append("=").append(getMemo()).append(",")
			.append("Prop1").append("=").append(getProp1()).append(",")
			.append("Prop2").append("=").append(getProp2()).append(",")
			.append("Prop3").append("=").append(getProp3()).append(",")
			.append("Prop4").append("=").append(getProp4()).append(",")
			.append("Createuser").append("=").append(getCreateuser()).append(",")
			.append("Createdate").append("=").append(getCreatedate()).append(",")
			.append("Updateuser").append("=").append(getUpdateuser()).append(",")
			.append("Updatedate").append("=").append(getUpdatedate()).append(",")
			.append("Orderamount").append("=").append(getOrderamount()).append(",")
			.append("Mobilelogo").append("=").append(getMobilelogo()).append(",")
			.append("Alias").append("=").append(getAlias()).append(",")
			.append("Contentalias").append("=").append(getContentalias())
			.append("]").toString();
	}
	

}

