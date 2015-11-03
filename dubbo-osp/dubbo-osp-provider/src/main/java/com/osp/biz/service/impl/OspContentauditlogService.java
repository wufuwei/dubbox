/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspContentauditlogService;
import com.osp.biz.manager.IOspContentauditlogManager;
import com.osp.biz.model.OspContentauditlog;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspContentauditlogService implements IOspContentauditlogService{
	
	private IOspContentauditlogManager ospContentauditlogManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspContentauditlogManager(IOspContentauditlogManager manager) {
		this.ospContentauditlogManager = manager;
	}

	public IOspContentauditlogManager getEntityManager() {
		return this.ospContentauditlogManager;
	}
	
	public OspContentauditlog getById(java.lang.Long id) {
		return (OspContentauditlog)ospContentauditlogManager.getById(id);
	}
	
	
	
	public void save(OspContentauditlog entity) {
		ospContentauditlogManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospContentauditlogManager.removeById(id);
	}
	
	public void update(OspContentauditlog entity) {
		ospContentauditlogManager.update(entity);
	}
	
	public boolean isUnique(OspContentauditlog entity, String uniquePropertyNames) {
		return ospContentauditlogManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspContentauditlog entity){
		return ospContentauditlogManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospContentauditlogManager.findByPageRequest(pr);
	}
	

	public List<OspContentauditlog> findAll() {
		return ospContentauditlogManager.findAll();
	}
	
	public void updateDynamic(OspContentauditlog entity){
		ospContentauditlogManager.updateDynamic(entity);
	}
	
	public List<OspContentauditlog> findByDynamicWhere(OspContentauditlog entity){
		return ospContentauditlogManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspContentauditlog entity){
		ospContentauditlogManager.saveOrUpdate(entity);
	}
	
}
