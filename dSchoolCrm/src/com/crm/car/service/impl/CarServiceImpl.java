package com.crm.car.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.bean.Car;
import com.crm.car.service.CarService;
import com.crm.mapper.CarMapper;
import com.crm.mapper.UserMapper;

@Service
public class CarServiceImpl implements CarService {
	@Resource
	private CarMapper carMapper;
	
	@Resource
	private UserMapper userMapper;
	@Override
	public List<Car> AllCar() {
		return carMapper.selectByExample(null);
	}
	@Override
	public List<Car> selCarSchool() {
		return carMapper.selCarSchool();
	}
	@Override
	public void add(Car car) {
		carMapper.insert(car);
	}
	@Override
	public void del(int id) {
		carMapper.deleteByPrimaryKey(id);
	}
	@Override
	public Car QueryById(int id) {		
		return carMapper.selectByPrimaryKey(id);
	}
	@Override
	public void updateCar(Car car) {
		carMapper.updateByPrimaryKey(car);		
	}
	@Override
	public List<Car> selUsers(Integer id) {
		return carMapper.selUsers(id);
	}
	@Override
	public void delUser(int id) {
		userMapper.upcarId(id);
		
	}
	@Override
	public List<Car> queryschool(int cid) {
		
		return carMapper.queryschool(cid);
	}

}
