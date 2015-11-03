/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspContentactionlogService;
import com.osp.biz.manager.IOspContentactionlogManager;
import com.osp.biz.model.OspContentactionlog;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspContentactionlogService implements IOspContentactionlogService{
	
	private IOspContentactionlogManager ospContentactionlogManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspContentactionlogManager(IOspContentactionlogManager manager) {
		this.ospContentactionlogManager = manager;
	}

	public IOspContentactionlogManager getEntityManager() {
		return this.ospContentactionlogManager;
	}
	
	public OspContentactionlog getById(java.lang.Long id) {
		return (OspContentactionlog)ospContentactionlogManager.getById(id);
	}
	
	
	
	public void save(OspContentactionlog entity) {
		ospContentactionlogManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospContentactionlogManager.removeById(id);
	}
	
	public void update(OspContentactionlog entity) {
		ospContentactionlogManager.update(entity);
	}
	
	public boolean isUnique(OspContentactionlog entity, String uniquePropertyNames) {
		return ospContentactionlogManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspContentactionlog entity){
		return ospContentactionlogManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospContentactionlogManager.findByPageRequest(pr);
	}
	

	public List<OspContentactionlog> findAll() {
		return ospContentactionlogManager.findAll();
	}
	
	public void updateDynamic(OspContentactionlog entity){
		ospContentactionlogManager.updateDynamic(entity);
	}
	
	public List<OspContentactionlog> findByDynamicWhere(OspContentactionlog entity){
		return ospContentactionlogManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspContentactionlog entity){
		ospContentactionlogManager.saveOrUpdate(entity);
	}
	
}
