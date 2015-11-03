/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.ITablePlatformInfoService;
import com.osp.biz.model.TablePlatformInfo;


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
public class TablePlatformInfoService {
	
	private ITablePlatformInfoService tablePlatformInfoService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setTablePlatformInfoService(ITablePlatformInfoService service) {
		this.tablePlatformInfoService = service;
	}

	public ITablePlatformInfoService getTablePlatformInfoService() {
		return this.tablePlatformInfoService;
	}
	
	public TablePlatformInfo getById(java.lang.Integer id) {
		return (TablePlatformInfo)tablePlatformInfoService.getById(id);
	}
	
	
	
	
	public void save(TablePlatformInfo entity) {
		tablePlatformInfoService.save(entity);
	}
	
	public void removeById(java.lang.Integer id) {
		tablePlatformInfoService.removeById(id);
	}
	
	public void update(TablePlatformInfo entity) {
		tablePlatformInfoService.update(entity);
	}
	
	public boolean isUnique(TablePlatformInfo entity, String uniquePropertyNames) {
		return tablePlatformInfoService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(TablePlatformInfo entity){
		return tablePlatformInfoService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return tablePlatformInfoService.findByPageRequest(pr);
	}
	
	public TablePlatformInfo getByPlatform(java.lang.String v) {
		return tablePlatformInfoService.getByPlatform(v);
	}	

	public List<TablePlatformInfo> findAll() {
		return tablePlatformInfoService.findAll();
	}
	
	public void updateDynamic(TablePlatformInfo entity){
		tablePlatformInfoService.updateDynamic(entity);
	}
	
	public List<TablePlatformInfo> findByDynamicWhere(TablePlatformInfo entity){
		return tablePlatformInfoService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(TablePlatformInfo entity){
		tablePlatformInfoService.saveOrUpdate(entity);
	}
	
}
