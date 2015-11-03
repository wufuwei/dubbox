/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;

import com.osp.biz.model.OspProperties;
import com.osp.biz.service.IOspPropertiesService;

/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspPropertiesService {
	
	private IOspPropertiesService ospPropertiesService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspPropertiesService(IOspPropertiesService service) {
		this.ospPropertiesService = service;
	}

	public IOspPropertiesService getOspPropertiesService() {
		return this.ospPropertiesService;
	}
	
	public OspProperties getById(java.lang.Long id) {
		return (OspProperties)ospPropertiesService.getById(id);
	}
	
	
	
	
	public void save(OspProperties entity) {
		ospPropertiesService.save(entity);
	}
	
	public void removeById(java.lang.Long id) {
		ospPropertiesService.removeById(id);
	}
	
	public void update(OspProperties entity) {
		ospPropertiesService.update(entity);
	}
	
	public boolean isUnique(OspProperties entity, String uniquePropertyNames) {
		return ospPropertiesService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspProperties entity){
		return ospPropertiesService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospPropertiesService.findByPageRequest(pr);
	}
	
	public OspProperties getByName(java.lang.String v) {
		return ospPropertiesService.getByName(v);
	}	

	public List<OspProperties> findAll() {
		return ospPropertiesService.findAll();
	}
	
	public void updateDynamic(OspProperties entity){
		ospPropertiesService.updateDynamic(entity);
	}
	
	public List<OspProperties> findByDynamicWhere(OspProperties entity){
		return ospPropertiesService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspProperties entity){
		ospPropertiesService.saveOrUpdate(entity);
	}
	
}
