package come.yedam.Rerence;

/*
 * 아이디. 비밀번호, 이름.
 * 
 */
public class Member {
	// 필드.
	private String memberId;
	private String password;
	private String memverName;

	// 생성자.
	public Member(String memberId, String password, String memverName) {
		this.memberId = memberId;
		this.password = password;
		this.memverName = memverName;
	}

	// 메소드.
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getMemverName() {
		return memverName;
	}

	public void setMemverName(String memverName) {
		this.memverName = memverName;
	}

}
