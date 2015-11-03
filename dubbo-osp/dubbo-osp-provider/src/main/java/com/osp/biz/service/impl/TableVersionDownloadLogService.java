/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.ITableVersionDownloadLogService;
import com.osp.biz.manager.ITableVersionDownloadLogManager;
import com.osp.biz.model.TableVersionDownloadLog;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class TableVersionDownloadLogService implements ITableVersionDownloadLogService{
	
	private ITableVersionDownloadLogManager tableVersionDownloadLogManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setTableVersionDownloadLogManager(ITableVersionDownloadLogManager manager) {
		this.tableVersionDownloadLogManager = manager;
	}

	public ITableVersionDownloadLogManager getEntityManager() {
		return this.tableVersionDownloadLogManager;
	}
	
	public TableVersionDownloadLog getById(java.lang.Integer id) {
		return (TableVersionDownloadLog)tableVersionDownloadLogManager.getById(id);
	}
	
	
	
	public void save(TableVersionDownloadLog entity) {
		tableVersionDownloadLogManager.save(entity);
	}
	

	public void removeById(java.lang.Integer id) {
		tableVersionDownloadLogManager.removeById(id);
	}
	
	public void update(TableVersionDownloadLog entity) {
		tableVersionDownloadLogManager.update(entity);
	}
	
	public boolean isUnique(TableVersionDownloadLog entity, String uniquePropertyNames) {
		return tableVersionDownloadLogManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(TableVersionDownloadLog entity){
		return tableVersionDownloadLogManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return tableVersionDownloadLogManager.findByPageRequest(pr);
	}
	

	public List<TableVersionDownloadLog> findAll() {
		return tableVersionDownloadLogManager.findAll();
	}
	
	public void updateDynamic(TableVersionDownloadLog entity){
		tableVersionDownloadLogManager.updateDynamic(entity);
	}
	
	public List<TableVersionDownloadLog> findByDynamicWhere(TableVersionDownloadLog entity){
		return tableVersionDownloadLogManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(TableVersionDownloadLog entity){
		tableVersionDownloadLogManager.saveOrUpdate(entity);
	}
	
}
