/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspCatalogactionlogService;
import com.osp.biz.model.OspCatalogactionlog;


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
public class OspCatalogactionlogService {
	
	private IOspCatalogactionlogService ospCatalogactionlogService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspCatalogactionlogService(IOspCatalogactionlogService service) {
		this.ospCatalogactionlogService = service;
	}

	public IOspCatalogactionlogService getOspCatalogactionlogService() {
		return this.ospCatalogactionlogService;
	}
	
	public OspCatalogactionlog getById(java.lang.Long id) {
		return (OspCatalogactionlog)ospCatalogactionlogService.getById(id);
	}
	
	
	
	
	public void save(OspCatalogactionlog entity) {
		ospCatalogactionlogService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospCatalogactionlogService.removeById(id);
	}
	
	public void update(OspCatalogactionlog entity) {
		ospCatalogactionlogService.update(entity);
	}
	
	public boolean isUnique(OspCatalogactionlog entity, String uniquePropertyNames) {
		return ospCatalogactionlogService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspCatalogactionlog entity){
		return ospCatalogactionlogService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospCatalogactionlogService.findByPageRequest(pr);
	}
	

	public List<OspCatalogactionlog> findAll() {
		return ospCatalogactionlogService.findAll();
	}
	
	public void updateDynamic(OspCatalogactionlog entity){
		ospCatalogactionlogService.updateDynamic(entity);
	}
	
	public List<OspCatalogactionlog> findByDynamicWhere(OspCatalogactionlog entity){
		return ospCatalogactionlogService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspCatalogactionlog entity){
		ospCatalogactionlogService.saveOrUpdate(entity);
	}
	
}
