package cn.java.sams.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.java.sams.dao.DepartmentDao;
import cn.java.sams.model.Department;
@Service("departmentService")
public class DepartmentServiceImpl extends BaseServiceImpl<Department> implements DepartmentService {
	@Autowired
	private DepartmentDao departmentDao ;
}
