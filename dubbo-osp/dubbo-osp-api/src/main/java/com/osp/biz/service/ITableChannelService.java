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

import com.osp.biz.model.TableChannel;

public interface ITableChannelService {
	
	 
	 public TableChannel getById(java.lang.Integer id);
	
	public void save(TableChannel entity);
	
	public void removeById(java.lang.Integer id);	
	
	
	public void update(TableChannel entity);
	
	
	public boolean isUnique(TableChannel entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(TableChannel entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<TableChannel> findAll();
	
	public void updateDynamic(TableChannel entity);
	
	public List<TableChannel> findByDynamicWhere(TableChannel entity);
	
	public void saveOrUpdate(TableChannel entity);
	

}
