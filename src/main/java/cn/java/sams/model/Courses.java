package cn.java.sams.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//@Entity
//@Table(name="s_courses")
public class Courses {
	/**
	 * 主键
	 */
	private int id;
	/**
	 * 任课教师
	 */
	private Teacher teacher;
	/**
	 * 课程名
	 */
	private String cName;
	/**
	 * 成绩
	 */
	private int score;
	/**
	 * 学生
	 */
	private Student student;
	/**
	 * 学期
	 */
	private String term;
	/**
	 * 所在专业
	 */
	private Major mojor;
	/**
	 * 所在班级编号
	 */
	private String sClass;
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@ManyToOne
	@JoinColumn(name="teacher_id")
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Column(name="c_name",length=20)
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	@Column(name="score",length=3)
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@ManyToOne
	@JoinColumn(name="student_id")
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Column(name="term",length=20)
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	@Column(name="mojor_id")
	public Major getMojor() {
		return mojor;
	}
	public void setMojor(Major mojor) {
		this.mojor = mojor;
	}
	@Column(name="s_class",length=20)
	public String getsClass() {
		return sClass;
	}
	public void setsClass(String sClass) {
		this.sClass = sClass;
	}
	public Courses() {
		super();
	}
	
	
}
