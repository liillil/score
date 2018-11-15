package cn.java.sams.dao;

import java.util.List;

import cn.java.sams.model.Courses;

public interface CoursesDao extends BaseDao<Courses>{
	/**
	 *  查询班级成绩
	 * @param classesNum
	 * @param studentNum
	 * @param coursesName
	 * @return
	 */
	public List<Courses> getClassesResults(String classesNum);
	
	
}
