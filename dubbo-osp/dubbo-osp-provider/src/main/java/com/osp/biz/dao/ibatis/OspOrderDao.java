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

import com.osp.biz.model.OspOrder;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspOrderDao;

@Repository
public class OspOrderDao extends BaseIbatisDao<OspOrder,java.lang.Long> implements IOspOrderDao{

	public Class getEntityClass() {
		return OspOrder.class;
	}
	
	public void saveOrUpdate(OspOrder entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
	public OspOrder getByOrderid(java.lang.String v) {
		return (OspOrder)getSqlMapClientTemplate().queryForObject("OspOrder.getByOrderid",v);
	}	
}
