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

import com.osp.biz.model.OspTerminalgroup;

public interface IOspTerminalgroupService {
	
	 
	 public OspTerminalgroup getById(java.lang.Long id);
	
	public void save(OspTerminalgroup entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspTerminalgroup entity);
	
	
	public boolean isUnique(OspTerminalgroup entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspTerminalgroup entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<OspTerminalgroup> findAll();
	
	public void updateDynamic(OspTerminalgroup entity);
	
	public List<OspTerminalgroup> findByDynamicWhere(OspTerminalgroup entity);
	
	public void saveOrUpdate(OspTerminalgroup entity);
	

}
