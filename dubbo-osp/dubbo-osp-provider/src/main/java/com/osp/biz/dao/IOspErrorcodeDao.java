/*
 * Powered By wufuwei
 */

package com.osp.biz.dao;

import java.util.*;

import javacommon.base.*;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;

/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */

import com.osp.biz.model.OspErrorcode;

public interface IOspErrorcodeDao extends EntityDao<OspErrorcode,java.lang.Long>{

	public Class getEntityClass();
	
	public OspErrorcode getByErrorcode(java.lang.Integer v) ;
	
}
