/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspTerminalonlineService;
import com.osp.biz.manager.IOspTerminalonlineManager;
import com.osp.biz.model.OspTerminalonline;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspTerminalonlineService implements IOspTerminalonlineService{
	
	private IOspTerminalonlineManager ospTerminalonlineManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspTerminalonlineManager(IOspTerminalonlineManager manager) {
		this.ospTerminalonlineManager = manager;
	}

	public IOspTerminalonlineManager getEntityManager() {
		return this.ospTerminalonlineManager;
	}
	
	public OspTerminalonline getById(java.lang.Long id) {
		return (OspTerminalonline)ospTerminalonlineManager.getById(id);
	}
	
	
	
	public void save(OspTerminalonline entity) {
		ospTerminalonlineManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospTerminalonlineManager.removeById(id);
	}
	
	public void update(OspTerminalonline entity) {
		ospTerminalonlineManager.update(entity);
	}
	
	public boolean isUnique(OspTerminalonline entity, String uniquePropertyNames) {
		return ospTerminalonlineManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspTerminalonline entity){
		return ospTerminalonlineManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospTerminalonlineManager.findByPageRequest(pr);
	}
	

	public List<OspTerminalonline> findAll() {
		return ospTerminalonlineManager.findAll();
	}
	
	public void updateDynamic(OspTerminalonline entity){
		ospTerminalonlineManager.updateDynamic(entity);
	}
	
	public List<OspTerminalonline> findByDynamicWhere(OspTerminalonline entity){
		return ospTerminalonlineManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspTerminalonline entity){
		ospTerminalonlineManager.saveOrUpdate(entity);
	}
	
}
