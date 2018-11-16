package cn.java.sams.service;

import java.util.List;

import cn.java.sams.model.Courses;

public interface CoursesService extends BaseService<Courses>{
	/**
	 *  查询班级成绩
	 * @param classesNum
	 * @param studentNum
	 * @param coursesName
	 * @return
	 */
	public List<Courses> getClassesResults(String classesNum,int pageNum,int pageSize);
}
