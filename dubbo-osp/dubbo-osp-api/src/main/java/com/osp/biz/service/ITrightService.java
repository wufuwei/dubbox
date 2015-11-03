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

import com.osp.biz.model.Tright;

public interface ITrightService {
	
	 
	 public Tright getById(java.lang.Integer id);
	
	public void save(Tright entity);
	
	public void removeById(java.lang.Integer id);	
	
	
	public void update(Tright entity);
	
	
	public boolean isUnique(Tright entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(Tright entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<Tright> findAll();
	
	public void updateDynamic(Tright entity);
	
	public List<Tright> findByDynamicWhere(Tright entity);
	
	public void saveOrUpdate(Tright entity);
	

}
