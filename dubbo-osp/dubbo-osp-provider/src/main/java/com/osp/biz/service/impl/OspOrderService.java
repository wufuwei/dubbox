/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspOrderService;
import com.osp.biz.manager.IOspOrderManager;
import com.osp.biz.model.OspOrder;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspOrderService implements IOspOrderService{
	
	private IOspOrderManager ospOrderManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspOrderManager(IOspOrderManager manager) {
		this.ospOrderManager = manager;
	}

	public IOspOrderManager getEntityManager() {
		return this.ospOrderManager;
	}
	
	public OspOrder getById(java.lang.Long id) {
		return (OspOrder)ospOrderManager.getById(id);
	}
	
	
	
	public void save(OspOrder entity) {
		ospOrderManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospOrderManager.removeById(id);
	}
	
	public void update(OspOrder entity) {
		ospOrderManager.update(entity);
	}
	
	public boolean isUnique(OspOrder entity, String uniquePropertyNames) {
		return ospOrderManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspOrder entity){
		return ospOrderManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospOrderManager.findByPageRequest(pr);
	}
	
	public OspOrder getByOrderid(java.lang.String v) {
		return ospOrderManager.getByOrderid(v);
	}	

	public List<OspOrder> findAll() {
		return ospOrderManager.findAll();
	}
	
	public void updateDynamic(OspOrder entity){
		ospOrderManager.updateDynamic(entity);
	}
	
	public List<OspOrder> findByDynamicWhere(OspOrder entity){
		return ospOrderManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspOrder entity){
		ospOrderManager.saveOrUpdate(entity);
	}
	
}
