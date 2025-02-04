package come.yedam.inheritance;

public class  OracleDao extends Dao {
    
	public void add() {
   	 System.out.println("등록가능.");
	}
	public void remove() {
	   	 System.out.println("삭제가능.");
		}
	public void select() {
	   	 System.out.println("조회가능.");
		}
	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void search() {
		// TODO Auto-generated method stub
		
	}
}
