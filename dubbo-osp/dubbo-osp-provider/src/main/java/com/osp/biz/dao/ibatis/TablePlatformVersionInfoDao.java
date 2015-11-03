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

import com.osp.biz.model.TablePlatformVersionInfo;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.ITablePlatformVersionInfoDao;

@Repository
public class TablePlatformVersionInfoDao extends BaseIbatisDao<TablePlatformVersionInfo,java.lang.Integer> implements ITablePlatformVersionInfoDao{

	public Class getEntityClass() {
		return TablePlatformVersionInfo.class;
	}
	
	public void saveOrUpdate(TablePlatformVersionInfo entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
