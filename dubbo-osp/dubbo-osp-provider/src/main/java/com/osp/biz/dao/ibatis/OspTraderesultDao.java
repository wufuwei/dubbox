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

import com.osp.biz.model.OspTraderesult;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspTraderesultDao;

@Repository
public class OspTraderesultDao extends BaseIbatisDao<OspTraderesult,java.lang.Integer> implements IOspTraderesultDao{

	public Class getEntityClass() {
		return OspTraderesult.class;
	}
	
	public void saveOrUpdate(OspTraderesult entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
