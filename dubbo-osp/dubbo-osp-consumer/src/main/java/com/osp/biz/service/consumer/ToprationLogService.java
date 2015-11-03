/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IToprationLogService;
import com.osp.biz.model.ToprationLog;


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
public class ToprationLogService {
	
	private IToprationLogService toprationLogService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setToprationLogService(IToprationLogService service) {
		this.toprationLogService = service;
	}

	public IToprationLogService getToprationLogService() {
		return this.toprationLogService;
	}
	
	public ToprationLog getById(java.lang.Integer id) {
		return (ToprationLog)toprationLogService.getById(id);
	}
	
	
	
	
	public void save(ToprationLog entity) {
		toprationLogService.save(entity);
	}
	
	public void removeById(java.lang.Integer id) {
		toprationLogService.removeById(id);
	}
	
	public void update(ToprationLog entity) {
		toprationLogService.update(entity);
	}
	
	public boolean isUnique(ToprationLog entity, String uniquePropertyNames) {
		return toprationLogService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(ToprationLog entity){
		return toprationLogService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return toprationLogService.findByPageRequest(pr);
	}
	

	public List<ToprationLog> findAll() {
		return toprationLogService.findAll();
	}
	
	public void updateDynamic(ToprationLog entity){
		toprationLogService.updateDynamic(entity);
	}
	
	public List<ToprationLog> findByDynamicWhere(ToprationLog entity){
		return toprationLogService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(ToprationLog entity){
		toprationLogService.saveOrUpdate(entity);
	}
	
}
