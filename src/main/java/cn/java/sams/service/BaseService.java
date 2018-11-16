package cn.java.sams.service;

public interface BaseService<T> {
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
	 * 删除一条数据
	 */
	public void delete(int id);
	
	/**通过账号密码查找用户是否存在
	 * 
	 * @param id
	 * @param password
	 * @return
	 */
	public int determineWhetherAccountPasswordIsCorrect(String id, String password,String jpql);
	
}
