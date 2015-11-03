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
import com.osp.biz.model.OspCatalogcontent;

public interface IOspCatalogcontentService {
	
	 
	 public OspCatalogcontent getById(java.lang.Long id);
	
	public void save(OspCatalogcontent entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspCatalogcontent entity);
	
	
	public boolean isUnique(OspCatalogcontent entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspCatalogcontent entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<OspCatalogcontent> findAll();
	
	public void updateDynamic(OspCatalogcontent entity);
	
	public List<OspCatalogcontent> findByDynamicWhere(OspCatalogcontent entity);
	
	public void saveOrUpdate(OspCatalogcontent entity);
	

}
