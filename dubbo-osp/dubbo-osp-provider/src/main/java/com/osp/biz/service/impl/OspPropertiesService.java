/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspPropertiesService;
import com.osp.biz.manager.IOspPropertiesManager;
import com.osp.biz.model.OspProperties;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspPropertiesService implements IOspPropertiesService{
	
	private IOspPropertiesManager ospPropertiesManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspPropertiesManager(IOspPropertiesManager manager) {
		this.ospPropertiesManager = manager;
	}

	public IOspPropertiesManager getEntityManager() {
		return this.ospPropertiesManager;
	}
	
	public OspProperties getById(java.lang.Long id) {
		return (OspProperties)ospPropertiesManager.getById(id);
	}
	
	
	
	public void save(OspProperties entity) {
		ospPropertiesManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospPropertiesManager.removeById(id);
	}
	
	public void update(OspProperties entity) {
		ospPropertiesManager.update(entity);
	}
	
	public boolean isUnique(OspProperties entity, String uniquePropertyNames) {
		return ospPropertiesManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspProperties entity){
		return ospPropertiesManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospPropertiesManager.findByPageRequest(pr);
	}
	
	public OspProperties getByName(java.lang.String v) {
		return ospPropertiesManager.getByName(v);
	}	

	public List<OspProperties> findAll() {
		return ospPropertiesManager.findAll();
	}
	
	public void updateDynamic(OspProperties entity){
		ospPropertiesManager.updateDynamic(entity);
	}
	
	public List<OspProperties> findByDynamicWhere(OspProperties entity){
		return ospPropertiesManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspProperties entity){
		ospPropertiesManager.saveOrUpdate(entity);
	}
	
}
