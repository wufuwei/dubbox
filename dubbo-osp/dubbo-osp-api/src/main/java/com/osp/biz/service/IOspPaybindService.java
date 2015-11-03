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

import com.osp.biz.model.OspPaybind;

public interface IOspPaybindService {
	
	 
	 public OspPaybind getById(java.lang.Long id);
	
	public void save(OspPaybind entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspPaybind entity);
	
	
	public boolean isUnique(OspPaybind entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspPaybind entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<OspPaybind> findAll();
	
	public void updateDynamic(OspPaybind entity);
	
	public List<OspPaybind> findByDynamicWhere(OspPaybind entity);
	
	public void saveOrUpdate(OspPaybind entity);
	

}
