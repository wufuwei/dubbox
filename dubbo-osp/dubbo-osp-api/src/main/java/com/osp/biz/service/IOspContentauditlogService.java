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
import com.osp.biz.model.OspContentauditlog;

public interface IOspContentauditlogService {
	
	 
	 public OspContentauditlog getById(java.lang.Long id);
	
	public void save(OspContentauditlog entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspContentauditlog entity);
	
	
	public boolean isUnique(OspContentauditlog entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspContentauditlog entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<OspContentauditlog> findAll();
	
	public void updateDynamic(OspContentauditlog entity);
	
	public List<OspContentauditlog> findByDynamicWhere(OspContentauditlog entity);
	
	public void saveOrUpdate(OspContentauditlog entity);
	

}
