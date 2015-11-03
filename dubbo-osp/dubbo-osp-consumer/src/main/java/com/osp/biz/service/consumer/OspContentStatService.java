/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspContentStatService;
import com.osp.biz.model.OspContentStat;


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
public class OspContentStatService {
	
	private IOspContentStatService ospContentStatService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspContentStatService(IOspContentStatService service) {
		this.ospContentStatService = service;
	}

	public IOspContentStatService getOspContentStatService() {
		return this.ospContentStatService;
	}
	
	
	
	
	
	public void save(OspContentStat entity) {
		ospContentStatService.save(entity);
	}
	
	
	public void update(OspContentStat entity) {
		ospContentStatService.update(entity);
	}
	
	public boolean isUnique(OspContentStat entity, String uniquePropertyNames) {
		return ospContentStatService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspContentStat entity){
		return ospContentStatService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospContentStatService.findByPageRequest(pr);
	}
	

	public List<OspContentStat> findAll() {
		return ospContentStatService.findAll();
	}
	
	public void updateDynamic(OspContentStat entity){
		ospContentStatService.updateDynamic(entity);
	}
	
	public List<OspContentStat> findByDynamicWhere(OspContentStat entity){
		return ospContentStatService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspContentStat entity){
		ospContentStatService.saveOrUpdate(entity);
	}
	
}
