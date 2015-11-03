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

import com.osp.biz.model.Trole;

public interface ITroleService {
	
	 
	 public Trole getById(java.lang.Integer id);
	
	public void save(Trole entity);
	
	public void removeById(java.lang.Integer id);	
	
	
	public void update(Trole entity);
	
	
	public boolean isUnique(Trole entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(Trole entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<Trole> findAll();
	
	public void updateDynamic(Trole entity);
	
	public List<Trole> findByDynamicWhere(Trole entity);
	
	public void saveOrUpdate(Trole entity);
	

}
