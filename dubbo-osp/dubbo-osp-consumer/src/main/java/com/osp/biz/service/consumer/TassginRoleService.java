/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.ITassginRoleService;
import com.osp.biz.model.TassginRole;


import java.util.*;

import javacommon.base.*;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;

/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class TassginRoleService {
	
	private ITassginRoleService tassginRoleService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setTassginRoleService(ITassginRoleService service) {
		this.tassginRoleService = service;
	}

	public ITassginRoleService getTassginRoleService() {
		return this.tassginRoleService;
	}
	
	public TassginRole getById(java.lang.Integer id) {
		return (TassginRole)tassginRoleService.getById(id);
	}
	
	
	
	
	public void save(TassginRole entity) {
		tassginRoleService.save(entity);
	}
	
	public void removeById(java.lang.Integer id) {
		tassginRoleService.removeById(id);
	}
	
	public void update(TassginRole entity) {
		tassginRoleService.update(entity);
	}
	
	public boolean isUnique(TassginRole entity, String uniquePropertyNames) {
		return tassginRoleService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(TassginRole entity){
		return tassginRoleService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return tassginRoleService.findByPageRequest(pr);
	}
	

	public List<TassginRole> findAll() {
		return tassginRoleService.findAll();
	}
	
	public void updateDynamic(TassginRole entity){
		tassginRoleService.updateDynamic(entity);
	}
	
	public List<TassginRole> findByDynamicWhere(TassginRole entity){
		return tassginRoleService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(TassginRole entity){
		tassginRoleService.saveOrUpdate(entity);
	}
	
}
