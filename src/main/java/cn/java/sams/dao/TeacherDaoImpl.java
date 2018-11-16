package cn.java.sams.dao;

import org.springframework.stereotype.Repository;

import cn.java.sams.model.Teacher;
@Repository("teacherDao")
public class TeacherDaoImpl extends BaseDaoImpl<Teacher> implements TeacherDao{

	@Override
	public Teacher getOneTeacher(String teacherNum) {
		String jpql = "from Teacher t where t.teacherNum=?1";
		
		return (Teacher) entityManager.createQuery(jpql).setParameter(1,teacherNum ).getSingleResult();
	}

	@Override
	public int getTeacherOne(String teacherNum, String password) {
		String jpql = "select count(t) from Teacher t where t.teacherNum=?1 and t.password=?2";
		return determineWhetherAccountPasswordIsCorrect(teacherNum, password, jpql);
	}

}
