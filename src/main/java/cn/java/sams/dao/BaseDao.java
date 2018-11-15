package cn.java.sams.dao;



public interface BaseDao<T> {
	/**
	 * 通过id条件查找的一条数据
	 * @param id
	 * @return
	 */
	public T getOne(int id);
	
	/**
	 * 修改或添加一条数据
	 * @param t
	 */
	public void merge(T t);
	
	/**
	 * 添加一条数据
	 * @param t
	 */
	public void add(T t);
	
	/**
	 * 删除一条数据
	 */
	public void delete(int id);
}
