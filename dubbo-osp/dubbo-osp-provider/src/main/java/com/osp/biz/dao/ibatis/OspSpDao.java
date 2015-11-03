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

import com.osp.biz.model.OspSp;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspSpDao;

@Repository
public class OspSpDao extends BaseIbatisDao<OspSp,java.lang.Long> implements IOspSpDao{

	public Class getEntityClass() {
		return OspSp.class;
	}
	
	public void saveOrUpdate(OspSp entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
