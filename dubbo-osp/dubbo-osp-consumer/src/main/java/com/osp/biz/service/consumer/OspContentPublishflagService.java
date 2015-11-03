/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspContentPublishflagService;
import com.osp.biz.model.OspContentPublishflag;


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
public class OspContentPublishflagService {
	
	private IOspContentPublishflagService ospContentPublishflagService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspContentPublishflagService(IOspContentPublishflagService service) {
		this.ospContentPublishflagService = service;
	}

	public IOspContentPublishflagService getOspContentPublishflagService() {
		return this.ospContentPublishflagService;
	}
	
	
	
	
	
	public void save(OspContentPublishflag entity) {
		ospContentPublishflagService.save(entity);
	}
	
	
	public void update(OspContentPublishflag entity) {
		ospContentPublishflagService.update(entity);
	}
	
	public boolean isUnique(OspContentPublishflag entity, String uniquePropertyNames) {
		return ospContentPublishflagService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspContentPublishflag entity){
		return ospContentPublishflagService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospContentPublishflagService.findByPageRequest(pr);
	}
	

	public List<OspContentPublishflag> findAll() {
		return ospContentPublishflagService.findAll();
	}
	
	public void updateDynamic(OspContentPublishflag entity){
		ospContentPublishflagService.updateDynamic(entity);
	}
	
	public List<OspContentPublishflag> findByDynamicWhere(OspContentPublishflag entity){
		return ospContentPublishflagService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspContentPublishflag entity){
		ospContentPublishflagService.saveOrUpdate(entity);
	}
	
}
