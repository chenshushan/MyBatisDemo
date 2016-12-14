package com.chen.mapper;

import java.util.List;
import java.util.Map;

import com.chen.vo.Employee;

public interface EmployeeMapper {

	public List<Employee> findLikeName(String name);
	public List<Employee> findAllLike(String name);
	public List<Employee> findAll(String name);
	public List<Employee> findForPage(Map map);
	public List<Employee> findAssociation();
	public Map findMap(Map map);
}
