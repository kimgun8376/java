package come.yedam.interfaces.emp;
/*
 * 배열활용.
 * 
 */
public class EmpAryExe implements EmpDAO {

	Employee[] emloyees = new Employee[10]; // 저장.
	
	@Override
	public boolean registerEmp(Employee emp) {
		return false;
	}

	@Override
	public boolean modifyEmp(Employee emp) {
		return false;
	}

	@Override
	public boolean removeEmp(int empNo) {
				return false;
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
