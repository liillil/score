package cn.java.sams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.java.sams.dao.ScoreDao;
import cn.java.sams.model.Score;
import cn.java.sams.model.Student;
@Service("scoreService")
public class ScoreServiceImpl extends BaseServiceImpl<Score> implements ScoreService{
	@Autowired
	private ScoreDao scoreDao;
	@Override
	public List<List<Score>> getClassesResult(String classesId, int pageNum, int pageMax) {
		List<Score> student = null;
		List<List<Score>> students = null;
		Student stu1 = null;
		Student stu2 = null;
		List<Score> lists =	scoreDao.getClassesResult(classesId, pageNum, pageMax);
		for(Score score : lists) {
			stu1 = score.getStudent();
			if(stu1 == stu2) {
				student.add(score);
			}
			if(stu1 != stu2) {
				if(stu2 != null) {
					students.add(student);
				}
				student.clear();
				student.add(score);		
			}
			stu2 = score.getStudent();
		}
		
		return students;
	}
	@Override
	public List<Score> getStudentCount(String classesId) {
		
		return scoreDao.getStudentCount(classesId);
	}
	@Override
	public List<Score> getCoursesCount(String classesId) {
		
		return scoreDao.getCoursesCount(classesId);
	}

}
