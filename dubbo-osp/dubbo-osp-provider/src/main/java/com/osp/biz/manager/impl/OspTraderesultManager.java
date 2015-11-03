/*
 * Powered By wufuwei
 */

package com.osp.biz.manager.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javacommon.base.BaseManager;
import com.osp.biz.model.OspTraderesult;
import com.osp.biz.manager.IOspTraderesultManager;
import com.osp.biz.dao.IOspTraderesultDao;

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
public class OspTraderesultManager extends BaseManager implements IOspTraderesultManager{
	
	
	private IOspTraderesultDao ospTraderesultDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspTraderesultDao(IOspTraderesultDao dao) {
		this.ospTraderesultDao = dao;
	}
	public IOspTraderesultDao getEntityDao() {
		return this.ospTraderesultDao;
	}
	

}
