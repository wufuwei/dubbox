/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspContentrelationService;
import com.osp.biz.model.OspContentrelation;


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
public class OspContentrelationService {
	
	private IOspContentrelationService ospContentrelationService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspContentrelationService(IOspContentrelationService service) {
		this.ospContentrelationService = service;
	}

	public IOspContentrelationService getOspContentrelationService() {
		return this.ospContentrelationService;
	}
	
	public OspContentrelation getById(java.lang.Long id) {
		return (OspContentrelation)ospContentrelationService.getById(id);
	}
	
	
	
	
	public void save(OspContentrelation entity) {
		ospContentrelationService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospContentrelationService.removeById(id);
	}
	
	public void update(OspContentrelation entity) {
		ospContentrelationService.update(entity);
	}
	
	public boolean isUnique(OspContentrelation entity, String uniquePropertyNames) {
		return ospContentrelationService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspContentrelation entity){
		return ospContentrelationService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospContentrelationService.findByPageRequest(pr);
	}
	

	public List<OspContentrelation> findAll() {
		return ospContentrelationService.findAll();
	}
	
	public void updateDynamic(OspContentrelation entity){
		ospContentrelationService.updateDynamic(entity);
	}
	
	public List<OspContentrelation> findByDynamicWhere(OspContentrelation entity){
		return ospContentrelationService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspContentrelation entity){
		ospContentrelationService.saveOrUpdate(entity);
	}
	
}
