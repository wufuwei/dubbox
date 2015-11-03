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

import com.osp.biz.model.OspSearchkey;

public interface IOspSearchkeyService {
	
	 
	 public OspSearchkey getById(java.lang.Long id);
	
	public void save(OspSearchkey entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspSearchkey entity);
	
	
	public boolean isUnique(OspSearchkey entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspSearchkey entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	
	public OspSearchkey getBySearchkey(java.lang.String v);

	public List<OspSearchkey> findAll();
	
	public void updateDynamic(OspSearchkey entity);
	
	public List<OspSearchkey> findByDynamicWhere(OspSearchkey entity);
	
	public void saveOrUpdate(OspSearchkey entity);
	

}
