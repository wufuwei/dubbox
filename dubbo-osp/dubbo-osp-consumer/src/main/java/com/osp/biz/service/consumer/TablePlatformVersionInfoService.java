/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.ITablePlatformVersionInfoService;
import com.osp.biz.model.TablePlatformVersionInfo;


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
public class TablePlatformVersionInfoService {
	
	private ITablePlatformVersionInfoService tablePlatformVersionInfoService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setTablePlatformVersionInfoService(ITablePlatformVersionInfoService service) {
		this.tablePlatformVersionInfoService = service;
	}

	public ITablePlatformVersionInfoService getTablePlatformVersionInfoService() {
		return this.tablePlatformVersionInfoService;
	}
	
	public TablePlatformVersionInfo getById(java.lang.Integer id) {
		return (TablePlatformVersionInfo)tablePlatformVersionInfoService.getById(id);
	}
	
	
	
	
	public void save(TablePlatformVersionInfo entity) {
		tablePlatformVersionInfoService.save(entity);
	}
	
	public void removeById(java.lang.Integer id) {
		tablePlatformVersionInfoService.removeById(id);
	}
	
	public void update(TablePlatformVersionInfo entity) {
		tablePlatformVersionInfoService.update(entity);
	}
	
	public boolean isUnique(TablePlatformVersionInfo entity, String uniquePropertyNames) {
		return tablePlatformVersionInfoService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(TablePlatformVersionInfo entity){
		return tablePlatformVersionInfoService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return tablePlatformVersionInfoService.findByPageRequest(pr);
	}
	

	public List<TablePlatformVersionInfo> findAll() {
		return tablePlatformVersionInfoService.findAll();
	}
	
	public void updateDynamic(TablePlatformVersionInfo entity){
		tablePlatformVersionInfoService.updateDynamic(entity);
	}
	
	public List<TablePlatformVersionInfo> findByDynamicWhere(TablePlatformVersionInfo entity){
		return tablePlatformVersionInfoService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(TablePlatformVersionInfo entity){
		tablePlatformVersionInfoService.saveOrUpdate(entity);
	}
	
}
