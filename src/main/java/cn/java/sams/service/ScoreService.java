package cn.java.sams.service;

import java.util.List;

import cn.java.sams.model.Score;

public interface ScoreService {
	/**
	 * 查询班级成绩
	 * @param classesId
	 * @param pageNum
	 * @param pageMax
	 * @return
	 */
	public List<List<Score>> getClassesResult(String classesId,int pageNum,int pageMax);
	
	/**
	 * 获取一个班级学生人数
	 * @param classesId
	 * @return
	 */
	public List<Score> getStudentCount(String classesId);
	
	/**
	 * 查询一个班级的科目
	 * @param classesId
	 * @return
	 */
	public List<Score> getCoursesCount(String classesId);
}
