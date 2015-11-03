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

import com.osp.biz.model.OspServerconfig;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspServerconfigDao;

@Repository
public class OspServerconfigDao extends BaseIbatisDao<OspServerconfig,java.lang.Long> implements IOspServerconfigDao{

	public Class getEntityClass() {
		return OspServerconfig.class;
	}
	
	public void saveOrUpdate(OspServerconfig entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
	public OspServerconfig getByInnercode(java.lang.String v) {
		return (OspServerconfig)getSqlMapClientTemplate().queryForObject("OspServerconfig.getByInnercode",v);
	}	
}
