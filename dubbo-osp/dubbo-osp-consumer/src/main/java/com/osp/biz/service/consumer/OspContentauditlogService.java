/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspContentauditlogService;
import com.osp.biz.model.OspContentauditlog;


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
public class OspContentauditlogService {
	
	private IOspContentauditlogService ospContentauditlogService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspContentauditlogService(IOspContentauditlogService service) {
		this.ospContentauditlogService = service;
	}

	public IOspContentauditlogService getOspContentauditlogService() {
		return this.ospContentauditlogService;
	}
	
	public OspContentauditlog getById(java.lang.Long id) {
		return (OspContentauditlog)ospContentauditlogService.getById(id);
	}
	
	
	
	
	public void save(OspContentauditlog entity) {
		ospContentauditlogService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospContentauditlogService.removeById(id);
	}
	
	public void update(OspContentauditlog entity) {
		ospContentauditlogService.update(entity);
	}
	
	public boolean isUnique(OspContentauditlog entity, String uniquePropertyNames) {
		return ospContentauditlogService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspContentauditlog entity){
		return ospContentauditlogService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospContentauditlogService.findByPageRequest(pr);
	}
	

	public List<OspContentauditlog> findAll() {
		return ospContentauditlogService.findAll();
	}
	
	public void updateDynamic(OspContentauditlog entity){
		ospContentauditlogService.updateDynamic(entity);
	}
	
	public List<OspContentauditlog> findByDynamicWhere(OspContentauditlog entity){
		return ospContentauditlogService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspContentauditlog entity){
		ospContentauditlogService.saveOrUpdate(entity);
	}
	
}
