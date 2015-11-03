/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspPaybindService;
import com.osp.biz.model.OspPaybind;


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
public class OspPaybindService {
	
	private IOspPaybindService ospPaybindService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspPaybindService(IOspPaybindService service) {
		this.ospPaybindService = service;
	}

	public IOspPaybindService getOspPaybindService() {
		return this.ospPaybindService;
	}
	
	public OspPaybind getById(java.lang.Long id) {
		return (OspPaybind)ospPaybindService.getById(id);
	}
	
	
	
	
	public void save(OspPaybind entity) {
		ospPaybindService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospPaybindService.removeById(id);
	}
	
	public void update(OspPaybind entity) {
		ospPaybindService.update(entity);
	}
	
	public boolean isUnique(OspPaybind entity, String uniquePropertyNames) {
		return ospPaybindService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspPaybind entity){
		return ospPaybindService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospPaybindService.findByPageRequest(pr);
	}
	

	public List<OspPaybind> findAll() {
		return ospPaybindService.findAll();
	}
	
	public void updateDynamic(OspPaybind entity){
		ospPaybindService.updateDynamic(entity);
	}
	
	public List<OspPaybind> findByDynamicWhere(OspPaybind entity){
		return ospPaybindService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspPaybind entity){
		ospPaybindService.saveOrUpdate(entity);
	}
	
}
