/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspDebitcreditService;
import com.osp.biz.manager.IOspDebitcreditManager;
import com.osp.biz.model.OspDebitcredit;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspDebitcreditService implements IOspDebitcreditService{
	
	private IOspDebitcreditManager ospDebitcreditManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspDebitcreditManager(IOspDebitcreditManager manager) {
		this.ospDebitcreditManager = manager;
	}

	public IOspDebitcreditManager getEntityManager() {
		return this.ospDebitcreditManager;
	}
	
	public OspDebitcredit getById(java.lang.Long id) {
		return (OspDebitcredit)ospDebitcreditManager.getById(id);
	}
	
	
	
	public void save(OspDebitcredit entity) {
		ospDebitcreditManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospDebitcreditManager.removeById(id);
	}
	
	public void update(OspDebitcredit entity) {
		ospDebitcreditManager.update(entity);
	}
	
	public boolean isUnique(OspDebitcredit entity, String uniquePropertyNames) {
		return ospDebitcreditManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspDebitcredit entity){
		return ospDebitcreditManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospDebitcreditManager.findByPageRequest(pr);
	}
	
	public OspDebitcredit getByTradeid(java.lang.String v) {
		return ospDebitcreditManager.getByTradeid(v);
	}	

	public List<OspDebitcredit> findAll() {
		return ospDebitcreditManager.findAll();
	}
	
	public void updateDynamic(OspDebitcredit entity){
		ospDebitcreditManager.updateDynamic(entity);
	}
	
	public List<OspDebitcredit> findByDynamicWhere(OspDebitcredit entity){
		return ospDebitcreditManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspDebitcredit entity){
		ospDebitcreditManager.saveOrUpdate(entity);
	}
	
}
