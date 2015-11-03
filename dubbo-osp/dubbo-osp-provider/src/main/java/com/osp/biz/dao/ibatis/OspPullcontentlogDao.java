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

import com.osp.biz.model.OspPullcontentlog;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspPullcontentlogDao;

@Repository
public class OspPullcontentlogDao extends BaseIbatisDao<OspPullcontentlog,java.lang.Long> implements IOspPullcontentlogDao{

	public Class getEntityClass() {
		return OspPullcontentlog.class;
	}
	
	public void saveOrUpdate(OspPullcontentlog entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
