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

import com.osp.biz.model.OspContent;

public interface IOspContentService {
	
	 
	 public OspContent getById(java.lang.Long id);
	
	public void save(OspContent entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspContent entity);
	
	
	public boolean isUnique(OspContent entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspContent entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<OspContent> findAll();
	
	public void updateDynamic(OspContent entity);
	
	public List<OspContent> findByDynamicWhere(OspContent entity);
	
	public void saveOrUpdate(OspContent entity);
	

}
