/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspCatalogactionlogService;
import com.osp.biz.manager.IOspCatalogactionlogManager;
import com.osp.biz.model.OspCatalogactionlog;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspCatalogactionlogService implements IOspCatalogactionlogService{
	
	private IOspCatalogactionlogManager ospCatalogactionlogManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspCatalogactionlogManager(IOspCatalogactionlogManager manager) {
		this.ospCatalogactionlogManager = manager;
	}

	public IOspCatalogactionlogManager getEntityManager() {
		return this.ospCatalogactionlogManager;
	}
	
	public OspCatalogactionlog getById(java.lang.Long id) {
		return (OspCatalogactionlog)ospCatalogactionlogManager.getById(id);
	}
	
	
	
	public void save(OspCatalogactionlog entity) {
		ospCatalogactionlogManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospCatalogactionlogManager.removeById(id);
	}
	
	public void update(OspCatalogactionlog entity) {
		ospCatalogactionlogManager.update(entity);
	}
	
	public boolean isUnique(OspCatalogactionlog entity, String uniquePropertyNames) {
		return ospCatalogactionlogManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspCatalogactionlog entity){
		return ospCatalogactionlogManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospCatalogactionlogManager.findByPageRequest(pr);
	}
	

	public List<OspCatalogactionlog> findAll() {
		return ospCatalogactionlogManager.findAll();
	}
	
	public void updateDynamic(OspCatalogactionlog entity){
		ospCatalogactionlogManager.updateDynamic(entity);
	}
	
	public List<OspCatalogactionlog> findByDynamicWhere(OspCatalogactionlog entity){
		return ospCatalogactionlogManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspCatalogactionlog entity){
		ospCatalogactionlogManager.saveOrUpdate(entity);
	}
	
}
