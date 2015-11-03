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

import com.osp.biz.model.OspUpdateMacLog;

public interface IOspUpdateMacLogService {
	
	 
	 public OspUpdateMacLog getById(java.lang.Integer id);
	
	public void save(OspUpdateMacLog entity);
	
	public void removeById(java.lang.Integer id);	
	
	
	public void update(OspUpdateMacLog entity);
	
	
	public boolean isUnique(OspUpdateMacLog entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspUpdateMacLog entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<OspUpdateMacLog> findAll();
	
	public void updateDynamic(OspUpdateMacLog entity);
	
	public List<OspUpdateMacLog> findByDynamicWhere(OspUpdateMacLog entity);
	
	public void saveOrUpdate(OspUpdateMacLog entity);
	

}
