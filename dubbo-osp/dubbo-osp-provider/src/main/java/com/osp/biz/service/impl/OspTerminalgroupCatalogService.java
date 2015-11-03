/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspTerminalgroupCatalogService;
import com.osp.biz.manager.IOspTerminalgroupCatalogManager;
import com.osp.biz.model.OspTerminalgroupCatalog;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspTerminalgroupCatalogService implements IOspTerminalgroupCatalogService{
	
	private IOspTerminalgroupCatalogManager ospTerminalgroupCatalogManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspTerminalgroupCatalogManager(IOspTerminalgroupCatalogManager manager) {
		this.ospTerminalgroupCatalogManager = manager;
	}

	public IOspTerminalgroupCatalogManager getEntityManager() {
		return this.ospTerminalgroupCatalogManager;
	}
	
	public OspTerminalgroupCatalog getById(java.lang.Long id) {
		return (OspTerminalgroupCatalog)ospTerminalgroupCatalogManager.getById(id);
	}
	
	
	
	public void save(OspTerminalgroupCatalog entity) {
		ospTerminalgroupCatalogManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospTerminalgroupCatalogManager.removeById(id);
	}
	
	public void update(OspTerminalgroupCatalog entity) {
		ospTerminalgroupCatalogManager.update(entity);
	}
	
	public boolean isUnique(OspTerminalgroupCatalog entity, String uniquePropertyNames) {
		return ospTerminalgroupCatalogManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspTerminalgroupCatalog entity){
		return ospTerminalgroupCatalogManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospTerminalgroupCatalogManager.findByPageRequest(pr);
	}
	

	public List<OspTerminalgroupCatalog> findAll() {
		return ospTerminalgroupCatalogManager.findAll();
	}
	
	public void updateDynamic(OspTerminalgroupCatalog entity){
		ospTerminalgroupCatalogManager.updateDynamic(entity);
	}
	
	public List<OspTerminalgroupCatalog> findByDynamicWhere(OspTerminalgroupCatalog entity){
		return ospTerminalgroupCatalogManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspTerminalgroupCatalog entity){
		ospTerminalgroupCatalogManager.saveOrUpdate(entity);
	}
	
}
