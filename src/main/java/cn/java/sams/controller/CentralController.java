package cn.java.sams.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.java.sams.model.Score;
import cn.java.sams.service.ScoreService;
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
	@Autowired
	private ScoreService scoreService;
	/**
	 * 每页的最大数据条数
	 */
	private static final int PAGE_MAX = 10;
	/**
	 * 总页数
	 */
	private static int pagination = 1;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.setLenient(false);//设置为true为宽松解析，当输入2000-6-32时会解析为2000-7-2，设置为false为严格解析，格式不正确会报错
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf,true));
		binder.registerCustomEditor(Double.class,  new CustomNumberEditor(Double.class,true));
	}
	
	
	@RequestMapping("login")
	public String login() {
		return "/login";
	}
	
	@RequestMapping("loginView")
	public String loginView(@RequestParam(name="AccountNumber",required=false)String AccountNumber,
			@RequestParam(name="password",required=false) String password,
			@RequestParam(name="accountType",required=false) String accountType,
			Model model) {
		if(accountType == null) {
			accountType = "student";
		}
		switch (accountType) {
		case "student":
			int i = ss.getStudentOne(AccountNumber, password);
			if(i==0) {
				model.addAttribute("fail", "账号或密码错误");
				return "login";
			}
			model.addAttribute("student",ss.getOneStudent(AccountNumber));
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
	
	@RequestMapping(name="classesScore")
	public String classResult(Model model,@RequestParam(name="studentNum") String studentNum) {
		model.addAttribute("student", ss.getOneStudent(studentNum));
		model.addAttribute("sign", 2);
		return "/main";
	}
	
	@RequestMapping(name="classerScoreView")
	public String getClassResult(@RequestParam(value = "pageNum", defaultValue = "1", required = false) int pageNum,
			@RequestParam(value="classerId", required = false) String classesId,
			Model model) {
		pageNum = pageNum < 1?1:pageNum;
		pageNum = pageNum > pagination?pagination:pageNum;
		if(classesId == null || classesId == "") {
		 return "/main";
		}
		List<List<Score>> lists = scoreService.getClassesResult(classesId, pageNum, PAGE_MAX);
		//List<Score> courseses = scoreService.getCoursesCount(classesId);
		double i = lists.size()/(double) PAGE_MAX;
		pagination = (int) Math.ceil(i)==0?1:(int) Math.ceil(i);
		model.addAttribute("classesId",classesId);
		model.addAttribute("pagination", pagination);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("lists", lists);
	//	model.addAttribute("courseses", courseses);
		return "/main";
	}
}
