/*
 * Powered By wufuwei
 */

package com.osp.biz.manager.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javacommon.base.BaseManager;
import com.osp.biz.model.OspOrder;
import com.osp.biz.manager.IOspOrderManager;
import com.osp.biz.dao.IOspOrderDao;

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
public class OspOrderManager extends BaseManager implements IOspOrderManager{
	
	
	private IOspOrderDao ospOrderDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspOrderDao(IOspOrderDao dao) {
		this.ospOrderDao = dao;
	}
	public IOspOrderDao getEntityDao() {
		return this.ospOrderDao;
	}
	
	public OspOrder getByOrderid(java.lang.String v) {
		return ospOrderDao.getByOrderid(v);
	}	

}
