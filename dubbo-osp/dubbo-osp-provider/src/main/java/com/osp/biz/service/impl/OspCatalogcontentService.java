/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspCatalogcontentService;
import com.osp.biz.manager.IOspCatalogcontentManager;
import com.osp.biz.model.OspCatalogcontent;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspCatalogcontentService implements IOspCatalogcontentService{
	
	private IOspCatalogcontentManager ospCatalogcontentManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspCatalogcontentManager(IOspCatalogcontentManager manager) {
		this.ospCatalogcontentManager = manager;
	}

	public IOspCatalogcontentManager getEntityManager() {
		return this.ospCatalogcontentManager;
	}
	
	public OspCatalogcontent getById(java.lang.Long id) {
		return (OspCatalogcontent)ospCatalogcontentManager.getById(id);
	}
	
	
	
	public void save(OspCatalogcontent entity) {
		ospCatalogcontentManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospCatalogcontentManager.removeById(id);
	}
	
	public void update(OspCatalogcontent entity) {
		ospCatalogcontentManager.update(entity);
	}
	
	public boolean isUnique(OspCatalogcontent entity, String uniquePropertyNames) {
		return ospCatalogcontentManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspCatalogcontent entity){
		return ospCatalogcontentManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospCatalogcontentManager.findByPageRequest(pr);
	}
	

	public List<OspCatalogcontent> findAll() {
		return ospCatalogcontentManager.findAll();
	}
	
	public void updateDynamic(OspCatalogcontent entity){
		ospCatalogcontentManager.updateDynamic(entity);
	}
	
	public List<OspCatalogcontent> findByDynamicWhere(OspCatalogcontent entity){
		return ospCatalogcontentManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspCatalogcontent entity){
		ospCatalogcontentManager.saveOrUpdate(entity);
	}
	
}
