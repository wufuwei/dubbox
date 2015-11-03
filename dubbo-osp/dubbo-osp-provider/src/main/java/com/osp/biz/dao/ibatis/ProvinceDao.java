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

import com.osp.biz.model.Province;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IProvinceDao;

@Repository
public class ProvinceDao extends BaseIbatisDao<Province,java.lang.Integer> implements IProvinceDao{

	public Class getEntityClass() {
		return Province.class;
	}
	
	public void saveOrUpdate(Province entity) {
		if(entity.getProvinceid() == null) 
			save(entity);
		else 
			update(entity);
	}
	
}
