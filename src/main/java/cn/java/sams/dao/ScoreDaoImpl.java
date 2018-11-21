package cn.java.sams.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import cn.java.sams.model.Score;
@Repository("scoreDao")
public class ScoreDaoImpl extends BaseDaoImpl<Score> implements ScoreDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Score> getClassesResult(String classesId, int pageNum, int pageMax) {
		String jpql = "select s from Score s where s.sClass=?1 order by s.courses.cName asc,s.student.studentNum asc";
		return   entityManager.createQuery(jpql)
				.setParameter(1, classesId)
				.setFirstResult((pageNum-1)*pageMax)
				.setMaxResults(pageMax)
				.getResultList();
	}

	@Override
	public List<Score> getStudentCount(String classesId) {
		String jpql = "select s from Score s where s.sClass=?1 group by s.student ORDER BY s.student";
		Query query = entityManager.createQuery(jpql);
		query.setParameter(1, classesId);
		List<Score> students = query.getResultList();
		return  students;
	}

	@Override
	public List<Score> getCoursesCount(String classesId) {
		String jpql = "select s from Score s where s.sClass=?1 group by s.courses ORDER BY s.courses";
		Query query = entityManager.createQuery(jpql);
		query.setParameter(1, classesId);
		List<Score> courseses = query.getResultList();
		return courseses;
	}

}
