package cn.java.sams.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.java.sams.dao.UserDao;
import cn.java.sams.model.User;
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public User getOneUser(String userId) {
		return userDao.getOneUser(userId);
	}

	@Override
	public int getUserOne(String userId, String password) {
		// TODO Auto-generated method stub
		return userDao.getUserOne(userId, password);
	}

}
