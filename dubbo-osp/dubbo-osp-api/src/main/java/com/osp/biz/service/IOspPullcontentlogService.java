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

import com.osp.biz.model.OspPullcontentlog;

public interface IOspPullcontentlogService {
	
	 
	 public OspPullcontentlog getById(java.lang.Long id);
	
	public void save(OspPullcontentlog entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspPullcontentlog entity);
	
	
	public boolean isUnique(OspPullcontentlog entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspPullcontentlog entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<OspPullcontentlog> findAll();
	
	public void updateDynamic(OspPullcontentlog entity);
	
	public List<OspPullcontentlog> findByDynamicWhere(OspPullcontentlog entity);
	
	public void saveOrUpdate(OspPullcontentlog entity);
	

}
