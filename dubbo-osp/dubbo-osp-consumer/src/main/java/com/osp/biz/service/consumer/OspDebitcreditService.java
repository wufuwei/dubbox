/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspDebitcreditService;
import com.osp.biz.model.OspDebitcredit;


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
public class OspDebitcreditService {
	
	private IOspDebitcreditService ospDebitcreditService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspDebitcreditService(IOspDebitcreditService service) {
		this.ospDebitcreditService = service;
	}

	public IOspDebitcreditService getOspDebitcreditService() {
		return this.ospDebitcreditService;
	}
	
	public OspDebitcredit getById(java.lang.Long id) {
		return (OspDebitcredit)ospDebitcreditService.getById(id);
	}
	
	
	
	
	public void save(OspDebitcredit entity) {
		ospDebitcreditService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospDebitcreditService.removeById(id);
	}
	
	public void update(OspDebitcredit entity) {
		ospDebitcreditService.update(entity);
	}
	
	public boolean isUnique(OspDebitcredit entity, String uniquePropertyNames) {
		return ospDebitcreditService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspDebitcredit entity){
		return ospDebitcreditService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospDebitcreditService.findByPageRequest(pr);
	}
	
	public OspDebitcredit getByTradeid(java.lang.String v) {
		return ospDebitcreditService.getByTradeid(v);
	}	

	public List<OspDebitcredit> findAll() {
		return ospDebitcreditService.findAll();
	}
	
	public void updateDynamic(OspDebitcredit entity){
		ospDebitcreditService.updateDynamic(entity);
	}
	
	public List<OspDebitcredit> findByDynamicWhere(OspDebitcredit entity){
		return ospDebitcreditService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspDebitcredit entity){
		ospDebitcreditService.saveOrUpdate(entity);
	}
	
}
