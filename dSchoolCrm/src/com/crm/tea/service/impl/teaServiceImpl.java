package com.crm.tea.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.bean.Tea;
import com.crm.mapper.TeaMapper;
import com.crm.tea.service.teaService;
@Service
public class teaServiceImpl implements teaService {
	@Resource
	private TeaMapper teamapper;
	@Override
	public List<Tea> AllTea() {
		return teamapper.selectByExample(null);
	}
	@Override
	public void add(Tea tea) {
		teamapper.insert(tea);
	}
	@Override
	public void del(int id) {
		teamapper.deleteByPrimaryKey(id);
	}
	@Override
	public Tea toEdit(int id) {
		return teamapper.selectByPrimaryKey(id);
	}
	@Override
	public void edit(Tea tea) {
		teamapper.updateByPrimaryKey(tea);
	}
	@Override
	public int delAll(Integer[] ids) {
		
		return teamapper.delAll(ids);
	}
	@Override
	public List<Tea> selUser(Integer id) {
		
		return teamapper.queryTeaUser(id);
	}
	@Override
	public List<Tea> selteaschool() {
		return teamapper.selteaschool();
	}
	@Override
	public List<Tea> queryschool(int tid) {
		return teamapper.queryschool(tid);
	}

}
