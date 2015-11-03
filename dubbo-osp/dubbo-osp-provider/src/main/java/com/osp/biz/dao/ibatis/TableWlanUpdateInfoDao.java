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

import com.osp.biz.model.TableWlanUpdateInfo;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.ITableWlanUpdateInfoDao;

@Repository
public class TableWlanUpdateInfoDao extends BaseIbatisDao<TableWlanUpdateInfo,java.lang.Integer> implements ITableWlanUpdateInfoDao{

	public Class getEntityClass() {
		return TableWlanUpdateInfo.class;
	}
	
	public void saveOrUpdate(TableWlanUpdateInfo entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
