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

import com.osp.biz.model.OspContent;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspContentDao;

@Repository
public class OspContentDao extends BaseIbatisDao<OspContent,java.lang.Long> implements IOspContentDao{

	public Class getEntityClass() {
		return OspContent.class;
	}
	
	public void saveOrUpdate(OspContent entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
