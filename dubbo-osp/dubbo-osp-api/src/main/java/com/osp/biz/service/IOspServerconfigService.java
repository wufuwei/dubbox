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

import com.osp.biz.model.OspServerconfig;

public interface IOspServerconfigService {
	
	 
	 public OspServerconfig getById(java.lang.Long id);
	
	public void save(OspServerconfig entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspServerconfig entity);
	
	
	public boolean isUnique(OspServerconfig entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspServerconfig entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	
	public OspServerconfig getByInnercode(java.lang.String v);

	public List<OspServerconfig> findAll();
	
	public void updateDynamic(OspServerconfig entity);
	
	public List<OspServerconfig> findByDynamicWhere(OspServerconfig entity);
	
	public void saveOrUpdate(OspServerconfig entity);
	

}
