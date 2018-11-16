package cn.java.sams.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.java.sams.dao.TeacherDao;
import cn.java.sams.model.Teacher;
@Service(" teacherService")
public class TeacherServiceImpl extends BaseServiceImpl<Teacher> implements TeacherService {

	@Autowired
	private TeacherDao teacherDao;
	@Override
	public Teacher getOneTeacher(String teacherNum) {
		
		return teacherDao.getOneTeacher(teacherNum);
	}

	@Override
	public int getTeacherOne(String teacherNum, String password) {
		return teacherDao.getTeacherOne(teacherNum, password);
	}
	
}
