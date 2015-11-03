/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.ITableChannelService;
import com.osp.biz.manager.ITableChannelManager;
import com.osp.biz.model.TableChannel;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class TableChannelService implements ITableChannelService{
	
	private ITableChannelManager tableChannelManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setTableChannelManager(ITableChannelManager manager) {
		this.tableChannelManager = manager;
	}

	public ITableChannelManager getEntityManager() {
		return this.tableChannelManager;
	}
	
	public TableChannel getById(java.lang.Integer id) {
		return (TableChannel)tableChannelManager.getById(id);
	}
	
	
	
	public void save(TableChannel entity) {
		tableChannelManager.save(entity);
	}
	

	public void removeById(java.lang.Integer id) {
		tableChannelManager.removeById(id);
	}
	
	public void update(TableChannel entity) {
		tableChannelManager.update(entity);
	}
	
	public boolean isUnique(TableChannel entity, String uniquePropertyNames) {
		return tableChannelManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(TableChannel entity){
		return tableChannelManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return tableChannelManager.findByPageRequest(pr);
	}
	

	public List<TableChannel> findAll() {
		return tableChannelManager.findAll();
	}
	
	public void updateDynamic(TableChannel entity){
		tableChannelManager.updateDynamic(entity);
	}
	
	public List<TableChannel> findByDynamicWhere(TableChannel entity){
		return tableChannelManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(TableChannel entity){
		tableChannelManager.saveOrUpdate(entity);
	}
	
}
