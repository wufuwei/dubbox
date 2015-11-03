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

import com.osp.biz.model.OspOrderitem;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspOrderitemDao;

@Repository
public class OspOrderitemDao extends BaseIbatisDao<OspOrderitem,java.lang.Long> implements IOspOrderitemDao{

	public Class getEntityClass() {
		return OspOrderitem.class;
	}
	
	public void saveOrUpdate(OspOrderitem entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
