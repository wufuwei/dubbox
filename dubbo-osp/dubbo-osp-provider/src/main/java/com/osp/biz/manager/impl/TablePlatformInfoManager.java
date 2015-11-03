/*
 * Powered By wufuwei
 */

package com.osp.biz.manager.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javacommon.base.BaseManager;
import com.osp.biz.model.TablePlatformInfo;
import com.osp.biz.manager.ITablePlatformInfoManager;
import com.osp.biz.dao.ITablePlatformInfoDao;

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
public class TablePlatformInfoManager extends BaseManager implements ITablePlatformInfoManager{
	
	
	private ITablePlatformInfoDao tablePlatformInfoDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setTablePlatformInfoDao(ITablePlatformInfoDao dao) {
		this.tablePlatformInfoDao = dao;
	}
	public ITablePlatformInfoDao getEntityDao() {
		return this.tablePlatformInfoDao;
	}
	
	public TablePlatformInfo getByPlatform(java.lang.String v) {
		return tablePlatformInfoDao.getByPlatform(v);
	}	

}
