package cn.java.sams.dao;

import cn.java.sams.model.Teacher;

public class TeacherDaoImpl extends BaseDaoImpl<Teacher> implements TeacherDao{

	@Override
	public Teacher getOneTeacher(String teacherNum) {
		String jpql = "from Teacher t where t.teacherNum=?1";
		
		return (Teacher) entityManager.createQuery(jpql).setParameter(1,teacherNum ).getSingleResult();
	}

}
