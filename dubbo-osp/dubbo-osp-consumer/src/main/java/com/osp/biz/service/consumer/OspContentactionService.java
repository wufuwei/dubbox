/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspContentactionService;
import com.osp.biz.model.OspContentaction;


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
public class OspContentactionService {
	
	private IOspContentactionService ospContentactionService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspContentactionService(IOspContentactionService service) {
		this.ospContentactionService = service;
	}

	public IOspContentactionService getOspContentactionService() {
		return this.ospContentactionService;
	}
	
	public OspContentaction getById(java.lang.Long id) {
		return (OspContentaction)ospContentactionService.getById(id);
	}
	
	
	
	
	public void save(OspContentaction entity) {
		ospContentactionService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospContentactionService.removeById(id);
	}
	
	public void update(OspContentaction entity) {
		ospContentactionService.update(entity);
	}
	
	public boolean isUnique(OspContentaction entity, String uniquePropertyNames) {
		return ospContentactionService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspContentaction entity){
		return ospContentactionService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospContentactionService.findByPageRequest(pr);
	}
	

	public List<OspContentaction> findAll() {
		return ospContentactionService.findAll();
	}
	
	public void updateDynamic(OspContentaction entity){
		ospContentactionService.updateDynamic(entity);
	}
	
	public List<OspContentaction> findByDynamicWhere(OspContentaction entity){
		return ospContentactionService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspContentaction entity){
		ospContentactionService.saveOrUpdate(entity);
	}
	
}
