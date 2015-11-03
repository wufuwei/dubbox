/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.ITassginRoleService;
import com.osp.biz.manager.ITassginRoleManager;
import com.osp.biz.model.TassginRole;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class TassginRoleService implements ITassginRoleService{
	
	private ITassginRoleManager tassginRoleManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setTassginRoleManager(ITassginRoleManager manager) {
		this.tassginRoleManager = manager;
	}

	public ITassginRoleManager getEntityManager() {
		return this.tassginRoleManager;
	}
	
	public TassginRole getById(java.lang.Integer id) {
		return (TassginRole)tassginRoleManager.getById(id);
	}
	
	
	
	public void save(TassginRole entity) {
		tassginRoleManager.save(entity);
	}
	

	public void removeById(java.lang.Integer id) {
		tassginRoleManager.removeById(id);
	}
	
	public void update(TassginRole entity) {
		tassginRoleManager.update(entity);
	}
	
	public boolean isUnique(TassginRole entity, String uniquePropertyNames) {
		return tassginRoleManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(TassginRole entity){
		return tassginRoleManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return tassginRoleManager.findByPageRequest(pr);
	}
	

	public List<TassginRole> findAll() {
		return tassginRoleManager.findAll();
	}
	
	public void updateDynamic(TassginRole entity){
		tassginRoleManager.updateDynamic(entity);
	}
	
	public List<TassginRole> findByDynamicWhere(TassginRole entity){
		return tassginRoleManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(TassginRole entity){
		tassginRoleManager.saveOrUpdate(entity);
	}
	
}
