/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspContentPublishService;
import com.osp.biz.model.OspContentPublish;


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
public class OspContentPublishService {
	
	private IOspContentPublishService ospContentPublishService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspContentPublishService(IOspContentPublishService service) {
		this.ospContentPublishService = service;
	}

	public IOspContentPublishService getOspContentPublishService() {
		return this.ospContentPublishService;
	}
	
	
	
	
	
	public void save(OspContentPublish entity) {
		ospContentPublishService.save(entity);
	}
	
	
	public void update(OspContentPublish entity) {
		ospContentPublishService.update(entity);
	}
	
	public boolean isUnique(OspContentPublish entity, String uniquePropertyNames) {
		return ospContentPublishService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspContentPublish entity){
		return ospContentPublishService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospContentPublishService.findByPageRequest(pr);
	}
	

	public List<OspContentPublish> findAll() {
		return ospContentPublishService.findAll();
	}
	
	public void updateDynamic(OspContentPublish entity){
		ospContentPublishService.updateDynamic(entity);
	}
	
	public List<OspContentPublish> findByDynamicWhere(OspContentPublish entity){
		return ospContentPublishService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspContentPublish entity){
		ospContentPublishService.saveOrUpdate(entity);
	}
	
}
