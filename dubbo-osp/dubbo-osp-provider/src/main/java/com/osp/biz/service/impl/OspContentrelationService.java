/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspContentrelationService;
import com.osp.biz.manager.IOspContentrelationManager;
import com.osp.biz.model.OspContentrelation;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspContentrelationService implements IOspContentrelationService{
	
	private IOspContentrelationManager ospContentrelationManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspContentrelationManager(IOspContentrelationManager manager) {
		this.ospContentrelationManager = manager;
	}

	public IOspContentrelationManager getEntityManager() {
		return this.ospContentrelationManager;
	}
	
	public OspContentrelation getById(java.lang.Long id) {
		return (OspContentrelation)ospContentrelationManager.getById(id);
	}
	
	
	
	public void save(OspContentrelation entity) {
		ospContentrelationManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospContentrelationManager.removeById(id);
	}
	
	public void update(OspContentrelation entity) {
		ospContentrelationManager.update(entity);
	}
	
	public boolean isUnique(OspContentrelation entity, String uniquePropertyNames) {
		return ospContentrelationManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspContentrelation entity){
		return ospContentrelationManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospContentrelationManager.findByPageRequest(pr);
	}
	

	public List<OspContentrelation> findAll() {
		return ospContentrelationManager.findAll();
	}
	
	public void updateDynamic(OspContentrelation entity){
		ospContentrelationManager.updateDynamic(entity);
	}
	
	public List<OspContentrelation> findByDynamicWhere(OspContentrelation entity){
		return ospContentrelationManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspContentrelation entity){
		ospContentrelationManager.saveOrUpdate(entity);
	}
	
}
