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

import com.osp.biz.model.OspSp;

public interface IOspSpService {
	
	 
	 public OspSp getById(java.lang.Long id);
	
	public void save(OspSp entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspSp entity);
	
	
	public boolean isUnique(OspSp entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspSp entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<OspSp> findAll();
	
	public void updateDynamic(OspSp entity);
	
	public List<OspSp> findByDynamicWhere(OspSp entity);
	
	public void saveOrUpdate(OspSp entity);
	

}
