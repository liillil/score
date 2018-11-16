package cn.java.sams.dao;

import java.util.List;

import cn.java.sams.model.Courses;

public class CoursesDaoImpl extends BaseDaoImpl<Courses> implements CoursesDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Courses> getClassesResults(String classesNum,int pageNum,int pageSize) {
		String jpql="from Courses c where sClass=?1 ORDER BY c.cName and c.student.studentName";
		return entityManager.createQuery(jpql)
			  .setParameter(1,classesNum)
			  .setFirstResult((pageNum-1)*pageSize)
			  .setMaxResults(pageSize)
			  .getResultList();
	}

}
