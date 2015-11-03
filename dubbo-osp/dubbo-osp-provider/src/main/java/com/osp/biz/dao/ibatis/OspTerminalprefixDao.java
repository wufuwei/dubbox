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

import com.osp.biz.model.OspTerminalprefix;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspTerminalprefixDao;

@Repository
public class OspTerminalprefixDao extends BaseIbatisDao<OspTerminalprefix,java.lang.Long> implements IOspTerminalprefixDao{

	public Class getEntityClass() {
		return OspTerminalprefix.class;
	}
	
	public void saveOrUpdate(OspTerminalprefix entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
