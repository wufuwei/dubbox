/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspSearchkeyService;
import com.osp.biz.manager.IOspSearchkeyManager;
import com.osp.biz.model.OspSearchkey;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspSearchkeyService implements IOspSearchkeyService{
	
	private IOspSearchkeyManager ospSearchkeyManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspSearchkeyManager(IOspSearchkeyManager manager) {
		this.ospSearchkeyManager = manager;
	}

	public IOspSearchkeyManager getEntityManager() {
		return this.ospSearchkeyManager;
	}
	
	public OspSearchkey getById(java.lang.Long id) {
		return (OspSearchkey)ospSearchkeyManager.getById(id);
	}
	
	
	
	public void save(OspSearchkey entity) {
		ospSearchkeyManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospSearchkeyManager.removeById(id);
	}
	
	public void update(OspSearchkey entity) {
		ospSearchkeyManager.update(entity);
	}
	
	public boolean isUnique(OspSearchkey entity, String uniquePropertyNames) {
		return ospSearchkeyManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspSearchkey entity){
		return ospSearchkeyManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospSearchkeyManager.findByPageRequest(pr);
	}
	
	public OspSearchkey getBySearchkey(java.lang.String v) {
		return ospSearchkeyManager.getBySearchkey(v);
	}	

	public List<OspSearchkey> findAll() {
		return ospSearchkeyManager.findAll();
	}
	
	public void updateDynamic(OspSearchkey entity){
		ospSearchkeyManager.updateDynamic(entity);
	}
	
	public List<OspSearchkey> findByDynamicWhere(OspSearchkey entity){
		return ospSearchkeyManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspSearchkey entity){
		ospSearchkeyManager.saveOrUpdate(entity);
	}
	
}
