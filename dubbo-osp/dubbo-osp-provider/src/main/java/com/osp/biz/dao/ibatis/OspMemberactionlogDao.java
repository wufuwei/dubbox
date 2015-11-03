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

import com.osp.biz.model.OspMemberactionlog;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspMemberactionlogDao;

@Repository
public class OspMemberactionlogDao extends BaseIbatisDao<OspMemberactionlog,java.lang.Integer> implements IOspMemberactionlogDao{

	public Class getEntityClass() {
		return OspMemberactionlog.class;
	}
	
	public void saveOrUpdate(OspMemberactionlog entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
