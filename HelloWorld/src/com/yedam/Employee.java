package com.yedam;

import java.util.Date;

public class Employee {
	private int empNo;
	private String empName;
	private String tel;
	private Date hdate;
	private int sal;

	public Employee() {

	}

	public Employee(int empNo, String empName, String tel) {
		this.empNo = empNo;
		this.empName = empName;
		this.tel = tel;
		this.hdate = new Date();
		this.sal = sal;
	}
    
	public Employee(int empNo, String empName, String tel //
			         , String hdate, int sal) {
		this(empNo, empName,tel );
	}

     public String empInfo() {
    	 return empNo + " " + empName + "  " + tel + " " + hdate + " " +sal; 
     }

}
      