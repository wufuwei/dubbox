/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspPullcontentService;
import com.osp.biz.manager.IOspPullcontentManager;
import com.osp.biz.model.OspPullcontent;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspPullcontentService implements IOspPullcontentService{
	
	private IOspPullcontentManager ospPullcontentManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspPullcontentManager(IOspPullcontentManager manager) {
		this.ospPullcontentManager = manager;
	}

	public IOspPullcontentManager getEntityManager() {
		return this.ospPullcontentManager;
	}
	
	public OspPullcontent getById(java.lang.Long id) {
		return (OspPullcontent)ospPullcontentManager.getById(id);
	}
	
	
	
	public void save(OspPullcontent entity) {
		ospPullcontentManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospPullcontentManager.removeById(id);
	}
	
	public void update(OspPullcontent entity) {
		ospPullcontentManager.update(entity);
	}
	
	public boolean isUnique(OspPullcontent entity, String uniquePropertyNames) {
		return ospPullcontentManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspPullcontent entity){
		return ospPullcontentManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospPullcontentManager.findByPageRequest(pr);
	}
	

	public List<OspPullcontent> findAll() {
		return ospPullcontentManager.findAll();
	}
	
	public void updateDynamic(OspPullcontent entity){
		ospPullcontentManager.updateDynamic(entity);
	}
	
	public List<OspPullcontent> findByDynamicWhere(OspPullcontent entity){
		return ospPullcontentManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspPullcontent entity){
		ospPullcontentManager.saveOrUpdate(entity);
	}
	
}
