package cn.java.sams.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.java.sams.dao.StudentDao;
import cn.java.sams.model.Student;
@Service("studentService")
public class StudentServiceImpl extends BaseServiceImpl<Student> implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public Student getOneStudent(String studentNum) {
		
		return studentDao.getOneStudent(studentNum);
	}

	@Override
	public int getStudentOne(String studentNum, String password) {
		return studentDao.getStudentOne(studentNum, password);
	}

}
