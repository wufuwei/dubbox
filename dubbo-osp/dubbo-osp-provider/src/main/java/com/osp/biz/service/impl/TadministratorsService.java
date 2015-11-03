/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.ITadministratorsService;
import com.osp.biz.manager.ITadministratorsManager;
import com.osp.biz.model.Tadministrators;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class TadministratorsService implements ITadministratorsService{
	
	private ITadministratorsManager tadministratorsManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setTadministratorsManager(ITadministratorsManager manager) {
		this.tadministratorsManager = manager;
	}

	public ITadministratorsManager getEntityManager() {
		return this.tadministratorsManager;
	}
	
	public Tadministrators getById(java.lang.Integer id) {
		return (Tadministrators)tadministratorsManager.getById(id);
	}
	
	
	
	public void save(Tadministrators entity) {
		tadministratorsManager.save(entity);
	}
	

	public void removeById(java.lang.Integer id) {
		tadministratorsManager.removeById(id);
	}
	
	public void update(Tadministrators entity) {
		tadministratorsManager.update(entity);
	}
	
	public boolean isUnique(Tadministrators entity, String uniquePropertyNames) {
		return tadministratorsManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(Tadministrators entity){
		return tadministratorsManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return tadministratorsManager.findByPageRequest(pr);
	}
	
	public Tadministrators getByLonginName(java.lang.String v) {
		return tadministratorsManager.getByLonginName(v);
	}	

	public List<Tadministrators> findAll() {
		return tadministratorsManager.findAll();
	}
	
	public void updateDynamic(Tadministrators entity){
		tadministratorsManager.updateDynamic(entity);
	}
	
	public List<Tadministrators> findByDynamicWhere(Tadministrators entity){
		return tadministratorsManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(Tadministrators entity){
		tadministratorsManager.saveOrUpdate(entity);
	}
	
}
