/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspContentPublishflagService;
import com.osp.biz.manager.IOspContentPublishflagManager;
import com.osp.biz.model.OspContentPublishflag;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspContentPublishflagService implements IOspContentPublishflagService{
	
	private IOspContentPublishflagManager ospContentPublishflagManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspContentPublishflagManager(IOspContentPublishflagManager manager) {
		this.ospContentPublishflagManager = manager;
	}

	public IOspContentPublishflagManager getEntityManager() {
		return this.ospContentPublishflagManager;
	}
	
	
	
	
	public void save(OspContentPublishflag entity) {
		ospContentPublishflagManager.save(entity);
	}
	
	
	public void update(OspContentPublishflag entity) {
		ospContentPublishflagManager.update(entity);
	}
	
	public boolean isUnique(OspContentPublishflag entity, String uniquePropertyNames) {
		return ospContentPublishflagManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspContentPublishflag entity){
		return ospContentPublishflagManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospContentPublishflagManager.findByPageRequest(pr);
	}
	

	public List<OspContentPublishflag> findAll() {
		return ospContentPublishflagManager.findAll();
	}
	
	public void updateDynamic(OspContentPublishflag entity){
		ospContentPublishflagManager.updateDynamic(entity);
	}
	
	public List<OspContentPublishflag> findByDynamicWhere(OspContentPublishflag entity){
		return ospContentPublishflagManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspContentPublishflag entity){
		ospContentPublishflagManager.saveOrUpdate(entity);
	}
	
}
