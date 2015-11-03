/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.ITadministratorsService;
import com.osp.biz.model.Tadministrators;


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
public class TadministratorsService {
	
	private ITadministratorsService tadministratorsService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setTadministratorsService(ITadministratorsService service) {
		this.tadministratorsService = service;
	}

	public ITadministratorsService getTadministratorsService() {
		return this.tadministratorsService;
	}
	
	public Tadministrators getById(java.lang.Integer id) {
		return (Tadministrators)tadministratorsService.getById(id);
	}
	
	
	
	
	public void save(Tadministrators entity) {
		tadministratorsService.save(entity);
	}
	
	public void removeById(java.lang.Integer id) {
		tadministratorsService.removeById(id);
	}
	
	public void update(Tadministrators entity) {
		tadministratorsService.update(entity);
	}
	
	public boolean isUnique(Tadministrators entity, String uniquePropertyNames) {
		return tadministratorsService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(Tadministrators entity){
		return tadministratorsService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return tadministratorsService.findByPageRequest(pr);
	}
	
	public Tadministrators getByLonginName(java.lang.String v) {
		return tadministratorsService.getByLonginName(v);
	}	

	public List<Tadministrators> findAll() {
		return tadministratorsService.findAll();
	}
	
	public void updateDynamic(Tadministrators entity){
		tadministratorsService.updateDynamic(entity);
	}
	
	public List<Tadministrators> findByDynamicWhere(Tadministrators entity){
		return tadministratorsService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(Tadministrators entity){
		tadministratorsService.saveOrUpdate(entity);
	}
	
}
