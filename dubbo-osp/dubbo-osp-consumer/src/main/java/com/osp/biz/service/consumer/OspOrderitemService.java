/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspOrderitemService;
import com.osp.biz.model.OspOrderitem;


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
public class OspOrderitemService {
	
	private IOspOrderitemService ospOrderitemService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspOrderitemService(IOspOrderitemService service) {
		this.ospOrderitemService = service;
	}

	public IOspOrderitemService getOspOrderitemService() {
		return this.ospOrderitemService;
	}
	
	public OspOrderitem getById(java.lang.Long id) {
		return (OspOrderitem)ospOrderitemService.getById(id);
	}
	
	
	
	
	public void save(OspOrderitem entity) {
		ospOrderitemService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospOrderitemService.removeById(id);
	}
	
	public void update(OspOrderitem entity) {
		ospOrderitemService.update(entity);
	}
	
	public boolean isUnique(OspOrderitem entity, String uniquePropertyNames) {
		return ospOrderitemService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspOrderitem entity){
		return ospOrderitemService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospOrderitemService.findByPageRequest(pr);
	}
	

	public List<OspOrderitem> findAll() {
		return ospOrderitemService.findAll();
	}
	
	public void updateDynamic(OspOrderitem entity){
		ospOrderitemService.updateDynamic(entity);
	}
	
	public List<OspOrderitem> findByDynamicWhere(OspOrderitem entity){
		return ospOrderitemService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspOrderitem entity){
		ospOrderitemService.saveOrUpdate(entity);
	}
	
}
