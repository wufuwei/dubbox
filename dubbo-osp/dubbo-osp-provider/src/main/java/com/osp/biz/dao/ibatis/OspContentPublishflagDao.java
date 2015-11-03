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

import com.osp.biz.model.OspContentPublishflag;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspContentPublishflagDao;

@Repository
public class OspContentPublishflagDao extends BaseIbatisDao<OspContentPublishflag,java.lang.String> implements IOspContentPublishflagDao{

	public Class getEntityClass() {
		return OspContentPublishflag.class;
	}
	
	public void saveOrUpdate(OspContentPublishflag entity) {
		if(entity.getContentinnercode() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
