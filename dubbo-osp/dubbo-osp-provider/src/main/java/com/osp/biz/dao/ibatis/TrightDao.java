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

import com.osp.biz.model.Tright;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.ITrightDao;

@Repository
public class TrightDao extends BaseIbatisDao<Tright,java.lang.Integer> implements ITrightDao{

	public Class getEntityClass() {
		return Tright.class;
	}
	
	public void saveOrUpdate(Tright entity) {
		if(entity.getRightId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
