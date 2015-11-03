package javacommon.base;

import java.io.Serializable;
import java.util.List;

import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.osp.biz.model.OspContent;
/**
 * @author badqiu
 */
public abstract class BaseManager <E,PK extends Serializable> implements EntityManager<E,PK>{
	
	protected Log log = LogFactory.getLog(getClass());

	protected abstract EntityDao getEntityDao();

	public E getById(PK id) {
		return (E)getEntityDao().getById(id);
	}
	
	public List<E> findAll() {
		return getEntityDao().findAll();
	}
	
	
	public void save(E entity) {
		getEntityDao().save(entity);
	}
	
	public void removeById(PK id) {
		getEntityDao().deleteById(id);
	}
	
	public void update(E entity) {
		getEntityDao().update(entity);
	}
	
	public boolean isUnique(E entity, String uniquePropertyNames) {
		return getEntityDao().isUnique(entity, uniquePropertyNames);
	}
	
	public Long pageSelectCount(E entity){
		return getEntityDao().pageSelectCount(entity);
	}
	
	public Page findByPageRequest(PageRequest pr) {
		return getEntityDao().findByPageRequest(pr);
	}
	
	
	public void updateDynamic(E entity){
		getEntityDao().updateDynamic(entity);
	}
	
	public List<E> findByDynamicWhere(E entity){
		return getEntityDao().findByDynamicWhere(entity);
	}
	
	public  void saveOrUpdate(E entity){
		 getEntityDao().saveOrUpdate(entity);
	}
	
	

}
