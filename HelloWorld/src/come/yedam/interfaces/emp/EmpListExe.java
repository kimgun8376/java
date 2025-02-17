package come.yedam.interfaces.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/*
 * 컬렉션 활용.
 */
public class EmpListExe implements EmpDAO {

	// 필드.
	List<Employee> empList = new ArrayList<Employee>(); // 저장공간.

	// 생성자.
	public EmpListExe() {
		// 초기값.
		empList.add(new Employee(1001, "홍길동", "432-1234","2000-01-01", 400));
		empList.add(new Employee(1011, "박길동", "432-1212","2004-02-04", 350));
		empList.add(new Employee(1021, "김사원", "432-2222","1998-03-07", 700));
		empList.add(new Employee(1010, "박사장", "333-1212", "1995-04-11", 850));
	}

	@Override
	public boolean registerEmp(Employee emp) {
		return empList.add(emp); // 등록
	}

	@Override
	public boolean modifyEmp(Employee emp) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i < empList.size(); i++) {
			// 사원번호 비교.
			if (empList.get(i).getEmpNo() == emp.getEmpNo()) {
				// 연락처값이 ""이 아닐때 변경.
				if (!emp.getTelNo().equals("")) {
					empList.get(i).setTelNo(emp.getTelNo());
				}
				try {
					// 값을 변경안하려고 엔터("")일 경우 1900-01-01
					if (!emp.getHireDate().equals(sdf.parse("1900-01-01"))) {
						empList.get(i).setHireDate(emp.getHireDate());
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
				// 급여변경을 안할려고 엔터만 입력했을때는 변경안함.
				if (emp.getSalary() != 0) {
					empList.get(i).setSalary(emp.getSalary());
				}
				return true; // 정상수정.
			}
		}
		return false; // 수정못함.
	} // end of modifyEmp.

	@Override
	public boolean removeEmp(int empNo) {
		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).getEmpNo() == empNo) {
				empList.remove(i); // 삭제.
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Employee> search(Employee emp) { // sal보다 급여가 많은사원
	    ArrayList<Employee> result = new ArrayList<Employee>();  
	    int id = 0; 
	    String name = emp.getEmpName(); // 검색할 이름
	    
	    for (int i = 0; i < empList.size(); i++) {
	        // indexOf 사용.
	        if (empList.get(i).getEmpName().indexOf(name) > -1) {
				result.add(empList.get(i));
	        }
	    }

		return result;
	}

}
