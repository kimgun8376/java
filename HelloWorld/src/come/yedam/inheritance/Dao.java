package come.yedam.inheritance;
/*
 * Date Access Objrect.
 * 추상클랙스 규칙.
 * MysqlDao - > regiser, remove,search
 * OracleDao -> regiser, remove,search
 * 실행클래스의 코드수정 최소화 가능.
 */
public abstract class Dao {
     //등록.
	public abstract void register();
	//삭제
	public abstract void remove();
    //조회
	public abstract void search();

}
