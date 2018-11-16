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
public class CentralController {
	@Autowired
	private StudentService ss;
	@Autowired
	private TeacherService ts;
	@Autowired
	private UserService us;
	@RequestMapping("/login")
	public String login(@RequestParam(name="AccountNumber",required=false)String AccountNumber,
			@RequestParam(name="password",required=false) String password,
			@RequestParam(name="accountType",required=false) String accountType,
			Model model) {
		
		switch (accountType) {
		case "student":
			int i = ss.getStudentOne(AccountNumber, password);
			if(i==0) {
				model.addAttribute("fail", "账号或密码错误");
				return "login";
			}
			return "/main";
		case "teacher":
			int n = ts.getTeacherOne(AccountNumber, password);
			if(n==0) {
				model.addAttribute("fail", "账号或密码错误");
				return "login";
			}
			return "/main";
		case "user":
			int m = us.getUserOne(AccountNumber, password);
			if(m==0) {
				model.addAttribute("fail", "账号或密码错误");
				return "login";
			}
			return "/main";
		default:
			return "/error";
			
		}
	
	}
	
}
