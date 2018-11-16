package cn.java.sams.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

	@Override
	public int determineWhetherAccountPasswordIsCorrect(String id, String password,String jpql) {
		Query query = entityManager.createQuery(jpql);
		query.setParameter(1, id);
		query.setParameter(2, password);
		Integer i = Integer.parseInt(query.getSingleResult().toString());
		int count = i == null?0:i;

		return count;
	}

}
