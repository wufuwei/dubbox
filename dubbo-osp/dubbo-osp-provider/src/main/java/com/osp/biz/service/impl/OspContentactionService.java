/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspContentactionService;
import com.osp.biz.manager.IOspContentactionManager;
import com.osp.biz.model.OspContentaction;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspContentactionService implements IOspContentactionService{
	
	private IOspContentactionManager ospContentactionManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspContentactionManager(IOspContentactionManager manager) {
		this.ospContentactionManager = manager;
	}

	public IOspContentactionManager getEntityManager() {
		return this.ospContentactionManager;
	}
	
	public OspContentaction getById(java.lang.Long id) {
		return (OspContentaction)ospContentactionManager.getById(id);
	}
	
	
	
	public void save(OspContentaction entity) {
		ospContentactionManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospContentactionManager.removeById(id);
	}
	
	public void update(OspContentaction entity) {
		ospContentactionManager.update(entity);
	}
	
	public boolean isUnique(OspContentaction entity, String uniquePropertyNames) {
		return ospContentactionManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspContentaction entity){
		return ospContentactionManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospContentactionManager.findByPageRequest(pr);
	}
	

	public List<OspContentaction> findAll() {
		return ospContentactionManager.findAll();
	}
	
	public void updateDynamic(OspContentaction entity){
		ospContentactionManager.updateDynamic(entity);
	}
	
	public List<OspContentaction> findByDynamicWhere(OspContentaction entity){
		return ospContentactionManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspContentaction entity){
		ospContentactionManager.saveOrUpdate(entity);
	}
	
}
