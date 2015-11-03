/*
 * Powered By wufuwei
 */

package com.osp.biz.model;

import javacommon.base.BaseEntity;

public class OspContent extends BaseEntity {
	
	
	//date formats
	public static final String FORMAT_FINEDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_TOPDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_RECOMMENDDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_ADDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_PUBLISHDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_DOWNLINEDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_EFFECTDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_DELETEDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_CREATEDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_UPDATEDATE = DATE_TIME_FORMAT;
	public static final String FORMAT_DESKTOPDATE = DATE_TIME_FORMAT;
	
	//columns START
	private java.lang.Long id;
	private java.lang.String contentinnercode;
	private java.lang.String name;
	private java.lang.String osenv;
	private java.lang.String spname;
	private java.lang.String icpcode;
	private java.lang.String icpservid;
	private java.lang.String apppackage;
	private java.lang.String platform;
	private java.lang.String version;
	private java.lang.Long filesize;
	private java.lang.String filemd5;
	private java.lang.String enforceflag;
	private java.lang.String downloadurl;
	private java.lang.String filename;
	private java.lang.String alias;
	private java.lang.String summary;
	private java.lang.String memo;
	private java.lang.String content;
	private java.lang.String mobilelogo;
	private java.lang.String wwwlogo;
	private java.lang.String adimage;
	private java.lang.String image0;
	private java.lang.String image1;
	private java.lang.String image2;
	private java.lang.String image3;
	private java.lang.String keyword;
	private java.sql.Timestamp finedate;
	private java.lang.String fineflag;
	private java.sql.Timestamp topdate;
	private java.lang.String topflag;
	private java.sql.Timestamp recommenddate;
	private java.lang.String recommendflag;
	private java.sql.Timestamp addate;
	private java.lang.String adflag;
	private java.lang.String publishflag;
	private java.sql.Timestamp publishdate;
	private java.sql.Timestamp downlinedate;
	private java.lang.String status;
	private java.lang.Integer pricetype;
	private java.lang.Integer orderflag;
	private java.lang.Float marketprice;
	private java.lang.Float price;
	private java.lang.Float discount;
	private java.lang.Float discountprice;
	private java.lang.Float memberprice;
	private java.lang.Float vipprice;
	private java.sql.Timestamp effectdate;
	private java.lang.String unit;
	private java.lang.Integer daydownloadtimes;
	private java.lang.Integer weekdownloadtimes;
	private java.lang.Integer monthdownloadtimes;
	private java.lang.Integer downloadtimes;
	private java.lang.Integer daysearchtimes;
	private java.lang.Integer weeksearchtimes;
	private java.lang.Integer monthsearchtimes;
	private java.lang.Integer searchtimes;
	private java.lang.Integer dayscantimes;
	private java.lang.Integer weekscantimes;
	private java.lang.Integer monthscantimes;
	private java.lang.Integer scantimes;
	private java.lang.Integer dayordertimes;
	private java.lang.Integer weekordertimes;
	private java.lang.Integer monthordertimes;
	private java.lang.Integer ordertimes;
	private java.lang.Integer daycommenttimes;
	private java.lang.Integer weekcommenttimes;
	private java.lang.Integer monthcommenttimes;
	private java.lang.Integer commenttimes;
	private java.lang.Integer daymarktimes;
	private java.lang.Integer weekmarktimes;
	private java.lang.Integer monthmarktimes;
	private java.lang.Integer marktimes;
	private java.lang.Integer dayscoretimes;
	private java.lang.Integer weekscoretimes;
	private java.lang.Integer monthscoretimes;
	private java.lang.Integer scoretimes;
	private java.lang.Integer daycommendtimes;
	private java.lang.Integer weekcommendtimes;
	private java.lang.Integer monthcommendtimes;
	private java.lang.Integer commendtimes;
	private java.lang.Integer daycollecttimes;
	private java.lang.Integer weekcollecttimes;
	private java.lang.Integer monthcollecttimes;
	private java.lang.Integer collecttimes;
	private java.lang.String prop1;
	private java.lang.String prop2;
	private java.lang.String prop3;
	private java.lang.String prop4;
	private java.lang.String prop5;
	private java.lang.String prop6;
	private java.lang.String prop7;
	private java.lang.String deleteflag;
	private java.sql.Timestamp deletedate;
	private java.lang.String createuser;
	private java.sql.Timestamp createdate;
	private java.lang.String updateuser;
	private java.sql.Timestamp updatedate;
	private java.lang.String desktopflag;
	private java.sql.Timestamp desktopdate;
	//columns END
 
//generateConstructor START

		 public OspContent(){}

	public OspContent(
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
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}
	public void setOsenv(java.lang.String value) {
		this.osenv = value;
	}
	
	public java.lang.String getOsenv() {
		return this.osenv;
	}
	public void setSpname(java.lang.String value) {
		this.spname = value;
	}
	
	public java.lang.String getSpname() {
		return this.spname;
	}
	public void setIcpcode(java.lang.String value) {
		this.icpcode = value;
	}
	
	public java.lang.String getIcpcode() {
		return this.icpcode;
	}
	public void setIcpservid(java.lang.String value) {
		this.icpservid = value;
	}
	
	public java.lang.String getIcpservid() {
		return this.icpservid;
	}
	public void setApppackage(java.lang.String value) {
		this.apppackage = value;
	}
	
	public java.lang.String getApppackage() {
		return this.apppackage;
	}
	public void setPlatform(java.lang.String value) {
		this.platform = value;
	}
	
	public java.lang.String getPlatform() {
		return this.platform;
	}
	public void setVersion(java.lang.String value) {
		this.version = value;
	}
	
	public java.lang.String getVersion() {
		return this.version;
	}
	public void setFilesize(java.lang.Long value) {
		this.filesize = value;
	}
	
	public java.lang.Long getFilesize() {
		return this.filesize;
	}
	public void setFilemd5(java.lang.String value) {
		this.filemd5 = value;
	}
	
	public java.lang.String getFilemd5() {
		return this.filemd5;
	}
	public void setEnforceflag(java.lang.String value) {
		this.enforceflag = value;
	}
	
	public java.lang.String getEnforceflag() {
		return this.enforceflag;
	}
	public void setDownloadurl(java.lang.String value) {
		this.downloadurl = value;
	}
	
	public java.lang.String getDownloadurl() {
		return this.downloadurl;
	}
	public void setFilename(java.lang.String value) {
		this.filename = value;
	}
	
	public java.lang.String getFilename() {
		return this.filename;
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
	public void setContent(java.lang.String value) {
		this.content = value;
	}
	
	public java.lang.String getContent() {
		return this.content;
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
	public void setAdimage(java.lang.String value) {
		this.adimage = value;
	}
	
	public java.lang.String getAdimage() {
		return this.adimage;
	}
	public void setImage0(java.lang.String value) {
		this.image0 = value;
	}
	
	public java.lang.String getImage0() {
		return this.image0;
	}
	public void setImage1(java.lang.String value) {
		this.image1 = value;
	}
	
	public java.lang.String getImage1() {
		return this.image1;
	}
	public void setImage2(java.lang.String value) {
		this.image2 = value;
	}
	
	public java.lang.String getImage2() {
		return this.image2;
	}
	public void setImage3(java.lang.String value) {
		this.image3 = value;
	}
	
	public java.lang.String getImage3() {
		return this.image3;
	}
	public void setKeyword(java.lang.String value) {
		this.keyword = value;
	}
	
	public java.lang.String getKeyword() {
		return this.keyword;
	}
	public String getFinedateString() {
		return date2String(getFinedate(), FORMAT_FINEDATE);
	}
	public void setFinedateString(String value) {
		setFinedate(string2Date(value, FORMAT_FINEDATE,java.sql.Timestamp.class));
	}
	
	public void setFinedate(java.sql.Timestamp value) {
		this.finedate = value;
	}
	
	public java.sql.Timestamp getFinedate() {
		return this.finedate;
	}
	public void setFineflag(java.lang.String value) {
		this.fineflag = value;
	}
	
	public java.lang.String getFineflag() {
		return this.fineflag;
	}
	public String getTopdateString() {
		return date2String(getTopdate(), FORMAT_TOPDATE);
	}
	public void setTopdateString(String value) {
		setTopdate(string2Date(value, FORMAT_TOPDATE,java.sql.Timestamp.class));
	}
	
	public void setTopdate(java.sql.Timestamp value) {
		this.topdate = value;
	}
	
	public java.sql.Timestamp getTopdate() {
		return this.topdate;
	}
	public void setTopflag(java.lang.String value) {
		this.topflag = value;
	}
	
	public java.lang.String getTopflag() {
		return this.topflag;
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
	public String getAddateString() {
		return date2String(getAddate(), FORMAT_ADDATE);
	}
	public void setAddateString(String value) {
		setAddate(string2Date(value, FORMAT_ADDATE,java.sql.Timestamp.class));
	}
	
	public void setAddate(java.sql.Timestamp value) {
		this.addate = value;
	}
	
	public java.sql.Timestamp getAddate() {
		return this.addate;
	}
	public void setAdflag(java.lang.String value) {
		this.adflag = value;
	}
	
	public java.lang.String getAdflag() {
		return this.adflag;
	}
	public void setPublishflag(java.lang.String value) {
		this.publishflag = value;
	}
	
	public java.lang.String getPublishflag() {
		return this.publishflag;
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
	public void setStatus(java.lang.String value) {
		this.status = value;
	}
	
	public java.lang.String getStatus() {
		return this.status;
	}
	public void setPricetype(java.lang.Integer value) {
		this.pricetype = value;
	}
	
	public java.lang.Integer getPricetype() {
		return this.pricetype;
	}
	public void setOrderflag(java.lang.Integer value) {
		this.orderflag = value;
	}
	
	public java.lang.Integer getOrderflag() {
		return this.orderflag;
	}
	public void setMarketprice(java.lang.Float value) {
		this.marketprice = value;
	}
	
	public java.lang.Float getMarketprice() {
		return this.marketprice;
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
	public void setMemberprice(java.lang.Float value) {
		this.memberprice = value;
	}
	
	public java.lang.Float getMemberprice() {
		return this.memberprice;
	}
	public void setVipprice(java.lang.Float value) {
		this.vipprice = value;
	}
	
	public java.lang.Float getVipprice() {
		return this.vipprice;
	}
	public String getEffectdateString() {
		return date2String(getEffectdate(), FORMAT_EFFECTDATE);
	}
	public void setEffectdateString(String value) {
		setEffectdate(string2Date(value, FORMAT_EFFECTDATE,java.sql.Timestamp.class));
	}
	
	public void setEffectdate(java.sql.Timestamp value) {
		this.effectdate = value;
	}
	
	public java.sql.Timestamp getEffectdate() {
		return this.effectdate;
	}
	public void setUnit(java.lang.String value) {
		this.unit = value;
	}
	
	public java.lang.String getUnit() {
		return this.unit;
	}
	public void setDaydownloadtimes(java.lang.Integer value) {
		this.daydownloadtimes = value;
	}
	
	public java.lang.Integer getDaydownloadtimes() {
		return this.daydownloadtimes;
	}
	public void setWeekdownloadtimes(java.lang.Integer value) {
		this.weekdownloadtimes = value;
	}
	
	public java.lang.Integer getWeekdownloadtimes() {
		return this.weekdownloadtimes;
	}
	public void setMonthdownloadtimes(java.lang.Integer value) {
		this.monthdownloadtimes = value;
	}
	
	public java.lang.Integer getMonthdownloadtimes() {
		return this.monthdownloadtimes;
	}
	public void setDownloadtimes(java.lang.Integer value) {
		this.downloadtimes = value;
	}
	
	public java.lang.Integer getDownloadtimes() {
		return this.downloadtimes;
	}
	public void setDaysearchtimes(java.lang.Integer value) {
		this.daysearchtimes = value;
	}
	
	public java.lang.Integer getDaysearchtimes() {
		return this.daysearchtimes;
	}
	public void setWeeksearchtimes(java.lang.Integer value) {
		this.weeksearchtimes = value;
	}
	
	public java.lang.Integer getWeeksearchtimes() {
		return this.weeksearchtimes;
	}
	public void setMonthsearchtimes(java.lang.Integer value) {
		this.monthsearchtimes = value;
	}
	
	public java.lang.Integer getMonthsearchtimes() {
		return this.monthsearchtimes;
	}
	public void setSearchtimes(java.lang.Integer value) {
		this.searchtimes = value;
	}
	
	public java.lang.Integer getSearchtimes() {
		return this.searchtimes;
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
	public void setDayordertimes(java.lang.Integer value) {
		this.dayordertimes = value;
	}
	
	public java.lang.Integer getDayordertimes() {
		return this.dayordertimes;
	}
	public void setWeekordertimes(java.lang.Integer value) {
		this.weekordertimes = value;
	}
	
	public java.lang.Integer getWeekordertimes() {
		return this.weekordertimes;
	}
	public void setMonthordertimes(java.lang.Integer value) {
		this.monthordertimes = value;
	}
	
	public java.lang.Integer getMonthordertimes() {
		return this.monthordertimes;
	}
	public void setOrdertimes(java.lang.Integer value) {
		this.ordertimes = value;
	}
	
	public java.lang.Integer getOrdertimes() {
		return this.ordertimes;
	}
	public void setDaycommenttimes(java.lang.Integer value) {
		this.daycommenttimes = value;
	}
	
	public java.lang.Integer getDaycommenttimes() {
		return this.daycommenttimes;
	}
	public void setWeekcommenttimes(java.lang.Integer value) {
		this.weekcommenttimes = value;
	}
	
	public java.lang.Integer getWeekcommenttimes() {
		return this.weekcommenttimes;
	}
	public void setMonthcommenttimes(java.lang.Integer value) {
		this.monthcommenttimes = value;
	}
	
	public java.lang.Integer getMonthcommenttimes() {
		return this.monthcommenttimes;
	}
	public void setCommenttimes(java.lang.Integer value) {
		this.commenttimes = value;
	}
	
	public java.lang.Integer getCommenttimes() {
		return this.commenttimes;
	}
	public void setDaymarktimes(java.lang.Integer value) {
		this.daymarktimes = value;
	}
	
	public java.lang.Integer getDaymarktimes() {
		return this.daymarktimes;
	}
	public void setWeekmarktimes(java.lang.Integer value) {
		this.weekmarktimes = value;
	}
	
	public java.lang.Integer getWeekmarktimes() {
		return this.weekmarktimes;
	}
	public void setMonthmarktimes(java.lang.Integer value) {
		this.monthmarktimes = value;
	}
	
	public java.lang.Integer getMonthmarktimes() {
		return this.monthmarktimes;
	}
	public void setMarktimes(java.lang.Integer value) {
		this.marktimes = value;
	}
	
	public java.lang.Integer getMarktimes() {
		return this.marktimes;
	}
	public void setDayscoretimes(java.lang.Integer value) {
		this.dayscoretimes = value;
	}
	
	public java.lang.Integer getDayscoretimes() {
		return this.dayscoretimes;
	}
	public void setWeekscoretimes(java.lang.Integer value) {
		this.weekscoretimes = value;
	}
	
	public java.lang.Integer getWeekscoretimes() {
		return this.weekscoretimes;
	}
	public void setMonthscoretimes(java.lang.Integer value) {
		this.monthscoretimes = value;
	}
	
	public java.lang.Integer getMonthscoretimes() {
		return this.monthscoretimes;
	}
	public void setScoretimes(java.lang.Integer value) {
		this.scoretimes = value;
	}
	
	public java.lang.Integer getScoretimes() {
		return this.scoretimes;
	}
	public void setDaycommendtimes(java.lang.Integer value) {
		this.daycommendtimes = value;
	}
	
	public java.lang.Integer getDaycommendtimes() {
		return this.daycommendtimes;
	}
	public void setWeekcommendtimes(java.lang.Integer value) {
		this.weekcommendtimes = value;
	}
	
	public java.lang.Integer getWeekcommendtimes() {
		return this.weekcommendtimes;
	}
	public void setMonthcommendtimes(java.lang.Integer value) {
		this.monthcommendtimes = value;
	}
	
	public java.lang.Integer getMonthcommendtimes() {
		return this.monthcommendtimes;
	}
	public void setCommendtimes(java.lang.Integer value) {
		this.commendtimes = value;
	}
	
	public java.lang.Integer getCommendtimes() {
		return this.commendtimes;
	}
	public void setDaycollecttimes(java.lang.Integer value) {
		this.daycollecttimes = value;
	}
	
	public java.lang.Integer getDaycollecttimes() {
		return this.daycollecttimes;
	}
	public void setWeekcollecttimes(java.lang.Integer value) {
		this.weekcollecttimes = value;
	}
	
	public java.lang.Integer getWeekcollecttimes() {
		return this.weekcollecttimes;
	}
	public void setMonthcollecttimes(java.lang.Integer value) {
		this.monthcollecttimes = value;
	}
	
	public java.lang.Integer getMonthcollecttimes() {
		return this.monthcollecttimes;
	}
	public void setCollecttimes(java.lang.Integer value) {
		this.collecttimes = value;
	}
	
	public java.lang.Integer getCollecttimes() {
		return this.collecttimes;
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
	public void setProp5(java.lang.String value) {
		this.prop5 = value;
	}
	
	public java.lang.String getProp5() {
		return this.prop5;
	}
	public void setProp6(java.lang.String value) {
		this.prop6 = value;
	}
	
	public java.lang.String getProp6() {
		return this.prop6;
	}
	public void setProp7(java.lang.String value) {
		this.prop7 = value;
	}
	
	public java.lang.String getProp7() {
		return this.prop7;
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
	public void setDesktopflag(java.lang.String value) {
		this.desktopflag = value;
	}
	
	public java.lang.String getDesktopflag() {
		return this.desktopflag;
	}
	public String getDesktopdateString() {
		return date2String(getDesktopdate(), FORMAT_DESKTOPDATE);
	}
	public void setDesktopdateString(String value) {
		setDesktopdate(string2Date(value, FORMAT_DESKTOPDATE,java.sql.Timestamp.class));
	}
	
	public void setDesktopdate(java.sql.Timestamp value) {
		this.desktopdate = value;
	}
	
	public java.sql.Timestamp getDesktopdate() {
		return this.desktopdate;
	}

	public String toString() {
		return new StringBuffer().append("[")
			.append("Id").append("=").append(getId()).append(",")
			.append("Contentinnercode").append("=").append(getContentinnercode()).append(",")
			.append("Name").append("=").append(getName()).append(",")
			.append("Osenv").append("=").append(getOsenv()).append(",")
			.append("Spname").append("=").append(getSpname()).append(",")
			.append("Icpcode").append("=").append(getIcpcode()).append(",")
			.append("Icpservid").append("=").append(getIcpservid()).append(",")
			.append("Apppackage").append("=").append(getApppackage()).append(",")
			.append("Platform").append("=").append(getPlatform()).append(",")
			.append("Version").append("=").append(getVersion()).append(",")
			.append("Filesize").append("=").append(getFilesize()).append(",")
			.append("Filemd5").append("=").append(getFilemd5()).append(",")
			.append("Enforceflag").append("=").append(getEnforceflag()).append(",")
			.append("Downloadurl").append("=").append(getDownloadurl()).append(",")
			.append("Filename").append("=").append(getFilename()).append(",")
			.append("Alias").append("=").append(getAlias()).append(",")
			.append("Summary").append("=").append(getSummary()).append(",")
			.append("Memo").append("=").append(getMemo()).append(",")
			.append("Content").append("=").append(getContent()).append(",")
			.append("Mobilelogo").append("=").append(getMobilelogo()).append(",")
			.append("Wwwlogo").append("=").append(getWwwlogo()).append(",")
			.append("Adimage").append("=").append(getAdimage()).append(",")
			.append("Image0").append("=").append(getImage0()).append(",")
			.append("Image1").append("=").append(getImage1()).append(",")
			.append("Image2").append("=").append(getImage2()).append(",")
			.append("Image3").append("=").append(getImage3()).append(",")
			.append("Keyword").append("=").append(getKeyword()).append(",")
			.append("Finedate").append("=").append(getFinedate()).append(",")
			.append("Fineflag").append("=").append(getFineflag()).append(",")
			.append("Topdate").append("=").append(getTopdate()).append(",")
			.append("Topflag").append("=").append(getTopflag()).append(",")
			.append("Recommenddate").append("=").append(getRecommenddate()).append(",")
			.append("Recommendflag").append("=").append(getRecommendflag()).append(",")
			.append("Addate").append("=").append(getAddate()).append(",")
			.append("Adflag").append("=").append(getAdflag()).append(",")
			.append("Publishflag").append("=").append(getPublishflag()).append(",")
			.append("Publishdate").append("=").append(getPublishdate()).append(",")
			.append("Downlinedate").append("=").append(getDownlinedate()).append(",")
			.append("Status").append("=").append(getStatus()).append(",")
			.append("Pricetype").append("=").append(getPricetype()).append(",")
			.append("Orderflag").append("=").append(getOrderflag()).append(",")
			.append("Marketprice").append("=").append(getMarketprice()).append(",")
			.append("Price").append("=").append(getPrice()).append(",")
			.append("Discount").append("=").append(getDiscount()).append(",")
			.append("Discountprice").append("=").append(getDiscountprice()).append(",")
			.append("Memberprice").append("=").append(getMemberprice()).append(",")
			.append("Vipprice").append("=").append(getVipprice()).append(",")
			.append("Effectdate").append("=").append(getEffectdate()).append(",")
			.append("Unit").append("=").append(getUnit()).append(",")
			.append("Daydownloadtimes").append("=").append(getDaydownloadtimes()).append(",")
			.append("Weekdownloadtimes").append("=").append(getWeekdownloadtimes()).append(",")
			.append("Monthdownloadtimes").append("=").append(getMonthdownloadtimes()).append(",")
			.append("Downloadtimes").append("=").append(getDownloadtimes()).append(",")
			.append("Daysearchtimes").append("=").append(getDaysearchtimes()).append(",")
			.append("Weeksearchtimes").append("=").append(getWeeksearchtimes()).append(",")
			.append("Monthsearchtimes").append("=").append(getMonthsearchtimes()).append(",")
			.append("Searchtimes").append("=").append(getSearchtimes()).append(",")
			.append("Dayscantimes").append("=").append(getDayscantimes()).append(",")
			.append("Weekscantimes").append("=").append(getWeekscantimes()).append(",")
			.append("Monthscantimes").append("=").append(getMonthscantimes()).append(",")
			.append("Scantimes").append("=").append(getScantimes()).append(",")
			.append("Dayordertimes").append("=").append(getDayordertimes()).append(",")
			.append("Weekordertimes").append("=").append(getWeekordertimes()).append(",")
			.append("Monthordertimes").append("=").append(getMonthordertimes()).append(",")
			.append("Ordertimes").append("=").append(getOrdertimes()).append(",")
			.append("Daycommenttimes").append("=").append(getDaycommenttimes()).append(",")
			.append("Weekcommenttimes").append("=").append(getWeekcommenttimes()).append(",")
			.append("Monthcommenttimes").append("=").append(getMonthcommenttimes()).append(",")
			.append("Commenttimes").append("=").append(getCommenttimes()).append(",")
			.append("Daymarktimes").append("=").append(getDaymarktimes()).append(",")
			.append("Weekmarktimes").append("=").append(getWeekmarktimes()).append(",")
			.append("Monthmarktimes").append("=").append(getMonthmarktimes()).append(",")
			.append("Marktimes").append("=").append(getMarktimes()).append(",")
			.append("Dayscoretimes").append("=").append(getDayscoretimes()).append(",")
			.append("Weekscoretimes").append("=").append(getWeekscoretimes()).append(",")
			.append("Monthscoretimes").append("=").append(getMonthscoretimes()).append(",")
			.append("Scoretimes").append("=").append(getScoretimes()).append(",")
			.append("Daycommendtimes").append("=").append(getDaycommendtimes()).append(",")
			.append("Weekcommendtimes").append("=").append(getWeekcommendtimes()).append(",")
			.append("Monthcommendtimes").append("=").append(getMonthcommendtimes()).append(",")
			.append("Commendtimes").append("=").append(getCommendtimes()).append(",")
			.append("Daycollecttimes").append("=").append(getDaycollecttimes()).append(",")
			.append("Weekcollecttimes").append("=").append(getWeekcollecttimes()).append(",")
			.append("Monthcollecttimes").append("=").append(getMonthcollecttimes()).append(",")
			.append("Collecttimes").append("=").append(getCollecttimes()).append(",")
			.append("Prop1").append("=").append(getProp1()).append(",")
			.append("Prop2").append("=").append(getProp2()).append(",")
			.append("Prop3").append("=").append(getProp3()).append(",")
			.append("Prop4").append("=").append(getProp4()).append(",")
			.append("Prop5").append("=").append(getProp5()).append(",")
			.append("Prop6").append("=").append(getProp6()).append(",")
			.append("Prop7").append("=").append(getProp7()).append(",")
			.append("Deleteflag").append("=").append(getDeleteflag()).append(",")
			.append("Deletedate").append("=").append(getDeletedate()).append(",")
			.append("Createuser").append("=").append(getCreateuser()).append(",")
			.append("Createdate").append("=").append(getCreatedate()).append(",")
			.append("Updateuser").append("=").append(getUpdateuser()).append(",")
			.append("Updatedate").append("=").append(getUpdatedate()).append(",")
			.append("Desktopflag").append("=").append(getDesktopflag()).append(",")
			.append("Desktopdate").append("=").append(getDesktopdate())
			.append("]").toString();
	}
	

}

