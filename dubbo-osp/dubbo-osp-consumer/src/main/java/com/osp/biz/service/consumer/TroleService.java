/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.ITroleService;
import com.osp.biz.model.Trole;


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
public class TroleService {
	
	private ITroleService troleService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setTroleService(ITroleService service) {
		this.troleService = service;
	}

	public ITroleService getTroleService() {
		return this.troleService;
	}
	
	public Trole getById(java.lang.Integer id) {
		return (Trole)troleService.getById(id);
	}
	
	
	
	
	public void save(Trole entity) {
		troleService.save(entity);
	}
	
	public void removeById(java.lang.Integer id) {
		troleService.removeById(id);
	}
	
	public void update(Trole entity) {
		troleService.update(entity);
	}
	
	public boolean isUnique(Trole entity, String uniquePropertyNames) {
		return troleService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(Trole entity){
		return troleService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return troleService.findByPageRequest(pr);
	}
	

	public List<Trole> findAll() {
		return troleService.findAll();
	}
	
	public void updateDynamic(Trole entity){
		troleService.updateDynamic(entity);
	}
	
	public List<Trole> findByDynamicWhere(Trole entity){
		return troleService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(Trole entity){
		troleService.saveOrUpdate(entity);
	}
	
}
