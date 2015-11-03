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

import com.osp.biz.model.OspAppencode;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspAppencodeDao;

@Repository
public class OspAppencodeDao extends BaseIbatisDao<OspAppencode,java.lang.Long> implements IOspAppencodeDao{

	public Class getEntityClass() {
		return OspAppencode.class;
	}
	
	public void saveOrUpdate(OspAppencode entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
