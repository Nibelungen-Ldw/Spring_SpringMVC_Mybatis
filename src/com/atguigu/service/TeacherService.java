package com.atguigu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.dao.TeacherDao;
import com.atguigu.pojo.Teacher;

@Service
public class TeacherService {
@Autowired
private TeacherDao teacherDao;

	public Teacher getTeacherByid(int id) {
		// TODO Auto-generated method stub
		return teacherDao.getTeacherById(id);
	}
	
	

}
