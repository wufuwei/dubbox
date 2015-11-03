/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspTerminalgroupService;
import com.osp.biz.manager.IOspTerminalgroupManager;
import com.osp.biz.model.OspTerminalgroup;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspTerminalgroupService implements IOspTerminalgroupService{
	
	private IOspTerminalgroupManager ospTerminalgroupManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspTerminalgroupManager(IOspTerminalgroupManager manager) {
		this.ospTerminalgroupManager = manager;
	}

	public IOspTerminalgroupManager getEntityManager() {
		return this.ospTerminalgroupManager;
	}
	
	public OspTerminalgroup getById(java.lang.Long id) {
		return (OspTerminalgroup)ospTerminalgroupManager.getById(id);
	}
	
	
	
	public void save(OspTerminalgroup entity) {
		ospTerminalgroupManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospTerminalgroupManager.removeById(id);
	}
	
	public void update(OspTerminalgroup entity) {
		ospTerminalgroupManager.update(entity);
	}
	
	public boolean isUnique(OspTerminalgroup entity, String uniquePropertyNames) {
		return ospTerminalgroupManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspTerminalgroup entity){
		return ospTerminalgroupManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospTerminalgroupManager.findByPageRequest(pr);
	}
	

	public List<OspTerminalgroup> findAll() {
		return ospTerminalgroupManager.findAll();
	}
	
	public void updateDynamic(OspTerminalgroup entity){
		ospTerminalgroupManager.updateDynamic(entity);
	}
	
	public List<OspTerminalgroup> findByDynamicWhere(OspTerminalgroup entity){
		return ospTerminalgroupManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspTerminalgroup entity){
		ospTerminalgroupManager.saveOrUpdate(entity);
	}
	
}
