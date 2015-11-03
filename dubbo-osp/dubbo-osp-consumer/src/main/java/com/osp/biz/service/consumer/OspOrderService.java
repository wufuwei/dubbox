/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspOrderService;
import com.osp.biz.model.OspOrder;


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
public class OspOrderService {
	
	private IOspOrderService ospOrderService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspOrderService(IOspOrderService service) {
		this.ospOrderService = service;
	}

	public IOspOrderService getOspOrderService() {
		return this.ospOrderService;
	}
	
	public OspOrder getById(java.lang.Long id) {
		return (OspOrder)ospOrderService.getById(id);
	}
	
	
	
	
	public void save(OspOrder entity) {
		ospOrderService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospOrderService.removeById(id);
	}
	
	public void update(OspOrder entity) {
		ospOrderService.update(entity);
	}
	
	public boolean isUnique(OspOrder entity, String uniquePropertyNames) {
		return ospOrderService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspOrder entity){
		return ospOrderService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospOrderService.findByPageRequest(pr);
	}
	
	public OspOrder getByOrderid(java.lang.String v) {
		return ospOrderService.getByOrderid(v);
	}	

	public List<OspOrder> findAll() {
		return ospOrderService.findAll();
	}
	
	public void updateDynamic(OspOrder entity){
		ospOrderService.updateDynamic(entity);
	}
	
	public List<OspOrder> findByDynamicWhere(OspOrder entity){
		return ospOrderService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspOrder entity){
		ospOrderService.saveOrUpdate(entity);
	}
	
}
