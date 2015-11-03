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

import com.osp.biz.model.Tadministrators;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.ITadministratorsDao;

@Repository
public class TadministratorsDao extends BaseIbatisDao<Tadministrators,java.lang.Integer> implements ITadministratorsDao{

	public Class getEntityClass() {
		return Tadministrators.class;
	}
	
	public void saveOrUpdate(Tadministrators entity) {
		if(entity.getStaffId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
	public Tadministrators getByLonginName(java.lang.String v) {
		return (Tadministrators)getSqlMapClientTemplate().queryForObject("Tadministrators.getByLonginName",v);
	}	
}
