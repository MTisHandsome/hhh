package com.crm.tea.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.bean.School;
import com.crm.bean.Tea;
import com.crm.school.service.SchoolService;
import com.crm.tea.service.teaService;
import com.crm.user.service.UserService;

@Controller
@RequestMapping("/tea")
public class teaController {
	@Resource
	private teaService teaservice;
	@Resource
	private UserService userService;
	@Resource
	private SchoolService schoolSercice;
	@RequestMapping("/allTea")
	public String allTea(Model model) {
		List<Tea> list = teaservice.selteaschool();
		model.addAttribute("list", list);
		return "tea/tealist";
	}
	//跳转添加页面
	@RequestMapping("/toadd")
	public String toadd(Model model) {
		List<School> school = schoolSercice.allSchool();
		model.addAttribute("school", school);
		return "tea/teaAdd";
	}
	//添加
	@RequestMapping("/add")
	public String add(Tea tea) {
		teaservice.add(tea);
		return null;
	}
	//单项删除
	@RequestMapping("/del")
	public String del(int id) {
		teaservice.del(id);
		return "redirect:../tea/allTea.action";		
	}
	//跳转修改
	@RequestMapping("/toEdit")
	public String toEdit(int id,Model model) {
		Tea tea = teaservice.toEdit(id);
		model.addAttribute("tea", tea);
		List<School> school = schoolSercice.allSchool();
		model.addAttribute("school", school);
		return "tea/teaUpdate";
	}
	@RequestMapping("/edit")
	public String edit(Tea tea) {
		teaservice.edit(tea);
		return null;
	}
	@RequestMapping("/delall")
	@ResponseBody
	public String delall(Integer[] ids) {
		try {
			teaservice.delAll(ids);
		} catch (Exception e) {
			return "error";
		}		 
		return "ok";
	}
	@RequestMapping("/query")
	public String selUser(Integer id,Model model) {
		List<Tea> list = teaservice.selUser(id);
		
		model.addAttribute("list", list);
		return "tea/query";
	}
	@RequestMapping("/delTeaId")
	public String delTeaId(Integer id) {
		userService.delTeaId(id);
		return "redirect:../tea/query.action";
		
	}
}
