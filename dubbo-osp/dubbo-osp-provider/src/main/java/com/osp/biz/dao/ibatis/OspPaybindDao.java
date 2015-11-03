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

import com.osp.biz.model.OspPaybind;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspPaybindDao;

@Repository
public class OspPaybindDao extends BaseIbatisDao<OspPaybind,java.lang.Long> implements IOspPaybindDao{

	public Class getEntityClass() {
		return OspPaybind.class;
	}
	
	public void saveOrUpdate(OspPaybind entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
