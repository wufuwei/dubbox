/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspPullcontentService;
import com.osp.biz.model.OspPullcontent;


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
public class OspPullcontentService {
	
	private IOspPullcontentService ospPullcontentService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspPullcontentService(IOspPullcontentService service) {
		this.ospPullcontentService = service;
	}

	public IOspPullcontentService getOspPullcontentService() {
		return this.ospPullcontentService;
	}
	
	public OspPullcontent getById(java.lang.Long id) {
		return (OspPullcontent)ospPullcontentService.getById(id);
	}
	
	
	
	
	public void save(OspPullcontent entity) {
		ospPullcontentService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospPullcontentService.removeById(id);
	}
	
	public void update(OspPullcontent entity) {
		ospPullcontentService.update(entity);
	}
	
	public boolean isUnique(OspPullcontent entity, String uniquePropertyNames) {
		return ospPullcontentService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspPullcontent entity){
		return ospPullcontentService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospPullcontentService.findByPageRequest(pr);
	}
	

	public List<OspPullcontent> findAll() {
		return ospPullcontentService.findAll();
	}
	
	public void updateDynamic(OspPullcontent entity){
		ospPullcontentService.updateDynamic(entity);
	}
	
	public List<OspPullcontent> findByDynamicWhere(OspPullcontent entity){
		return ospPullcontentService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspPullcontent entity){
		ospPullcontentService.saveOrUpdate(entity);
	}
	
}
