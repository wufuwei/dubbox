/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspDeviceService;
import com.osp.biz.model.OspDevice;


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
public class OspDeviceService {
	
	private IOspDeviceService ospDeviceService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspDeviceService(IOspDeviceService service) {
		this.ospDeviceService = service;
	}

	public IOspDeviceService getOspDeviceService() {
		return this.ospDeviceService;
	}
	
	public OspDevice getById(java.lang.Long id) {
		return (OspDevice)ospDeviceService.getById(id);
	}
	
	
	
	
	public void save(OspDevice entity) {
		ospDeviceService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospDeviceService.removeById(id);
	}
	
	public void update(OspDevice entity) {
		ospDeviceService.update(entity);
	}
	
	public boolean isUnique(OspDevice entity, String uniquePropertyNames) {
		return ospDeviceService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspDevice entity){
		return ospDeviceService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospDeviceService.findByPageRequest(pr);
	}
	
	public OspDevice getByImei(java.lang.String v) {
		return ospDeviceService.getByImei(v);
	}	

	public List<OspDevice> findAll() {
		return ospDeviceService.findAll();
	}
	
	public void updateDynamic(OspDevice entity){
		ospDeviceService.updateDynamic(entity);
	}
	
	public List<OspDevice> findByDynamicWhere(OspDevice entity){
		return ospDeviceService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspDevice entity){
		ospDeviceService.saveOrUpdate(entity);
	}
	
}
