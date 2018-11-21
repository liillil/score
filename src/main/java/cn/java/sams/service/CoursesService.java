package cn.java.sams.service;

import java.util.List;

import cn.java.sams.model.Courses;

public interface CoursesService extends BaseService<Courses>{
	/**
	 *  课程信息
	 * @param classesNum
	 * @param studentNum
	 * @param coursesName
	 * @return
	 */
	public Courses getCoursesInfo(String cName);
}
