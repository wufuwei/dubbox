/*
 * Powered By wufuwei
 */

package com.osp.biz.manager.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javacommon.base.BaseManager;
import com.osp.biz.model.TableChannel;
import com.osp.biz.manager.ITableChannelManager;
import com.osp.biz.dao.ITableChannelDao;

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
public class TableChannelManager extends BaseManager implements ITableChannelManager{
	
	
	private ITableChannelDao tableChannelDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setTableChannelDao(ITableChannelDao dao) {
		this.tableChannelDao = dao;
	}
	public ITableChannelDao getEntityDao() {
		return this.tableChannelDao;
	}
	

}
