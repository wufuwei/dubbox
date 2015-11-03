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

import com.osp.biz.model.TableVersionDownloadLog;

public interface ITableVersionDownloadLogService {
	
	 
	 public TableVersionDownloadLog getById(java.lang.Integer id);
	
	public void save(TableVersionDownloadLog entity);
	
	public void removeById(java.lang.Integer id);	
	
	
	public void update(TableVersionDownloadLog entity);
	
	
	public boolean isUnique(TableVersionDownloadLog entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(TableVersionDownloadLog entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<TableVersionDownloadLog> findAll();
	
	public void updateDynamic(TableVersionDownloadLog entity);
	
	public List<TableVersionDownloadLog> findByDynamicWhere(TableVersionDownloadLog entity);
	
	public void saveOrUpdate(TableVersionDownloadLog entity);
	

}
