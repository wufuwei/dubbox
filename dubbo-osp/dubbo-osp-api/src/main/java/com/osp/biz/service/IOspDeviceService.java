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

import com.osp.biz.model.OspDevice;

public interface IOspDeviceService {
	
	 
	 public OspDevice getById(java.lang.Long id);
	
	public void save(OspDevice entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspDevice entity);
	
	
	public boolean isUnique(OspDevice entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspDevice entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	
	public OspDevice getByImei(java.lang.String v);

	public List<OspDevice> findAll();
	
	public void updateDynamic(OspDevice entity);
	
	public List<OspDevice> findByDynamicWhere(OspDevice entity);
	
	public void saveOrUpdate(OspDevice entity);
	

}
