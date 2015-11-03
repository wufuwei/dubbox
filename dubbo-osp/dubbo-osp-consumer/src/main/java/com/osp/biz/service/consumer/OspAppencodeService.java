/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspAppencodeService;
import com.osp.biz.model.OspAppencode;


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
public class OspAppencodeService {
	
	private IOspAppencodeService ospAppencodeService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspAppencodeService(IOspAppencodeService service) {
		this.ospAppencodeService = service;
	}

	public IOspAppencodeService getOspAppencodeService() {
		return this.ospAppencodeService;
	}
	
	public OspAppencode getById(java.lang.Long id) {
		return (OspAppencode)ospAppencodeService.getById(id);
	}
	
	
	
	
	public void save(OspAppencode entity) {
		ospAppencodeService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospAppencodeService.removeById(id);
	}
	
	public void update(OspAppencode entity) {
		ospAppencodeService.update(entity);
	}
	
	public boolean isUnique(OspAppencode entity, String uniquePropertyNames) {
		return ospAppencodeService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspAppencode entity){
		return ospAppencodeService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospAppencodeService.findByPageRequest(pr);
	}
	

	public List<OspAppencode> findAll() {
		return ospAppencodeService.findAll();
	}
	
	public void updateDynamic(OspAppencode entity){
		ospAppencodeService.updateDynamic(entity);
	}
	
	public List<OspAppencode> findByDynamicWhere(OspAppencode entity){
		return ospAppencodeService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspAppencode entity){
		ospAppencodeService.saveOrUpdate(entity);
	}
	
}
