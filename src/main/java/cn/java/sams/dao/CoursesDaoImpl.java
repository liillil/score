package cn.java.sams.dao;



import org.springframework.stereotype.Repository;

import cn.java.sams.model.Courses;
@Repository("coursesDao")
public class CoursesDaoImpl extends BaseDaoImpl<Courses> implements CoursesDao {

	@Override
	public Courses getCoursesInfo(String cName) {
		String jpql = "from Courses c where c.cName=?1";
		
		return (Courses) entityManager.createQuery(jpql).setParameter(1,cName).getSingleResult();
	}

	

}
