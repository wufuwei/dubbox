/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspErrorcodeService;
import com.osp.biz.manager.IOspErrorcodeManager;
import com.osp.biz.model.OspErrorcode;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspErrorcodeService implements IOspErrorcodeService{
	
	private IOspErrorcodeManager ospErrorcodeManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspErrorcodeManager(IOspErrorcodeManager manager) {
		this.ospErrorcodeManager = manager;
	}

	public IOspErrorcodeManager getEntityManager() {
		return this.ospErrorcodeManager;
	}
	
	public OspErrorcode getById(java.lang.Long id) {
		return (OspErrorcode)ospErrorcodeManager.getById(id);
	}
	
	
	
	public void save(OspErrorcode entity) {
		ospErrorcodeManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospErrorcodeManager.removeById(id);
	}
	
	public void update(OspErrorcode entity) {
		ospErrorcodeManager.update(entity);
	}
	
	public boolean isUnique(OspErrorcode entity, String uniquePropertyNames) {
		return ospErrorcodeManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspErrorcode entity){
		return ospErrorcodeManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospErrorcodeManager.findByPageRequest(pr);
	}
	
	public OspErrorcode getByErrorcode(java.lang.Integer v) {
		return ospErrorcodeManager.getByErrorcode(v);
	}	

	public List<OspErrorcode> findAll() {
		return ospErrorcodeManager.findAll();
	}
	
	public void updateDynamic(OspErrorcode entity){
		ospErrorcodeManager.updateDynamic(entity);
	}
	
	public List<OspErrorcode> findByDynamicWhere(OspErrorcode entity){
		return ospErrorcodeManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspErrorcode entity){
		ospErrorcodeManager.saveOrUpdate(entity);
	}
	
}
