/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IProvinceService;
import com.osp.biz.manager.IProvinceManager;
import com.osp.biz.model.Province;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class ProvinceService implements IProvinceService{
	
	private IProvinceManager provinceManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setProvinceManager(IProvinceManager manager) {
		this.provinceManager = manager;
	}

	public IProvinceManager getEntityManager() {
		return this.provinceManager;
	}
	
	public Province getById(java.lang.Integer id) {
		return (Province)provinceManager.getById(id);
	}
	
	
	
	public void save(Province entity) {
		provinceManager.save(entity);
	}
	

	public void removeById(java.lang.Integer id) {
		provinceManager.removeById(id);
	}
	
	public void update(Province entity) {
		provinceManager.update(entity);
	}
	
	public boolean isUnique(Province entity, String uniquePropertyNames) {
		return provinceManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(Province entity){
		return provinceManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return provinceManager.findByPageRequest(pr);
	}
	

	public List<Province> findAll() {
		return provinceManager.findAll();
	}
	
	public void updateDynamic(Province entity){
		provinceManager.updateDynamic(entity);
	}
	
	public List<Province> findByDynamicWhere(Province entity){
		return provinceManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(Province entity){
		provinceManager.saveOrUpdate(entity);
	}
	
}
