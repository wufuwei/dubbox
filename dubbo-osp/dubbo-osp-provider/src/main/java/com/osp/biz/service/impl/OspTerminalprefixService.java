/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspTerminalprefixService;
import com.osp.biz.manager.IOspTerminalprefixManager;
import com.osp.biz.model.OspTerminalprefix;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspTerminalprefixService implements IOspTerminalprefixService{
	
	private IOspTerminalprefixManager ospTerminalprefixManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspTerminalprefixManager(IOspTerminalprefixManager manager) {
		this.ospTerminalprefixManager = manager;
	}

	public IOspTerminalprefixManager getEntityManager() {
		return this.ospTerminalprefixManager;
	}
	
	public OspTerminalprefix getById(java.lang.Long id) {
		return (OspTerminalprefix)ospTerminalprefixManager.getById(id);
	}
	
	
	
	public void save(OspTerminalprefix entity) {
		ospTerminalprefixManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospTerminalprefixManager.removeById(id);
	}
	
	public void update(OspTerminalprefix entity) {
		ospTerminalprefixManager.update(entity);
	}
	
	public boolean isUnique(OspTerminalprefix entity, String uniquePropertyNames) {
		return ospTerminalprefixManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspTerminalprefix entity){
		return ospTerminalprefixManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospTerminalprefixManager.findByPageRequest(pr);
	}
	

	public List<OspTerminalprefix> findAll() {
		return ospTerminalprefixManager.findAll();
	}
	
	public void updateDynamic(OspTerminalprefix entity){
		ospTerminalprefixManager.updateDynamic(entity);
	}
	
	public List<OspTerminalprefix> findByDynamicWhere(OspTerminalprefix entity){
		return ospTerminalprefixManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspTerminalprefix entity){
		ospTerminalprefixManager.saveOrUpdate(entity);
	}
	
}
