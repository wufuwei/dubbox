/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspPullcontenttoService;
import com.osp.biz.manager.IOspPullcontenttoManager;
import com.osp.biz.model.OspPullcontentto;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspPullcontenttoService implements IOspPullcontenttoService{
	
	private IOspPullcontenttoManager ospPullcontenttoManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspPullcontenttoManager(IOspPullcontenttoManager manager) {
		this.ospPullcontenttoManager = manager;
	}

	public IOspPullcontenttoManager getEntityManager() {
		return this.ospPullcontenttoManager;
	}
	
	public OspPullcontentto getById(java.lang.Long id) {
		return (OspPullcontentto)ospPullcontenttoManager.getById(id);
	}
	
	
	
	public void save(OspPullcontentto entity) {
		ospPullcontenttoManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospPullcontenttoManager.removeById(id);
	}
	
	public void update(OspPullcontentto entity) {
		ospPullcontenttoManager.update(entity);
	}
	
	public boolean isUnique(OspPullcontentto entity, String uniquePropertyNames) {
		return ospPullcontenttoManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspPullcontentto entity){
		return ospPullcontenttoManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospPullcontenttoManager.findByPageRequest(pr);
	}
	

	public List<OspPullcontentto> findAll() {
		return ospPullcontenttoManager.findAll();
	}
	
	public void updateDynamic(OspPullcontentto entity){
		ospPullcontenttoManager.updateDynamic(entity);
	}
	
	public List<OspPullcontentto> findByDynamicWhere(OspPullcontentto entity){
		return ospPullcontenttoManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspPullcontentto entity){
		ospPullcontenttoManager.saveOrUpdate(entity);
	}
	
}
