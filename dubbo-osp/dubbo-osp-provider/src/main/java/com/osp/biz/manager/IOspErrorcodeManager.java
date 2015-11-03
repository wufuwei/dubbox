/*
 * Powered By wufuwei
 */

package com.osp.biz.manager;

import org.springframework.stereotype.Service;

import com.osp.biz.model.OspErrorcode;
import java.util.*;

import javacommon.base.*;


import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;

/**
 * @author David Wu email:oradb(a)163.com
 * @version 1.0
 * @since 1.0
 */


public interface IOspErrorcodeManager extends EntityManager{
	public OspErrorcode getByErrorcode(java.lang.Integer v);
}
