/*
 * Powered By wufuwei
 */

package com.osp.biz.manager.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javacommon.base.BaseManager;
import com.osp.biz.model.OspDebitcredit;
import com.osp.biz.manager.IOspDebitcreditManager;
import com.osp.biz.dao.IOspDebitcreditDao;

import java.util.*;

import javacommon.base.*;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;

/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspDebitcreditManager extends BaseManager implements IOspDebitcreditManager{
	
	
	private IOspDebitcreditDao ospDebitcreditDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspDebitcreditDao(IOspDebitcreditDao dao) {
		this.ospDebitcreditDao = dao;
	}
	public IOspDebitcreditDao getEntityDao() {
		return this.ospDebitcreditDao;
	}
	
	public OspDebitcredit getByTradeid(java.lang.String v) {
		return ospDebitcreditDao.getByTradeid(v);
	}	

}
