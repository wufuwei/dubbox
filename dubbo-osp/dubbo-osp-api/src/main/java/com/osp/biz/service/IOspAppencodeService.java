/*
 * Powered By wufuwei
 */

package com.osp.biz.service;

import java.util.List;

import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;
/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */
import com.osp.biz.model.OspAppencode;

public interface IOspAppencodeService {
	
	 
	 public OspAppencode getById(java.lang.Long id);
	
	public void save(OspAppencode entity);
	
	public void removeById(java.lang.Long id);	
	
	
	public void update(OspAppencode entity);
	
	
	public boolean isUnique(OspAppencode entity, String uniquePropertyNames) ;
	
	public Long pageSelectCount(OspAppencode entity);
	
	
	public Page findByPageRequest(PageRequest pr);
	

	public List<OspAppencode> findAll();
	
	public void updateDynamic(OspAppencode entity);
	
	public List<OspAppencode> findByDynamicWhere(OspAppencode entity);
	
	public void saveOrUpdate(OspAppencode entity);
	

}
