/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspContentPublishService;
import com.osp.biz.manager.IOspContentPublishManager;
import com.osp.biz.model.OspContentPublish;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspContentPublishService implements IOspContentPublishService{
	
	private IOspContentPublishManager ospContentPublishManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspContentPublishManager(IOspContentPublishManager manager) {
		this.ospContentPublishManager = manager;
	}

	public IOspContentPublishManager getEntityManager() {
		return this.ospContentPublishManager;
	}
	
	
	
	
	public void save(OspContentPublish entity) {
		ospContentPublishManager.save(entity);
	}
	
	
	public void update(OspContentPublish entity) {
		ospContentPublishManager.update(entity);
	}
	
	public boolean isUnique(OspContentPublish entity, String uniquePropertyNames) {
		return ospContentPublishManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspContentPublish entity){
		return ospContentPublishManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospContentPublishManager.findByPageRequest(pr);
	}
	

	public List<OspContentPublish> findAll() {
		return ospContentPublishManager.findAll();
	}
	
	public void updateDynamic(OspContentPublish entity){
		ospContentPublishManager.updateDynamic(entity);
	}
	
	public List<OspContentPublish> findByDynamicWhere(OspContentPublish entity){
		return ospContentPublishManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspContentPublish entity){
		ospContentPublishManager.saveOrUpdate(entity);
	}
	
}
