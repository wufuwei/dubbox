/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;

import com.osp.biz.model.Tsequence;
import com.osp.biz.service.ITsequenceService;

/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class TsequenceService {
	
	private ITsequenceService tsequenceService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setTsequenceService(ITsequenceService service) {
		this.tsequenceService = service;
	}

	public ITsequenceService getTsequenceService() {
		return this.tsequenceService;
	}
	
	public Tsequence getById(java.lang.String id) {
		return (Tsequence)tsequenceService.getById(id);
	}
	
	
	
	
	public void save(Tsequence entity) {
		tsequenceService.save(entity);
	}
	
	public void removeById(java.lang.String id) {
		tsequenceService.removeById(id);
	}
	
	public void update(Tsequence entity) {
		tsequenceService.update(entity);
	}
	
	public boolean isUnique(Tsequence entity, String uniquePropertyNames) {
		return tsequenceService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(Tsequence entity){
		return tsequenceService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return tsequenceService.findByPageRequest(pr);
	}
	

	public List<Tsequence> findAll() {
		return tsequenceService.findAll();
	}
	
	public void updateDynamic(Tsequence entity){
		tsequenceService.updateDynamic(entity);
	}
	
	public List<Tsequence> findByDynamicWhere(Tsequence entity){
		return tsequenceService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(Tsequence entity){
		tsequenceService.saveOrUpdate(entity);
	}
	
}
