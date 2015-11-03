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

import com.osp.biz.model.OspCatalogactionlog;

public interface IOspCatalogactionlogService {
	
	 
	 public OspCatalogactionlog getById(java.lang.Long id);
	
	public void save(OspCatalogactionlog entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspCatalogactionlog entity);
	
	
	public boolean isUnique(OspCatalogactionlog entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspCatalogactionlog entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<OspCatalogactionlog> findAll();
	
	public void updateDynamic(OspCatalogactionlog entity);
	
	public List<OspCatalogactionlog> findByDynamicWhere(OspCatalogactionlog entity);
	
	public void saveOrUpdate(OspCatalogactionlog entity);
	

}
