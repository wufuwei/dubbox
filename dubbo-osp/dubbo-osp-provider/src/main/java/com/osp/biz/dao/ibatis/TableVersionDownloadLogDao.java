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

import com.osp.biz.model.TableVersionDownloadLog;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.ITableVersionDownloadLogDao;

@Repository
public class TableVersionDownloadLogDao extends BaseIbatisDao<TableVersionDownloadLog,java.lang.Integer> implements ITableVersionDownloadLogDao{

	public Class getEntityClass() {
		return TableVersionDownloadLog.class;
	}
	
	public void saveOrUpdate(TableVersionDownloadLog entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
