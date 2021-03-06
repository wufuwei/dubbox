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

import com.osp.biz.model.OspProperties;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspPropertiesDao;

@Repository
public class OspPropertiesDao extends BaseIbatisDao<OspProperties,java.lang.Long> implements IOspPropertiesDao{

	public Class getEntityClass() {
		return OspProperties.class;
	}
	
	public void saveOrUpdate(OspProperties entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
	public OspProperties getByName(java.lang.String v) {
		return (OspProperties)getSqlMapClientTemplate().queryForObject("OspProperties.getByName",v);
	}	
}
