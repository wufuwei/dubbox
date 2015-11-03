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

import com.osp.biz.model.OspOrder;

public interface IOspOrderService {
	
	 
	 public OspOrder getById(java.lang.Long id);
	
	public void save(OspOrder entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspOrder entity);
	
	
	public boolean isUnique(OspOrder entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspOrder entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	
	public OspOrder getByOrderid(java.lang.String v);

	public List<OspOrder> findAll();
	
	public void updateDynamic(OspOrder entity);
	
	public List<OspOrder> findByDynamicWhere(OspOrder entity);
	
	public void saveOrUpdate(OspOrder entity);
	

}
