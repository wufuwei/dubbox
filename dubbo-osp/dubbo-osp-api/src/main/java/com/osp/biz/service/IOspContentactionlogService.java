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
import com.osp.biz.model.OspContentactionlog;

public interface IOspContentactionlogService {
	
	 
	 public OspContentactionlog getById(java.lang.Long id);
	
	public void save(OspContentactionlog entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspContentactionlog entity);
	
	
	public boolean isUnique(OspContentactionlog entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspContentactionlog entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<OspContentactionlog> findAll();
	
	public void updateDynamic(OspContentactionlog entity);
	
	public List<OspContentactionlog> findByDynamicWhere(OspContentactionlog entity);
	
	public void saveOrUpdate(OspContentactionlog entity);
	

}
