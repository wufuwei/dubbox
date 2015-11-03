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

import com.osp.biz.model.OspErrorcode;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspErrorcodeDao;

@Repository
public class OspErrorcodeDao extends BaseIbatisDao<OspErrorcode,java.lang.Long> implements IOspErrorcodeDao{

	public Class getEntityClass() {
		return OspErrorcode.class;
	}
	
	public void saveOrUpdate(OspErrorcode entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
	public OspErrorcode getByErrorcode(java.lang.Integer v) {
		return (OspErrorcode)getSqlMapClientTemplate().queryForObject("OspErrorcode.getByErrorcode",v);
	}	
}
