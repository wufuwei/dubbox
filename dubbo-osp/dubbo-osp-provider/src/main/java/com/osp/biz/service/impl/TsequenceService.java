/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.ITsequenceService;
import com.osp.biz.manager.ITsequenceManager;
import com.osp.biz.model.Tsequence;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class TsequenceService implements ITsequenceService{
	
	private ITsequenceManager tsequenceManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setTsequenceManager(ITsequenceManager manager) {
		this.tsequenceManager = manager;
	}

	public ITsequenceManager getEntityManager() {
		return this.tsequenceManager;
	}
	
	public Tsequence getById(java.lang.String id) {
		return (Tsequence)tsequenceManager.getById(id);
	}
	
	
	
	public void save(Tsequence entity) {
		tsequenceManager.save(entity);
	}
	

	public void removeById(java.lang.String id) {
		tsequenceManager.removeById(id);
	}
	
	public void update(Tsequence entity) {
		tsequenceManager.update(entity);
	}
	
	public boolean isUnique(Tsequence entity, String uniquePropertyNames) {
		return tsequenceManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(Tsequence entity){
		return tsequenceManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return tsequenceManager.findByPageRequest(pr);
	}
	

	public List<Tsequence> findAll() {
		return tsequenceManager.findAll();
	}
	
	public void updateDynamic(Tsequence entity){
		tsequenceManager.updateDynamic(entity);
	}
	
	public List<Tsequence> findByDynamicWhere(Tsequence entity){
		return tsequenceManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(Tsequence entity){
		tsequenceManager.saveOrUpdate(entity);
	}
	
}
