package com.crm.user.service;

import java.util.List;

import com.crm.bean.*;



public interface UserService {

	List<User> allUser();

	void add(User user);

	void deleteUser(int id);

	User toEdit(int id);

	void update(User user);

	int  delUsers(Integer[] ids);

	List<User> isNotNull();

	List<User> all();

	User toall(Integer id);

	void delTeaId(Integer id);

	List<User> queryAllUser();

	List<User> selUserScore(Integer id);

	void addScore(Score score);

	void delScore(int id);
	
	
	

}
