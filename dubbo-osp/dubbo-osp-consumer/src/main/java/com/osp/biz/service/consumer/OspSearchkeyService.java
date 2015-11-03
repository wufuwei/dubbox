/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspSearchkeyService;
import com.osp.biz.model.OspSearchkey;


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
public class OspSearchkeyService {
	
	private IOspSearchkeyService ospSearchkeyService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspSearchkeyService(IOspSearchkeyService service) {
		this.ospSearchkeyService = service;
	}

	public IOspSearchkeyService getOspSearchkeyService() {
		return this.ospSearchkeyService;
	}
	
	public OspSearchkey getById(java.lang.Long id) {
		return (OspSearchkey)ospSearchkeyService.getById(id);
	}
	
	
	
	
	public void save(OspSearchkey entity) {
		ospSearchkeyService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospSearchkeyService.removeById(id);
	}
	
	public void update(OspSearchkey entity) {
		ospSearchkeyService.update(entity);
	}
	
	public boolean isUnique(OspSearchkey entity, String uniquePropertyNames) {
		return ospSearchkeyService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspSearchkey entity){
		return ospSearchkeyService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospSearchkeyService.findByPageRequest(pr);
	}
	
	public OspSearchkey getBySearchkey(java.lang.String v) {
		return ospSearchkeyService.getBySearchkey(v);
	}	

	public List<OspSearchkey> findAll() {
		return ospSearchkeyService.findAll();
	}
	
	public void updateDynamic(OspSearchkey entity){
		ospSearchkeyService.updateDynamic(entity);
	}
	
	public List<OspSearchkey> findByDynamicWhere(OspSearchkey entity){
		return ospSearchkeyService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspSearchkey entity){
		ospSearchkeyService.saveOrUpdate(entity);
	}
	
}
