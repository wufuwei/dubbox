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

import com.osp.biz.model.OspPullcontent;

public interface IOspPullcontentService {
	
	 
	 public OspPullcontent getById(java.lang.Long id);
	
	public void save(OspPullcontent entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspPullcontent entity);
	
	
	public boolean isUnique(OspPullcontent entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspPullcontent entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<OspPullcontent> findAll();
	
	public void updateDynamic(OspPullcontent entity);
	
	public List<OspPullcontent> findByDynamicWhere(OspPullcontent entity);
	
	public void saveOrUpdate(OspPullcontent entity);
	

}
