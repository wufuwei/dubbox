/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspTraderesultService;
import com.osp.biz.manager.IOspTraderesultManager;
import com.osp.biz.model.OspTraderesult;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspTraderesultService implements IOspTraderesultService{
	
	private IOspTraderesultManager ospTraderesultManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspTraderesultManager(IOspTraderesultManager manager) {
		this.ospTraderesultManager = manager;
	}

	public IOspTraderesultManager getEntityManager() {
		return this.ospTraderesultManager;
	}
	
	public OspTraderesult getById(java.lang.Integer id) {
		return (OspTraderesult)ospTraderesultManager.getById(id);
	}
	
	
	
	public void save(OspTraderesult entity) {
		ospTraderesultManager.save(entity);
	}
	

	public void removeById(java.lang.Integer id) {
		ospTraderesultManager.removeById(id);
	}
	
	public void update(OspTraderesult entity) {
		ospTraderesultManager.update(entity);
	}
	
	public boolean isUnique(OspTraderesult entity, String uniquePropertyNames) {
		return ospTraderesultManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspTraderesult entity){
		return ospTraderesultManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospTraderesultManager.findByPageRequest(pr);
	}
	

	public List<OspTraderesult> findAll() {
		return ospTraderesultManager.findAll();
	}
	
	public void updateDynamic(OspTraderesult entity){
		ospTraderesultManager.updateDynamic(entity);
	}
	
	public List<OspTraderesult> findByDynamicWhere(OspTraderesult entity){
		return ospTraderesultManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspTraderesult entity){
		ospTraderesultManager.saveOrUpdate(entity);
	}
	
}
