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

import com.osp.biz.model.Tsequence;

public interface ITsequenceService {
	
	 
	 public Tsequence getById(java.lang.String id);
	
	public void save(Tsequence entity);
	
	public void removeById(java.lang.String id);	
	
	
	public void update(Tsequence entity);
	
	
	public boolean isUnique(Tsequence entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(Tsequence entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<Tsequence> findAll();
	
	public void updateDynamic(Tsequence entity);
	
	public List<Tsequence> findByDynamicWhere(Tsequence entity);
	
	public void saveOrUpdate(Tsequence entity);
	

}
