package com.crm.sys.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.bean.Sysuser;

import com.crm.mapper.SysuserMapper;
import com.crm.mapper.UserMapper;
import com.crm.sys.service.ISysUserService;

@Service
public class SysUserServiceImpl implements ISysUserService {
	@Resource
	private SysuserMapper sysuserMapper;


	@Override
	public Sysuser selecetUser(Sysuser sysuser) {

		return sysuserMapper.selecetUser(sysuser);
	}





}
