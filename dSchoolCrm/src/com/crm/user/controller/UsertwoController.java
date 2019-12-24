package com.crm.user.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.user.service.UserService;
import com.crm.bean.*;
import com.crm.car.service.CarService;
import com.crm.school.service.SchoolService;
import com.crm.tea.service.teaService;

@Controller
@RequestMapping("/two")
public class UsertwoController {
	@Resource
	private UserService userService;
	@Resource
	private teaService teaservice;	
	@Resource
	private CarService carservice;
	@Resource
	private SchoolService schoolService;
	
	@RequestMapping("/list")
	public String isNotUser(Model model) {
		List<User> user = userService.isNotNull();
		//List<User> user = userService.all();
		model.addAttribute("user", user);
		return "user/list";
	}
	@RequestMapping("/toall")
	public String toAll(Integer id,Model model) {
		User user = userService.toall(id);
		model.addAttribute("user", user);
		List<School> school = schoolService.allSchool();
		model.addAttribute("school", school);
		return "user/update";
	}
	
	@RequestMapping("/uptea")
	public String addtea(User user) {
		userService.update(user);
		return "redirect:../two/list.action";
	}
	
	@RequestMapping("/deleteUser")
	public String del(int id) {
		userService.deleteUser(id);
		return "redirect:../two/list.action";
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
	@RequestMapping("/addtea")
	public String addtea(int id,Model model,int cid,int tid) {
		User user = userService.toEdit(id);
		model.addAttribute("user", user);
		List<Tea> tea = teaservice.queryschool(tid);
		model.addAttribute("tea", tea);
		List<Car> car = carservice.queryschool(cid);
		model.addAttribute("car", car);
		return "user/user_add_tea";
	}
	
	@RequestMapping("/addteas")
	public String addteas(User user) {
		userService.update(user);
		return "redirect:../two/list.action";
	}
	
}
