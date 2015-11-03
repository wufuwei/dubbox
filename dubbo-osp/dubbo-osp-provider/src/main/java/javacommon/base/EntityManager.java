package javacommon.base;

import java.io.Serializable;
import java.util.List;

import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;

/**
 * @author badqiu
 */
public interface EntityManager <E,PK extends Serializable>{
	
	public E getById(PK id) ;
	
	public List<E> findAll();
	
	public void saveOrUpdate(E entity);
	
	public void save(E entity);
	
	public void removeById(PK id);
	
	public void update(E entity);
	
	public boolean isUnique(E entity, String uniquePropertyNames);
	
	public Long pageSelectCount(E entity);
	
	
	public Page findByPageRequest(PageRequest pr) ;
	
	
	public void updateDynamic(E entity);
	
	public List<E> findByDynamicWhere(E entity);
}
