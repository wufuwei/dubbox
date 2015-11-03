/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspCatalogService;
import com.osp.biz.model.OspCatalog;


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
public class OspCatalogService {
	
	private IOspCatalogService ospCatalogService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspCatalogService(IOspCatalogService service) {
		this.ospCatalogService = service;
	}

	public IOspCatalogService getOspCatalogService() {
		return this.ospCatalogService;
	}
	
	public OspCatalog getById(java.lang.Long id) {
		return (OspCatalog)ospCatalogService.getById(id);
	}
	
	
	
	
	public void save(OspCatalog entity) {
		ospCatalogService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospCatalogService.removeById(id);
	}
	
	public void update(OspCatalog entity) {
		ospCatalogService.update(entity);
	}
	
	public boolean isUnique(OspCatalog entity, String uniquePropertyNames) {
		return ospCatalogService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspCatalog entity){
		return ospCatalogService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospCatalogService.findByPageRequest(pr);
	}
	
	public OspCatalog getByInnercode(java.lang.String v) {
		return ospCatalogService.getByInnercode(v);
	}	

	public List<OspCatalog> findAll() {
		return ospCatalogService.findAll();
	}
	
	public void updateDynamic(OspCatalog entity){
		ospCatalogService.updateDynamic(entity);
	}
	
	public List<OspCatalog> findByDynamicWhere(OspCatalog entity){
		return ospCatalogService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspCatalog entity){
		ospCatalogService.saveOrUpdate(entity);
	}
	
}
