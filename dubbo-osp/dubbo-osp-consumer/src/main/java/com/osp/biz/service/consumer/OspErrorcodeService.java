/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspErrorcodeService;
import com.osp.biz.model.OspErrorcode;


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
public class OspErrorcodeService {
	
	private IOspErrorcodeService ospErrorcodeService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspErrorcodeService(IOspErrorcodeService service) {
		this.ospErrorcodeService = service;
	}

	public IOspErrorcodeService getOspErrorcodeService() {
		return this.ospErrorcodeService;
	}
	
	public OspErrorcode getById(java.lang.Long id) {
		return (OspErrorcode)ospErrorcodeService.getById(id);
	}
	
	
	
	
	public void save(OspErrorcode entity) {
		ospErrorcodeService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospErrorcodeService.removeById(id);
	}
	
	public void update(OspErrorcode entity) {
		ospErrorcodeService.update(entity);
	}
	
	public boolean isUnique(OspErrorcode entity, String uniquePropertyNames) {
		return ospErrorcodeService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspErrorcode entity){
		return ospErrorcodeService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospErrorcodeService.findByPageRequest(pr);
	}
	
	public OspErrorcode getByErrorcode(java.lang.Integer v) {
		return ospErrorcodeService.getByErrorcode(v);
	}	

	public List<OspErrorcode> findAll() {
		return ospErrorcodeService.findAll();
	}
	
	public void updateDynamic(OspErrorcode entity){
		ospErrorcodeService.updateDynamic(entity);
	}
	
	public List<OspErrorcode> findByDynamicWhere(OspErrorcode entity){
		return ospErrorcodeService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspErrorcode entity){
		ospErrorcodeService.saveOrUpdate(entity);
	}
	
}
