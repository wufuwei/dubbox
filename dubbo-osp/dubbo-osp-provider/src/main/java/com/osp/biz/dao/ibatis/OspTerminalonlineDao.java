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

import com.osp.biz.model.OspTerminalonline;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspTerminalonlineDao;

@Repository
public class OspTerminalonlineDao extends BaseIbatisDao<OspTerminalonline,java.lang.Long> implements IOspTerminalonlineDao{

	public Class getEntityClass() {
		return OspTerminalonline.class;
	}
	
	public void saveOrUpdate(OspTerminalonline entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
