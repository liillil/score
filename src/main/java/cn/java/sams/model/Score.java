package cn.java.sams.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="score")
public class Score {
	/**
	 * 主键
	 */
	private int id;
	/**
	 * 成绩
	 */
	private int score;
	/**
	 * 学生
	 */
	private Student student;
	/**
	 * 课程
	 */
	private Courses courses;
	/**
	 * 所在班级编号
	 */
	private String sClass;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="score",length=3)
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@ManyToOne
	@JoinColumn(name="courses")
	public Courses getCourses() {
		return courses;
	}
	public void setCourses(Courses courses) {
		this.courses = courses;
	}
	@ManyToOne
	@JoinColumn(name="student_id")
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Column(name="s_class",length=20)
	public String getsClass() {
		return sClass;
	}
	public void setsClass(String sClass) {
		this.sClass = sClass;
	}
	@Override
	public String toString() {
		return "Score [id=" + id + ", score=" + score + ", student=" + student.getStudentName() + ", courses=" + courses.getcName() + ", sClass="
				+ sClass + "]";
	}
	
}
