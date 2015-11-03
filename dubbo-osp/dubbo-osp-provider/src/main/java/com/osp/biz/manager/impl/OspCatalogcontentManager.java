/*
 * Powered By wufuwei
 */

package com.osp.biz.manager.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javacommon.base.BaseManager;
import com.osp.biz.model.OspCatalogcontent;
import com.osp.biz.manager.IOspCatalogcontentManager;
import com.osp.biz.dao.IOspCatalogcontentDao;

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
public class OspCatalogcontentManager extends BaseManager implements IOspCatalogcontentManager{
	
	
	private IOspCatalogcontentDao ospCatalogcontentDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspCatalogcontentDao(IOspCatalogcontentDao dao) {
		this.ospCatalogcontentDao = dao;
	}
	public IOspCatalogcontentDao getEntityDao() {
		return this.ospCatalogcontentDao;
	}
	

}
