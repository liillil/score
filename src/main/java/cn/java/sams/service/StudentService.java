package cn.java.sams.service;

import cn.java.sams.model.Student;

public interface StudentService extends BaseService<Student>{
	/**
	 *  通过学号查询一个学生的信息
	 * @param studentNum
	 * @return
	 */
	public Student getOneStudent(String studentNum);
	
	/**
	 *  验证学号和密码是否存在
	 * @param studentNum
	 * @param password
	 * @return
	 */
	public int getStudentOne(String studentNum,String password);
}
