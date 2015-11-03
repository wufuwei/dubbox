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

import com.osp.biz.model.OspTerminalgroupCatalog;

public interface IOspTerminalgroupCatalogService {
	
	 
	 public OspTerminalgroupCatalog getById(java.lang.Long id);
	
	public void save(OspTerminalgroupCatalog entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspTerminalgroupCatalog entity);
	
	
	public boolean isUnique(OspTerminalgroupCatalog entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspTerminalgroupCatalog entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<OspTerminalgroupCatalog> findAll();
	
	public void updateDynamic(OspTerminalgroupCatalog entity);
	
	public List<OspTerminalgroupCatalog> findByDynamicWhere(OspTerminalgroupCatalog entity);
	
	public void saveOrUpdate(OspTerminalgroupCatalog entity);
	

}
