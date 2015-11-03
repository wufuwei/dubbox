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

import com.osp.biz.model.OspMemberactionlog;

public interface IOspMemberactionlogService {
	
	 
	 public OspMemberactionlog getById(java.lang.Integer id);
	
	public void save(OspMemberactionlog entity);
	
	public void removeById(java.lang.Integer id);	
	
	
	public void update(OspMemberactionlog entity);
	
	
	public boolean isUnique(OspMemberactionlog entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspMemberactionlog entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<OspMemberactionlog> findAll();
	
	public void updateDynamic(OspMemberactionlog entity);
	
	public List<OspMemberactionlog> findByDynamicWhere(OspMemberactionlog entity);
	
	public void saveOrUpdate(OspMemberactionlog entity);
	

}
