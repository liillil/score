package cn.java.sams.model;

import java.util.Date;
import java.util.List;

public class Student {
	private int id;
	private String studentNum;
	private String password;
	private String studentName;
	private String phone;
	private String qq;
	private Date dateOfBirth;
	private String sex;
	private List<Courses> lists;
	private Major mojor;
	private String sClass;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public List<Courses> getLists() {
		return lists;
	}
	public void setLists(List<Courses> lists) {
		this.lists = lists;
	}
	public Major getMojor() {
		return mojor;
	}
	public void setMojor(Major mojor) {
		this.mojor = mojor;
	}
	public String getsClass() {
		return sClass;
	}
	public void setsClass(String sClass) {
		this.sClass = sClass;
	}
	public Student() {
		super();
	}
	
}
