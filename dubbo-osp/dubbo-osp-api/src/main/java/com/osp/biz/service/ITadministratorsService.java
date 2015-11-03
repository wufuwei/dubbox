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

import com.osp.biz.model.Tadministrators;

public interface ITadministratorsService {
	
	 
	 public Tadministrators getById(java.lang.Integer id);
	
	public void save(Tadministrators entity);
	
	public void removeById(java.lang.Integer id);	
	
	
	public void update(Tadministrators entity);
	
	
	public boolean isUnique(Tadministrators entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(Tadministrators entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	
	public Tadministrators getByLonginName(java.lang.String v);

	public List<Tadministrators> findAll();
	
	public void updateDynamic(Tadministrators entity);
	
	public List<Tadministrators> findByDynamicWhere(Tadministrators entity);
	
	public void saveOrUpdate(Tadministrators entity);
	

}
