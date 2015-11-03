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

import com.osp.biz.model.OspSearchkey;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspSearchkeyDao;

@Repository
public class OspSearchkeyDao extends BaseIbatisDao<OspSearchkey,java.lang.Long> implements IOspSearchkeyDao{

	public Class getEntityClass() {
		return OspSearchkey.class;
	}
	
	public void saveOrUpdate(OspSearchkey entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
	public OspSearchkey getBySearchkey(java.lang.String v) {
		return (OspSearchkey)getSqlMapClientTemplate().queryForObject("OspSearchkey.getBySearchkey",v);
	}	
}
