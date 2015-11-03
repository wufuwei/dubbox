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

import com.osp.biz.model.OspMember;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspMemberDao;

@Repository
public class OspMemberDao extends BaseIbatisDao<OspMember,java.lang.String> implements IOspMemberDao{

	public Class getEntityClass() {
		return OspMember.class;
	}
	
	public void saveOrUpdate(OspMember entity) {
		if(entity.getUsername() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
