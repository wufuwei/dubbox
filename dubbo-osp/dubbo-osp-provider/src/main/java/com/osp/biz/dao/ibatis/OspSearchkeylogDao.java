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

import com.osp.biz.model.OspSearchkeylog;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspSearchkeylogDao;

@Repository
public class OspSearchkeylogDao extends BaseIbatisDao<OspSearchkeylog,java.lang.Long> implements IOspSearchkeylogDao{

	public Class getEntityClass() {
		return OspSearchkeylog.class;
	}
	
	public void saveOrUpdate(OspSearchkeylog entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
