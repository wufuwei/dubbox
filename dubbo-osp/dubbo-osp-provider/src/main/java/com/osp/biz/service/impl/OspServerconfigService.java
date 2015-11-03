/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspServerconfigService;
import com.osp.biz.manager.IOspServerconfigManager;
import com.osp.biz.model.OspServerconfig;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspServerconfigService implements IOspServerconfigService{
	
	private IOspServerconfigManager ospServerconfigManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspServerconfigManager(IOspServerconfigManager manager) {
		this.ospServerconfigManager = manager;
	}

	public IOspServerconfigManager getEntityManager() {
		return this.ospServerconfigManager;
	}
	
	public OspServerconfig getById(java.lang.Long id) {
		return (OspServerconfig)ospServerconfigManager.getById(id);
	}
	
	
	
	public void save(OspServerconfig entity) {
		ospServerconfigManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospServerconfigManager.removeById(id);
	}
	
	public void update(OspServerconfig entity) {
		ospServerconfigManager.update(entity);
	}
	
	public boolean isUnique(OspServerconfig entity, String uniquePropertyNames) {
		return ospServerconfigManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspServerconfig entity){
		return ospServerconfigManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospServerconfigManager.findByPageRequest(pr);
	}
	
	public OspServerconfig getByInnercode(java.lang.String v) {
		return ospServerconfigManager.getByInnercode(v);
	}	

	public List<OspServerconfig> findAll() {
		return ospServerconfigManager.findAll();
	}
	
	public void updateDynamic(OspServerconfig entity){
		ospServerconfigManager.updateDynamic(entity);
	}
	
	public List<OspServerconfig> findByDynamicWhere(OspServerconfig entity){
		return ospServerconfigManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspServerconfig entity){
		ospServerconfigManager.saveOrUpdate(entity);
	}
	
}
