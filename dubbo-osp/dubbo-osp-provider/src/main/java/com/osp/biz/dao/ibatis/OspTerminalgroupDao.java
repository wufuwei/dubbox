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

import com.osp.biz.model.OspTerminalgroup;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspTerminalgroupDao;

@Repository
public class OspTerminalgroupDao extends BaseIbatisDao<OspTerminalgroup,java.lang.Long> implements IOspTerminalgroupDao{

	public Class getEntityClass() {
		return OspTerminalgroup.class;
	}
	
	public void saveOrUpdate(OspTerminalgroup entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
