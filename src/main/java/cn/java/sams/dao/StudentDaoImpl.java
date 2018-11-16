package cn.java.sams.dao;

import cn.java.sams.model.Student;

public class StudentDaoImpl extends BaseDaoImpl<Student> implements StudentDao{

	@Override
	public Student getOneStudent(String studentNum) {
		String jpql = "from Student s where s.studentNum=?1";
		
		return (Student) entityManager.createQuery(jpql).setParameter(1,studentNum).getSingleResult();
	}

	@Override
	public int getStudentOne(String studentNum, String password) {
		String jpql = "select count(s) from Student s where s.studentNum=?1 and s.password=?2";
		return determineWhetherAccountPasswordIsCorrect(studentNum, password, jpql);
	}

}
