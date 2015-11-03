/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.ITroleService;
import com.osp.biz.manager.ITroleManager;
import com.osp.biz.model.Trole;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class TroleService implements ITroleService{
	
	private ITroleManager troleManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setTroleManager(ITroleManager manager) {
		this.troleManager = manager;
	}

	public ITroleManager getEntityManager() {
		return this.troleManager;
	}
	
	public Trole getById(java.lang.Integer id) {
		return (Trole)troleManager.getById(id);
	}
	
	
	
	public void save(Trole entity) {
		troleManager.save(entity);
	}
	

	public void removeById(java.lang.Integer id) {
		troleManager.removeById(id);
	}
	
	public void update(Trole entity) {
		troleManager.update(entity);
	}
	
	public boolean isUnique(Trole entity, String uniquePropertyNames) {
		return troleManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(Trole entity){
		return troleManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return troleManager.findByPageRequest(pr);
	}
	

	public List<Trole> findAll() {
		return troleManager.findAll();
	}
	
	public void updateDynamic(Trole entity){
		troleManager.updateDynamic(entity);
	}
	
	public List<Trole> findByDynamicWhere(Trole entity){
		return troleManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(Trole entity){
		troleManager.saveOrUpdate(entity);
	}
	
}
