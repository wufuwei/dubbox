/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspCatalogcontentService;
import com.osp.biz.model.OspCatalogcontent;


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
public class OspCatalogcontentService {
	
	private IOspCatalogcontentService ospCatalogcontentService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspCatalogcontentService(IOspCatalogcontentService service) {
		this.ospCatalogcontentService = service;
	}

	public IOspCatalogcontentService getOspCatalogcontentService() {
		return this.ospCatalogcontentService;
	}
	
	public OspCatalogcontent getById(java.lang.Long id) {
		return (OspCatalogcontent)ospCatalogcontentService.getById(id);
	}
	
	
	
	
	public void save(OspCatalogcontent entity) {
		ospCatalogcontentService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospCatalogcontentService.removeById(id);
	}
	
	public void update(OspCatalogcontent entity) {
		ospCatalogcontentService.update(entity);
	}
	
	public boolean isUnique(OspCatalogcontent entity, String uniquePropertyNames) {
		return ospCatalogcontentService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspCatalogcontent entity){
		return ospCatalogcontentService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospCatalogcontentService.findByPageRequest(pr);
	}
	

	public List<OspCatalogcontent> findAll() {
		return ospCatalogcontentService.findAll();
	}
	
	public void updateDynamic(OspCatalogcontent entity){
		ospCatalogcontentService.updateDynamic(entity);
	}
	
	public List<OspCatalogcontent> findByDynamicWhere(OspCatalogcontent entity){
		return ospCatalogcontentService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspCatalogcontent entity){
		ospCatalogcontentService.saveOrUpdate(entity);
	}
	
}
