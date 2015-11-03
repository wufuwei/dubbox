/*
 * Powered By wufuwei
 */

package com.osp.biz.service;

import java.util.List;

import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;

/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */
import com.osp.biz.model.OspContentPublishflag;

public interface IOspContentPublishflagService {
	
	 
	
	public void save(OspContentPublishflag entity);
	
	
	
	public void update(OspContentPublishflag entity);
	
	
	public boolean isUnique(OspContentPublishflag entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspContentPublishflag entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<OspContentPublishflag> findAll();
	
	public void updateDynamic(OspContentPublishflag entity);
	
	public List<OspContentPublishflag> findByDynamicWhere(OspContentPublishflag entity);
	
	public void saveOrUpdate(OspContentPublishflag entity);
	

}
