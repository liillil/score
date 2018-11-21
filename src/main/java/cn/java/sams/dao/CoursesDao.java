package cn.java.sams.dao;



import cn.java.sams.model.Courses;

public interface CoursesDao extends BaseDao<Courses>{
	/**
	 *  课程信息
	 * @param classesNum
	 * @param studentNum
	 * @param coursesName
	 * @return
	 */
	public Courses getCoursesInfo(String cName);
	
	
}
