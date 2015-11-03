package javacommon.base;

import java.io.Serializable;
import java.util.List;

import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


/**
 * @author badqiu
 */
public interface EntityDao <E,PK extends Serializable>{

	public Object getById(PK id);
	
	public void deleteById(PK id);
	
	public void save(E entity);
	
	public void update(E entity);

	public boolean isUnique(E entity, String uniquePropertyNames);
	
	public void flush();
	
	public List<E> findAll();
	
	public Long pageSelectCount(E entity);
	
	public Page findByPageRequest(PageRequest pageRequest);
	
	public void updateDynamic(E entity);
	
	public List<E> findByDynamicWhere(E entity);
	
	public void saveOrUpdate(E entity);
}
