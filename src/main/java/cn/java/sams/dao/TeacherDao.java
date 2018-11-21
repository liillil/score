package cn.java.sams.dao;

import cn.java.sams.model.Teacher;

public interface TeacherDao extends BaseDao<Teacher> {
	/**
	 * 通过教师名称查询以为老师的信息
	 * @return
	 */
	public Teacher getOneTeacher(String teacherName);
	
	/**
	 *  验证教师编号和密码是否存在
	 * @param teacherNum
	 * @param password
	 * @return
	 */
	public int getTeacherOne(String teacherNum,String password);
}
