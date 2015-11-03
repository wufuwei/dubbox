/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.ITableWlanUpdateInfoService;
import com.osp.biz.manager.ITableWlanUpdateInfoManager;
import com.osp.biz.model.TableWlanUpdateInfo;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class TableWlanUpdateInfoService implements ITableWlanUpdateInfoService{
	
	private ITableWlanUpdateInfoManager tableWlanUpdateInfoManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setTableWlanUpdateInfoManager(ITableWlanUpdateInfoManager manager) {
		this.tableWlanUpdateInfoManager = manager;
	}

	public ITableWlanUpdateInfoManager getEntityManager() {
		return this.tableWlanUpdateInfoManager;
	}
	
	public TableWlanUpdateInfo getById(java.lang.Integer id) {
		return (TableWlanUpdateInfo)tableWlanUpdateInfoManager.getById(id);
	}
	
	
	
	public void save(TableWlanUpdateInfo entity) {
		tableWlanUpdateInfoManager.save(entity);
	}
	

	public void removeById(java.lang.Integer id) {
		tableWlanUpdateInfoManager.removeById(id);
	}
	
	public void update(TableWlanUpdateInfo entity) {
		tableWlanUpdateInfoManager.update(entity);
	}
	
	public boolean isUnique(TableWlanUpdateInfo entity, String uniquePropertyNames) {
		return tableWlanUpdateInfoManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(TableWlanUpdateInfo entity){
		return tableWlanUpdateInfoManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return tableWlanUpdateInfoManager.findByPageRequest(pr);
	}
	

	public List<TableWlanUpdateInfo> findAll() {
		return tableWlanUpdateInfoManager.findAll();
	}
	
	public void updateDynamic(TableWlanUpdateInfo entity){
		tableWlanUpdateInfoManager.updateDynamic(entity);
	}
	
	public List<TableWlanUpdateInfo> findByDynamicWhere(TableWlanUpdateInfo entity){
		return tableWlanUpdateInfoManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(TableWlanUpdateInfo entity){
		tableWlanUpdateInfoManager.saveOrUpdate(entity);
	}
	
}
