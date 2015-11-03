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

import com.osp.biz.model.OspTradetype;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspTradetypeDao;

@Repository
public class OspTradetypeDao extends BaseIbatisDao<OspTradetype,java.lang.Long> implements IOspTradetypeDao{

	public Class getEntityClass() {
		return OspTradetype.class;
	}
	
	public void saveOrUpdate(OspTradetype entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
	public OspTradetype getByTradetype(java.lang.String v) {
		return (OspTradetype)getSqlMapClientTemplate().queryForObject("OspTradetype.getByTradetype",v);
	}	
}
