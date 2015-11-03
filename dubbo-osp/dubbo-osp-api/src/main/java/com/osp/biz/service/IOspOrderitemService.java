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

import com.osp.biz.model.OspOrderitem;

public interface IOspOrderitemService {
	
	 
	 public OspOrderitem getById(java.lang.Long id);
	
	public void save(OspOrderitem entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspOrderitem entity);
	
	
	public boolean isUnique(OspOrderitem entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspOrderitem entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<OspOrderitem> findAll();
	
	public void updateDynamic(OspOrderitem entity);
	
	public List<OspOrderitem> findByDynamicWhere(OspOrderitem entity);
	
	public void saveOrUpdate(OspOrderitem entity);
	

}
