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

import com.osp.biz.model.OspContentPublish;

public interface IOspContentPublishService {
	
	 
	
	public void save(OspContentPublish entity);
	
	
	
	public void update(OspContentPublish entity);
	
	
	public boolean isUnique(OspContentPublish entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspContentPublish entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<OspContentPublish> findAll();
	
	public void updateDynamic(OspContentPublish entity);
	
	public List<OspContentPublish> findByDynamicWhere(OspContentPublish entity);
	
	public void saveOrUpdate(OspContentPublish entity);
	

}
