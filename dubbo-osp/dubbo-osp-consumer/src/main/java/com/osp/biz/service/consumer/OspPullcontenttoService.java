/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspPullcontenttoService;
import com.osp.biz.model.OspPullcontentto;


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
public class OspPullcontenttoService {
	
	private IOspPullcontenttoService ospPullcontenttoService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspPullcontenttoService(IOspPullcontenttoService service) {
		this.ospPullcontenttoService = service;
	}

	public IOspPullcontenttoService getOspPullcontenttoService() {
		return this.ospPullcontenttoService;
	}
	
	public OspPullcontentto getById(java.lang.Long id) {
		return (OspPullcontentto)ospPullcontenttoService.getById(id);
	}
	
	
	
	
	public void save(OspPullcontentto entity) {
		ospPullcontenttoService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospPullcontenttoService.removeById(id);
	}
	
	public void update(OspPullcontentto entity) {
		ospPullcontenttoService.update(entity);
	}
	
	public boolean isUnique(OspPullcontentto entity, String uniquePropertyNames) {
		return ospPullcontenttoService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspPullcontentto entity){
		return ospPullcontenttoService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospPullcontenttoService.findByPageRequest(pr);
	}
	

	public List<OspPullcontentto> findAll() {
		return ospPullcontenttoService.findAll();
	}
	
	public void updateDynamic(OspPullcontentto entity){
		ospPullcontenttoService.updateDynamic(entity);
	}
	
	public List<OspPullcontentto> findByDynamicWhere(OspPullcontentto entity){
		return ospPullcontenttoService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspPullcontentto entity){
		ospPullcontenttoService.saveOrUpdate(entity);
	}
	
}
