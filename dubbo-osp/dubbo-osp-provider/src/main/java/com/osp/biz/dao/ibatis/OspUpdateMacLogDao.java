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

import com.osp.biz.model.OspUpdateMacLog;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspUpdateMacLogDao;

@Repository
public class OspUpdateMacLogDao extends BaseIbatisDao<OspUpdateMacLog,java.lang.Integer> implements IOspUpdateMacLogDao{

	public Class getEntityClass() {
		return OspUpdateMacLog.class;
	}
	
	public void saveOrUpdate(OspUpdateMacLog entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
