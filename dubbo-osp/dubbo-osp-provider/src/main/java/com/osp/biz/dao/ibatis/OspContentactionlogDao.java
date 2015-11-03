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

import com.osp.biz.model.OspContentactionlog;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspContentactionlogDao;

@Repository
public class OspContentactionlogDao extends BaseIbatisDao<OspContentactionlog,java.lang.Long> implements IOspContentactionlogDao{

	public Class getEntityClass() {
		return OspContentactionlog.class;
	}
	
	public void saveOrUpdate(OspContentactionlog entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
