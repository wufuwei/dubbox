/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspSearchkeylogService;
import com.osp.biz.manager.IOspSearchkeylogManager;
import com.osp.biz.model.OspSearchkeylog;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspSearchkeylogService implements IOspSearchkeylogService{
	
	private IOspSearchkeylogManager ospSearchkeylogManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspSearchkeylogManager(IOspSearchkeylogManager manager) {
		this.ospSearchkeylogManager = manager;
	}

	public IOspSearchkeylogManager getEntityManager() {
		return this.ospSearchkeylogManager;
	}
	
	public OspSearchkeylog getById(java.lang.Long id) {
		return (OspSearchkeylog)ospSearchkeylogManager.getById(id);
	}
	
	
	
	public void save(OspSearchkeylog entity) {
		ospSearchkeylogManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospSearchkeylogManager.removeById(id);
	}
	
	public void update(OspSearchkeylog entity) {
		ospSearchkeylogManager.update(entity);
	}
	
	public boolean isUnique(OspSearchkeylog entity, String uniquePropertyNames) {
		return ospSearchkeylogManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspSearchkeylog entity){
		return ospSearchkeylogManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospSearchkeylogManager.findByPageRequest(pr);
	}
	

	public List<OspSearchkeylog> findAll() {
		return ospSearchkeylogManager.findAll();
	}
	
	public void updateDynamic(OspSearchkeylog entity){
		ospSearchkeylogManager.updateDynamic(entity);
	}
	
	public List<OspSearchkeylog> findByDynamicWhere(OspSearchkeylog entity){
		return ospSearchkeylogManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspSearchkeylog entity){
		ospSearchkeylogManager.saveOrUpdate(entity);
	}
	
}
