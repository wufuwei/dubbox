/*
 * Powered By wufuwei
 */

package com.osp.biz.service;

import java.util.*;

import javacommon.base.*;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;

/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

import com.osp.biz.model.Province;

public interface IProvinceService {
	
	 
	 public Province getById(java.lang.Integer id);
	
	public void save(Province entity);
	
	public void removeById(java.lang.Integer id);	
	
	
	public void update(Province entity);
	
	
	public boolean isUnique(Province entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(Province entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<Province> findAll();
	
	public void updateDynamic(Province entity);
	
	public List<Province> findByDynamicWhere(Province entity);
	
	public void saveOrUpdate(Province entity);
	

}
