package cn.java.sams.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
//@Entity
//@Table(name="s_student")
public class Student {
	/**
	 * 主键
	 */
	private int id;
	/**
	 * 学号
	 */
	private String studentNum;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 姓名
	 */
	private String studentName;
	/**
	 * 联系电话
	 */
	private String phone;
	/**
	 * qq号
	 */
	private String qq;
	/**
	 * 出生日期
	 */
	private Date dateOfBirth;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 成绩表
	 */
	private List<Courses> lists;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="student_num",length=20)
	public String getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}
	@Column(name="s_password",length=30)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name="student_name",length=20)
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Column(name="s_phone",length=11)
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Column(name="s_qq",length=10)
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	@Temporal(TemporalType.DATE)
	@Column(name="s_date_of_birth")
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Column(name="sex",length=1)
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@OneToMany(mappedBy="student")
	public List<Courses> getLists() {
		return lists;
	}
	public void setLists(List<Courses> lists) {
		this.lists = lists;
	}
	public Student() {
		super();
	}
	
}
