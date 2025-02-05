package come.yedam.interfaces.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;  // 수정된 부분

/* 
 * 사원번호(1001,1002)
 * 사원이름(홍길동,김민수)
 * 전화번호(654-1123, 654-3434)
 * 입사일자(2020-02-04)
 * 급여(300, 350)
 */
public class Employee {
	private int empNO;
	private String empName;
	private String telNo;
	private Date hireDate;
	private int salary;
	public Object getName;

	// 생성자.
	public Employee() {

	}

	public Employee(int empNo, String empName, String telNo) {
		this.empNO = empNo;
		this.empName = empName;
		this.telNo = telNo;
		this.hireDate = new Date();
		this.salary = 250;
	}

	public Employee(int empNo, String empName, String telNo, String hireDate, int salary ) {
		this (empNo, empName, telNo);
		SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM-dd");
		try {
		this.hireDate = sdf.parse(hireDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    this.salary= salary;
	}

	//사번,이름,연락처,급여.
	public String empInfo() {
		// 사번  이름  연락처   급여
		// --------------------
		//1001 홍길동  234-1235 520
		return empNO + "" +empName +" "+telNo + " " + salary;
	}
	
	// getter, setter
	public int getEmpNO() {
		return empNO;
	}

	public String getEmpName() {
		return empName;
	}

	public String getTelNo() {
		return telNo;
	}

	public java.util.Date getHireDate() {
		return hireDate;
	}

	public int getSalary() {
		return salary;
	}

	public void setEmpNO(int empNO) {
		this.empNO = empNO;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public void setHireDate(java.util.Date hireDate) {
		this.hireDate = hireDate;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
       
}

