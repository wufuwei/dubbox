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

import com.osp.biz.model.OspPullcontentto;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspPullcontenttoDao;

@Repository
public class OspPullcontenttoDao extends BaseIbatisDao<OspPullcontentto,java.lang.Long> implements IOspPullcontenttoDao{

	public Class getEntityClass() {
		return OspPullcontentto.class;
	}
	
	public void saveOrUpdate(OspPullcontentto entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
