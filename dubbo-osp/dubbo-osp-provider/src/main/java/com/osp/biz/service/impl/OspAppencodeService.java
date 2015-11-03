/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspAppencodeService;
import com.osp.biz.manager.IOspAppencodeManager;
import com.osp.biz.model.OspAppencode;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspAppencodeService implements IOspAppencodeService{
	
	private IOspAppencodeManager ospAppencodeManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspAppencodeManager(IOspAppencodeManager manager) {
		this.ospAppencodeManager = manager;
	}

	public IOspAppencodeManager getEntityManager() {
		return this.ospAppencodeManager;
	}
	
	public OspAppencode getById(java.lang.Long id) {
		return (OspAppencode)ospAppencodeManager.getById(id);
	}
	
	
	
	public void save(OspAppencode entity) {
		ospAppencodeManager.save(entity);
	}
	

	public void removeById(java.lang.Long id) {
		ospAppencodeManager.removeById(id);
	}
	
	public void update(OspAppencode entity) {
		ospAppencodeManager.update(entity);
	}
	
	public boolean isUnique(OspAppencode entity, String uniquePropertyNames) {
		return ospAppencodeManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspAppencode entity){
		return ospAppencodeManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospAppencodeManager.findByPageRequest(pr);
	}
	

	public List<OspAppencode> findAll() {
		return ospAppencodeManager.findAll();
	}
	
	public void updateDynamic(OspAppencode entity){
		ospAppencodeManager.updateDynamic(entity);
	}
	
	public List<OspAppencode> findByDynamicWhere(OspAppencode entity){
		return ospAppencodeManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspAppencode entity){
		ospAppencodeManager.saveOrUpdate(entity);
	}
	
}
