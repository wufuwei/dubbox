/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspContentStatService;
import com.osp.biz.manager.IOspContentStatManager;
import com.osp.biz.model.OspContentStat;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspContentStatService implements IOspContentStatService{
	
	private IOspContentStatManager ospContentStatManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspContentStatManager(IOspContentStatManager manager) {
		this.ospContentStatManager = manager;
	}

	public IOspContentStatManager getEntityManager() {
		return this.ospContentStatManager;
	}
	
	
	
	
	public void save(OspContentStat entity) {
		ospContentStatManager.save(entity);
	}
	
	
	public void update(OspContentStat entity) {
		ospContentStatManager.update(entity);
	}
	
	public boolean isUnique(OspContentStat entity, String uniquePropertyNames) {
		return ospContentStatManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspContentStat entity){
		return ospContentStatManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospContentStatManager.findByPageRequest(pr);
	}
	

	public List<OspContentStat> findAll() {
		return ospContentStatManager.findAll();
	}
	
	public void updateDynamic(OspContentStat entity){
		ospContentStatManager.updateDynamic(entity);
	}
	
	public List<OspContentStat> findByDynamicWhere(OspContentStat entity){
		return ospContentStatManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspContentStat entity){
		ospContentStatManager.saveOrUpdate(entity);
	}
	
}
