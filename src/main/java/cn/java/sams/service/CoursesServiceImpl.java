package cn.java.sams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.java.sams.dao.CoursesDao;
import cn.java.sams.model.Courses;
@Service("coursesService")
public class CoursesServiceImpl extends BaseServiceImpl<Courses> implements CoursesService{

	@Autowired
	private CoursesDao coursesDao;
	@Override
	public List<Courses> getClassesResults(String classesNum, int pageNum, int pageSize) {
		return coursesDao.getClassesResults(classesNum, pageNum, pageSize);
	}

}
