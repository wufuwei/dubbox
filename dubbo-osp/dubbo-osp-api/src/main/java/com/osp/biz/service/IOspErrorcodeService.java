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

import com.osp.biz.model.OspErrorcode;

public interface IOspErrorcodeService {
	
	 
	 public OspErrorcode getById(java.lang.Long id);
	
	public void save(OspErrorcode entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspErrorcode entity);
	
	
	public boolean isUnique(OspErrorcode entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspErrorcode entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	
	public OspErrorcode getByErrorcode(java.lang.Integer v);

	public List<OspErrorcode> findAll();
	
	public void updateDynamic(OspErrorcode entity);
	
	public List<OspErrorcode> findByDynamicWhere(OspErrorcode entity);
	
	public void saveOrUpdate(OspErrorcode entity);
	

}
