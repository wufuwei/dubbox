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

import com.osp.biz.model.ToprationLog;

public interface IToprationLogService {
	
	 
	 public ToprationLog getById(java.lang.Integer id);
	
	public void save(ToprationLog entity);
	
	public void removeById(java.lang.Integer id);	
	
	
	public void update(ToprationLog entity);
	
	
	public boolean isUnique(ToprationLog entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(ToprationLog entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<ToprationLog> findAll();
	
	public void updateDynamic(ToprationLog entity);
	
	public List<ToprationLog> findByDynamicWhere(ToprationLog entity);
	
	public void saveOrUpdate(ToprationLog entity);
	

}
