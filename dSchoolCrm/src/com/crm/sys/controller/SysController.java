package com.crm.sys.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.bean.Sysuser;
import com.crm.bean.User;
import com.crm.sys.service.ISysUserService;

@Controller
@RequestMapping("/sys")
public class SysController {

	@Resource
	private ISysUserService sysUserService;

	@RequestMapping("/login")
	public String login(Sysuser sysuser) {

		if (sysUserService.selecetUser(sysuser) != null) {
			return "redirect:/index.html";
		}
		return "redirect:/login.jsp";
	}







}
