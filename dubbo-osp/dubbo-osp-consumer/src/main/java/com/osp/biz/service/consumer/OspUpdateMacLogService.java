/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspUpdateMacLogService;
import com.osp.biz.model.OspUpdateMacLog;


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
public class OspUpdateMacLogService {
	
	private IOspUpdateMacLogService ospUpdateMacLogService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspUpdateMacLogService(IOspUpdateMacLogService service) {
		this.ospUpdateMacLogService = service;
	}

	public IOspUpdateMacLogService getOspUpdateMacLogService() {
		return this.ospUpdateMacLogService;
	}
	
	public OspUpdateMacLog getById(java.lang.Integer id) {
		return (OspUpdateMacLog)ospUpdateMacLogService.getById(id);
	}
	
	
	
	
	public void save(OspUpdateMacLog entity) {
		ospUpdateMacLogService.save(entity);
	}
	
	public void removeById(java.lang.Integer id) {
		ospUpdateMacLogService.removeById(id);
	}
	
	public void update(OspUpdateMacLog entity) {
		ospUpdateMacLogService.update(entity);
	}
	
	public boolean isUnique(OspUpdateMacLog entity, String uniquePropertyNames) {
		return ospUpdateMacLogService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspUpdateMacLog entity){
		return ospUpdateMacLogService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospUpdateMacLogService.findByPageRequest(pr);
	}
	

	public List<OspUpdateMacLog> findAll() {
		return ospUpdateMacLogService.findAll();
	}
	
	public void updateDynamic(OspUpdateMacLog entity){
		ospUpdateMacLogService.updateDynamic(entity);
	}
	
	public List<OspUpdateMacLog> findByDynamicWhere(OspUpdateMacLog entity){
		return ospUpdateMacLogService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspUpdateMacLog entity){
		ospUpdateMacLogService.saveOrUpdate(entity);
	}
	
}
