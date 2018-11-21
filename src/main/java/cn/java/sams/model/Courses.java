package cn.java.sams.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.br.CNPJ;
@Entity
@Table(name="s_courses")
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
	 * 开课日期
	 */
	private Date term;
	/**
	 * 学分
	 */
	private int credit;
	/**
	 * 学时
	 */
	private int period;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	@Column(name="Term")
	@Temporal(TemporalType.DATE)
	public Date getTerm() {
		return term;
	}
	public void setTerm(Date term) {
		this.term = term;
	}
	@Column(length=5)
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	@Column(length=5)
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public Courses() {
		super();
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", teacher=" + teacher + ", cName=" + cName + ", term=" + term + ", credit="
				+ credit + ", period=" + period + "]";
	}
	
	
}
