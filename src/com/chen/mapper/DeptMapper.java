package com.chen.mapper;

import java.util.List;

import com.chen.vo.Employee;

public interface DeptMapper {
	List<Employee> selectByPrimaryKey(Integer id);
}
