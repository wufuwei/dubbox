/*
 * Powered By wufuwei
 */

package com.osp.biz.service;

import java.util.*;

import javacommon.base.*;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;

/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

import com.osp.biz.model.OspMember;

public interface IOspMemberService {
	
	 
	 public OspMember getById(java.lang.String id);
	
	public void save(OspMember entity);
	
	public void removeById(java.lang.String id);	
	
	
	public void update(OspMember entity);
	
	
	public boolean isUnique(OspMember entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspMember entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<OspMember> findAll();
	
	public void updateDynamic(OspMember entity);
	
	public List<OspMember> findByDynamicWhere(OspMember entity);
	
	public void saveOrUpdate(OspMember entity);
	

}
