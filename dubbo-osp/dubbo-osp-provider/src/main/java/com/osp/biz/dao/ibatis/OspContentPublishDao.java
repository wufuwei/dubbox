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

import com.osp.biz.model.OspContentPublish;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspContentPublishDao;

@Repository
public class OspContentPublishDao extends BaseIbatisDao<OspContentPublish,java.lang.Long> implements IOspContentPublishDao{

	public Class getEntityClass() {
		return OspContentPublish.class;
	}
	
	public void saveOrUpdate(OspContentPublish entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
