package come.yedam.interfaces.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import come.yedam.Rerence.Board;

/*
 * 배열활용.
 * 
 */
public class EmpAryExe implements EmpDAO {

    Employee[] employees = new Employee[10]; // 저장.

    public EmpAryExe() {
        employees[0] = new Employee(1001, "홍길동", "111-2222");
        employees[1] = new Employee(1011, "박길동", "111-3333");
        employees[2] = new Employee(1111, "김사원", "111-4444");
        employees[3] = new Employee(1221, "박사장", "111-5555", "2001-01-01", 500);
    }

    @Override
    public boolean registerEmp(Employee emp) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = emp;
                return true; // 정상등록.
            }
        }
        return false; // 등록실패.
    }

    @Override
    public boolean modifyEmp(Employee emp) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (int i = 0; i < employees.length; i++) {
            // 사원번호 비교
            if (employees[i] != null && employees[i].getEmpNO() == emp.getEmpNO()) {
                // 연락처값이 ""이 아닐 때 변경
                if (!emp.getTelNo().equals("")) {
                    employees[i].setTelNo(emp.getTelNo());
                }
                try {
                    // 값을 변경하려고 엔터("")일 경우 1900-01-01
                    if (emp.getHireDate().equals(sdf.parse("1900-01-01"))) {
                        employees[i].setHireDate(emp.getHireDate());
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                if (emp.getSalary() != 0) {
                    employees[i].setSalary(emp.getSalary());
                }
                return true; // 정상수정.
            }
        }
        return false; // 수정 실패.
    }

    @Override
    public boolean removeEmp(int empNo) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getEmpNO() == empNo) {
                employees[i] = null; // 해당 사원 삭제
                return true;
            }
        }
        return false; // 삭제 실패.
    }

    @Override
    public Employee[] search(Employee emp) {
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
