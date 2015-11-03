/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspTradetypeService;
import com.osp.biz.manager.IOspTradetypeManager;
import com.osp.biz.model.OspTradetype;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspTradetypeService implements IOspTradetypeService{
	
	private IOspTradetypeManager ospTradetypeManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspTradetypeManager(IOspTradetypeManager manager) {
		this.ospTradetypeManager = manager;
	}

	public IOspTradetypeManager getEntityManager() {
		return this.ospTradetypeManager;
	}
	
	public OspTradetype getById(java.lang.Long id) {
		return (OspTradetype)ospTradetypeManager.getById(id);
	}
	
	
	
	public void save(OspTradetype entity) {
		ospTradetypeManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospTradetypeManager.removeById(id);
	}
	
	public void update(OspTradetype entity) {
		ospTradetypeManager.update(entity);
	}
	
	public boolean isUnique(OspTradetype entity, String uniquePropertyNames) {
		return ospTradetypeManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspTradetype entity){
		return ospTradetypeManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospTradetypeManager.findByPageRequest(pr);
	}
	
	public OspTradetype getByTradetype(java.lang.String v) {
		return ospTradetypeManager.getByTradetype(v);
	}	

	public List<OspTradetype> findAll() {
		return ospTradetypeManager.findAll();
	}
	
	public void updateDynamic(OspTradetype entity){
		ospTradetypeManager.updateDynamic(entity);
	}
	
	public List<OspTradetype> findByDynamicWhere(OspTradetype entity){
		return ospTradetypeManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspTradetype entity){
		ospTradetypeManager.saveOrUpdate(entity);
	}
	
}
