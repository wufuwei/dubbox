/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspTerminalgroupCatalogService;
import com.osp.biz.model.OspTerminalgroupCatalog;


import java.util.*;

import javacommon.base.*;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;

/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspTerminalgroupCatalogService {
	
	private IOspTerminalgroupCatalogService ospTerminalgroupCatalogService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspTerminalgroupCatalogService(IOspTerminalgroupCatalogService service) {
		this.ospTerminalgroupCatalogService = service;
	}

	public IOspTerminalgroupCatalogService getOspTerminalgroupCatalogService() {
		return this.ospTerminalgroupCatalogService;
	}
	
	public OspTerminalgroupCatalog getById(java.lang.Long id) {
		return (OspTerminalgroupCatalog)ospTerminalgroupCatalogService.getById(id);
	}
	
	
	
	
	public void save(OspTerminalgroupCatalog entity) {
		ospTerminalgroupCatalogService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospTerminalgroupCatalogService.removeById(id);
	}
	
	public void update(OspTerminalgroupCatalog entity) {
		ospTerminalgroupCatalogService.update(entity);
	}
	
	public boolean isUnique(OspTerminalgroupCatalog entity, String uniquePropertyNames) {
		return ospTerminalgroupCatalogService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspTerminalgroupCatalog entity){
		return ospTerminalgroupCatalogService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospTerminalgroupCatalogService.findByPageRequest(pr);
	}
	

	public List<OspTerminalgroupCatalog> findAll() {
		return ospTerminalgroupCatalogService.findAll();
	}
	
	public void updateDynamic(OspTerminalgroupCatalog entity){
		ospTerminalgroupCatalogService.updateDynamic(entity);
	}
	
	public List<OspTerminalgroupCatalog> findByDynamicWhere(OspTerminalgroupCatalog entity){
		return ospTerminalgroupCatalogService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspTerminalgroupCatalog entity){
		ospTerminalgroupCatalogService.saveOrUpdate(entity);
	}
	
}
