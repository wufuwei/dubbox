/*
 * Powered By wufuwei
 */

package com.osp.biz.manager.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javacommon.base.BaseManager;
import com.osp.biz.model.OspPullcontent;
import com.osp.biz.manager.IOspPullcontentManager;
import com.osp.biz.dao.IOspPullcontentDao;

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
public class OspPullcontentManager extends BaseManager implements IOspPullcontentManager{
	
	
	private IOspPullcontentDao ospPullcontentDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspPullcontentDao(IOspPullcontentDao dao) {
		this.ospPullcontentDao = dao;
	}
	public IOspPullcontentDao getEntityDao() {
		return this.ospPullcontentDao;
	}
	

}
