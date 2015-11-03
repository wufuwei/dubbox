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

import com.osp.biz.model.Trole;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.ITroleDao;

@Repository
public class TroleDao extends BaseIbatisDao<Trole,java.lang.Integer> implements ITroleDao{

	public Class getEntityClass() {
		return Trole.class;
	}
	
	public void saveOrUpdate(Trole entity) {
		if(entity.getRoleId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
