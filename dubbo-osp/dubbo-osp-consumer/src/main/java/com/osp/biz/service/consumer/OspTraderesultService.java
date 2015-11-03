/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspTraderesultService;
import com.osp.biz.model.OspTraderesult;


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
public class OspTraderesultService {
	
	private IOspTraderesultService ospTraderesultService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspTraderesultService(IOspTraderesultService service) {
		this.ospTraderesultService = service;
	}

	public IOspTraderesultService getOspTraderesultService() {
		return this.ospTraderesultService;
	}
	
	public OspTraderesult getById(java.lang.Integer id) {
		return (OspTraderesult)ospTraderesultService.getById(id);
	}
	
	
	
	
	public void save(OspTraderesult entity) {
		ospTraderesultService.save(entity);
	}
	
	public void removeById(java.lang.Integer id) {
		ospTraderesultService.removeById(id);
	}
	
	public void update(OspTraderesult entity) {
		ospTraderesultService.update(entity);
	}
	
	public boolean isUnique(OspTraderesult entity, String uniquePropertyNames) {
		return ospTraderesultService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspTraderesult entity){
		return ospTraderesultService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospTraderesultService.findByPageRequest(pr);
	}
	

	public List<OspTraderesult> findAll() {
		return ospTraderesultService.findAll();
	}
	
	public void updateDynamic(OspTraderesult entity){
		ospTraderesultService.updateDynamic(entity);
	}
	
	public List<OspTraderesult> findByDynamicWhere(OspTraderesult entity){
		return ospTraderesultService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspTraderesult entity){
		ospTraderesultService.saveOrUpdate(entity);
	}
	
}
