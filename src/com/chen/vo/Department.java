package com.chen.vo;

import java.util.List;
import java.util.Set;

public class Department {
/*

 */
	private Integer deptno;
	private String dname;
	private String loc;
	private Set<Employee> emps;
	//一对多 关联
	
	public Set<Employee> getEmps() {
		return emps;
	}

	public void setEmps(Set<Employee> emps) {
		this.emps = emps;
	}

	public Department() {
		super();
	}
	
	public Department(Integer deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	
	@Override
	public String toString() {
		return "部门 [deptno=" + deptno + ", dname=" + dname + ", loc="
				+ loc + "]";
	}
	
	
}
