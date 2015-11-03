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

import com.osp.biz.model.OspTraderesult;

public interface IOspTraderesultService {
	
	 
	 public OspTraderesult getById(java.lang.Integer id);
	
	public void save(OspTraderesult entity);
	
	public void removeById(java.lang.Integer id);	
	
	
	public void update(OspTraderesult entity);
	
	
	public boolean isUnique(OspTraderesult entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspTraderesult entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<OspTraderesult> findAll();
	
	public void updateDynamic(OspTraderesult entity);
	
	public List<OspTraderesult> findByDynamicWhere(OspTraderesult entity);
	
	public void saveOrUpdate(OspTraderesult entity);
	

}
