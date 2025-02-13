package com.yedam;

import java.util.ArrayList;
import java.util.List;

import come.yedam.interfaces.emp.Employee;

public class EmpDAO {
	List<Employee> empList = new ArrayList<Employee>(); // 저장공간.
	
	public void EmpListExe() {
		// 초기값.
		empList.add(new Employee(23-11, "홍길동", "943-1234"));
		empList.add(new Employee(23-12, "김길동", "943-1244"));
		empList.add(new Employee(23-13, "박길동", "943-1254"));
		empList.add(new Employee(23-19, "김신입", "2023-12-01"));
		empList.add(new Employee(23-20, "박신입", "2023-12-02"));
		empList.add(new Employee(23-21, "최신입", "2023-12-03"));
	}

	public boolean registerEmp(Employee emp) {
		return empList.add(emp); // 등록
	}
	public boolean removeEmp(int empNo) {
		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).getEmpNo() == empNo) {
				empList.remove(i); // 삭제.
				return true;
			}
		}
		return false;
	}
/*	public List<Employee> search(Employee emp) {
		ArrayList<Employee> result = new ArrayList<Employee>();
		int hdate = 0;
		String hdate = emp.gethdate();
		for(int i = 0; i < empList.size(); i++) {
			if(empList.get(i).gethdate().indxOf(hdate) > -1) {
				result.add(empList.get(i)); */
		
		
	}
	
