/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.ITableWlanUpdateInfoService;
import com.osp.biz.model.TableWlanUpdateInfo;


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
public class TableWlanUpdateInfoService {
	
	private ITableWlanUpdateInfoService tableWlanUpdateInfoService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setTableWlanUpdateInfoService(ITableWlanUpdateInfoService service) {
		this.tableWlanUpdateInfoService = service;
	}

	public ITableWlanUpdateInfoService getTableWlanUpdateInfoService() {
		return this.tableWlanUpdateInfoService;
	}
	
	public TableWlanUpdateInfo getById(java.lang.Integer id) {
		return (TableWlanUpdateInfo)tableWlanUpdateInfoService.getById(id);
	}
	
	
	
	
	public void save(TableWlanUpdateInfo entity) {
		tableWlanUpdateInfoService.save(entity);
	}
	
	public void removeById(java.lang.Integer id) {
		tableWlanUpdateInfoService.removeById(id);
	}
	
	public void update(TableWlanUpdateInfo entity) {
		tableWlanUpdateInfoService.update(entity);
	}
	
	public boolean isUnique(TableWlanUpdateInfo entity, String uniquePropertyNames) {
		return tableWlanUpdateInfoService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(TableWlanUpdateInfo entity){
		return tableWlanUpdateInfoService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return tableWlanUpdateInfoService.findByPageRequest(pr);
	}
	

	public List<TableWlanUpdateInfo> findAll() {
		return tableWlanUpdateInfoService.findAll();
	}
	
	public void updateDynamic(TableWlanUpdateInfo entity){
		tableWlanUpdateInfoService.updateDynamic(entity);
	}
	
	public List<TableWlanUpdateInfo> findByDynamicWhere(TableWlanUpdateInfo entity){
		return tableWlanUpdateInfoService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(TableWlanUpdateInfo entity){
		tableWlanUpdateInfoService.saveOrUpdate(entity);
	}
	
}
