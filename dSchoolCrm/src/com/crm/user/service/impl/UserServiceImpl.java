package com.crm.user.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.bean.*;
import com.crm.mapper.ScoreMapper;
import com.crm.mapper.UserMapper;

@Service
public class UserServiceImpl implements com.crm.user.service.UserService {

	@Resource
	private UserMapper userMapper;
	
	@Resource
	private ScoreMapper scoreMapper;
	
	@Override
	public List<User> allUser() {				
		return userMapper.allUser();
	}


	@Override
	public void add(User user) {
		userMapper.insert(user);
	}


	@Override
	public void deleteUser(int id) {
		userMapper.deleteByPrimaryKey(id);
	}


	@Override
	public User toEdit(int id) {
		return userMapper.selectByPrimaryKey(id);
	}


	@Override
	public void update(User user) {
		userMapper.updateByPrimaryKey(user);
		
	}


	@Override
	public int delUsers(Integer[] ids) {
		return userMapper.delUsers(ids);
		
		
	}


	@Override
	public List<User> isNotNull() {
		// TODO Auto-generated method stub
		return userMapper.isNotNull();
	}


	@Override
	public List<User> all() {
		return userMapper.all();
	}


	@Override
	public User toall(Integer id) {
		
		return userMapper.selectAll(id);
	}


	@Override
	public void delTeaId(Integer id) {
		userMapper.upteaId(id);
	}


	@Override
	public List<User> queryAllUser() {
		return userMapper.selectByExample(null);
	}


	@Override
	public List<User> selUserScore(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.selUserScore(id);
	}


	@Override
	public void addScore(Score score) {
		scoreMapper.insert(score);
		
	}


	@Override
	public void delScore(int id) {
		scoreMapper.deleteByPrimaryKey(id);
		
	}




	
	

}
