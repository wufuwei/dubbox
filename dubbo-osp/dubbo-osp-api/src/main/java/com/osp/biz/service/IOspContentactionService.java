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
import com.osp.biz.model.OspContentaction;

public interface IOspContentactionService {
	
	 
	 public OspContentaction getById(java.lang.Long id);
	
	public void save(OspContentaction entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspContentaction entity);
	
	
	public boolean isUnique(OspContentaction entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspContentaction entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<OspContentaction> findAll();
	
	public void updateDynamic(OspContentaction entity);
	
	public List<OspContentaction> findByDynamicWhere(OspContentaction entity);
	
	public void saveOrUpdate(OspContentaction entity);
	

}
