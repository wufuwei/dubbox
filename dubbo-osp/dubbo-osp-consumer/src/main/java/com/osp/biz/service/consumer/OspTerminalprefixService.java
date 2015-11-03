/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspTerminalprefixService;
import com.osp.biz.model.OspTerminalprefix;


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
public class OspTerminalprefixService {
	
	private IOspTerminalprefixService ospTerminalprefixService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspTerminalprefixService(IOspTerminalprefixService service) {
		this.ospTerminalprefixService = service;
	}

	public IOspTerminalprefixService getOspTerminalprefixService() {
		return this.ospTerminalprefixService;
	}
	
	public OspTerminalprefix getById(java.lang.Long id) {
		return (OspTerminalprefix)ospTerminalprefixService.getById(id);
	}
	
	
	
	
	public void save(OspTerminalprefix entity) {
		ospTerminalprefixService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospTerminalprefixService.removeById(id);
	}
	
	public void update(OspTerminalprefix entity) {
		ospTerminalprefixService.update(entity);
	}
	
	public boolean isUnique(OspTerminalprefix entity, String uniquePropertyNames) {
		return ospTerminalprefixService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspTerminalprefix entity){
		return ospTerminalprefixService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospTerminalprefixService.findByPageRequest(pr);
	}
	

	public List<OspTerminalprefix> findAll() {
		return ospTerminalprefixService.findAll();
	}
	
	public void updateDynamic(OspTerminalprefix entity){
		ospTerminalprefixService.updateDynamic(entity);
	}
	
	public List<OspTerminalprefix> findByDynamicWhere(OspTerminalprefix entity){
		return ospTerminalprefixService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspTerminalprefix entity){
		ospTerminalprefixService.saveOrUpdate(entity);
	}
	
}
