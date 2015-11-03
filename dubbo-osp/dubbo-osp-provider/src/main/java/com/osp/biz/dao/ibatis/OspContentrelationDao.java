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

import com.osp.biz.model.OspContentrelation;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspContentrelationDao;

@Repository
public class OspContentrelationDao extends BaseIbatisDao<OspContentrelation,java.lang.Long> implements IOspContentrelationDao{

	public Class getEntityClass() {
		return OspContentrelation.class;
	}
	
	public void saveOrUpdate(OspContentrelation entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
