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

import com.osp.biz.model.OspContentStat;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspContentStatDao;

@Repository
public class OspContentStatDao extends BaseIbatisDao<OspContentStat,java.lang.String> implements IOspContentStatDao{

	public Class getEntityClass() {
		return OspContentStat.class;
	}
	
	public void saveOrUpdate(OspContentStat entity) {
		if(entity.getContentinnercode() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
