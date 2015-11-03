/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspContentService;
import com.osp.biz.model.OspContent;


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
public class OspContentService {
	
	private IOspContentService ospContentService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspContentService(IOspContentService service) {
		this.ospContentService = service;
	}

	public IOspContentService getOspContentService() {
		return this.ospContentService;
	}
	
	public OspContent getById(java.lang.Long id) {
		return (OspContent)ospContentService.getById(id);
	}
	
	
	
	
	public void save(OspContent entity) {
		ospContentService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospContentService.removeById(id);
	}
	
	public void update(OspContent entity) {
		ospContentService.update(entity);
	}
	
	public boolean isUnique(OspContent entity, String uniquePropertyNames) {
		return ospContentService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspContent entity){
		return ospContentService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospContentService.findByPageRequest(pr);
	}
	

	public List<OspContent> findAll() {
		return ospContentService.findAll();
	}
	
	public void updateDynamic(OspContent entity){
		ospContentService.updateDynamic(entity);
	}
	
	public List<OspContent> findByDynamicWhere(OspContent entity){
		return ospContentService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspContent entity){
		ospContentService.saveOrUpdate(entity);
	}
	
}
