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

import com.osp.biz.model.TablePlatformInfo;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.ITablePlatformInfoDao;

@Repository
public class TablePlatformInfoDao extends BaseIbatisDao<TablePlatformInfo,java.lang.Integer> implements ITablePlatformInfoDao{

	public Class getEntityClass() {
		return TablePlatformInfo.class;
	}
	
	public void saveOrUpdate(TablePlatformInfo entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
	public TablePlatformInfo getByPlatform(java.lang.String v) {
		return (TablePlatformInfo)getSqlMapClientTemplate().queryForObject("TablePlatformInfo.getByPlatform",v);
	}	
}
