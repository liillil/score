package cn.java.sams.dao;


import org.springframework.stereotype.Repository;

import cn.java.sams.model.User;
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

	@Override
	public User getOneUser(String userId) {
			String jpql = "from User u where u.userId=?1";
			return (User) entityManager.createQuery(jpql).setParameter(1,userId ).getSingleResult();
	}

	@Override
	public int getUserOne(String userId, String password) {
		String jpql = "select count(u) from User u where u.userId=?1 and u.password=?2";
		return determineWhetherAccountPasswordIsCorrect(userId, password, jpql);
	}

}
