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

import com.osp.biz.model.ToprationLog;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IToprationLogDao;

@Repository
public class ToprationLogDao extends BaseIbatisDao<ToprationLog,java.lang.Integer> implements IToprationLogDao{

	public Class getEntityClass() {
		return ToprationLog.class;
	}
	
	public void saveOrUpdate(ToprationLog entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
