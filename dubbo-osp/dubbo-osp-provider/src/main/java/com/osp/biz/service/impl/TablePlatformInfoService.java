/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.ITablePlatformInfoService;
import com.osp.biz.manager.ITablePlatformInfoManager;
import com.osp.biz.model.TablePlatformInfo;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class TablePlatformInfoService implements ITablePlatformInfoService{
	
	private ITablePlatformInfoManager tablePlatformInfoManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setTablePlatformInfoManager(ITablePlatformInfoManager manager) {
		this.tablePlatformInfoManager = manager;
	}

	public ITablePlatformInfoManager getEntityManager() {
		return this.tablePlatformInfoManager;
	}
	
	public TablePlatformInfo getById(java.lang.Integer id) {
		return (TablePlatformInfo)tablePlatformInfoManager.getById(id);
	}
	
	
	
	public void save(TablePlatformInfo entity) {
		tablePlatformInfoManager.save(entity);
	}
	

	public void removeById(java.lang.Integer id) {
		tablePlatformInfoManager.removeById(id);
	}
	
	public void update(TablePlatformInfo entity) {
		tablePlatformInfoManager.update(entity);
	}
	
	public boolean isUnique(TablePlatformInfo entity, String uniquePropertyNames) {
		return tablePlatformInfoManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(TablePlatformInfo entity){
		return tablePlatformInfoManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return tablePlatformInfoManager.findByPageRequest(pr);
	}
	
	public TablePlatformInfo getByPlatform(java.lang.String v) {
		return tablePlatformInfoManager.getByPlatform(v);
	}	

	public List<TablePlatformInfo> findAll() {
		return tablePlatformInfoManager.findAll();
	}
	
	public void updateDynamic(TablePlatformInfo entity){
		tablePlatformInfoManager.updateDynamic(entity);
	}
	
	public List<TablePlatformInfo> findByDynamicWhere(TablePlatformInfo entity){
		return tablePlatformInfoManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(TablePlatformInfo entity){
		tablePlatformInfoManager.saveOrUpdate(entity);
	}
	
}
