package cn.java.sams.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="s_teacher")
public class Teacher {
	private int id;
	private String tName;
	private String teacherNum;
	private String password;
	private Date dateOfEntry;
	private String phone;
	private String qq;
	private Department dpt;
	private List<Courses> lists;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="t_name",length=20)
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	@Column(name="teacher_num",length=20)
	public String getTeacherNum() {
		return teacherNum;
	}
	public void setTeacherNum(String teacherNum) {
		this.teacherNum = teacherNum;
	}
	@Column(name="t_password",length=30)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name="date_of_entry")
	@Temporal(TemporalType.DATE)
	public Date getDateOfEntry() {
		return dateOfEntry;
	}
	public void setDateOfEntry(Date dateOfEntry) {
		this.dateOfEntry = dateOfEntry;
	}
	@Column(name="t_phone",length=11)
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Column(name="t_qq",length=10)
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	@ManyToOne
	@JoinColumn(name="dpt")
	public Department getDpt() {
		return dpt;
	}
	public void setDpt(Department dpt) {
		this.dpt = dpt;
	}
	@OneToMany(mappedBy="teacher")
	public List<Courses> getLists() {
		return lists;
	}
	public void setLists(List<Courses> lists) {
		this.lists = lists;
	}
	public Teacher() {
		super();
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", tName=" + tName + ", teacherNum=" + teacherNum + ", password=" + password
				+ ", dateOfEntry=" + dateOfEntry + ", phone=" + phone + ", qq=" + qq + "]";
	}
	
	
	
}
