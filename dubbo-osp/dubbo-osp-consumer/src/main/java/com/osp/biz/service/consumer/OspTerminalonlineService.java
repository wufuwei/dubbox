/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspTerminalonlineService;
import com.osp.biz.model.OspTerminalonline;


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
public class OspTerminalonlineService {
	
	private IOspTerminalonlineService ospTerminalonlineService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspTerminalonlineService(IOspTerminalonlineService service) {
		this.ospTerminalonlineService = service;
	}

	public IOspTerminalonlineService getOspTerminalonlineService() {
		return this.ospTerminalonlineService;
	}
	
	public OspTerminalonline getById(java.lang.Long id) {
		return (OspTerminalonline)ospTerminalonlineService.getById(id);
	}
	
	
	
	
	public void save(OspTerminalonline entity) {
		ospTerminalonlineService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospTerminalonlineService.removeById(id);
	}
	
	public void update(OspTerminalonline entity) {
		ospTerminalonlineService.update(entity);
	}
	
	public boolean isUnique(OspTerminalonline entity, String uniquePropertyNames) {
		return ospTerminalonlineService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspTerminalonline entity){
		return ospTerminalonlineService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospTerminalonlineService.findByPageRequest(pr);
	}
	

	public List<OspTerminalonline> findAll() {
		return ospTerminalonlineService.findAll();
	}
	
	public void updateDynamic(OspTerminalonline entity){
		ospTerminalonlineService.updateDynamic(entity);
	}
	
	public List<OspTerminalonline> findByDynamicWhere(OspTerminalonline entity){
		return ospTerminalonlineService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspTerminalonline entity){
		ospTerminalonlineService.saveOrUpdate(entity);
	}
	
}
