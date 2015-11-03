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
import com.osp.biz.model.OspCatalog;

public interface IOspCatalogService {
	
	 
	 public OspCatalog getById(java.lang.Long id);
	
	public void save(OspCatalog entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspCatalog entity);
	
	
	public boolean isUnique(OspCatalog entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspCatalog entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	
	public OspCatalog getByInnercode(java.lang.String v);

	public List<OspCatalog> findAll();
	
	public void updateDynamic(OspCatalog entity);
	
	public List<OspCatalog> findByDynamicWhere(OspCatalog entity);
	
	public void saveOrUpdate(OspCatalog entity);
	

}
