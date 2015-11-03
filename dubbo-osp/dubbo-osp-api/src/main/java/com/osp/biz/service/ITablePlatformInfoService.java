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

import com.osp.biz.model.TablePlatformInfo;

public interface ITablePlatformInfoService {
	
	 
	 public TablePlatformInfo getById(java.lang.Integer id);
	
	public void save(TablePlatformInfo entity);
	
	public void removeById(java.lang.Integer id);	
	
	
	public void update(TablePlatformInfo entity);
	
	
	public boolean isUnique(TablePlatformInfo entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(TablePlatformInfo entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	
	public TablePlatformInfo getByPlatform(java.lang.String v);

	public List<TablePlatformInfo> findAll();
	
	public void updateDynamic(TablePlatformInfo entity);
	
	public List<TablePlatformInfo> findByDynamicWhere(TablePlatformInfo entity);
	
	public void saveOrUpdate(TablePlatformInfo entity);
	

}
