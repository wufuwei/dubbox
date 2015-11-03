/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspSpService;
import com.osp.biz.manager.IOspSpManager;
import com.osp.biz.model.OspSp;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspSpService implements IOspSpService{
	
	private IOspSpManager ospSpManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspSpManager(IOspSpManager manager) {
		this.ospSpManager = manager;
	}

	public IOspSpManager getEntityManager() {
		return this.ospSpManager;
	}
	
	public OspSp getById(java.lang.Long id) {
		return (OspSp)ospSpManager.getById(id);
	}
	
	
	
	public void save(OspSp entity) {
		ospSpManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospSpManager.removeById(id);
	}
	
	public void update(OspSp entity) {
		ospSpManager.update(entity);
	}
	
	public boolean isUnique(OspSp entity, String uniquePropertyNames) {
		return ospSpManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspSp entity){
		return ospSpManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospSpManager.findByPageRequest(pr);
	}
	

	public List<OspSp> findAll() {
		return ospSpManager.findAll();
	}
	
	public void updateDynamic(OspSp entity){
		ospSpManager.updateDynamic(entity);
	}
	
	public List<OspSp> findByDynamicWhere(OspSp entity){
		return ospSpManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspSp entity){
		ospSpManager.saveOrUpdate(entity);
	}
	
}
