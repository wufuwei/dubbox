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

import com.osp.biz.model.TableChannel;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.ITableChannelDao;

@Repository
public class TableChannelDao extends BaseIbatisDao<TableChannel,java.lang.Integer> implements ITableChannelDao{

	public Class getEntityClass() {
		return TableChannel.class;
	}
	
	public void saveOrUpdate(TableChannel entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
