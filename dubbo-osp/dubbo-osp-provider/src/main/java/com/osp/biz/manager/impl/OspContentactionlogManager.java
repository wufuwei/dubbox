/*
 * Powered By wufuwei
 */

package com.osp.biz.manager.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javacommon.base.BaseManager;
import com.osp.biz.model.OspContentactionlog;
import com.osp.biz.manager.IOspContentactionlogManager;
import com.osp.biz.dao.IOspContentactionlogDao;

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
public class OspContentactionlogManager extends BaseManager implements IOspContentactionlogManager{
	
	
	private IOspContentactionlogDao ospContentactionlogDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspContentactionlogDao(IOspContentactionlogDao dao) {
		this.ospContentactionlogDao = dao;
	}
	public IOspContentactionlogDao getEntityDao() {
		return this.ospContentactionlogDao;
	}
	

}
