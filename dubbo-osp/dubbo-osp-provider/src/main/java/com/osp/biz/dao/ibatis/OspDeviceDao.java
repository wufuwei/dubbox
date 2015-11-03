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

import com.osp.biz.model.OspDevice;

import org.springframework.stereotype.Repository;

import com.osp.biz.dao.IOspDeviceDao;

@Repository
public class OspDeviceDao extends BaseIbatisDao<OspDevice,java.lang.Long> implements IOspDeviceDao{

	public Class getEntityClass() {
		return OspDevice.class;
	}
	
	public void saveOrUpdate(OspDevice entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
	public OspDevice getByImei(java.lang.String v) {
		return (OspDevice)getSqlMapClientTemplate().queryForObject("OspDevice.getByImei",v);
	}	
}
