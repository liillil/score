package cn.java.sams.service;

import org.springframework.beans.factory.annotation.Autowired;

import cn.java.sams.dao.BaseDao;

public class BaseServiceImpl<T> implements BaseService<T> {
	@Autowired
	private BaseDao<T> baseDao;
	@Override
	public T getOne(int id) {
		
		return baseDao.getOne(id);
	}

	@Override
	public void merge(T t) {
		baseDao.merge(t);
		
	}

	@Override
	public void delete(int id) {
		baseDao.delete(id);
		
	}
	@Override
	public void add(T t) {
		baseDao.add(t);
		
	}

}
