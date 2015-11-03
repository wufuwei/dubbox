/*
 * Powered By wufuwei
 */

package com.osp.biz.manager.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javacommon.base.BaseManager;
import com.osp.biz.model.TableVersionDownloadLog;
import com.osp.biz.manager.ITableVersionDownloadLogManager;
import com.osp.biz.dao.ITableVersionDownloadLogDao;

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
public class TableVersionDownloadLogManager extends BaseManager implements ITableVersionDownloadLogManager{
	
	
	private ITableVersionDownloadLogDao tableVersionDownloadLogDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setTableVersionDownloadLogDao(ITableVersionDownloadLogDao dao) {
		this.tableVersionDownloadLogDao = dao;
	}
	public ITableVersionDownloadLogDao getEntityDao() {
		return this.tableVersionDownloadLogDao;
	}
	

}
