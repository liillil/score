package cn.java.sams.test;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.java.sams.model.Courses;
import cn.java.sams.model.Department;
import cn.java.sams.model.Major;
import cn.java.sams.model.Score;
import cn.java.sams.model.Student;
import cn.java.sams.model.Teacher;
import cn.java.sams.service.CoursesService;
import cn.java.sams.service.DepartmentService;
import cn.java.sams.service.MajorService;
import cn.java.sams.service.ScoreService;
import cn.java.sams.service.StudentService;
import cn.java.sams.service.TeacherService;
import cn.java.sams.service.UserService;
import cn.java.sams.util.StringTransferDate;

public class ServiceTest {
	
	@Test
	public void test() throws ParseException {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		ScoreService scs = (ScoreService) ac.getBean("scoreService");
		StudentService ss = (StudentService) ac.getBean("studentService");
//		CoursesService cs = (CoursesService) ac.getBean("coursesService");
//		TeacherService ts = (TeacherService) ac.getBean("teacherService");
//		UserService us = (UserService) ac.getBean("userService");
	//	MajorService ms = (MajorService) ac.getBean("majorService"); 
//		DepartmentService ds = (DepartmentService) ac.getBean("departmentService");
		//System.out.println(ss.getOneStudent("201530310211").getMojor().getmName());
		//System.out.println(ss.getStudentOne("201530310211", "123456"));
//		Teacher teacher = ts.getOne(1);
//		Major major = ms.getOne(1);
//		for(int i = 1;i < 34; i++) {
//			Student student = new Student();
//			student.setStudentName("a"+i);
//			student.setSex(i%2==0?"男":"女");
//			student.setDateOfBirth(StringTransferDate.transfer("1998-05-13"));
//			String studentNum = "2015303102"+(i<10?"0"+i:i);
//			student.setStudentNum(studentNum);
//			student.setPassword(studentNum);
//			student.setPhone("123456789"+(i<10?"0"+i:i));
//			student.setQq("12345678"+(i<10?"0"+i:i));
//			student.setMajor(major);
//			ss.add(student);
//		}
//		
//		List<Courses> coursess = cs.getClassesResults("1533102",1,10);
//		for(Courses courses:coursess) {
//			System.out.println(courses);
//		}
		
//		List<Score> lists = scs.getClassesResult("1533102", 1, 4);
//		for(Score score: lists) {
//			System.out.println(score);
//		}
		
		ss.getOneStudent("201530310211");
	}
}
