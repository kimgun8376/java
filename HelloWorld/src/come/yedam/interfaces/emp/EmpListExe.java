package come.yedam.interfaces.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/*
 * 컬렉션 활용.
 */
public class EmpListExe implements EmpDAO {
	
	List<Employee> empList = new ArrayList<Employee>(); // 저장공간,

	public EmpListExe() {
		empList.add(new Employee(1001, "홍길동", "111-2222"));
		empList.add(new Employee(1011, "박길동", "111-3333"));
		empList.add(new Employee(1111, "김사원", "111-4444"));
		empList.add(new Employee(1221, "박사장", "111-5555", "2001-01-01", 500));

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
			if (empList.get(i).getEmpNO() == emp.getEmpNO()) {
				// 연락처값이 ""이 아닐떄 변경
				if (!emp.getTelNo().equals("")) {
					empList.get(i).setTelNo(emp.getTelNo());

				}
				try {
					// 값을 변경안하려고 엔터("")일 경우 1900-01-01
					if (emp.getHireDate().equals(sdf.parse("1900-01-01"))) {
						empList.get(i).setHireDate(emp.getHireDate());
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
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
			if (empList.get(i).getEmpNO() == empNo) { // 같은 값 비교하기
				empList.remove(i); // 삭제...

			}
		}

		return false;
	}

	@Override
	public Employee[] search(Employee emp) { // 급여가 더 많은 사원 검색
	    List<Employee> result = new ArrayList<>();  // 결과를 저장할 리스트
	    int salary = emp.getSalary(); // 검색할 급여
	    String name = emp.getEmpName(); // 검색할 이름
	    
	    for (int i = 0; i < empList.size(); i++) {
	        Employee currentEmp = empList.get(i);  // empList에서 사원 가져오기
	        // 이름이 포함되고 급여가 더 많은 경우
	        if (currentEmp != null && currentEmp.getEmpName().contains(name) && currentEmp.getSalary() > salary) {
	            result.add(currentEmp);  // 조건에 맞는 사원 추가
	        }
	    }

	    // 리스트를 배열로 변환하여 반환
	    return result.toArray(new Employee[0]);
	}
	private Employee employees(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerEmp(Object emp) {

	}

	@Override
	public void modifyEmp(Object emp) {

	}

	@Override
	public void removeEmp(Object emp) {

	}

}
