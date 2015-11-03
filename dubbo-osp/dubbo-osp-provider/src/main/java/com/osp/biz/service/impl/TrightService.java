/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.ITrightService;
import com.osp.biz.manager.ITrightManager;
import com.osp.biz.model.Tright;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class TrightService implements ITrightService{
	
	private ITrightManager trightManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setTrightManager(ITrightManager manager) {
		this.trightManager = manager;
	}

	public ITrightManager getEntityManager() {
		return this.trightManager;
	}
	
	public Tright getById(java.lang.Integer id) {
		return (Tright)trightManager.getById(id);
	}
	
	
	
	public void save(Tright entity) {
		trightManager.save(entity);
	}
	

	public void removeById(java.lang.Integer id) {
		trightManager.removeById(id);
	}
	
	public void update(Tright entity) {
		trightManager.update(entity);
	}
	
	public boolean isUnique(Tright entity, String uniquePropertyNames) {
		return trightManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(Tright entity){
		return trightManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return trightManager.findByPageRequest(pr);
	}
	

	public List<Tright> findAll() {
		return trightManager.findAll();
	}
	
	public void updateDynamic(Tright entity){
		trightManager.updateDynamic(entity);
	}
	
	public List<Tright> findByDynamicWhere(Tright entity){
		return trightManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(Tright entity){
		trightManager.saveOrUpdate(entity);
	}
	
}
