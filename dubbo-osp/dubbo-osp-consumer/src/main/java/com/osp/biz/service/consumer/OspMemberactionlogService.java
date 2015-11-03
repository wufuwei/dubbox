/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspMemberactionlogService;
import com.osp.biz.model.OspMemberactionlog;


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
public class OspMemberactionlogService {
	
	private IOspMemberactionlogService ospMemberactionlogService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspMemberactionlogService(IOspMemberactionlogService service) {
		this.ospMemberactionlogService = service;
	}

	public IOspMemberactionlogService getOspMemberactionlogService() {
		return this.ospMemberactionlogService;
	}
	
	public OspMemberactionlog getById(java.lang.Integer id) {
		return (OspMemberactionlog)ospMemberactionlogService.getById(id);
	}
	
	
	
	
	public void save(OspMemberactionlog entity) {
		ospMemberactionlogService.save(entity);
	}
	
	public void removeById(java.lang.Integer id) {
		ospMemberactionlogService.removeById(id);
	}
	
	public void update(OspMemberactionlog entity) {
		ospMemberactionlogService.update(entity);
	}
	
	public boolean isUnique(OspMemberactionlog entity, String uniquePropertyNames) {
		return ospMemberactionlogService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspMemberactionlog entity){
		return ospMemberactionlogService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospMemberactionlogService.findByPageRequest(pr);
	}
	

	public List<OspMemberactionlog> findAll() {
		return ospMemberactionlogService.findAll();
	}
	
	public void updateDynamic(OspMemberactionlog entity){
		ospMemberactionlogService.updateDynamic(entity);
	}
	
	public List<OspMemberactionlog> findByDynamicWhere(OspMemberactionlog entity){
		return ospMemberactionlogService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspMemberactionlog entity){
		ospMemberactionlogService.saveOrUpdate(entity);
	}
	
}
