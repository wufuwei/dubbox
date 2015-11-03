/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspMemberactionlogService;
import com.osp.biz.manager.IOspMemberactionlogManager;
import com.osp.biz.model.OspMemberactionlog;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspMemberactionlogService implements IOspMemberactionlogService{
	
	private IOspMemberactionlogManager ospMemberactionlogManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspMemberactionlogManager(IOspMemberactionlogManager manager) {
		this.ospMemberactionlogManager = manager;
	}

	public IOspMemberactionlogManager getEntityManager() {
		return this.ospMemberactionlogManager;
	}
	
	public OspMemberactionlog getById(java.lang.Integer id) {
		return (OspMemberactionlog)ospMemberactionlogManager.getById(id);
	}
	
	
	
	public void save(OspMemberactionlog entity) {
		ospMemberactionlogManager.save(entity);
	}
	

	public void removeById(java.lang.Integer id) {
		ospMemberactionlogManager.removeById(id);
	}
	
	public void update(OspMemberactionlog entity) {
		ospMemberactionlogManager.update(entity);
	}
	
	public boolean isUnique(OspMemberactionlog entity, String uniquePropertyNames) {
		return ospMemberactionlogManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspMemberactionlog entity){
		return ospMemberactionlogManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospMemberactionlogManager.findByPageRequest(pr);
	}
	

	public List<OspMemberactionlog> findAll() {
		return ospMemberactionlogManager.findAll();
	}
	
	public void updateDynamic(OspMemberactionlog entity){
		ospMemberactionlogManager.updateDynamic(entity);
	}
	
	public List<OspMemberactionlog> findByDynamicWhere(OspMemberactionlog entity){
		return ospMemberactionlogManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspMemberactionlog entity){
		ospMemberactionlogManager.saveOrUpdate(entity);
	}
	
}
