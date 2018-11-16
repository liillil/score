package cn.java.sams.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.java.sams.dao.MajorDao;
import cn.java.sams.model.Major;
@Service("majorService")
public class MajorServiceImpl extends BaseServiceImpl<Major> implements MajorService{
	@Autowired
	private MajorDao majorDao;
}
