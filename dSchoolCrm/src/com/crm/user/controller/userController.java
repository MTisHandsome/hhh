package com.crm.user.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.bean.Car;
import com.crm.bean.School;
import com.crm.bean.Score;
import com.crm.bean.Tea;
import com.crm.bean.User;
import com.crm.car.service.CarService;
import com.crm.school.service.SchoolService;
import com.crm.tea.service.teaService;
import com.crm.user.service.UserService;

@Controller
@RequestMapping("/user")
public class userController {
	@Resource
	private UserService userService;
	
	@Resource
	private teaService teaservice;
	
	@Resource
	private CarService carservice;
	
	@Resource
	private SchoolService schoolservice;
	@RequestMapping("/list")
	public String list(Model model) {
		List<User> list = userService.allUser();
		model.addAttribute("list", list);
		return "sys/User_List";
	}

	@RequestMapping("/toAdd")
	public String toadd() {
		return "sys/User_add";
	}

	@RequestMapping("/add")
	public String add(User user) {
		userService.add(user);
		return "redirect:../user/list.action";
	}

	@RequestMapping("/deleteUser")
	public String del(int id) {
		userService.deleteUser(id);
		return "redirect:../user/list.action";
	}

	@RequestMapping("/toEdit")
	public String toEdit(int id, Model model) {
		User user = userService.toEdit(id);
		model.addAttribute("user", user);
		return "sys/User_update";
	}

	@RequestMapping("/update")
	public String update(User user) {
		userService.update(user);
		return "redirect:../user/list.action";
	}

	@RequestMapping("/del")
	@ResponseBody
	public String delStansard(Integer[] ids) { // 传过来的是一个名叫ids的数组
		try {
			System.out.println(ids);
			userService.delUsers(ids);// 删除的方法
		} catch (Exception e) {
			// TODO: handle exception
			return "error";
		}
		return "ok";
	}
	@RequestMapping("/to")
	public String toaddtea(int id,Model model) {
		User user = userService.toEdit(id);
		model.addAttribute("user", user);
		List<School> school = schoolservice.allSchool();
		model.addAttribute("school", school);
		return "sys/user_add_tea";
	}
	@RequestMapping("/addtea")
	public String addtea(User user) {
		userService.update(user);
		return "redirect:../user/list.action";
	}
	@RequestMapping("/queryAllUser")
	public String queryAllUser(Model model) {
		List<User> list = userService.queryAllUser();
		model.addAttribute("list", list);
		return "user/score";
	}
	@RequestMapping("/toScore")
	public String toScore(Integer id,Model model) {
		List<User> list = userService.selUserScore(id);
		System.out.println();
		model.addAttribute("list", list);
		return "user/toscore";
	}
	@RequestMapping("/toAddScore")
	public String toAddScore(Model model,int id) {
		User user = userService.toEdit(id);
		model.addAttribute("user", user);
		return "user/addScore";
	}
	@RequestMapping("/addScore")
	public String addScore(Score score) {
		userService.addScore(score);
		return null;
	}
	@RequestMapping("/delScore")
	public String delScore(int id) {
		userService.delScore(id);
		return null;
	}
}
