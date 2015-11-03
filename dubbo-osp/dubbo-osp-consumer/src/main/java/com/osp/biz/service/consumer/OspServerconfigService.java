/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspServerconfigService;
import com.osp.biz.model.OspServerconfig;


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
public class OspServerconfigService {
	
	private IOspServerconfigService ospServerconfigService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspServerconfigService(IOspServerconfigService service) {
		this.ospServerconfigService = service;
	}

	public IOspServerconfigService getOspServerconfigService() {
		return this.ospServerconfigService;
	}
	
	public OspServerconfig getById(java.lang.Long id) {
		return (OspServerconfig)ospServerconfigService.getById(id);
	}
	
	
	
	
	public void save(OspServerconfig entity) {
		ospServerconfigService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospServerconfigService.removeById(id);
	}
	
	public void update(OspServerconfig entity) {
		ospServerconfigService.update(entity);
	}
	
	public boolean isUnique(OspServerconfig entity, String uniquePropertyNames) {
		return ospServerconfigService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspServerconfig entity){
		return ospServerconfigService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospServerconfigService.findByPageRequest(pr);
	}
	
	public OspServerconfig getByInnercode(java.lang.String v) {
		return ospServerconfigService.getByInnercode(v);
	}	

	public List<OspServerconfig> findAll() {
		return ospServerconfigService.findAll();
	}
	
	public void updateDynamic(OspServerconfig entity){
		ospServerconfigService.updateDynamic(entity);
	}
	
	public List<OspServerconfig> findByDynamicWhere(OspServerconfig entity){
		return ospServerconfigService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspServerconfig entity){
		ospServerconfigService.saveOrUpdate(entity);
	}
	
}
