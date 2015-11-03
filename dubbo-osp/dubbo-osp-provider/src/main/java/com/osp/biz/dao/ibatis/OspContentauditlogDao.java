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

import com.osp.biz.model.OspContentauditlog;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspContentauditlogDao;

@Repository
public class OspContentauditlogDao extends BaseIbatisDao<OspContentauditlog,java.lang.Long> implements IOspContentauditlogDao{

	public Class getEntityClass() {
		return OspContentauditlog.class;
	}
	
	public void saveOrUpdate(OspContentauditlog entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
