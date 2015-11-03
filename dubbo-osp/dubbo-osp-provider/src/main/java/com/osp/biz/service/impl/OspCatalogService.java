/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspCatalogService;
import com.osp.biz.manager.IOspCatalogManager;
import com.osp.biz.model.OspCatalog;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspCatalogService implements IOspCatalogService{
	
	private IOspCatalogManager ospCatalogManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspCatalogManager(IOspCatalogManager manager) {
		this.ospCatalogManager = manager;
	}

	public IOspCatalogManager getEntityManager() {
		return this.ospCatalogManager;
	}
	
	public OspCatalog getById(java.lang.Long id) {
		return (OspCatalog)ospCatalogManager.getById(id);
	}
	
	
	
	public void save(OspCatalog entity) {
		ospCatalogManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospCatalogManager.removeById(id);
	}
	
	public void update(OspCatalog entity) {
		ospCatalogManager.update(entity);
	}
	
	public boolean isUnique(OspCatalog entity, String uniquePropertyNames) {
		return ospCatalogManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspCatalog entity){
		return ospCatalogManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospCatalogManager.findByPageRequest(pr);
	}
	
	public OspCatalog getByInnercode(java.lang.String v) {
		return ospCatalogManager.getByInnercode(v);
	}	

	public List<OspCatalog> findAll() {
		return ospCatalogManager.findAll();
	}
	
	public void updateDynamic(OspCatalog entity){
		ospCatalogManager.updateDynamic(entity);
	}
	
	public List<OspCatalog> findByDynamicWhere(OspCatalog entity){
		return ospCatalogManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspCatalog entity){
		ospCatalogManager.saveOrUpdate(entity);
	}
	
}
