/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspSearchkeylogService;
import com.osp.biz.model.OspSearchkeylog;


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
public class OspSearchkeylogService {
	
	private IOspSearchkeylogService ospSearchkeylogService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspSearchkeylogService(IOspSearchkeylogService service) {
		this.ospSearchkeylogService = service;
	}

	public IOspSearchkeylogService getOspSearchkeylogService() {
		return this.ospSearchkeylogService;
	}
	
	public OspSearchkeylog getById(java.lang.Long id) {
		return (OspSearchkeylog)ospSearchkeylogService.getById(id);
	}
	
	
	
	
	public void save(OspSearchkeylog entity) {
		ospSearchkeylogService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospSearchkeylogService.removeById(id);
	}
	
	public void update(OspSearchkeylog entity) {
		ospSearchkeylogService.update(entity);
	}
	
	public boolean isUnique(OspSearchkeylog entity, String uniquePropertyNames) {
		return ospSearchkeylogService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspSearchkeylog entity){
		return ospSearchkeylogService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospSearchkeylogService.findByPageRequest(pr);
	}
	

	public List<OspSearchkeylog> findAll() {
		return ospSearchkeylogService.findAll();
	}
	
	public void updateDynamic(OspSearchkeylog entity){
		ospSearchkeylogService.updateDynamic(entity);
	}
	
	public List<OspSearchkeylog> findByDynamicWhere(OspSearchkeylog entity){
		return ospSearchkeylogService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspSearchkeylog entity){
		ospSearchkeylogService.saveOrUpdate(entity);
	}
	
}
