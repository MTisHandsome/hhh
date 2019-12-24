package com.crm.school.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.bean.School;
import com.crm.mapper.SchoolMapper;
import com.crm.school.service.SchoolService;

@Service
public class SchoolServiceImpl implements SchoolService {
	@Resource
	private SchoolMapper schoolMapper;
	
	@Override
	public List<School> allSchool() {
		// TODO Auto-generated method stub
		return schoolMapper.selectByExample(null);
	}

}
