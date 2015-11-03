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

import com.osp.biz.model.OspContentaction;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspContentactionDao;

@Repository
public class OspContentactionDao extends BaseIbatisDao<OspContentaction,java.lang.Long> implements IOspContentactionDao{

	public Class getEntityClass() {
		return OspContentaction.class;
	}
	
	public void saveOrUpdate(OspContentaction entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
