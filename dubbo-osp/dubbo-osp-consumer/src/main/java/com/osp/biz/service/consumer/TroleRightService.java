/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.ITroleRightService;
import com.osp.biz.model.TroleRight;


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
public class TroleRightService {
	
	private ITroleRightService troleRightService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setTroleRightService(ITroleRightService service) {
		this.troleRightService = service;
	}

	public ITroleRightService getTroleRightService() {
		return this.troleRightService;
	}
	
	public TroleRight getById(java.lang.Integer id) {
		return (TroleRight)troleRightService.getById(id);
	}
	
	
	
	
	public void save(TroleRight entity) {
		troleRightService.save(entity);
	}
	
	public void removeById(java.lang.Integer id) {
		troleRightService.removeById(id);
	}
	
	public void update(TroleRight entity) {
		troleRightService.update(entity);
	}
	
	public boolean isUnique(TroleRight entity, String uniquePropertyNames) {
		return troleRightService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(TroleRight entity){
		return troleRightService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return troleRightService.findByPageRequest(pr);
	}
	

	public List<TroleRight> findAll() {
		return troleRightService.findAll();
	}
	
	public void updateDynamic(TroleRight entity){
		troleRightService.updateDynamic(entity);
	}
	
	public List<TroleRight> findByDynamicWhere(TroleRight entity){
		return troleRightService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(TroleRight entity){
		troleRightService.saveOrUpdate(entity);
	}
	
}
