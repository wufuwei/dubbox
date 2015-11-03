/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IToprationLogService;
import com.osp.biz.manager.IToprationLogManager;
import com.osp.biz.model.ToprationLog;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class ToprationLogService implements IToprationLogService{
	
	private IToprationLogManager toprationLogManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setToprationLogManager(IToprationLogManager manager) {
		this.toprationLogManager = manager;
	}

	public IToprationLogManager getEntityManager() {
		return this.toprationLogManager;
	}
	
	public ToprationLog getById(java.lang.Integer id) {
		return (ToprationLog)toprationLogManager.getById(id);
	}
	
	
	
	public void save(ToprationLog entity) {
		toprationLogManager.save(entity);
	}
	

	public void removeById(java.lang.Integer id) {
		toprationLogManager.removeById(id);
	}
	
	public void update(ToprationLog entity) {
		toprationLogManager.update(entity);
	}
	
	public boolean isUnique(ToprationLog entity, String uniquePropertyNames) {
		return toprationLogManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(ToprationLog entity){
		return toprationLogManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return toprationLogManager.findByPageRequest(pr);
	}
	

	public List<ToprationLog> findAll() {
		return toprationLogManager.findAll();
	}
	
	public void updateDynamic(ToprationLog entity){
		toprationLogManager.updateDynamic(entity);
	}
	
	public List<ToprationLog> findByDynamicWhere(ToprationLog entity){
		return toprationLogManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(ToprationLog entity){
		toprationLogManager.saveOrUpdate(entity);
	}
	
}
