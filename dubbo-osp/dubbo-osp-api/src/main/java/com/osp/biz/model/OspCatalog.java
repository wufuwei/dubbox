/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class OspCatalog extends BaseEntity {
	
	
	//date formats
	public static final String FORMAT_RECOMMENDDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_DELETEDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_CREATEDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_UPDATEDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_PUBLISHDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_DOWNLINEDATE = DATE_TIME_FORMAT;
	
	//columns START
	private java.lang.Long id;
	private java.lang.Long parentid;
	private java.lang.String name;
	private java.lang.String innercode;
	private java.lang.String alias;
	private java.lang.String summary;
	private java.lang.String memo;
	private java.lang.String catalogpath;
	private java.lang.String url;
	private java.lang.String imagepath;
	private java.sql.Timestamp recommenddate;
	private java.lang.String recommendflag;
	private java.lang.String newflag;
	private java.lang.String publishflag;
	private java.lang.Integer orderflag;
	private java.lang.Integer type;
	private java.lang.String indextemplate;
	private java.lang.String listtemplate;
	private java.lang.String listnamerule;
	private java.lang.String detailtemplate;
	private java.lang.String detailnamerule;
	private java.lang.String templatefollow;
	private java.lang.Integer treelevel;
	private java.lang.Integer childcount;
	private java.lang.String isleaf;
	private java.lang.Integer total;
	private java.lang.Integer listpagesize;
	private java.lang.Integer listpage;
	private java.lang.String singleflag;
	private java.lang.Integer dayscantimes;
	private java.lang.Integer weekscantimes;
	private java.lang.Integer monthscantimes;
	private java.lang.Integer scantimes;
	private java.lang.String deleteflag;
	private java.sql.Timestamp deletedate;
	private java.lang.String createuser;
	private java.sql.Timestamp createdate;
	private java.lang.String updateuser;
	private java.sql.Timestamp updatedate;
	private java.lang.String mobilelogo;
	private java.lang.String wwwlogo;
	private java.sql.Timestamp publishdate;
	private java.sql.Timestamp downlinedate;
	private java.lang.String prop1;
	private java.lang.String prop2;
	private java.lang.String prop3;
	private java.lang.String prop4;
	//columns END
 
//generateConstructor START

		 public OspCatalog(){}

	public OspCatalog(
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
	public void setParentid(java.lang.Long value) {
		this.parentid = value;
	}
	
	public java.lang.Long getParentid() {
		return this.parentid;
	}
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}
	public void setInnercode(java.lang.String value) {
		this.innercode = value;
	}
	
	public java.lang.String getInnercode() {
		return this.innercode;
	}
	public void setAlias(java.lang.String value) {
		this.alias = value;
	}
	
	public java.lang.String getAlias() {
		return this.alias;
	}
	public void setSummary(java.lang.String value) {
		this.summary = value;
	}
	
	public java.lang.String getSummary() {
		return this.summary;
	}
	public void setMemo(java.lang.String value) {
		this.memo = value;
	}
	
	public java.lang.String getMemo() {
		return this.memo;
	}
	public void setCatalogpath(java.lang.String value) {
		this.catalogpath = value;
	}
	
	public java.lang.String getCatalogpath() {
		return this.catalogpath;
	}
	public void setUrl(java.lang.String value) {
		this.url = value;
	}
	
	public java.lang.String getUrl() {
		return this.url;
	}
	public void setImagepath(java.lang.String value) {
		this.imagepath = value;
	}
	
	public java.lang.String getImagepath() {
		return this.imagepath;
	}
	public String getRecommenddateString() {
		return date2String(getRecommenddate(), FORMAT_RECOMMENDDATE);
	}
	public void setRecommenddateString(String value) {
		setRecommenddate(string2Date(value, FORMAT_RECOMMENDDATE,java.sql.Timestamp.class));
	}
	
	public void setRecommenddate(java.sql.Timestamp value) {
		this.recommenddate = value;
	}
	
	public java.sql.Timestamp getRecommenddate() {
		return this.recommenddate;
	}
	public void setRecommendflag(java.lang.String value) {
		this.recommendflag = value;
	}
	
	public java.lang.String getRecommendflag() {
		return this.recommendflag;
	}
	public void setNewflag(java.lang.String value) {
		this.newflag = value;
	}
	
	public java.lang.String getNewflag() {
		return this.newflag;
	}
	public void setPublishflag(java.lang.String value) {
		this.publishflag = value;
	}
	
	public java.lang.String getPublishflag() {
		return this.publishflag;
	}
	public void setOrderflag(java.lang.Integer value) {
		this.orderflag = value;
	}
	
	public java.lang.Integer getOrderflag() {
		return this.orderflag;
	}
	public void setType(java.lang.Integer value) {
		this.type = value;
	}
	
	public java.lang.Integer getType() {
		return this.type;
	}
	public void setIndextemplate(java.lang.String value) {
		this.indextemplate = value;
	}
	
	public java.lang.String getIndextemplate() {
		return this.indextemplate;
	}
	public void setListtemplate(java.lang.String value) {
		this.listtemplate = value;
	}
	
	public java.lang.String getListtemplate() {
		return this.listtemplate;
	}
	public void setListnamerule(java.lang.String value) {
		this.listnamerule = value;
	}
	
	public java.lang.String getListnamerule() {
		return this.listnamerule;
	}
	public void setDetailtemplate(java.lang.String value) {
		this.detailtemplate = value;
	}
	
	public java.lang.String getDetailtemplate() {
		return this.detailtemplate;
	}
	public void setDetailnamerule(java.lang.String value) {
		this.detailnamerule = value;
	}
	
	public java.lang.String getDetailnamerule() {
		return this.detailnamerule;
	}
	public void setTemplatefollow(java.lang.String value) {
		this.templatefollow = value;
	}
	
	public java.lang.String getTemplatefollow() {
		return this.templatefollow;
	}
	public void setTreelevel(java.lang.Integer value) {
		this.treelevel = value;
	}
	
	public java.lang.Integer getTreelevel() {
		return this.treelevel;
	}
	public void setChildcount(java.lang.Integer value) {
		this.childcount = value;
	}
	
	public java.lang.Integer getChildcount() {
		return this.childcount;
	}
	public void setIsleaf(java.lang.String value) {
		this.isleaf = value;
	}
	
	public java.lang.String getIsleaf() {
		return this.isleaf;
	}
	public void setTotal(java.lang.Integer value) {
		this.total = value;
	}
	
	public java.lang.Integer getTotal() {
		return this.total;
	}
	public void setListpagesize(java.lang.Integer value) {
		this.listpagesize = value;
	}
	
	public java.lang.Integer getListpagesize() {
		return this.listpagesize;
	}
	public void setListpage(java.lang.Integer value) {
		this.listpage = value;
	}
	
	public java.lang.Integer getListpage() {
		return this.listpage;
	}
	public void setSingleflag(java.lang.String value) {
		this.singleflag = value;
	}
	
	public java.lang.String getSingleflag() {
		return this.singleflag;
	}
	public void setDayscantimes(java.lang.Integer value) {
		this.dayscantimes = value;
	}
	
	public java.lang.Integer getDayscantimes() {
		return this.dayscantimes;
	}
	public void setWeekscantimes(java.lang.Integer value) {
		this.weekscantimes = value;
	}
	
	public java.lang.Integer getWeekscantimes() {
		return this.weekscantimes;
	}
	public void setMonthscantimes(java.lang.Integer value) {
		this.monthscantimes = value;
	}
	
	public java.lang.Integer getMonthscantimes() {
		return this.monthscantimes;
	}
	public void setScantimes(java.lang.Integer value) {
		this.scantimes = value;
	}
	
	public java.lang.Integer getScantimes() {
		return this.scantimes;
	}
	public void setDeleteflag(java.lang.String value) {
		this.deleteflag = value;
	}
	
	public java.lang.String getDeleteflag() {
		return this.deleteflag;
	}
	public String getDeletedateString() {
		return date2String(getDeletedate(), FORMAT_DELETEDATE);
	}
	public void setDeletedateString(String value) {
		setDeletedate(string2Date(value, FORMAT_DELETEDATE,java.sql.Timestamp.class));
	}
	
	public void setDeletedate(java.sql.Timestamp value) {
		this.deletedate = value;
	}
	
	public java.sql.Timestamp getDeletedate() {
		return this.deletedate;
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
	public void setMobilelogo(java.lang.String value) {
		this.mobilelogo = value;
	}
	
	public java.lang.String getMobilelogo() {
		return this.mobilelogo;
	}
	public void setWwwlogo(java.lang.String value) {
		this.wwwlogo = value;
	}
	
	public java.lang.String getWwwlogo() {
		return this.wwwlogo;
	}
	public String getPublishdateString() {
		return date2String(getPublishdate(), FORMAT_PUBLISHDATE);
	}
	public void setPublishdateString(String value) {
		setPublishdate(string2Date(value, FORMAT_PUBLISHDATE,java.sql.Timestamp.class));
	}
	
	public void setPublishdate(java.sql.Timestamp value) {
		this.publishdate = value;
	}
	
	public java.sql.Timestamp getPublishdate() {
		return this.publishdate;
	}
	public String getDownlinedateString() {
		return date2String(getDownlinedate(), FORMAT_DOWNLINEDATE);
	}
	public void setDownlinedateString(String value) {
		setDownlinedate(string2Date(value, FORMAT_DOWNLINEDATE,java.sql.Timestamp.class));
	}
	
	public void setDownlinedate(java.sql.Timestamp value) {
		this.downlinedate = value;
	}
	
	public java.sql.Timestamp getDownlinedate() {
		return this.downlinedate;
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

	public String toString() {
		return new StringBuffer().append("[")
			.append("Id").append("=").append(getId()).append(",")
			.append("Parentid").append("=").append(getParentid()).append(",")
			.append("Name").append("=").append(getName()).append(",")
			.append("Innercode").append("=").append(getInnercode()).append(",")
			.append("Alias").append("=").append(getAlias()).append(",")
			.append("Summary").append("=").append(getSummary()).append(",")
			.append("Memo").append("=").append(getMemo()).append(",")
			.append("Catalogpath").append("=").append(getCatalogpath()).append(",")
			.append("Url").append("=").append(getUrl()).append(",")
			.append("Imagepath").append("=").append(getImagepath()).append(",")
			.append("Recommenddate").append("=").append(getRecommenddate()).append(",")
			.append("Recommendflag").append("=").append(getRecommendflag()).append(",")
			.append("Newflag").append("=").append(getNewflag()).append(",")
			.append("Publishflag").append("=").append(getPublishflag()).append(",")
			.append("Orderflag").append("=").append(getOrderflag()).append(",")
			.append("Type").append("=").append(getType()).append(",")
			.append("Indextemplate").append("=").append(getIndextemplate()).append(",")
			.append("Listtemplate").append("=").append(getListtemplate()).append(",")
			.append("Listnamerule").append("=").append(getListnamerule()).append(",")
			.append("Detailtemplate").append("=").append(getDetailtemplate()).append(",")
			.append("Detailnamerule").append("=").append(getDetailnamerule()).append(",")
			.append("Templatefollow").append("=").append(getTemplatefollow()).append(",")
			.append("Treelevel").append("=").append(getTreelevel()).append(",")
			.append("Childcount").append("=").append(getChildcount()).append(",")
			.append("Isleaf").append("=").append(getIsleaf()).append(",")
			.append("Total").append("=").append(getTotal()).append(",")
			.append("Listpagesize").append("=").append(getListpagesize()).append(",")
			.append("Listpage").append("=").append(getListpage()).append(",")
			.append("Singleflag").append("=").append(getSingleflag()).append(",")
			.append("Dayscantimes").append("=").append(getDayscantimes()).append(",")
			.append("Weekscantimes").append("=").append(getWeekscantimes()).append(",")
			.append("Monthscantimes").append("=").append(getMonthscantimes()).append(",")
			.append("Scantimes").append("=").append(getScantimes()).append(",")
			.append("Deleteflag").append("=").append(getDeleteflag()).append(",")
			.append("Deletedate").append("=").append(getDeletedate()).append(",")
			.append("Createuser").append("=").append(getCreateuser()).append(",")
			.append("Createdate").append("=").append(getCreatedate()).append(",")
			.append("Updateuser").append("=").append(getUpdateuser()).append(",")
			.append("Updatedate").append("=").append(getUpdatedate()).append(",")
			.append("Mobilelogo").append("=").append(getMobilelogo()).append(",")
			.append("Wwwlogo").append("=").append(getWwwlogo()).append(",")
			.append("Publishdate").append("=").append(getPublishdate()).append(",")
			.append("Downlinedate").append("=").append(getDownlinedate()).append(",")
			.append("Prop1").append("=").append(getProp1()).append(",")
			.append("Prop2").append("=").append(getProp2()).append(",")
			.append("Prop3").append("=").append(getProp3()).append(",")
			.append("Prop4").append("=").append(getProp4())
			.append("]").toString();
	}
	

}

