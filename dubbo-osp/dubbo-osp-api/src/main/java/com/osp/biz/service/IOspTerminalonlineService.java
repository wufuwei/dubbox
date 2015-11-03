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

import com.osp.biz.model.OspTerminalonline;

public interface IOspTerminalonlineService {
	
	 
	 public OspTerminalonline getById(java.lang.Long id);
	
	public void save(OspTerminalonline entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspTerminalonline entity);
	
	
	public boolean isUnique(OspTerminalonline entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspTerminalonline entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<OspTerminalonline> findAll();
	
	public void updateDynamic(OspTerminalonline entity);
	
	public List<OspTerminalonline> findByDynamicWhere(OspTerminalonline entity);
	
	public void saveOrUpdate(OspTerminalonline entity);
	

}
