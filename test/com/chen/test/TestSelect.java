package com.chen.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.chen.config.MyBatisConfig;
import com.chen.mapper.DeptMapper;
import com.chen.mapper.EmployeeMapper;
import com.chen.vo.Employee;

public class TestSelect {
	SqlSession sqlSession;
	@Before
	public void setUp() throws Exception {
		sqlSession=MyBatisConfig.getSqlSession();
	}

	@After
	public void tearDown() throws Exception {
	}

	//@Test
	public void test() {
		List<Employee> list=sqlSession.selectList("com.chen.mapper.findAll");
	//	System.out.println(list);
	}
	@Test
	public void test2() {
		Map map=new HashMap();
		map.put("start", 0);
		map.put("end", 5);
		Employee e=new Employee();
		e.setEname("S");
		EmployeeMapper emp=sqlSession.getMapper(EmployeeMapper.class);
//		List<Employee> list=emp.findForPage(map);//findAssociation();// findAll();
		map.put("deptno",20);
		map.put("ename", "S");
		Map remap = emp.findMap(map);
	//	System.out.println(emp.findLikeName("%S%"));
		System.out.println(emp.findAssociation());
		/*System.out.println(remap.get("S"));
		System.out.println(remap.get("A"));*/
	}

}
