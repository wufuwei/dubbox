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

import com.osp.biz.model.OspContentrelation;

public interface IOspContentrelationService {
	
	 
	 public OspContentrelation getById(java.lang.Long id);
	
	public void save(OspContentrelation entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspContentrelation entity);
	
	
	public boolean isUnique(OspContentrelation entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspContentrelation entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<OspContentrelation> findAll();
	
	public void updateDynamic(OspContentrelation entity);
	
	public List<OspContentrelation> findByDynamicWhere(OspContentrelation entity);
	
	public void saveOrUpdate(OspContentrelation entity);
	

}
