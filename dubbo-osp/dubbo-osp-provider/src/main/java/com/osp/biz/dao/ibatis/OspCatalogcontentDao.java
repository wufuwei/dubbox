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

import com.osp.biz.model.OspCatalogcontent;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspCatalogcontentDao;

@Repository
public class OspCatalogcontentDao extends BaseIbatisDao<OspCatalogcontent,java.lang.Long> implements IOspCatalogcontentDao{

	public Class getEntityClass() {
		return OspCatalogcontent.class;
	}
	
	public void saveOrUpdate(OspCatalogcontent entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
