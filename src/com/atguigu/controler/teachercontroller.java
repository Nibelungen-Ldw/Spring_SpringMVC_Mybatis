package com.atguigu.controler;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.atguigu.dao.TeacherDao;
import com.atguigu.pojo.Teacher;
import com.atguigu.service.TeacherService;
import com.sun.net.httpserver.Authenticator.Success;

@Controller
public class teachercontroller {
	@Autowired
	private TeacherService teacherService;
@RequestMapping("/getea")
	public String getTeacher(@RequestParam(value="id",defaultValue="1")int id,Model model){
	Teacher teacher = teacherService.getTeacherByid(id);
	model.addAttribute("tea",teacher);
	return "sucess";
}
}
