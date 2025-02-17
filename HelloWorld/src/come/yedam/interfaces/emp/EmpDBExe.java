package come.yedam.interfaces.emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


/*
 * EmpDAO(인터페이스) 구현하는 클래스.
 * 
 */
public class EmpDBExe implements EmpDAO {

	Connection getConnect() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 오라클DB의 접속정보.
		String user = "hr";
		String password = "hr";
		Connection conn = null;
		try {
			conn = //
					DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	@Override
	public boolean registerEmp(Employee emp) {
		return false;
	}

	
	@Override
	public boolean removeEmp(int empNo) {
		return false;
	}
	
	@Override
	public List<Employee> search(Employee emp) {
		List<Employee> empList = new ArrayList<>();
		String qry = "select * from tbl_employees" + "where emp_name = nvl('" + emp.getEmpName() + "', emp_name)"
				+ "order by emp_no";

		try {
			Statement stmt = getConnect().createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM tbl_employees");
			while (rs.next()) {
				Employee empl = new Employee();
				empl.setEmpNo(rs.getInt("emp_no"));
				empl.setEmpName(rs.getString("emp_name"));
				empl.setHireDate(rs.getDate("hire_date"));
				empl.setSalary(rs.getInt("salary"));
				empl.setTelNo(rs.getString("tel_no"));

				empList.add(empl);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return empList; // 수정된 부분: 리스트 반환
	}

	
	
	public boolean modifyEmp(Employee emp) {
	    // SimpleDateFormat을 사용하여 날짜 형식 지정
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	    // SQL 쿼리 문자열 생성
	    String sql = "UPDATE tbl_employees SET "
	            + "tel_no = NVL('" + emp.getTelNo() + "', tel_no), " // 전화번호가 null일 경우 기존 값을 유지
	            + "hire_date = CASE WHEN '" + emp.getHireDate() + "' = '1990-01-01' THEN hire_date "
	            + "ELSE TO_DATE('" + sdf.format(emp.getHireDate()) + "', 'yyyy-MM-dd') END, " // hire_date가 '1990-01-01'이면 기존 값 유지, 아니면 새 값으로 업데이트
	            + "salary = CASE WHEN " + emp.getSalary() + " = 0 THEN salary "
	            + "ELSE " + emp.getSalary() + " END " // salary가 0이면 기존 값 유지, 아니면 새 값으로 업데이트
	            + "WHERE emp_no = " + emp.getEmpNo(); // emp_no에 해당하는 직원만 업데이트

	    try {
	        // Statement 객체 생성 후 SQL 실행
	        Statement stmt = getConnect().createStatement();
	        int rowsAffected = stmt.executeUpdate(sql); // executeUpdate로 쿼리 실행
	        if (rowsAffected > 0) {
	            return true; // 업데이트 성공 시 true 반환
	        }
	    } catch (SQLException e) {
	        e.printStackTrace(); // 예외 처리
	    }

	    return false; // 업데이트 실패 시 false 반환
	}

}

/*
 * 
 * 
*/

