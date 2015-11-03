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

import com.osp.biz.model.OspTradetype;

public interface IOspTradetypeService {
	
	 
	 public OspTradetype getById(java.lang.Long id);
	
	public void save(OspTradetype entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspTradetype entity);
	
	
	public boolean isUnique(OspTradetype entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspTradetype entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	
	public OspTradetype getByTradetype(java.lang.String v);

	public List<OspTradetype> findAll();
	
	public void updateDynamic(OspTradetype entity);
	
	public List<OspTradetype> findByDynamicWhere(OspTradetype entity);
	
	public void saveOrUpdate(OspTradetype entity);
	

}
