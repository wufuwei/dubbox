/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspTerminalgroupService;
import com.osp.biz.model.OspTerminalgroup;


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
public class OspTerminalgroupService {
	
	private IOspTerminalgroupService ospTerminalgroupService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspTerminalgroupService(IOspTerminalgroupService service) {
		this.ospTerminalgroupService = service;
	}

	public IOspTerminalgroupService getOspTerminalgroupService() {
		return this.ospTerminalgroupService;
	}
	
	public OspTerminalgroup getById(java.lang.Long id) {
		return (OspTerminalgroup)ospTerminalgroupService.getById(id);
	}
	
	
	
	
	public void save(OspTerminalgroup entity) {
		ospTerminalgroupService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospTerminalgroupService.removeById(id);
	}
	
	public void update(OspTerminalgroup entity) {
		ospTerminalgroupService.update(entity);
	}
	
	public boolean isUnique(OspTerminalgroup entity, String uniquePropertyNames) {
		return ospTerminalgroupService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspTerminalgroup entity){
		return ospTerminalgroupService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospTerminalgroupService.findByPageRequest(pr);
	}
	

	public List<OspTerminalgroup> findAll() {
		return ospTerminalgroupService.findAll();
	}
	
	public void updateDynamic(OspTerminalgroup entity){
		ospTerminalgroupService.updateDynamic(entity);
	}
	
	public List<OspTerminalgroup> findByDynamicWhere(OspTerminalgroup entity){
		return ospTerminalgroupService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspTerminalgroup entity){
		ospTerminalgroupService.saveOrUpdate(entity);
	}
	
}
