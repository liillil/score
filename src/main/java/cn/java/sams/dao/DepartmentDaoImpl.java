package cn.java.sams.dao;

import org.springframework.stereotype.Repository;

import cn.java.sams.model.Department;
@Repository("departmentDao")
public class DepartmentDaoImpl extends BaseDaoImpl<Department> implements DepartmentDao{

}
