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

import com.osp.biz.model.OspProperties;

public interface IOspPropertiesService {
	
	 
	 public OspProperties getById(java.lang.Long id);
	
	public void save(OspProperties entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspProperties entity);
	
	
	public boolean isUnique(OspProperties entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspProperties entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	
	public OspProperties getByName(java.lang.String v);

	public List<OspProperties> findAll();
	
	public void updateDynamic(OspProperties entity);
	
	public List<OspProperties> findByDynamicWhere(OspProperties entity);
	
	public void saveOrUpdate(OspProperties entity);
	

}
