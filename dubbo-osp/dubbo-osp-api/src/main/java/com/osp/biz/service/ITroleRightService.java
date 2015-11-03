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

import com.osp.biz.model.TroleRight;

public interface ITroleRightService {
	
	 
	 public TroleRight getById(java.lang.Integer id);
	
	public void save(TroleRight entity);
	
	public void removeById(java.lang.Integer id);	
	
	
	public void update(TroleRight entity);
	
	
	public boolean isUnique(TroleRight entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(TroleRight entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<TroleRight> findAll();
	
	public void updateDynamic(TroleRight entity);
	
	public List<TroleRight> findByDynamicWhere(TroleRight entity);
	
	public void saveOrUpdate(TroleRight entity);
	

}
