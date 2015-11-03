/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspPullcontentlogService;
import com.osp.biz.model.OspPullcontentlog;


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
public class OspPullcontentlogService {
	
	private IOspPullcontentlogService ospPullcontentlogService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspPullcontentlogService(IOspPullcontentlogService service) {
		this.ospPullcontentlogService = service;
	}

	public IOspPullcontentlogService getOspPullcontentlogService() {
		return this.ospPullcontentlogService;
	}
	
	public OspPullcontentlog getById(java.lang.Long id) {
		return (OspPullcontentlog)ospPullcontentlogService.getById(id);
	}
	
	
	
	
	public void save(OspPullcontentlog entity) {
		ospPullcontentlogService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospPullcontentlogService.removeById(id);
	}
	
	public void update(OspPullcontentlog entity) {
		ospPullcontentlogService.update(entity);
	}
	
	public boolean isUnique(OspPullcontentlog entity, String uniquePropertyNames) {
		return ospPullcontentlogService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspPullcontentlog entity){
		return ospPullcontentlogService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospPullcontentlogService.findByPageRequest(pr);
	}
	

	public List<OspPullcontentlog> findAll() {
		return ospPullcontentlogService.findAll();
	}
	
	public void updateDynamic(OspPullcontentlog entity){
		ospPullcontentlogService.updateDynamic(entity);
	}
	
	public List<OspPullcontentlog> findByDynamicWhere(OspPullcontentlog entity){
		return ospPullcontentlogService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspPullcontentlog entity){
		ospPullcontentlogService.saveOrUpdate(entity);
	}
	
}
