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

import com.osp.biz.model.OspTerminalgroupCatalog;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspTerminalgroupCatalogDao;

@Repository
public class OspTerminalgroupCatalogDao extends BaseIbatisDao<OspTerminalgroupCatalog,java.lang.Long> implements IOspTerminalgroupCatalogDao{

	public Class getEntityClass() {
		return OspTerminalgroupCatalog.class;
	}
	
	public void saveOrUpdate(OspTerminalgroupCatalog entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
