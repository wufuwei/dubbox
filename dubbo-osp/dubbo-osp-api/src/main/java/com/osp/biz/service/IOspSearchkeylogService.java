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

import com.osp.biz.model.OspSearchkeylog;

public interface IOspSearchkeylogService {
	
	 
	 public OspSearchkeylog getById(java.lang.Long id);
	
	public void save(OspSearchkeylog entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspSearchkeylog entity);
	
	
	public boolean isUnique(OspSearchkeylog entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspSearchkeylog entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<OspSearchkeylog> findAll();
	
	public void updateDynamic(OspSearchkeylog entity);
	
	public List<OspSearchkeylog> findByDynamicWhere(OspSearchkeylog entity);
	
	public void saveOrUpdate(OspSearchkeylog entity);
	

}
