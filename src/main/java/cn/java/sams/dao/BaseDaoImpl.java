package cn.java.sams.dao;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
@Repository(value="baseDao")
public class BaseDaoImpl<T> implements BaseDao<T>{
	@PersistenceContext
	EntityManager entityManager;
	
	public Class<T> getTClass(){
		@SuppressWarnings("unchecked")
		Class<T> clazz = (Class<T>)((ParameterizedType) this.getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
		return clazz;
	}
	
	@Override
	public T getOne(int id) {
		
		return entityManager.find(getTClass(), id);
	}

	@Override
	public void merge(T t) {
		entityManager.merge(t);
		
	}

	@Override
	public void add(T t) {
		entityManager.persist(t);
		
	}

	@Override
	public void delete(int id) {
		entityManager.remove(getOne(id));
	}

}
