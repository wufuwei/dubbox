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

import com.osp.biz.model.Tsequence;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.ITsequenceDao;

@Repository
public class TsequenceDao extends BaseIbatisDao<Tsequence,java.lang.String> implements ITsequenceDao{

	public Class getEntityClass() {
		return Tsequence.class;
	}
	
	public void saveOrUpdate(Tsequence entity) {
		if(entity.getName() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
