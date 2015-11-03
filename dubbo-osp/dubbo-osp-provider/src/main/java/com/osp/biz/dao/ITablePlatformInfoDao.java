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

import com.osp.biz.model.TablePlatformInfo;

public interface ITablePlatformInfoDao extends EntityDao<TablePlatformInfo,java.lang.Integer>{

	public Class getEntityClass();
	
	public TablePlatformInfo getByPlatform(java.lang.String v) ;
	
}
