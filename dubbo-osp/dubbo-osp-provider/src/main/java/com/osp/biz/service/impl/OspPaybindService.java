/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspPaybindService;
import com.osp.biz.manager.IOspPaybindManager;
import com.osp.biz.model.OspPaybind;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspPaybindService implements IOspPaybindService{
	
	private IOspPaybindManager ospPaybindManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspPaybindManager(IOspPaybindManager manager) {
		this.ospPaybindManager = manager;
	}

	public IOspPaybindManager getEntityManager() {
		return this.ospPaybindManager;
	}
	
	public OspPaybind getById(java.lang.Long id) {
		return (OspPaybind)ospPaybindManager.getById(id);
	}
	
	
	
	public void save(OspPaybind entity) {
		ospPaybindManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospPaybindManager.removeById(id);
	}
	
	public void update(OspPaybind entity) {
		ospPaybindManager.update(entity);
	}
	
	public boolean isUnique(OspPaybind entity, String uniquePropertyNames) {
		return ospPaybindManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspPaybind entity){
		return ospPaybindManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospPaybindManager.findByPageRequest(pr);
	}
	

	public List<OspPaybind> findAll() {
		return ospPaybindManager.findAll();
	}
	
	public void updateDynamic(OspPaybind entity){
		ospPaybindManager.updateDynamic(entity);
	}
	
	public List<OspPaybind> findByDynamicWhere(OspPaybind entity){
		return ospPaybindManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspPaybind entity){
		ospPaybindManager.saveOrUpdate(entity);
	}
	
}
