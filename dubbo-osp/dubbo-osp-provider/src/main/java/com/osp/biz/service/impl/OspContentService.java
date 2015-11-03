/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspContentService;
import com.osp.biz.manager.IOspContentManager;
import com.osp.biz.model.OspContent;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspContentService implements IOspContentService{
	
	private IOspContentManager ospContentManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspContentManager(IOspContentManager manager) {
		this.ospContentManager = manager;
	}

	public IOspContentManager getEntityManager() {
		return this.ospContentManager;
	}
	
	public OspContent getById(java.lang.Long id) {
		return (OspContent)ospContentManager.getById(id);
	}
	
	
	
	public void save(OspContent entity) {
		ospContentManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospContentManager.removeById(id);
	}
	
	public void update(OspContent entity) {
		ospContentManager.update(entity);
	}
	
	public boolean isUnique(OspContent entity, String uniquePropertyNames) {
		return ospContentManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspContent entity){
		return ospContentManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospContentManager.findByPageRequest(pr);
	}
	

	public List<OspContent> findAll() {
		return ospContentManager.findAll();
	}
	
	public void updateDynamic(OspContent entity){
		ospContentManager.updateDynamic(entity);
	}
	
	public List<OspContent> findByDynamicWhere(OspContent entity){
		return ospContentManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspContent entity){
		ospContentManager.saveOrUpdate(entity);
	}
	
}
