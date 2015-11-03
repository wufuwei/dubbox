/*
 * Powered By wufuwei
 */

package com.osp.biz.service.consumer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.osp.biz.service.IOspMemberService;
import com.osp.biz.model.OspMember;


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
public class OspMemberService {
	
	private IOspMemberService ospMemberService;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	
	public void setOspMemberService(IOspMemberService service) {
		this.ospMemberService = service;
	}

	public IOspMemberService getOspMemberService() {
		return this.ospMemberService;
	}
	
	public OspMember getById(java.lang.String id) {
		return (OspMember)ospMemberService.getById(id);
	}
	
	
	
	
	public void save(OspMember entity) {
		ospMemberService.save(entity);
	}
	
	public void removeById(java.lang.String id) {
		ospMemberService.removeById(id);
	}
	
	public void update(OspMember entity) {
		ospMemberService.update(entity);
	}
	
	public boolean isUnique(OspMember entity, String uniquePropertyNames) {
		return ospMemberService.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspMember entity){
		return ospMemberService.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospMemberService.findByPageRequest(pr);
	}
	

	public List<OspMember> findAll() {
		return ospMemberService.findAll();
	}
	
	public void updateDynamic(OspMember entity){
		ospMemberService.updateDynamic(entity);
	}
	
	public List<OspMember> findByDynamicWhere(OspMember entity){
		return ospMemberService.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspMember entity){
		ospMemberService.saveOrUpdate(entity);
	}
	
}
