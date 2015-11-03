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

import com.osp.biz.model.OspPullcontentto;

public interface IOspPullcontenttoService {
	
	 
	 public OspPullcontentto getById(java.lang.Long id);
	
	public void save(OspPullcontentto entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspPullcontentto entity);
	
	
	public boolean isUnique(OspPullcontentto entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspPullcontentto entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<OspPullcontentto> findAll();
	
	public void updateDynamic(OspPullcontentto entity);
	
	public List<OspPullcontentto> findByDynamicWhere(OspPullcontentto entity);
	
	public void saveOrUpdate(OspPullcontentto entity);
	

}
