/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspPullcontentlogService;
import com.osp.biz.manager.IOspPullcontentlogManager;
import com.osp.biz.model.OspPullcontentlog;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspPullcontentlogService implements IOspPullcontentlogService{
	
	private IOspPullcontentlogManager ospPullcontentlogManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspPullcontentlogManager(IOspPullcontentlogManager manager) {
		this.ospPullcontentlogManager = manager;
	}

	public IOspPullcontentlogManager getEntityManager() {
		return this.ospPullcontentlogManager;
	}
	
	public OspPullcontentlog getById(java.lang.Long id) {
		return (OspPullcontentlog)ospPullcontentlogManager.getById(id);
	}
	
	
	
	public void save(OspPullcontentlog entity) {
		ospPullcontentlogManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospPullcontentlogManager.removeById(id);
	}
	
	public void update(OspPullcontentlog entity) {
		ospPullcontentlogManager.update(entity);
	}
	
	public boolean isUnique(OspPullcontentlog entity, String uniquePropertyNames) {
		return ospPullcontentlogManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspPullcontentlog entity){
		return ospPullcontentlogManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospPullcontentlogManager.findByPageRequest(pr);
	}
	

	public List<OspPullcontentlog> findAll() {
		return ospPullcontentlogManager.findAll();
	}
	
	public void updateDynamic(OspPullcontentlog entity){
		ospPullcontentlogManager.updateDynamic(entity);
	}
	
	public List<OspPullcontentlog> findByDynamicWhere(OspPullcontentlog entity){
		return ospPullcontentlogManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspPullcontentlog entity){
		ospPullcontentlogManager.saveOrUpdate(entity);
	}
	
}
