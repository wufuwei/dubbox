/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.ITroleRightService;
import com.osp.biz.manager.ITroleRightManager;
import com.osp.biz.model.TroleRight;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class TroleRightService implements ITroleRightService{
	
	private ITroleRightManager troleRightManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setTroleRightManager(ITroleRightManager manager) {
		this.troleRightManager = manager;
	}

	public ITroleRightManager getEntityManager() {
		return this.troleRightManager;
	}
	
	public TroleRight getById(java.lang.Integer id) {
		return (TroleRight)troleRightManager.getById(id);
	}
	
	
	
	public void save(TroleRight entity) {
		troleRightManager.save(entity);
	}
	

	public void removeById(java.lang.Integer id) {
		troleRightManager.removeById(id);
	}
	
	public void update(TroleRight entity) {
		troleRightManager.update(entity);
	}
	
	public boolean isUnique(TroleRight entity, String uniquePropertyNames) {
		return troleRightManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(TroleRight entity){
		return troleRightManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return troleRightManager.findByPageRequest(pr);
	}
	

	public List<TroleRight> findAll() {
		return troleRightManager.findAll();
	}
	
	public void updateDynamic(TroleRight entity){
		troleRightManager.updateDynamic(entity);
	}
	
	public List<TroleRight> findByDynamicWhere(TroleRight entity){
		return troleRightManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(TroleRight entity){
		troleRightManager.saveOrUpdate(entity);
	}
	
}
