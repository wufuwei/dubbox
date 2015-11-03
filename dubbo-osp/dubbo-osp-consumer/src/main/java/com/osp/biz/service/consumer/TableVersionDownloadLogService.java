/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.ITableVersionDownloadLogService;
import com.osp.biz.model.TableVersionDownloadLog;


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
public class TableVersionDownloadLogService {
	
	private ITableVersionDownloadLogService tableVersionDownloadLogService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setTableVersionDownloadLogService(ITableVersionDownloadLogService service) {
		this.tableVersionDownloadLogService = service;
	}

	public ITableVersionDownloadLogService getTableVersionDownloadLogService() {
		return this.tableVersionDownloadLogService;
	}
	
	public TableVersionDownloadLog getById(java.lang.Integer id) {
		return (TableVersionDownloadLog)tableVersionDownloadLogService.getById(id);
	}
	
	
	
	
	public void save(TableVersionDownloadLog entity) {
		tableVersionDownloadLogService.save(entity);
	}
	
	public void removeById(java.lang.Integer id) {
		tableVersionDownloadLogService.removeById(id);
	}
	
	public void update(TableVersionDownloadLog entity) {
		tableVersionDownloadLogService.update(entity);
	}
	
	public boolean isUnique(TableVersionDownloadLog entity, String uniquePropertyNames) {
		return tableVersionDownloadLogService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(TableVersionDownloadLog entity){
		return tableVersionDownloadLogService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return tableVersionDownloadLogService.findByPageRequest(pr);
	}
	

	public List<TableVersionDownloadLog> findAll() {
		return tableVersionDownloadLogService.findAll();
	}
	
	public void updateDynamic(TableVersionDownloadLog entity){
		tableVersionDownloadLogService.updateDynamic(entity);
	}
	
	public List<TableVersionDownloadLog> findByDynamicWhere(TableVersionDownloadLog entity){
		return tableVersionDownloadLogService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(TableVersionDownloadLog entity){
		tableVersionDownloadLogService.saveOrUpdate(entity);
	}
	
}
