/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.ITablePlatformVersionInfoService;
import com.osp.biz.manager.ITablePlatformVersionInfoManager;
import com.osp.biz.model.TablePlatformVersionInfo;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class TablePlatformVersionInfoService implements ITablePlatformVersionInfoService{
	
	private ITablePlatformVersionInfoManager tablePlatformVersionInfoManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setTablePlatformVersionInfoManager(ITablePlatformVersionInfoManager manager) {
		this.tablePlatformVersionInfoManager = manager;
	}

	public ITablePlatformVersionInfoManager getEntityManager() {
		return this.tablePlatformVersionInfoManager;
	}
	
	public TablePlatformVersionInfo getById(java.lang.Integer id) {
		return (TablePlatformVersionInfo)tablePlatformVersionInfoManager.getById(id);
	}
	
	
	
	public void save(TablePlatformVersionInfo entity) {
		tablePlatformVersionInfoManager.save(entity);
	}
	

	public void removeById(java.lang.Integer id) {
		tablePlatformVersionInfoManager.removeById(id);
	}
	
	public void update(TablePlatformVersionInfo entity) {
		tablePlatformVersionInfoManager.update(entity);
	}
	
	public boolean isUnique(TablePlatformVersionInfo entity, String uniquePropertyNames) {
		return tablePlatformVersionInfoManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(TablePlatformVersionInfo entity){
		return tablePlatformVersionInfoManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return tablePlatformVersionInfoManager.findByPageRequest(pr);
	}
	

	public List<TablePlatformVersionInfo> findAll() {
		return tablePlatformVersionInfoManager.findAll();
	}
	
	public void updateDynamic(TablePlatformVersionInfo entity){
		tablePlatformVersionInfoManager.updateDynamic(entity);
	}
	
	public List<TablePlatformVersionInfo> findByDynamicWhere(TablePlatformVersionInfo entity){
		return tablePlatformVersionInfoManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(TablePlatformVersionInfo entity){
		tablePlatformVersionInfoManager.saveOrUpdate(entity);
	}
	
}
