/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspOrderitemService;
import com.osp.biz.manager.IOspOrderitemManager;
import com.osp.biz.model.OspOrderitem;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspOrderitemService implements IOspOrderitemService{
	
	private IOspOrderitemManager ospOrderitemManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspOrderitemManager(IOspOrderitemManager manager) {
		this.ospOrderitemManager = manager;
	}

	public IOspOrderitemManager getEntityManager() {
		return this.ospOrderitemManager;
	}
	
	public OspOrderitem getById(java.lang.Long id) {
		return (OspOrderitem)ospOrderitemManager.getById(id);
	}
	
	
	
	public void save(OspOrderitem entity) {
		ospOrderitemManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospOrderitemManager.removeById(id);
	}
	
	public void update(OspOrderitem entity) {
		ospOrderitemManager.update(entity);
	}
	
	public boolean isUnique(OspOrderitem entity, String uniquePropertyNames) {
		return ospOrderitemManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspOrderitem entity){
		return ospOrderitemManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospOrderitemManager.findByPageRequest(pr);
	}
	

	public List<OspOrderitem> findAll() {
		return ospOrderitemManager.findAll();
	}
	
	public void updateDynamic(OspOrderitem entity){
		ospOrderitemManager.updateDynamic(entity);
	}
	
	public List<OspOrderitem> findByDynamicWhere(OspOrderitem entity){
		return ospOrderitemManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspOrderitem entity){
		ospOrderitemManager.saveOrUpdate(entity);
	}
	
}
