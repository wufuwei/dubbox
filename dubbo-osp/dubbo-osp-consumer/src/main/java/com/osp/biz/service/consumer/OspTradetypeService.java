/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspTradetypeService;
import com.osp.biz.model.OspTradetype;


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
public class OspTradetypeService {
	
	private IOspTradetypeService ospTradetypeService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspTradetypeService(IOspTradetypeService service) {
		this.ospTradetypeService = service;
	}

	public IOspTradetypeService getOspTradetypeService() {
		return this.ospTradetypeService;
	}
	
	public OspTradetype getById(java.lang.Long id) {
		return (OspTradetype)ospTradetypeService.getById(id);
	}
	
	
	
	
	public void save(OspTradetype entity) {
		ospTradetypeService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospTradetypeService.removeById(id);
	}
	
	public void update(OspTradetype entity) {
		ospTradetypeService.update(entity);
	}
	
	public boolean isUnique(OspTradetype entity, String uniquePropertyNames) {
		return ospTradetypeService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspTradetype entity){
		return ospTradetypeService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospTradetypeService.findByPageRequest(pr);
	}
	
	public OspTradetype getByTradetype(java.lang.String v) {
		return ospTradetypeService.getByTradetype(v);
	}	

	public List<OspTradetype> findAll() {
		return ospTradetypeService.findAll();
	}
	
	public void updateDynamic(OspTradetype entity){
		ospTradetypeService.updateDynamic(entity);
	}
	
	public List<OspTradetype> findByDynamicWhere(OspTradetype entity){
		return ospTradetypeService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspTradetype entity){
		ospTradetypeService.saveOrUpdate(entity);
	}
	
}
