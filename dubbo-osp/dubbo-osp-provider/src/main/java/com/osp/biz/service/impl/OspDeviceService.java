/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspDeviceService;
import com.osp.biz.manager.IOspDeviceManager;
import com.osp.biz.model.OspDevice;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspDeviceService implements IOspDeviceService{
	
	private IOspDeviceManager ospDeviceManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspDeviceManager(IOspDeviceManager manager) {
		this.ospDeviceManager = manager;
	}

	public IOspDeviceManager getEntityManager() {
		return this.ospDeviceManager;
	}
	
	public OspDevice getById(java.lang.Long id) {
		return (OspDevice)ospDeviceManager.getById(id);
	}
	
	
	
	public void save(OspDevice entity) {
		ospDeviceManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospDeviceManager.removeById(id);
	}
	
	public void update(OspDevice entity) {
		ospDeviceManager.update(entity);
	}
	
	public boolean isUnique(OspDevice entity, String uniquePropertyNames) {
		return ospDeviceManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspDevice entity){
		return ospDeviceManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospDeviceManager.findByPageRequest(pr);
	}
	
	public OspDevice getByImei(java.lang.String v) {
		return ospDeviceManager.getByImei(v);
	}	

	public List<OspDevice> findAll() {
		return ospDeviceManager.findAll();
	}
	
	public void updateDynamic(OspDevice entity){
		ospDeviceManager.updateDynamic(entity);
	}
	
	public List<OspDevice> findByDynamicWhere(OspDevice entity){
		return ospDeviceManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspDevice entity){
		ospDeviceManager.saveOrUpdate(entity);
	}
	
}
