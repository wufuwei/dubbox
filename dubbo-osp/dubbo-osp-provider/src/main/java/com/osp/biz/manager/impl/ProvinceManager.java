/*
 * Powered By wufuwei
 */

package com.osp.biz.manager.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javacommon.base.BaseManager;
import com.osp.biz.model.Province;
import com.osp.biz.manager.IProvinceManager;
import com.osp.biz.dao.IProvinceDao;

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
public class ProvinceManager extends BaseManager implements IProvinceManager{
	
	
	private IProvinceDao provinceDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setProvinceDao(IProvinceDao dao) {
		this.provinceDao = dao;
	}
	public IProvinceDao getEntityDao() {
		return this.provinceDao;
	}
	

}
