package com.crm.car.service;

import java.util.List;

import com.crm.bean.Car;



public interface CarService {

	List<Car> AllCar();
	
	List<Car> selCarSchool();

	void add(Car car);

	void del(int id);

	Car QueryById(int id);

	void updateCar(Car car);

	List<Car> selUsers(Integer id);

	void delUser(int id);

	List<Car> queryschool(int cid);

}
