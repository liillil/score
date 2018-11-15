package cn.java.sams.dao;

import cn.java.sams.model.User;

public interface UserDao extends BaseDao<User> {

	/**
	 * 通过编号获得一位管理员的信息
	 * @return
	 */
	public User getOneUser(String userId);
}
