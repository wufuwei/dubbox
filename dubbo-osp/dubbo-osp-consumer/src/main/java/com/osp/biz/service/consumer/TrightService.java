/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.ITrightService;
import com.osp.biz.model.Tright;


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
public class TrightService {
	
	private ITrightService trightService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setTrightService(ITrightService service) {
		this.trightService = service;
	}

	public ITrightService getTrightService() {
		return this.trightService;
	}
	
	public Tright getById(java.lang.Integer id) {
		return (Tright)trightService.getById(id);
	}
	
	
	
	
	public void save(Tright entity) {
		trightService.save(entity);
	}
	
	public void removeById(java.lang.Integer id) {
		trightService.removeById(id);
	}
	
	public void update(Tright entity) {
		trightService.update(entity);
	}
	
	public boolean isUnique(Tright entity, String uniquePropertyNames) {
		return trightService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(Tright entity){
		return trightService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return trightService.findByPageRequest(pr);
	}
	

	public List<Tright> findAll() {
		return trightService.findAll();
	}
	
	public void updateDynamic(Tright entity){
		trightService.updateDynamic(entity);
	}
	
	public List<Tright> findByDynamicWhere(Tright entity){
		return trightService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(Tright entity){
		trightService.saveOrUpdate(entity);
	}
	
}
