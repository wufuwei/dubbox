/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspSpService;
import com.osp.biz.model.OspSp;


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
public class OspSpService {
	
	private IOspSpService ospSpService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspSpService(IOspSpService service) {
		this.ospSpService = service;
	}

	public IOspSpService getOspSpService() {
		return this.ospSpService;
	}
	
	public OspSp getById(java.lang.Long id) {
		return (OspSp)ospSpService.getById(id);
	}
	
	
	
	
	public void save(OspSp entity) {
		ospSpService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospSpService.removeById(id);
	}
	
	public void update(OspSp entity) {
		ospSpService.update(entity);
	}
	
	public boolean isUnique(OspSp entity, String uniquePropertyNames) {
		return ospSpService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspSp entity){
		return ospSpService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospSpService.findByPageRequest(pr);
	}
	

	public List<OspSp> findAll() {
		return ospSpService.findAll();
	}
	
	public void updateDynamic(OspSp entity){
		ospSpService.updateDynamic(entity);
	}
	
	public List<OspSp> findByDynamicWhere(OspSp entity){
		return ospSpService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspSp entity){
		ospSpService.saveOrUpdate(entity);
	}
	
}
