package cn.java.sams.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.java.sams.service.StudentService;
import cn.java.sams.service.TeacherService;
import cn.java.sams.service.UserService;

@Controller
public class StudentController {
	@Autowired
	private StudentService ss;
	@Autowired
	private TeacherService ts;
	@Autowired
	private UserService us;
	@RequestMapping("score")
	public String info(@RequestParam(name="sign") int sign,
			Model model) {
		Integer integer = null;
		if(sign==1) {
			integer = 1;
		}
		
		model.addAttribute("sign", integer);
		return "/main";
		
		
	}
}
