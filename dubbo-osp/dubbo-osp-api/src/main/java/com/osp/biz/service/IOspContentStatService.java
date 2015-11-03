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

import com.osp.biz.model.OspContentStat;

public interface IOspContentStatService {
	
	 
	
	public void save(OspContentStat entity);
	
	
	
	public void update(OspContentStat entity);
	
	
	public boolean isUnique(OspContentStat entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspContentStat entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<OspContentStat> findAll();
	
	public void updateDynamic(OspContentStat entity);
	
	public List<OspContentStat> findByDynamicWhere(OspContentStat entity);
	
	public void saveOrUpdate(OspContentStat entity);
	

}
