/*
 * Powered By wufuwei
 */

package com.osp.biz.manager.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javacommon.base.BaseManager;
import com.osp.biz.model.TassginRole;
import com.osp.biz.manager.ITassginRoleManager;
import com.osp.biz.dao.ITassginRoleDao;

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
public class TassginRoleManager extends BaseManager implements ITassginRoleManager{
	
	
	private ITassginRoleDao tassginRoleDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setTassginRoleDao(ITassginRoleDao dao) {
		this.tassginRoleDao = dao;
	}
	public ITassginRoleDao getEntityDao() {
		return this.tassginRoleDao;
	}
	

}
