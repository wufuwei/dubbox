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

import com.osp.biz.model.OspDebitcredit;

public interface IOspDebitcreditService {
	
	 
	 public OspDebitcredit getById(java.lang.Long id);
	
	public void save(OspDebitcredit entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspDebitcredit entity);
	
	
	public boolean isUnique(OspDebitcredit entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspDebitcredit entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	
	public OspDebitcredit getByTradeid(java.lang.String v);

	public List<OspDebitcredit> findAll();
	
	public void updateDynamic(OspDebitcredit entity);
	
	public List<OspDebitcredit> findByDynamicWhere(OspDebitcredit entity);
	
	public void saveOrUpdate(OspDebitcredit entity);
	

}
