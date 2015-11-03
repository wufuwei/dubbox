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

import com.osp.biz.model.OspCatalogactionlog;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspCatalogactionlogDao;

@Repository
public class OspCatalogactionlogDao extends BaseIbatisDao<OspCatalogactionlog,java.lang.Long> implements IOspCatalogactionlogDao{

	public Class getEntityClass() {
		return OspCatalogactionlog.class;
	}
	
	public void saveOrUpdate(OspCatalogactionlog entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
