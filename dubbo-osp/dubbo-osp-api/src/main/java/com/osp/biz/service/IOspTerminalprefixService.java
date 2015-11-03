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

import com.osp.biz.model.OspTerminalprefix;

public interface IOspTerminalprefixService {
	
	 
	 public OspTerminalprefix getById(java.lang.Long id);
	
	public void save(OspTerminalprefix entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspTerminalprefix entity);
	
	
	public boolean isUnique(OspTerminalprefix entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspTerminalprefix entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<OspTerminalprefix> findAll();
	
	public void updateDynamic(OspTerminalprefix entity);
	
	public List<OspTerminalprefix> findByDynamicWhere(OspTerminalprefix entity);
	
	public void saveOrUpdate(OspTerminalprefix entity);
	

}
