/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspUpdateMacLogService;
import com.osp.biz.manager.IOspUpdateMacLogManager;
import com.osp.biz.model.OspUpdateMacLog;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspUpdateMacLogService implements IOspUpdateMacLogService{
	
	private IOspUpdateMacLogManager ospUpdateMacLogManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspUpdateMacLogManager(IOspUpdateMacLogManager manager) {
		this.ospUpdateMacLogManager = manager;
	}

	public IOspUpdateMacLogManager getEntityManager() {
		return this.ospUpdateMacLogManager;
	}
	
	public OspUpdateMacLog getById(java.lang.Integer id) {
		return (OspUpdateMacLog)ospUpdateMacLogManager.getById(id);
	}
	
	
	
	public void save(OspUpdateMacLog entity) {
		ospUpdateMacLogManager.save(entity);
	}
	

	public void removeById(java.lang.Integer id) {
		ospUpdateMacLogManager.removeById(id);
	}
	
	public void update(OspUpdateMacLog entity) {
		ospUpdateMacLogManager.update(entity);
	}
	
	public boolean isUnique(OspUpdateMacLog entity, String uniquePropertyNames) {
		return ospUpdateMacLogManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspUpdateMacLog entity){
		return ospUpdateMacLogManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospUpdateMacLogManager.findByPageRequest(pr);
	}
	

	public List<OspUpdateMacLog> findAll() {
		return ospUpdateMacLogManager.findAll();
	}
	
	public void updateDynamic(OspUpdateMacLog entity){
		ospUpdateMacLogManager.updateDynamic(entity);
	}
	
	public List<OspUpdateMacLog> findByDynamicWhere(OspUpdateMacLog entity){
		return ospUpdateMacLogManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspUpdateMacLog entity){
		ospUpdateMacLogManager.saveOrUpdate(entity);
	}
	
}
