/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IProvinceService;
import com.osp.biz.model.Province;


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
public class ProvinceService {
	
	private IProvinceService provinceService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setProvinceService(IProvinceService service) {
		this.provinceService = service;
	}

	public IProvinceService getProvinceService() {
		return this.provinceService;
	}
	
	public Province getById(java.lang.Integer id) {
		return (Province)provinceService.getById(id);
	}
	
	
	
	
	public void save(Province entity) {
		provinceService.save(entity);
	}
	
	public void removeById(java.lang.Integer id) {
		provinceService.removeById(id);
	}
	
	public void update(Province entity) {
		provinceService.update(entity);
	}
	
	public boolean isUnique(Province entity, String uniquePropertyNames) {
		return provinceService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(Province entity){
		return provinceService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return provinceService.findByPageRequest(pr);
	}
	

	public List<Province> findAll() {
		return provinceService.findAll();
	}
	
	public void updateDynamic(Province entity){
		provinceService.updateDynamic(entity);
	}
	
	public List<Province> findByDynamicWhere(Province entity){
		return provinceService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(Province entity){
		provinceService.saveOrUpdate(entity);
	}
	
}
