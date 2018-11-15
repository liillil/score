package cn.java.sams.dao;


import cn.java.sams.model.User;

public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

	@Override
	public User getOneUser(String userId) {
			String jpql = "from User u where u.userId=?1";
			return (User) entityManager.createQuery(jpql).setParameter(1,userId ).getSingleResult();
	}

}
