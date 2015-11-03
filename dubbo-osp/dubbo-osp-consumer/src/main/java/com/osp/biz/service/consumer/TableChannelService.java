/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.ITableChannelService;
import com.osp.biz.model.TableChannel;


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
public class TableChannelService {
	
	private ITableChannelService tableChannelService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setTableChannelService(ITableChannelService service) {
		this.tableChannelService = service;
	}

	public ITableChannelService getTableChannelService() {
		return this.tableChannelService;
	}
	
	public TableChannel getById(java.lang.Integer id) {
		return (TableChannel)tableChannelService.getById(id);
	}
	
	
	
	
	public void save(TableChannel entity) {
		tableChannelService.save(entity);
	}
	
	public void removeById(java.lang.Integer id) {
		tableChannelService.removeById(id);
	}
	
	public void update(TableChannel entity) {
		tableChannelService.update(entity);
	}
	
	public boolean isUnique(TableChannel entity, String uniquePropertyNames) {
		return tableChannelService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(TableChannel entity){
		return tableChannelService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return tableChannelService.findByPageRequest(pr);
	}
	

	public List<TableChannel> findAll() {
		return tableChannelService.findAll();
	}
	
	public void updateDynamic(TableChannel entity){
		tableChannelService.updateDynamic(entity);
	}
	
	public List<TableChannel> findByDynamicWhere(TableChannel entity){
		return tableChannelService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(TableChannel entity){
		tableChannelService.saveOrUpdate(entity);
	}
	
}
