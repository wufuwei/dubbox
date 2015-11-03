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

import com.osp.biz.model.TableWlanUpdateInfo;

public interface ITableWlanUpdateInfoService {
	
	 
	 public TableWlanUpdateInfo getById(java.lang.Integer id);
	
	public void save(TableWlanUpdateInfo entity);
	
	public void removeById(java.lang.Integer id);	
	
	
	public void update(TableWlanUpdateInfo entity);
	
	
	public boolean isUnique(TableWlanUpdateInfo entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(TableWlanUpdateInfo entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<TableWlanUpdateInfo> findAll();
	
	public void updateDynamic(TableWlanUpdateInfo entity);
	
	public List<TableWlanUpdateInfo> findByDynamicWhere(TableWlanUpdateInfo entity);
	
	public void saveOrUpdate(TableWlanUpdateInfo entity);
	

}
