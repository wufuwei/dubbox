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

import com.osp.biz.model.TablePlatformVersionInfo;

public interface ITablePlatformVersionInfoService {
	
	 
	 public TablePlatformVersionInfo getById(java.lang.Integer id);
	
	public void save(TablePlatformVersionInfo entity);
	
	public void removeById(java.lang.Integer id);	
	
	
	public void update(TablePlatformVersionInfo entity);
	
	
	public boolean isUnique(TablePlatformVersionInfo entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(TablePlatformVersionInfo entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<TablePlatformVersionInfo> findAll();
	
	public void updateDynamic(TablePlatformVersionInfo entity);
	
	public List<TablePlatformVersionInfo> findByDynamicWhere(TablePlatformVersionInfo entity);
	
	public void saveOrUpdate(TablePlatformVersionInfo entity);
	

}
