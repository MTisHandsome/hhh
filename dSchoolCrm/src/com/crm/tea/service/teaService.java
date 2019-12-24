package com.crm.tea.service;

import java.util.List;

import com.crm.bean.Tea;

public interface teaService {
	List<Tea> AllTea();
	void add(Tea tea);
	void del(int id);
	Tea toEdit(int id);
	void edit(Tea tea);
	int delAll(Integer[] ids);
	List<Tea> selUser(Integer id);
	List<Tea> selteaschool();
	List<Tea> queryschool(int tid);
}
