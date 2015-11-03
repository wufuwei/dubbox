/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspContentactionlogService;
import com.osp.biz.model.OspContentactionlog;


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
public class OspContentactionlogService {
	
	private IOspContentactionlogService ospContentactionlogService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspContentactionlogService(IOspContentactionlogService service) {
		this.ospContentactionlogService = service;
	}

	public IOspContentactionlogService getOspContentactionlogService() {
		return this.ospContentactionlogService;
	}
	
	public OspContentactionlog getById(java.lang.Long id) {
		return (OspContentactionlog)ospContentactionlogService.getById(id);
	}
	
	
	
	
	public void save(OspContentactionlog entity) {
		ospContentactionlogService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospContentactionlogService.removeById(id);
	}
	
	public void update(OspContentactionlog entity) {
		ospContentactionlogService.update(entity);
	}
	
	public boolean isUnique(OspContentactionlog entity, String uniquePropertyNames) {
		return ospContentactionlogService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspContentactionlog entity){
		return ospContentactionlogService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospContentactionlogService.findByPageRequest(pr);
	}
	

	public List<OspContentactionlog> findAll() {
		return ospContentactionlogService.findAll();
	}
	
	public void updateDynamic(OspContentactionlog entity){
		ospContentactionlogService.updateDynamic(entity);
	}
	
	public List<OspContentactionlog> findByDynamicWhere(OspContentactionlog entity){
		return ospContentactionlogService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspContentactionlog entity){
		ospContentactionlogService.saveOrUpdate(entity);
	}
	
}
