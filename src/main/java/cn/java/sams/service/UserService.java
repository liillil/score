package cn.java.sams.service;

import cn.java.sams.model.User;

public interface UserService extends BaseService<User>{

	/**
	 * 通过编号获得一位管理员的信息
	 * @return
	 */
	public User getOneUser(String userId);
	
	/**
	 *  验证管理员编号和密码是否存在
	 * @param userId
	 * @param password
	 * @return
	 */
	public int getUserOne(String userId,String password);
}
