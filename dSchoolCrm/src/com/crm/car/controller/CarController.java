package com.crm.car.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.bean.Car;
import com.crm.bean.School;
import com.crm.car.service.CarService;
import com.crm.school.service.SchoolService;

@Controller
@RequestMapping("/car")
public class CarController {
	@Resource
	private CarService carService;
	@Resource
	private SchoolService schoolSercice;
	@RequestMapping("/all")
	public String list(Model model) {
		List<Car> list = carService.selCarSchool();
		model.addAttribute("list", list);
		return "car/Carlist";
	}
	@RequestMapping("/toadd")
	public String toadd(Model model) {
		List<School> school = schoolSercice.allSchool();
		model.addAttribute("school", school);
		return "car/Caradd";
	}
	
	@RequestMapping("/add")
	public String add(Car car) {
		carService.add(car);
		return null;
	}
	@RequestMapping("/del")
	public String del(int id) {
		carService.del(id);
		return null;
	}
	@RequestMapping("/toup")
	public String toup(Model model,int id) {
		List<School> school = schoolSercice.allSchool();
		model.addAttribute("school", school);
		Car car = carService.QueryById(id);
		model.addAttribute("car", car);
		return "car/Carupdate";
	}
	@RequestMapping("/update")
	public String update(Car car) {
		carService.updateCar(car);
		return null;
	}
	@RequestMapping("/selUsers")
	public String selUsers(Integer id,Model model) {
		List<Car> car = carService.selUsers(id);
		model.addAttribute("car", car);
		return "car/Caruser";
	}
	@RequestMapping("/delUser")
	public String delUser(int id) {
		carService.delUser(id);
		return "redirect:../car/selUsers.action";
	}
	
}
