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

import com.osp.biz.model.TassginRole;

public interface ITassginRoleService {
	
	 
	 public TassginRole getById(java.lang.Integer id);
	
	public void save(TassginRole entity);
	
	public void removeById(java.lang.Integer id);	
	
	
	public void update(TassginRole entity);
	
	
	public boolean isUnique(TassginRole entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(TassginRole entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<TassginRole> findAll();
	
	public void updateDynamic(TassginRole entity);
	
	public List<TassginRole> findByDynamicWhere(TassginRole entity);
	
	public void saveOrUpdate(TassginRole entity);
	

}
