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

import com.osp.biz.model.TroleRight;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.ITroleRightDao;

@Repository
public class TroleRightDao extends BaseIbatisDao<TroleRight,java.lang.Integer> implements ITroleRightDao{

	public Class getEntityClass() {
		return TroleRight.class;
	}
	
	public void saveOrUpdate(TroleRight entity) {
		if(entity.getRoleId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
