/*
 * Powered By wufuwei
 */

package com.osp.biz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import com.osp.biz.service.IOspMemberService;
import com.osp.biz.manager.IOspMemberManager;
import com.osp.biz.model.OspMember;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class OspMemberService implements IOspMemberService{
	
	private IOspMemberManager ospMemberManager;
	
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性*/
	
	@Autowired
	public void setOspMemberManager(IOspMemberManager manager) {
		this.ospMemberManager = manager;
	}

	public IOspMemberManager getEntityManager() {
		return this.ospMemberManager;
	}
	
	public OspMember getById(java.lang.String id) {
		return (OspMember)ospMemberManager.getById(id);
	}
	
	
	
	public void save(OspMember entity) {
		ospMemberManager.save(entity);
	}
	

	public void removeById(java.lang.String id) {
		ospMemberManager.removeById(id);
	}
	
	public void update(OspMember entity) {
		ospMemberManager.update(entity);
	}
	
	public boolean isUnique(OspMember entity, String uniquePropertyNames) {
		return ospMemberManager.isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(OspMember entity){
		return ospMemberManager.pageSelectCount(entity);
	}
	
	
	public Page findByPageRequest(PageRequest pr) {
		return ospMemberManager.findByPageRequest(pr);
	}
	

	public List<OspMember> findAll() {
		return ospMemberManager.findAll();
	}
	
	public void updateDynamic(OspMember entity){
		ospMemberManager.updateDynamic(entity);
	}
	
	public List<OspMember> findByDynamicWhere(OspMember entity){
		return ospMemberManager.findByDynamicWhere(entity);
	}
	
	public void saveOrUpdate(OspMember entity){
		ospMemberManager.saveOrUpdate(entity);
	}
	
}
