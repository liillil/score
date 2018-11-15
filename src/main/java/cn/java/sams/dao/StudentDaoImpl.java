package cn.java.sams.dao;

import cn.java.sams.model.Student;

public class StudentDaoImpl extends BaseDaoImpl<Student> implements StudentDao{

	@Override
	public Student getOneStudent(String studentNum) {
		String jpql = "from Student s where s.studentNum=?1";
		
		return (Student) entityManager.createQuery(jpql).setParameter(1,studentNum).getSingleResult();
	}

}
