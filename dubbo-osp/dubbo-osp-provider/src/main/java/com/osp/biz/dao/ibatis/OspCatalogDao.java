/*
 * Powered By wufuwei
 */

package com.osp.biz.dao.ibatis;

import java.util.*;

import javacommon.base.*;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;

/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

import com.osp.biz.model.OspCatalog;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspCatalogDao;

@Repository
public class OspCatalogDao extends BaseIbatisDao<OspCatalog,java.lang.Long> implements IOspCatalogDao{

	public Class getEntityClass() {
		return OspCatalog.class;
	}
	
	public void saveOrUpdate(OspCatalog entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
	public OspCatalog getByInnercode(java.lang.String v) {
		return (OspCatalog)getSqlMapClientTemplate().queryForObject("OspCatalog.getByInnercode",v);
	}	
}
